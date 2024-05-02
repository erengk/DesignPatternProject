package org.example.modules.creation.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.WesternRecipe;
import org.example.modules.creation.abstracts.RecipeFactory;
import org.example.modules.singleton.RecipeBookSingleton;

public class OthersRecipeFactory extends RecipeFactory {
    Recipe recipe;
    String name;
    public OthersRecipeFactory(String name) {
        super();
        this.name = name;
        System.out.println("Creating " + name + " Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new WesternRecipe(name, description, size);
        RecipeBookSingleton.getInstance().addRecipe(recipe);
        return recipe;
    }
}
