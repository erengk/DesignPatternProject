package org.example.modules.creation.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.MiddleEasternRecipeConcrete;
import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import org.example.modules.singleton.RecipeBook;

public class MiddleEasternRecipeFactoryConcrete extends RecipeFactoryAbstract {
    RecipeAbstract recipeAbstract;
    public MiddleEasternRecipeFactoryConcrete() {
        super();
        System.out.println("Created Middle Eastern RecipeAbstract Factory");
    }

    @Override
    public RecipeAbstract createRecipes(String name, String description, int size) {
        recipeAbstract = new MiddleEasternRecipeConcrete(name, description, size);
        RecipeBook.getInstance().addRecipe(recipeAbstract);
        return recipeAbstract;
    }
}
