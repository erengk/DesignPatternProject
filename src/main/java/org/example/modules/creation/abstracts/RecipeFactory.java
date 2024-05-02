package org.example.modules.creation.abstracts;

import org.example.entities.abstracts.Recipe;

public abstract class RecipeFactory {
    public abstract Recipe createRecipes(String name, String description, int size);
}
