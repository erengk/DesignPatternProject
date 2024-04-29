package org.example.module.creation.abstracts;

import org.example.entity.abstracts.Recipe;

public abstract class RecipeFactory {
    public abstract Recipe createRecipes(String name, String description, int size);
}
