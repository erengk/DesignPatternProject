package org.example.entities.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.creation.concretes.RecipeTypeConcrete;

public class MiddleEasternRecipeConcrete extends RecipeAbstract {
    public MiddleEasternRecipeConcrete(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeTypeConcrete.MIDDLE_EASTERN_RECIPE);
    }
}
