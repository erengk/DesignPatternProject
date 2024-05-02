package org.example.constituents;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.ratings.concretes.TotalRatingsStrategyAbstractConcrete;
import org.example.modules.singleton.RecipeBook;

import java.util.List;

public class RecipeListerConstituent {
    static RecipeBook recipeBook = RecipeBook.getInstance();

    public static void listAllRecipes() {
        List<RecipeAbstract> recipeAbstractList = recipeBook.getRecipeList();
        RecipeAbstract recipeAbstract;
        for (int i = 0; i < recipeAbstractList.size(); i++) {
            recipeAbstract = recipeAbstractList.get(i);
            RecipeCardConstituent.printRecipeCard(recipeAbstract, i);
        }
    }

    public static void listAllRecipesForAverageRatings() {
        List<RecipeAbstract> recipeAbstractList = recipeBook.getRecipeList();
        RecipeAbstract recipeAbstract;
        for (int i = 0; i < recipeAbstractList.size(); i++) {
            recipeAbstract = recipeAbstractList.get(i);
            RecipeCardConstituent.printRecipeForAverageRating(recipeAbstract);
        }
    }

    public static void listAllRecipesForTotalRatings() {
        List<RecipeAbstract> recipeAbstractList = recipeBook.getRecipeList();
        RecipeAbstract recipeAbstract;
        for (int i = 0; i < recipeAbstractList.size(); i++) {
            recipeAbstract = recipeAbstractList.get(i);
            recipeAbstract.setRatingComputationStrategy(new TotalRatingsStrategyAbstractConcrete());
            RecipeCardConstituent.printRecipeForAverageRating(recipeAbstract);
        }
    }
}
