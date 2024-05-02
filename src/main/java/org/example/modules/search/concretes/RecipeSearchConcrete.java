package org.example.modules.search.concretes;

import org.example.constituents.RecipeCardConstituent;
import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.TagConcrete;
import org.example.modules.singleton.RecipeBook;

import java.util.LinkedList;
import java.util.List;

public class RecipeSearchConcrete {
    List<RecipeAbstract> recipeAbstractList = RecipeBook.getInstance().getRecipeList();


    public void searchRecipeByName(String name) {
        List<RecipeAbstract> result = new LinkedList<>();
        for (RecipeAbstract recipeAbstract : recipeAbstractList) {
            if (recipeAbstract.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(recipeAbstract);
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (RecipeAbstract recipeAbstract : result) {
                RecipeCardConstituent.printRecipeCard(recipeAbstract);
            }
        }
    }

    public void searchRecipeByTag(TagConcrete tagConcrete) {
        List<RecipeAbstract> result = new LinkedList<>();
        for (RecipeAbstract recipeAbstract : recipeAbstractList) {
            for (TagConcrete recipeTagConcrete : recipeAbstract.getTags()) {
                if (recipeTagConcrete.name().contains(tagConcrete.name().toUpperCase())) {
                    result.add(recipeAbstract);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (RecipeAbstract recipeAbstract : result) {
                RecipeCardConstituent.printRecipeCard(recipeAbstract);
            }
        }
    }

    public void searchRecipeByCategory(CategoryConcrete categoryConcrete) {
        List<RecipeAbstract> result = new LinkedList<>();
        for (RecipeAbstract recipeAbstract : recipeAbstractList) {
            for (CategoryConcrete recipeCategoryConcrete : recipeAbstract.getCategories()) {
                if (recipeCategoryConcrete.name().toLowerCase().contains(categoryConcrete.name().toLowerCase())) {
                    result.add(recipeAbstract);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (RecipeAbstract recipeAbstract : result) {
                RecipeCardConstituent.printRecipeCard(recipeAbstract);
            }
        }
    }

    public void searchRecipeByIngredient(String ingredient) {
        List<RecipeAbstract> result = new LinkedList<>();
        for (RecipeAbstract recipeAbstract : recipeAbstractList) {
            for (IngredientConcrete recipeIngredientConcrete : recipeAbstract.getIngredients()) {
                if (recipeIngredientConcrete.getName().toLowerCase().contains(ingredient.toLowerCase())) {
                    result.add(recipeAbstract);
                }
            }
        }
        if(result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (RecipeAbstract recipeAbstract : result) {
                RecipeCardConstituent.printRecipeCard(recipeAbstract);
            }
        }
    }
}
