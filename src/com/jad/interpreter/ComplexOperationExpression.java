package com.jad.interpreter;

import com.jad.product.IProduct;
import com.jad.product.operation.complex.ComplexOperation;

import java.util.Arrays;

public class ComplexOperationExpression implements RecipeExpression {
    private final RecipeExpression[] recipeExpressions;
    private final ComplexOperation complexOperation;

    public ComplexOperationExpression(final ComplexOperation complexOperation, final RecipeExpression... recipeExpressions) {
        this.recipeExpressions = recipeExpressions;
        this.complexOperation = complexOperation;
    }


    public final void interpret(final RecipeContext context) {
        RecipeContext[] contexts = new RecipeContext[this.recipeExpressions.length];
        for(int i = 0; i < contexts.length; i++) {
            contexts[i] = new RecipeContext();
            this.recipeExpressions[i].interpret(contexts[i]);
        }
        context.setProduct(this.complexOperation.execute(Arrays.stream(contexts).map(RecipeContext::getProduct).toArray(IProduct[]::new)));
    }
}
