package org.example.components;

import org.example.entities.concretes.Category;
import org.example.entities.concretes.Tag;
import org.example.modules.search.concretes.RecipeSearch;

public class SearchRecipeComponent {
    static RecipeSearch search = new RecipeSearch();
    public static void handleSearchRecipe() {
        System.out.println("**************** Search Recipe ****************");
        System.out.println("|   1. Search Recipe By Name                   |");
        System.out.println("|   2. Search Recipe By Category               |");
        System.out.println("|   3. Search Recipe By Ingredient             |");
        System.out.println("|   4. Search Recipe By Tag                    |");
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
        System.out.println("********** Search Recipe By Tag **********");
        Tag tag = TagComponent.selectTag();


        search.searchRecipeByTag(tag);
        System.out.println("******************************************");

    }

    private static void searchRecipeByIngredient() {
        System.out.println("********** Search Recipe By Ingredient **********");
        System.out.println("Enter ingredient name: ");
        String name = System.console().readLine();
        search.searchRecipeByIngredient(name);
        System.out.println("*************************************************");
    }

    private static void searchRecipeByCategory() {
        System.out.println("********** Search Recipe By Category **********");
        Category category = CategoryComponent.selectCategory();

        search.searchRecipeByCategory(category);
        System.out.println("***********************************************");
    }

    // Search by name
    public static void searchRecipeByName() {
        System.out.println("********** Search Recipe By Name **********");
        System.out.print("Enter recipe name: ");
        String name = System.console().readLine();
        search.searchRecipeByName(name);
        System.out.println("*******************************************");

    }
}
