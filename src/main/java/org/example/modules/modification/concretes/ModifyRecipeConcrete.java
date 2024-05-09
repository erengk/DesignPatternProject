package org.example.modules.modification.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.TagConcrete;
import org.example.modules.creation.concretes.RecipeTypeConcrete;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModifyRecipeConcrete {
    RecipeAbstract recipeAbstract;

    public ModifyRecipeConcrete(RecipeAbstract recipeAbstract) {
        this.recipeAbstract = recipeAbstract;
    }

    public void modifyRecipeName(String name) {
        recipeAbstract.setName(name);
    }

    public void modifyRecipeDescription(String description) {
        recipeAbstract.setDescription(description);
    }

    public void modifyRecipeSize(int size) {
        recipeAbstract.setSize(size);
    }

    public void modifyRecipeCategories(HashSet<CategoryConcrete> categories) {
        recipeAbstract.getCategories().clear();
        recipeAbstract.getCategories().addAll(categories);
    }

    public void modifyRecipeTags(HashSet<TagConcrete> tagConcretes) {
        recipeAbstract.getTags().clear();
        recipeAbstract.getTags().addAll(tagConcretes);
    }

    public void modifyRecipeType(String type) {
        try {
            RecipeTypeConcrete newType = RecipeTypeConcrete.valueOf(type);
            recipeAbstract.setType(newType);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid recipe type: " + type);
        }
    }

    public void modifyRecipeIngredients(List<IngredientConcrete> ingredientConcrete) {
        recipeAbstract.getIngredients().clear();
        recipeAbstract.getIngredients().addAll(ingredientConcrete);
    }

    public void modifyRecipeInstructions(ArrayList<String> instructions) {
        recipeAbstract.getInstructions().clear();
        recipeAbstract.getInstructions().addAll(instructions);
    }
}
