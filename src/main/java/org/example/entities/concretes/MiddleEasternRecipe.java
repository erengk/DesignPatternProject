package org.example.entities.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.modules.creation.concretes.RecipeType;

public class MiddleEasternRecipe extends Recipe {
    public MiddleEasternRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.MIDDLE_EASTERN_RECIPE);
    }
}
