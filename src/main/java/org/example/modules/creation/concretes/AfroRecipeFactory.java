package org.example.modules.creation.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.AfroRecipe;
import org.example.modules.creation.abstracts.RecipeFactory;
import org.example.modules.singleton.RecipeBookSingleton;

public class AfroRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public AfroRecipeFactory() {
        super();
        System.out.println("Created Afro Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new AfroRecipe(name, description, size);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
