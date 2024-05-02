package org.example.constituents;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.TagConcrete;
import org.example.modules.creation.abstracts.RecipeFactoryAbstract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CreateRecipeConstituent {
    static Scanner scanner = new Scanner(System.in);
    public static void handleCreateRecipe(){
        System.out.println("************************** Create RecipeAbstract ************************** ");
        RecipeAbstract recipeAbstract = null;

        RecipeStyleConstituent recipeStyleConstituent = new RecipeStyleConstituent();
        RecipeFactoryAbstract recipeFactoryAbstract = recipeStyleConstituent.getRecipeStyle();

        System.out.println("Please input the name of the recipeAbstract : ");
        //String name = scanner.nextLine();
        String name = System.console().readLine();


        System.out.println("Please input the description of the recipeAbstract : ");
        String description = System.console().readLine();


        System.out.print("Please input the size of the recipeAbstract : ");
        int size = 0;

        while (true){
            try {
                size = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again. (input size as number)");
            }
        }


        try {
            recipeAbstract = recipeFactoryAbstract.createRecipes(name, description, size);
            addCategories(recipeAbstract);
            addTags(recipeAbstract);
            addIngredients(recipeAbstract);
            addInstructions(recipeAbstract);
            System.out.println("RecipeAbstract created successfully!");
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }

    }

    private static RecipeAbstract addInstructions(RecipeAbstract recipeAbstract) {
        ArrayList<String> instructions = InstructionConstituent.createInstructions();
        recipeAbstract.setInstructions(instructions);


        return recipeAbstract;
    }

    private static RecipeAbstract addIngredients(RecipeAbstract recipeAbstract) {
        List<IngredientConcrete> ingredientConcretes = IngredientConstituent.createIngredientList();

        for (IngredientConcrete ingredientConcrete : ingredientConcretes) {
            recipeAbstract.addIngredient(ingredientConcrete);
        }

        return recipeAbstract;
    }

    private static RecipeAbstract addTags(RecipeAbstract recipeAbstract) {
        HashSet<TagConcrete> tagConcretes = TagConstituent.createTagList();

        for (TagConcrete tagConcrete : tagConcretes) {
            recipeAbstract.addTag(tagConcrete);
        }
        return recipeAbstract;
    }

    private static RecipeAbstract addCategories(RecipeAbstract recipeAbstract) {
        HashSet<CategoryConcrete> categories = CategoryConstituent.createCategoryList();

        for (CategoryConcrete categoryConcrete : categories) {
            recipeAbstract.addCategory(categoryConcrete);
        }
        return recipeAbstract;
    }
}
