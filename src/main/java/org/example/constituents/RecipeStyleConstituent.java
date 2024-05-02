package org.example.constituents;

import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import org.example.modules.creation.concretes.*;

import java.util.Scanner;

public class RecipeStyleConstituent {
    //this component will be used to create different RecipeFactoryAbstract objects
    Scanner scanner = new Scanner(System.in);
    RecipeFactoryAbstract getRecipeStyle() {
        RecipeFactoryAbstract recipeFactoryAbstract;
        //this method will show the kitchen component
        System.out.println("=========== Styles Menu ===========");
        System.out.println("What Style of RecipeAbstract do you want to create?");
        System.out.println("|   1. Asian Style RecipeAbstract             |");
        System.out.println("|   2. African Style RecipeAbstract           |");
        System.out.println("|   3. MiddleEastern Style RecipeAbstract     |");
        System.out.println("|   4. Western Style RecipeAbstract           |");
        System.out.println("|   5. Other Style RecipeAbstract             |");
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
                System.out.println("Creating Asian Style RecipeAbstract.............");
                recipeFactoryAbstract = new AsianRecipeFactoryConcrete();
                return recipeFactoryAbstract;
            case 2:
                // handle option 2
                System.out.println("Creating African Style RecipeAbstract.............");
                recipeFactoryAbstract = new AfricanRecipeFactoryConcrete();
                return recipeFactoryAbstract;
            case 3:
                // handle option 3
                System.out.println("Creating MiddleEastern Style RecipeAbstract.............");
                recipeFactoryAbstract = new MiddleEasternRecipeFactoryConcrete();
                return recipeFactoryAbstract;
            case 4:
                // handle option 4
                System.out.println("Creating Western Style RecipeAbstract.............");
                recipeFactoryAbstract = new WesternRecipeFactoryConcrete();
                return recipeFactoryAbstract;
            case 5:
                // quit the program
                System.out.println("Creating Other Style RecipeAbstract.............");
                System.out.println("Please input the style of the recipe: ");
                String style = scanner.nextLine();
                recipeFactoryAbstract = new OthersRecipeFactoryConcrete(style);
                return recipeFactoryAbstract;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again......");
                getRecipeStyle();
                return null;
        }



    }
}
