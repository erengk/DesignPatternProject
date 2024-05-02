package org.example.entities.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.modules.creation.concretes.RecipeType;

public class AsianRecipe extends Recipe {
    public AsianRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.ASIAN_RECIPE);
    }
}
