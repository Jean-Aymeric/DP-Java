package com.jad.product.recipeparser;

import com.jad.interpreter.ProductExpression;
import com.jad.interpreter.RecipeExpression;
import com.jad.product.leaf.LeafProduct;

class LeafProductExpressionHandler extends RecipeTokenHandler {
    private final LeafProduct product;

    public LeafProductExpressionHandler(final String token, final LeafProduct product) {
        super(token);
        this.product = product;
    }

    @Override
    public RecipeExpression handle(final RecipeTree recipeTree) {
        if (recipeTree.getToken().equals(this.getToken())) {
            this.product.setColor(recipeTree.getSubRecipe(0).getToken().charAt(0));
            return new ProductExpression(this.product);
        }
        return this.hasNextHandler() ? this.getNextHandler().handle(recipeTree) : null;
    }
}
