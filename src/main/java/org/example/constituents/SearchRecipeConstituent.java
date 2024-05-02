package org.example.constituents;

import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.TagConcrete;
import org.example.modules.search.concretes.RecipeSearchConcrete;

public class SearchRecipeConstituent {
    static RecipeSearchConcrete search = new RecipeSearchConcrete();
    public static void handleSearchRecipe() {
        System.out.println("**************** Search RecipeAbstract ****************");
        System.out.println("|   1. Search RecipeAbstract By Name                   |");
        System.out.println("|   2. Search RecipeAbstract By CategoryConcrete               |");
        System.out.println("|   3. Search RecipeAbstract By IngredientConcrete             |");
        System.out.println("|   4. Search RecipeAbstract By TagConcrete                    |");
        System.out.println("************************************************");

        System.out.print("Enter your choice: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
                return;
            }
        }

        switch (choice) {
            case 1:
                searchRecipeByName();
                break;
            case 2:
                searchRecipeByCategory();
                break;
            case 3:
                searchRecipeByIngredient();
                break;
            case 4:
                searchRecipeByTag();
                break;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again.");
                break;
        }
    }

    private static void searchRecipeByTag() {
        System.out.println("********** Search RecipeAbstract By TagConcrete **********");
        TagConcrete tagConcrete = TagConstituent.selectTag();


        search.searchRecipeByTag(tagConcrete);
        System.out.println("******************************************");

    }

    private static void searchRecipeByIngredient() {
        System.out.println("********** Search RecipeAbstract By IngredientConcrete **********");
        System.out.println("Enter ingredient name: ");
        String name = System.console().readLine();
        search.searchRecipeByIngredient(name);
        System.out.println("*************************************************");
    }

    private static void searchRecipeByCategory() {
        System.out.println("********** Search RecipeAbstract By CategoryConcrete **********");
        CategoryConcrete categoryConcrete = CategoryConstituent.selectCategory();

        search.searchRecipeByCategory(categoryConcrete);
        System.out.println("***********************************************");
    }

    // Search by name
    public static void searchRecipeByName() {
        System.out.println("********** Search RecipeAbstract By Name **********");
        System.out.print("Enter recipe name: ");
        String name = System.console().readLine();
        search.searchRecipeByName(name);
        System.out.println("*******************************************");

    }
}
