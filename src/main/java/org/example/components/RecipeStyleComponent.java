package org.example.components;

import org.example.modules.creation.abstracts.RecipeFactory;
import org.example.modules.creation.concretes.*;

import java.util.Scanner;

public class RecipeStyleComponent {
    //this component will be used to create different RecipeFactory objects
    Scanner scanner = new Scanner(System.in);
    RecipeFactory getRecipeStyle() {
        RecipeFactory recipeFactory;
        //this method will show the kitchen component
        System.out.println("=========== Styles Menu ===========");
        System.out.println("What Style of Recipe do you want to create?");
        System.out.println("|   1. Asian Style Recipe             |");
        System.out.println("|   2. African Style Recipe           |");
        System.out.println("|   3. MiddleEastern Style Recipe     |");
        System.out.println("|   4. Western Style Recipe           |");
        System.out.println("|   5. Other Style Recipe             |");
        System.out.println("==================================");

        System.out.print("Enter your choice: ");
        int choice = 0;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        switch (choice){
            case 1:
                // handle option 1
                System.out.println("Creating Asian Style Recipe.............");
                recipeFactory = new AsianRecipeFactory();
                return recipeFactory;
            case 2:
                // handle option 2
                System.out.println("Creating African Style Recipe.............");
                recipeFactory = new AfroRecipeFactory();
                return recipeFactory;
            case 3:
                // handle option 3
                System.out.println("Creating MiddleEastern Style Recipe.............");
                recipeFactory = new MiddleEasternRecipeFactory();
                return recipeFactory;
            case 4:
                // handle option 4
                System.out.println("Creating Western Style Recipe.............");
                recipeFactory = new WesternRecipeFactory();
                return recipeFactory;
            case 5:
                // quit the program
                System.out.println("Creating Other Style Recipe.............");
                System.out.println("Please input the style of the recipe: ");
                String style = scanner.nextLine();
                recipeFactory = new OthersRecipeFactory(style);
                return recipeFactory;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again......");
                getRecipeStyle();
                return null;
        }



    }
}
