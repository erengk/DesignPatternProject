package org.example.modules.modification.concretes;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.TagConcrete;

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
        recipeAbstract.setCategories(categories);
    }

    public void modifyRecipeTags(HashSet<TagConcrete> tagConcretes) {
        recipeAbstract.setTags(tagConcretes);

    }



    //no need to modify recipeAbstract type (maybe just add a new recipeAbstract if you wanna change everything  !! )
    /*public void modifyRecipeType(String type) {
        recipeAbstract.setType(RecipeTypeConcrete.valueOf(type));
    }*/

    public void modifyRecipeIngredients(List<IngredientConcrete> ingredientConcrete) {
        recipeAbstract.setIngredients(ingredientConcrete);
    }

    // no need to modify categories and tags

    public void modifyRecipeInstructions(ArrayList<String> instructions) {
        recipeAbstract.setInstructions(instructions);
    }

}
