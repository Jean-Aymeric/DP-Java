package com.jad.product.recipeparser;

import com.jad.interpreter.RecipeExpression;

abstract class RecipeTokenHandler {
    private final String token;
    private RecipeTokenHandler nextHandler;

    public RecipeTokenHandler(final String token, final RecipeTokenHandler nextHandler) {
        this.token = token;
        this.nextHandler = nextHandler;
    }

    public RecipeTokenHandler(final String token) {
        this(token, null);
    }

    public RecipeTokenHandler() {
        this(null);
    }

    public RecipeTokenHandler getNextHandler() {
        return this.nextHandler;
    }

    public boolean hasNextHandler() {
        return this.nextHandler != null;
    }

    public void addHandler(final RecipeTokenHandler nextHandler) {
        if (this.hasNextHandler()) {
            this.nextHandler.addHandler(nextHandler);
        } else {
            this.nextHandler = nextHandler;
        }
    }

    public abstract RecipeExpression handle(final RecipeTree recipeTree);

    protected String getToken() {
        return token;
    }
}
