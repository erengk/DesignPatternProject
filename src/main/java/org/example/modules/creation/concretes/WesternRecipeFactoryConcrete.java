package org.example.modules.creation.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.WesternRecipeConcrete;
import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import org.example.modules.singleton.RecipeBook;

public class WesternRecipeFactoryConcrete extends RecipeFactoryAbstract {
    RecipeAbstract recipeAbstract;
    public WesternRecipeFactoryConcrete() {
        super();
        System.out.println("Created Western RecipeAbstract Factory");
    }


    @Override
    public RecipeAbstract createRecipes(String name, String description, int size) {
        recipeAbstract = new WesternRecipeConcrete(name, description, size);
        RecipeBook.getInstance().addRecipe(recipeAbstract);
        return recipeAbstract;
    }
}
