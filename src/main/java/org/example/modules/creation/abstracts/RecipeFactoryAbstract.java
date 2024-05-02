package org.example.modules.creation.abstracts;

import org.example.entities.abstracts.RecipeAbstract;

public abstract class RecipeFactoryAbstract {
    public abstract RecipeAbstract createRecipes(String name, String description, int size);
}
