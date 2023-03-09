package com.jad.product.recipeparser;

import com.jad.interpreter.RecipeExpression;
import com.jad.product.composite.*;
import com.jad.product.leaf.*;
import com.jad.product.operation.complex.*;
import com.jad.product.operation.simple.*;

import java.util.HashMap;

public abstract class RecipeParser {
    public final static char OpenCharacter = '(';
    public final static char CloseCharacter = ')';
    public final static char SeparatorCharacter = ',';
    public final static HashMap<String, LeafProduct> LeafProductTokens = new HashMap<>();
    public final static HashMap<String, CompositeProduct> CompositeProductTokens = new HashMap<>();
    public final static HashMap<String, SimpleOperation> SimpleOperationTokens = new HashMap<>();
    public final static HashMap<String, ComplexOperation> ComplexOperationTokens = new HashMap<>();
    static {
        RecipeParser.LeafProductTokens.put("Cross", new Cross());
        RecipeParser.LeafProductTokens.put("EmptyCircle", new EmptyCircle());
        RecipeParser.LeafProductTokens.put("EmptySquare", new EmptySquare());
        RecipeParser.LeafProductTokens.put("FilledCircle", new FilledCircle());
        RecipeParser.LeafProductTokens.put("FilledSquare", new FilledSquare());

        RecipeParser.CompositeProductTokens.put("BlackSquare", new BlackSquare());
        RecipeParser.CompositeProductTokens.put("CircleSquare", new CircleSquare());
        RecipeParser.CompositeProductTokens.put("CheckerBoard", new CheckerBoard());
        RecipeParser.CompositeProductTokens.put("TicTacToe", new TicTacToe());
        RecipeParser.CompositeProductTokens.put("CrossSquare", new CrossSquare());
        RecipeParser.CompositeProductTokens.put("WhiteSquare", new WhiteSquare());

        RecipeParser.SimpleOperationTokens.put("CropBottomLeftCorner", new CropBottomLeftCorner());
        RecipeParser.SimpleOperationTokens.put("CropBottomRightCorner", new CropBottomRightCorner());
        RecipeParser.SimpleOperationTokens.put("CropTopLeftCorner", new CropTopLeftCorner());
        RecipeParser.SimpleOperationTokens.put("CropTopRightCorner", new CropTopRightCorner());
        RecipeParser.SimpleOperationTokens.put("CutTheBottom", new CutTheBottom());
        RecipeParser.SimpleOperationTokens.put("CutTheLeft", new CutTheLeft());
        RecipeParser.SimpleOperationTokens.put("CutTheRight", new CutTheRight());
        RecipeParser.SimpleOperationTokens.put("CutTheTop", new CutTheTop());
        RecipeParser.SimpleOperationTokens.put("Sand", new Sand());

        RecipeParser.ComplexOperationTokens.put("Stack", new Stack());
        RecipeParser.ComplexOperationTokens.put("StickLeftToRight", new StickLeftToRight());
        RecipeParser.ComplexOperationTokens.put("StickTopToBottom", new StickTopToBottom());
    }
    public final static RecipeTokenChain RecipeTokenChainOfResponsibilityStart = RecipeTokenChain.getInstance();

    public static RecipeExpression Parse(final String recipeText) {
        return RecipeParser.Generate(RecipeParser.TextToTreeRecipe(recipeText));
    }

    private static RecipeExpression Generate(RecipeTree recipeTree) {
        return RecipeParser.RecipeTokenChainOfResponsibilityStart.handle(recipeTree);
    }

    private static RecipeTree TextToTreeRecipe(final String recipeText) {
        RecipeTree root = new RecipeTree();
        int openCount = 0;
        int closeCount = 0;
        int lastSeparatorIndex = 0;
        for (int i = 0; (i < recipeText.length()) && (openCount + closeCount >= 0); i++) {
            switch (recipeText.charAt(i)) {
                case RecipeParser.OpenCharacter:
                    if (openCount == closeCount) {
                        lastSeparatorIndex = i + 1;
                    }
                    openCount++;
                    break;
                case RecipeParser.CloseCharacter:
                    closeCount++;
                    if (openCount == closeCount) {
                        root.addChild(RecipeParser.TextToTreeRecipe(recipeText.substring(lastSeparatorIndex, i)));
                    }
                    break;
                case RecipeParser.SeparatorCharacter:
                    if (openCount == (closeCount + 1)) {
                        root.addChild(RecipeParser.TextToTreeRecipe(recipeText.substring(lastSeparatorIndex, i)));
                        lastSeparatorIndex = i + 1;
                    }
                    break;
                case ' ':
                    break;
                default:
                    if (openCount == closeCount) {
                        root.setValue(root.getValue() + recipeText.charAt(i));
                    }
                    break;
            }
        }
        return root;
    }
}
