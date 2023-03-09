package com.jad.product.recipeparser;

import com.jad.treenode.NaryTreeNode;

import java.util.LinkedList;

class RecipeTree extends NaryTreeNode<String> {
    public RecipeTree() {
        super("");
    }

    public String getToken() {
        return this.getValue();
    }

    public RecipeTree getSubRecipe(final int index) {
            return (RecipeTree) this.getChild(index);
        }

    public LinkedList<RecipeTree> getSubRecipes() {
        LinkedList<RecipeTree> subRecipes = new LinkedList<>();
        for (NaryTreeNode<String> child : this.getChildren()) {
            subRecipes.add((RecipeTree) child);
        }
        return subRecipes;
    }

    public void addSubRecipe(final RecipeTree subRecipe) {
        this.addChild(subRecipe);
    }

    public void removeSubRecipe(final RecipeTree subRecipe) {
        this.removeChild(subRecipe);
    }

    public void removeSubRecipe(final int index) {
        this.removeChild(index);
    }

    public int getSubRecipesCount() {
        return this.getChildrenCount();
    }

    public int getSubRecipeCount() {
        return this.getChildrenCount();
    }
}
