package com.jad.interpreter;

import com.jad.product.operation.simple.SimpleOperation;

public class SimpleOperationExpression implements RecipeExpression {
    private final RecipeExpression recipeExpression;
    private final SimpleOperation simpleOperation;

    public SimpleOperationExpression(final SimpleOperation simpleOperation, final RecipeExpression recipeExpression) {
        this.recipeExpression = recipeExpression;
        this.simpleOperation = simpleOperation;
    }

    public final void interpret(final RecipeContext context) {
        this.recipeExpression.interpret(context);
        context.setProduct(this.simpleOperation.execute(context.getProduct()));
    }
}
