package org.example.modules.singleton;

import org.example.entities.abstracts.RecipeAbstract;

import java.util.LinkedList;
import java.util.List;

public class RecipeBook {
    private static RecipeBook instance;
    private final List<RecipeAbstract> recipeAbstractList = new LinkedList<>();
    private RecipeBook() {
    }
    public List<RecipeAbstract> getRecipeList() {
        return recipeAbstractList;
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            instance = new RecipeBook();
        }
        return instance;
    }

    // add recipeAbstract to recipeAbstract list
    public void addRecipe(RecipeAbstract recipeAbstract) {
        recipeAbstractList.add(recipeAbstract);
    }

    // remove recipeAbstract from recipeAbstract list
    public void removeRecipe(RecipeAbstract recipeAbstract) {
        recipeAbstractList.remove(recipeAbstract);
    }

}
