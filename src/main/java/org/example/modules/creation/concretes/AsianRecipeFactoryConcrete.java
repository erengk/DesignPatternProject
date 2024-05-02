package org.example.modules.creation.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.AsianRecipeConcrete;
import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import org.example.modules.singleton.RecipeBook;

public class AsianRecipeFactoryConcrete extends RecipeFactoryAbstract {
    RecipeAbstract recipeAbstract;

    public AsianRecipeFactoryConcrete() {
        super();
        //System.out.println("Created Asian RecipeAbstract Factory");
    }

    @Override
    public RecipeAbstract createRecipes(String name, String description, int size) {
        recipeAbstract = new AsianRecipeConcrete(name, description, size);
        RecipeBook.getInstance().addRecipe(recipeAbstract);
        return recipeAbstract;
    }
}
