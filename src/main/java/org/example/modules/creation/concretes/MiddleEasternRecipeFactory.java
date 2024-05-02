package org.example.modules.creation.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.MiddleEasternRecipe;
import org.example.modules.creation.abstracts.RecipeFactory;
import org.example.modules.singleton.RecipeBookSingleton;

public class MiddleEasternRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public MiddleEasternRecipeFactory() {
        super();
        System.out.println("Created Middle Eastern Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new MiddleEasternRecipe(name, description, size);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
