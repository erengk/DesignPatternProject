package org.example.entities.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.creation.concretes.RecipeTypeConcrete;

public class WesternRecipeConcrete extends RecipeAbstract {
    public WesternRecipeConcrete(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeTypeConcrete.WESTERN_RECIPE);
    }
}
