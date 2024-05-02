package org.example.entities.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.creation.concretes.RecipeTypeConcrete;

public class AfricanRecipeConcrete extends RecipeAbstract {
    public AfricanRecipeConcrete(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeTypeConcrete.AFRO_RECIPE);
    }
}
