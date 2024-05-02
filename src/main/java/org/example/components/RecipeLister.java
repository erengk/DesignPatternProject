package org.example.components;

import org.example.entities.abstracts.Recipe;
import org.example.modules.ratings.concretes.TotalRatingsStrategy;
import org.example.modules.singleton.RecipeBookSingleton;

import java.util.List;

public class RecipeLister {
    static RecipeBookSingleton recipeBookSingleton = RecipeBookSingleton.getInstance();

    public static void listAllRecipes() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeCardComponent.printRecipeCard(recipe, i);
        }
    }

    public static void listAllRecipesForAverageRatings() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeCardComponent.printRecipeForAverageRating(recipe);
        }
    }

    public static void listAllRecipesForTotalRatings() {
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            recipe.setRatingComputationStrategy(new TotalRatingsStrategy());
            RecipeCardComponent.printRecipeForAverageRating(recipe);
        }
    }
}
