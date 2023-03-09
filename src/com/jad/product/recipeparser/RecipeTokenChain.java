package com.jad.product.recipeparser;

import com.jad.interpreter.RecipeExpression;
import com.jad.product.composite.CompositeProduct;
import com.jad.product.leaf.LeafProduct;
import com.jad.product.operation.complex.ComplexOperation;
import com.jad.product.operation.simple.SimpleOperation;

import java.util.Map;

class RecipeTokenChain extends RecipeTokenHandler {
    private static RecipeTokenChain Instance;

    private RecipeTokenChain() {
        super();
        for (Map.Entry<String, LeafProduct> productToken : RecipeParser.LeafProductTokens.entrySet()) {
            this.addHandler(new LeafProductExpressionHandler(productToken.getKey(), productToken.getValue()));
        }
        for (Map.Entry<String, CompositeProduct> productToken : RecipeParser.CompositeProductTokens.entrySet()) {
            this.addHandler(new CompositeProductExpressionHandler(productToken.getKey(), productToken.getValue()));
        }
        for (Map.Entry<String, SimpleOperation> simpleOperation : RecipeParser.SimpleOperationTokens.entrySet()) {
            this.addHandler(new SimpleOperationExpressionHandler(simpleOperation.getKey(), simpleOperation.getValue()));
        }
        for (Map.Entry<String, ComplexOperation> complexOperation : RecipeParser.ComplexOperationTokens.entrySet()) {
            this.addHandler(new ComplexOperationExpressionHandler(complexOperation.getKey(), complexOperation.getValue()));
        }
    }

    public static RecipeTokenChain getInstance() {
        if (RecipeTokenChain.Instance == null) {
            RecipeTokenChain.Instance = new RecipeTokenChain();
        }
        return RecipeTokenChain.Instance;
    }

    @Override
    public RecipeExpression handle(final RecipeTree recipeTree) {
        return this.hasNextHandler() ? this.getNextHandler().handle(recipeTree) : null;
    }
}
