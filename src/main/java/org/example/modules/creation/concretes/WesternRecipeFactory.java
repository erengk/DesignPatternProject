package org.example.modules.creation.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.WesternRecipe;
import org.example.modules.creation.abstracts.RecipeFactory;
import org.example.modules.singleton.RecipeBookSingleton;

public class WesternRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public WesternRecipeFactory() {
        super();
        System.out.println("Created Western Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new WesternRecipe(name, description, size);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
