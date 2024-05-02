package org.example.constituents;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.IngredientConcrete;

import java.util.ArrayList;

public class RecipeCardConstituent {
    // This method is used to print the recipeAbstract card for modifying the recipeAbstract
    static void printRecipeCard(RecipeAbstract recipeAbstract, int recipeIndex) {
        System.out.println("##########################################################");
        System.out.println("#              RecipeAbstract No: " +recipeIndex +
                "\n# RecipeAbstract Name: "+ recipeAbstract.getName() +" from the "+ recipeAbstract.getType() +" Cuisine");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   Rating : "+ recipeAbstract.getAverageRating() );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   "+ recipeAbstract.getDescription()                          );
        System.out.println("#                                                        #");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Serve for "+ recipeAbstract.getSize()+" people                  ");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipeAbstract.getCategories()                  );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        TagConcrete: " + recipeAbstract.getTags()                        );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipeAbstract);
        System.out.println("#                                                        #");
        getInstructions(recipeAbstract);
        System.out.println("##########################################################");
    }

    //This method is used for printing the recipeAbstract card in the search results
    public static void printRecipeCard(RecipeAbstract recipeAbstract){
        System.out.println("##########################################################");
        System.out.println("#  "+ recipeAbstract.getName() +" from the "+ recipeAbstract.getType() +" Cuisine");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   Rating : "+ recipeAbstract.getAverageRating() );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   "+ recipeAbstract.getDescription()                          );
        System.out.println("#                                                        #");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Serve for "+ recipeAbstract.getSize()+" people                  ");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipeAbstract.getCategories()                  );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        TagConcrete: " + recipeAbstract.getTags()                        );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipeAbstract);
        System.out.println("#                                                        #");
        getInstructions(recipeAbstract);
        System.out.println("##########################################################");
    }

    public static void printRecipeForAverageRating(RecipeAbstract recipeAbstract){
        System.out.println("##########################################################");
        System.out.println("#  RecipeAbstract Name: "+ recipeAbstract.getName() +"      Rate: "+ recipeAbstract.getImpact()+ "  #");
        System.out.println("##########################################################");
    }

    private static void getIngredients(RecipeAbstract recipeAbstract) {
        for (IngredientConcrete ingredientConcrete : recipeAbstract.getIngredients()) {
            System.out.println("#                                                        #");
            System.out.println("# "+ ingredientConcrete.getName() + " " + ingredientConcrete.getAmount() + " " + ingredientConcrete.getUnit());
        }
    }

    private static void getInstructions(RecipeAbstract recipeAbstract) {
        System.out.println("#                      Instructions                      #");
        ArrayList<String> instructions = recipeAbstract.getInstructions();
        for (int i = 0; i < instructions.size(); i++) {
            String instruction = instructions.get(i);
            System.out.println("#                                                        #");
            System.out.println("# " + (i+1) +" -> "+ instruction);
        }
    }
}
