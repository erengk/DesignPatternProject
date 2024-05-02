package org.example.modules.creation.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.AsianRecipe;
import org.example.modules.creation.abstracts.RecipeFactory;
import org.example.modules.singleton.RecipeBookSingleton;

public class AsianRecipeFactory extends RecipeFactory {
    Recipe recipe;

    public AsianRecipeFactory() {
        super();
        //System.out.println("Created Asian Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new AsianRecipe(name, description, size);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
