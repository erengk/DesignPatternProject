package org.example.entities.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.modules.creation.concretes.RecipeType;

public class WesternRecipe extends Recipe {
    public WesternRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.WESTERN_RECIPE);
    }
}
