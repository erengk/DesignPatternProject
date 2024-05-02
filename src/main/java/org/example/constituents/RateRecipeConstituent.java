package org.example.constituents;

import org.example.entities.abstracts.RecipeAbstract;

public class RateRecipeConstituent {
    public static void handleRateRecipe() {

        System.out.println("**************** Rate RecipeAbstract ****************");
        RecipeAbstract recipeAbstract = SelectRecipeConstituent.selectRecipe();
        System.out.println("***********************************************");

        System.out.println("Enter your rating (0-5): ");

        int rating;
        while (true){
            try {
                rating = Integer.parseInt(System.console().readLine());
                if(rating < 0 || rating > 5)
                    System.out.println("Invalid rating, please try again.");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Invalid rating, please try again.");
            }
        }

        recipeAbstract.addRating(rating);

    }
}
