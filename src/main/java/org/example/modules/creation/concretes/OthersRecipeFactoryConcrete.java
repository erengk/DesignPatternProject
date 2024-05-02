package org.example.modules.creation.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.WesternRecipeConcrete;
import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import org.example.modules.singleton.RecipeBook;

public class OthersRecipeFactoryConcrete extends RecipeFactoryAbstract {
    RecipeAbstract recipeAbstract;
    String name;
    public OthersRecipeFactoryConcrete(String name) {
        super();
        this.name = name;
        System.out.println("Creating " + name + " RecipeAbstract Factory");
    }


    @Override
    public RecipeAbstract createRecipes(String name, String description, int size) {
        recipeAbstract = new WesternRecipeConcrete(name, description, size);
        RecipeBook.getInstance().addRecipe(recipeAbstract);
        return recipeAbstract;
    }
}
