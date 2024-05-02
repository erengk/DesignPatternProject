package org.example.constituents;

import org.example.entities.abstracts.RecipeAbstract;
import org.example.entities.concretes.CategoryConcrete;
import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.TagConcrete;
import org.example.modules.modification.concretes.ModifyRecipeConcrete;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModifyRecipeConstituent {
    private RecipeAbstract recipeAbstract = selectRecipeToModify();
    ModifyRecipeConcrete modifyRecipeConcrete = new ModifyRecipeConcrete(recipeAbstract);

    void  handleModifyRecipe() {
        System.out.println("**************** Modify RecipeAbstract ****************");
        System.out.println("|   1. Modify RecipeAbstract Name                      |");
        System.out.println("|   2. Modify RecipeAbstract Description               |");
        System.out.println("|   3. Modify RecipeAbstract Service Size              |");
        System.out.println("|   4. Modify RecipeAbstract Ingredients               |");
        System.out.println("|   5. Modify RecipeAbstract Instructions              |");
        System.out.println("|   6. Modify RecipeAbstract Categories                |");
        System.out.println("|   7. Modify RecipeAbstract TagConcrete                      |");
        System.out.println("|   8. Exit                                    |");
        System.out.println("************************************************");

        System.out.print("Enter your choice: ");
        int choice;
        while(true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }
        switch (choice) {
            case 1:
                // handle option 1
                System.out.println("Modify RecipeAbstract Name selected");
                modifyRecipeName();
                break;
            case 2:
                // handle option 2
                System.out.println("Modify RecipeAbstract Description selected");
                modifyRecipeDescription();
                break;
            case 3:
                // handle option 3
                System.out.println("Modify RecipeAbstract Service Size selected");
                modifyRecipeServiceSize();
                break;
            case 4:
                // handle option 4
                System.out.println("Modify RecipeAbstract Ingredients selected");
                modifyRecipeIngredients();
                break;
            case 5:
                // handle option 5
                System.out.println("Modify RecipeAbstract Instructions selected");
                modifyRecipeInstructions();
                break;
            case 6:
                // handle option 6
                System.out.println("Modify RecipeAbstract Categories selected");
                modifyRecipeCategories();
                break;
            case 7:
                // handle option 7
                System.out.println("Modify RecipeAbstract TagConcrete selected");
                modifyRecipeTags();
                break;
            case 8:
                // quit the program
                System.out.println("Quitting RecipeAbstract Modification...");
                break;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again.");
                break;
        }

    }

    private  void modifyRecipeTags() {
        HashSet<TagConcrete> tagConcretes = TagConstituent.createTagList();

        HashSet<TagConcrete> oldTagConcretes = new HashSet<>();
        for (TagConcrete tagConcrete : recipeAbstract.getTags()) {
            oldTagConcretes.add(tagConcrete);
        }

        modifyRecipeConcrete.modifyRecipeTags(tagConcretes);

        System.out.println("RecipeAbstract tagConcretes modified successfully " );
        System.out.println("Here is your new recipeAbstract: ");
        RecipeCardConstituent.printRecipeCard(recipeAbstract);
        undoModification(oldTagConcretes, "tagConcretes");

    }

    private  void modifyRecipeCategories() {
        HashSet<CategoryConcrete> categories = CategoryConstituent.createCategoryList();

        HashSet<CategoryConcrete> oldCategories = new HashSet<>();

        for (CategoryConcrete categoryConcrete : recipeAbstract.getCategories()) {
            oldCategories.add(categoryConcrete);
        }


        modifyRecipeConcrete.modifyRecipeCategories(categories);
        System.out.println("RecipeAbstract categories modified successfully " );
        RecipeCardConstituent.printRecipeCard(recipeAbstract);

        undoModification( oldCategories, "categories");
    }


    private  void modifyRecipeInstructions() {
        ArrayList<String> instructions = InstructionConstituent.createInstructions();

        ArrayList<String> oldInstructions = recipeAbstract.getInstructions();

        modifyRecipeConcrete.modifyRecipeInstructions(instructions);
        System.out.println("RecipeAbstract instructions modified successfully " );
        System.out.println("Here is your new recipeAbstract: ");
        RecipeCardConstituent.printRecipeCard(recipeAbstract);
        undoModification( oldInstructions, "instructions");
    }

    private  void modifyRecipeIngredients() {
        List<IngredientConcrete> ingredientConcretes = IngredientConstituent.createIngredientList();

        List<IngredientConcrete> oldIngredientConcretes = recipeAbstract.getIngredients();


        modifyRecipeConcrete.modifyRecipeIngredients(ingredientConcretes);
        System.out.println("RecipeAbstract ingredientConcretes modified successfully " );
        System.out.println("Here is your new recipeAbstract: ");
        RecipeCardConstituent.printRecipeCard(recipeAbstract);
        undoModification(oldIngredientConcretes, "ingredientConcretes");
    }

    private  void modifyRecipeServiceSize() {
        System.out.println("Enter new service size: ");

        int oldServiceSize = recipeAbstract.getSize();

        int newServiceSize = 0;
        try {
            newServiceSize = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }
        modifyRecipeConcrete.modifyRecipeSize(newServiceSize);
        System.out.println("RecipeAbstract service size changed to: " + recipeAbstract.getSize());
        System.out.println("Here is your new recipeAbstract: ");
        RecipeCardConstituent.printRecipeCard(recipeAbstract);
        undoModification( oldServiceSize, "size");
    }

    private  void modifyRecipeDescription() {
        System.out.println("Enter new description: ");

        String oldDescription = recipeAbstract.getDescription();



        String newDescription = System.console().readLine();
        modifyRecipeConcrete.modifyRecipeDescription(newDescription);
        System.out.println("RecipeAbstract description changed to: " + recipeAbstract.getDescription());
        System.out.println("Here is your new recipeAbstract: ");
        RecipeCardConstituent.printRecipeCard(recipeAbstract);
        undoModification(oldDescription, "description");
    }

    private  void modifyRecipeName() {
        System.out.println("Enter new name: ");

        String oldName = recipeAbstract.getName();

        String newName = System.console().readLine();
        modifyRecipeConcrete.modifyRecipeName(newName);
        System.out.println("RecipeAbstract name changed to: " + recipeAbstract.getName());
        System.out.println("Here is your new recipeAbstract: ");
        RecipeCardConstituent.printRecipeCard(recipeAbstract);
        undoModification(oldName, "name");
    }

    private  void undoModification(Object a, String type) {
        System.out.println("Do you want to undo the modification? (y/n)");
        String choice = System.console().readLine().toLowerCase();

        if(choice.startsWith("y")) {
            System.out.println("Undoing modification...");

            switch (type){
                case "name":
                    modifyRecipeConcrete.modifyRecipeName((String) a);
                    break;
                case "description":
                    modifyRecipeConcrete.modifyRecipeDescription((String) a);
                    break;
                case "size":
                    modifyRecipeConcrete.modifyRecipeSize((int) a);
                    break;
                case "ingredients":
                    modifyRecipeConcrete.modifyRecipeIngredients((List<IngredientConcrete>) a);
                    break;
                case "instructions":
                    modifyRecipeConcrete.modifyRecipeInstructions((ArrayList<String>) a);
                    break;
                case "categories":
                    modifyRecipeConcrete.modifyRecipeCategories((HashSet<CategoryConcrete>) a);
                    break;
                case "tags":
                    modifyRecipeConcrete.modifyRecipeTags((HashSet<TagConcrete>) a);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;

            }
            RecipeCardConstituent.printRecipeCard(recipeAbstract);
        } else if(choice.startsWith("n")) {
            System.out.println("Modification saved.");
        } else {
            System.out.println("Invalid choice, please try again.");
            undoModification(a, type);
        }
    }
    private RecipeAbstract selectRecipeToModify() {
        return SelectRecipeConstituent.selectRecipe();
    }


}
