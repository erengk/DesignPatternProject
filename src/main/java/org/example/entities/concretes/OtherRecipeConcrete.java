package org.example.entities.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.creation.concretes.RecipeTypeConcrete;

public class OtherRecipeConcrete extends RecipeAbstract {
    public OtherRecipeConcrete(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeTypeConcrete.OTHER_RECIPE);
    }
}
