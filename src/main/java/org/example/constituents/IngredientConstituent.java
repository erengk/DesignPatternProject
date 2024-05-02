package org.example.constituents;

import org.example.entities.concretes.IngredientConcrete;
import org.example.entities.concretes.UnitConcrete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngredientConstituent {
    static List<IngredientConcrete> createIngredientList() {
        List<IngredientConcrete> ingredientConcretes = new ArrayList<>();
        System.out.println("************************* Add Ingredients *************************");
        System.out.println("Creating Ingredients.. (write done as the name when you are done) ");

        while (true) {
            System.out.println("Please input the name of the ingredientConcrete: ");
            String name = System.console().readLine();
            if (name.equals("done")) {
                break;
            }
            IngredientConcrete ingredientConcrete = createIngredient(name);

            if (ingredientConcrete != null) {
                ingredientConcretes.add(ingredientConcrete);
            }


        }
        return ingredientConcretes;
    }

    private static IngredientConcrete createIngredient(String name){
        System.out.println("Please input the amount of the ingredient: ");
        double amount;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                amount = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
                return null;
            }
        }


        UnitConcrete unitConcrete = null;
        System.out.println("Please input the unitConcrete of the ingredient: ");
        System.out.println("|   1. BOTTLE               2. CAN                  3. CUP      |");
        System.out.println("|   4. TABLESPOON           5. TEASPOON             6. KILOGRAM |");
        System.out.println("|   7. LITER                8. PIECE                            |");
        int choice;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again (choose 1-8).");
                return null;
            }
        }

        switch (choice) {
            case 1:
                unitConcrete = UnitConcrete.BOTTLE;
                break;
            case 2:
                unitConcrete = UnitConcrete.CAN;
                break;
            case 3:
                unitConcrete = UnitConcrete.CUP;
                break;
            case 4:
                unitConcrete = UnitConcrete.TABLESPOON;
                break;
            case 5:
                unitConcrete = UnitConcrete.TEASPOON;
                break;
            case 6:
                unitConcrete = UnitConcrete.KILOGRAM;
                break;
            case 7:
                unitConcrete = UnitConcrete.LITER;
                break;
            case 8:
                unitConcrete = UnitConcrete.PIECE;
                break;
            default:
                System.out.println("Invalid choice, please try again (choose 1-8).");
                break;
        }

        return new IngredientConcrete(name, amount, unitConcrete);
    }
}
