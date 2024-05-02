package org.example.modules.creation.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.AfricanRecipeConcrete;
import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import org.example.modules.singleton.RecipeBook;

public class AfricanRecipeFactoryConcrete extends RecipeFactoryAbstract {
    RecipeAbstract recipeAbstract;
    public AfricanRecipeFactoryConcrete() {
        super();
        System.out.println("Created Afro RecipeAbstract Factory");
    }


    @Override
    public RecipeAbstract createRecipes(String name, String description, int size) {
        recipeAbstract = new AfricanRecipeConcrete(name, description, size);
        RecipeBook.getInstance().addRecipe(recipeAbstract);
        return recipeAbstract;
    }
}
