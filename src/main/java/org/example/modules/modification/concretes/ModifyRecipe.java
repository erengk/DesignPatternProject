package org.example.modules.modification.concretes;

import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.Category;
import org.example.entities.concretes.Ingredient;
import org.example.entities.concretes.Tag;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModifyRecipe {
    Recipe recipe;

    public ModifyRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void modifyRecipeName(String name) {
        recipe.setName(name);
    }

    public void modifyRecipeDescription(String description) {
        recipe.setDescription(description);
    }

    public void modifyRecipeSize(int size) {
        recipe.setSize(size);
    }

    public void modifyRecipeCategories(HashSet<Category> categories) {
        recipe.setCategories(categories);
    }

    public void modifyRecipeTags(HashSet<Tag> tags) {
        recipe.setTags(tags);

    }



    //no need to modify recipe type (maybe just add a new recipe if you wanna change everything  !! )
    /*public void modifyRecipeType(String type) {
        recipe.setType(RecipeType.valueOf(type));
    }*/

    public void modifyRecipeIngredients(List<Ingredient> ingredient) {
        recipe.setIngredients(ingredient);
    }

    // no need to modify categories and tags

    public void modifyRecipeInstructions(ArrayList<String> instructions) {
        recipe.setInstructions(instructions);
    }

}
