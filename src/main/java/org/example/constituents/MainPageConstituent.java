package org.example.constituents;

import static org.example.constituents.CreateRecipeConstituent.scanner;

public class MainPageConstituent {
    public static void showMainPage() {

        boolean quit = false;

        while (!quit) {
            System.out.println("=========== Main Menu ===========");
            System.out.println("|   1. Create RecipeAbstract             |");
            System.out.println("|   2. Search RecipeAbstract             |");
            System.out.println("|   3. Modify RecipeAbstract             |");
            System.out.println("|   4. Rate RecipeAbstract               |");
            System.out.println("|   5. List All Recipes          |");
            System.out.println("|   6. Show Ratings              |");
            System.out.println("|   7. Quit                      |");
            System.out.println("==================================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // handle option 1
                    System.out.println("Create RecipeAbstract selected");
                    CreateRecipeConstituent.handleCreateRecipe();
                    break;
                case 2:
                    // handle option 2
                    System.out.println("Search RecipeAbstract selected");
                    SearchRecipeConstituent.handleSearchRecipe();
                    break;
                case 3:
                    // handle option 3
                    System.out.println("Modify RecipeAbstract selected");
                    ModifyRecipeConstituent handleModifyRecipe = new ModifyRecipeConstituent();
                    handleModifyRecipe.handleModifyRecipe();
                    break;
                case 4:
                    // handle option 4
                    System.out.println("Rate RecipeAbstract selected");
                    RateRecipeConstituent.handleRateRecipe();
                    break;
                case 5:
                    // handle option 5
                    RecipeListerConstituent.listAllRecipes();
                    break;
                case 6:
                    // handle option 6
                    System.out.println("Show Ratings selected");
                    RecipeRatingConstituent.handleRecipeRating();
                    break;
                case 7:
                    // quit the program
                    System.out.println("Quitting the program...");
                    quit = true;
                    break;
                default:
                    // handle invalid choice
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

            System.out.println();
        }
        scanner.close();
    }
}
