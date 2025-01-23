package com.personal.pantry.menu.model.menu;

import java.util.List;

public class Recipe {
    private String recipeName;
    private String recipeDescription;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(String recipeName, String recipeDescription, List<String> ingredients, List<String> steps) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getRecipeName() {
        return recipeName;
    }
    public String getRecipeDescription() {
        return recipeDescription;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public List<String> getSteps() {
        return steps;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}
