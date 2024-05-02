package org.example.modules.search.concretes;

import org.example.components.RecipeCardComponent;
import org.example.entities.abstracts.Recipe;
import org.example.entities.concretes.Category;
import org.example.entities.concretes.Ingredient;
import org.example.entities.concretes.Tag;
import org.example.modules.singleton.RecipeBookSingleton;

import java.util.LinkedList;
import java.util.List;

public class RecipeSearch {
    List<Recipe> recipeList = RecipeBookSingleton.getInstance().getRecipeList();


    public void searchRecipeByName(String name) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(recipe);
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                RecipeCardComponent.printRecipeCard(recipe );
            }
        }
    }

    public void searchRecipeByTag(Tag tag) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Tag recipeTag : recipe.getTags()) {
                if (recipeTag.name().contains(tag.name().toUpperCase())) {
                    result.add(recipe);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                RecipeCardComponent.printRecipeCard(recipe );
            }
        }
    }

    public void searchRecipeByCategory(Category category) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Category recipeCategory : recipe.getCategories()) {
                if (recipeCategory.name().toLowerCase().contains(category.name().toLowerCase())) {
                    result.add(recipe);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                RecipeCardComponent.printRecipeCard(recipe );
            }
        }
    }

    public void searchRecipeByIngredient(String ingredient) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Ingredient recipeIngredient : recipe.getIngredients()) {
                if (recipeIngredient.getName().toLowerCase().contains(ingredient.toLowerCase())) {
                    result.add(recipe);
                }
            }
        }
        if(result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                RecipeCardComponent.printRecipeCard(recipe );
            }
        }
    }
}
