package org.example.constituents;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.modules.singleton.RecipeBook;

import java.util.List;

public class SelectRecipeConstituent {
    public static RecipeAbstract selectRecipe() {
        RecipeBook recipeBook = RecipeBook.getInstance();
        List<RecipeAbstract> recipeAbstractList = recipeBook.getRecipeList();
        RecipeAbstract recipeAbstract;

        RecipeListerConstituent.listAllRecipes();
        System.out.println("Select the recipeAbstract you want (Enter RecipeAbstract No): ");
        int choice;

        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());

                if(choice < recipeAbstractList.size() && choice >= 0)
                    break;
                else
                    System.out.println("Invalid choice, please try again.");

            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }



        recipeAbstract = recipeAbstractList.get(choice);

        return recipeAbstract;
    }
}
