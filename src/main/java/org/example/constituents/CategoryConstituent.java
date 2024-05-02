package org.example.constituents;

import org.example.entities.concretes.CategoryConcrete;

import java.util.HashSet;

public class CategoryConstituent {
    static HashSet<CategoryConcrete> createCategoryList() {
        HashSet<CategoryConcrete> categories = new HashSet<CategoryConcrete>(3);

        System.out.println("************************** CATEGORIES ************************** ");

        System.out.println("Please Choose the category of the recipe (up to 3 different Categories): ");
        System.out.println("|   1. BREAKFAST            2. LUNCH                3. DINNER  |");
        System.out.println("|   4. DESSERT              5. APPETIZER            6. SNACK   |");
        System.out.println("|   7. DRINK                8. SALAD                9. SOUP    |");
        System.out.println("|   10. SAUCE               11. SIDE_DISH           12. BREAD   |");
        System.out.println("|   13. PASTA               14. MEAT                15. POULTRY |");
        System.out.println("|   16. SEAFOOD             17. VEGETABLE           18. FRUIT   |");
        System.out.println("|   19. NUT                 20. HERB                21. SPICE   |");
        System.out.println("|   22. CONDIMENTS          23. BEVERAGE            24. NONE    |");

        while (categories.size() < 3) {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            if (choice == 24) break;
            switch (choice) {
                case 1:
                    categories.add(CategoryConcrete.BREAKFAST);
                    break;
                case 2:
                    categories.add(CategoryConcrete.LUNCH);
                    break;
                case 3:
                    categories.add(CategoryConcrete.DINNER);
                    break;
                case 4:
                    categories.add(CategoryConcrete.DESSERT);
                    break;
                case 5:
                    categories.add(CategoryConcrete.APPETIZER);
                    break;
                case 6:
                    categories.add(CategoryConcrete.SNACK);
                    break;
                case 7:
                    categories.add(CategoryConcrete.DRINK);
                    break;
                case 8:
                    categories.add(CategoryConcrete.SALAD);
                    break;
                case 9:
                    categories.add(CategoryConcrete.SOUP);
                    break;
                case 10:
                    categories.add(CategoryConcrete.SAUCE);
                    break;
                case 11:
                    categories.add(CategoryConcrete.SIDE_DISH);
                    break;
                case 12:
                    categories.add(CategoryConcrete.BREAD);
                    break;
                case 13:
                    categories.add(CategoryConcrete.PASTA);
                    break;
                case 14:
                    categories.add(CategoryConcrete.MEAT);
                    break;
                case 15:
                    categories.add(CategoryConcrete.POULTRY);
                    break;
                case 16:
                    categories.add(CategoryConcrete.SEAFOOD);
                    break;
                case 17:
                    categories.add(CategoryConcrete.VEGETABLE);
                    break;
                case 18:
                    categories.add(CategoryConcrete.FRUIT);
                    break;
                case 19:
                    categories.add(CategoryConcrete.NUT);
                    break;
                case 20:
                    categories.add(CategoryConcrete.HERB);
                    break;
                case 21:
                    categories.add(CategoryConcrete.SPICE);
                    break;
                case 22:
                    categories.add(CategoryConcrete.CONDIMENTS);
                    break;
                case 23:
                    categories.add(CategoryConcrete.BEVERAGE);
                    break;
                case 24:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        return categories;
    }

    static CategoryConcrete selectCategory() {

        System.out.println("************************** CATEGORIES ************************** ");
        System.out.println("|   1. BREAKFAST            2. LUNCH                3. DINNER  |");
        System.out.println("|   4. DESSERT              5. APPETIZER            6. SNACK   |");
        System.out.println("|   7. DRINK                8. SALAD                9. SOUP    |");
        System.out.println("|   10. SAUCE               11. SIDE_DISH           12. BREAD   |");
        System.out.println("|   13. PASTA               14. MEAT                15. POULTRY |");
        System.out.println("|   16. SEAFOOD             17. VEGETABLE           18. FRUIT   |");
        System.out.println("|   19. NUT                 20. HERB                21. SPICE   |");
        System.out.println("|   22. CONDIMENTS          23. BEVERAGE            24. NONE    |");

        System.out.print("Select the categoryConcrete: ");

        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                if (choice > 0 && choice < 25) break;
                else System.out.println("Invalid choice");
            } catch (Exception e) {
                System.out.println("Invalid choice");
            }
        }

        CategoryConcrete categoryConcrete = CategoryConcrete.NONE;

        switch (choice) {
            case 1:
                categoryConcrete = CategoryConcrete.BREAKFAST;
                break;
            case 2:
                categoryConcrete = CategoryConcrete.LUNCH;
                break;
            case 3:
                categoryConcrete = CategoryConcrete.DINNER;
                break;
            case 4:
                categoryConcrete = CategoryConcrete.DESSERT;
                break;
            case 5:
                categoryConcrete = CategoryConcrete.APPETIZER;
                break;
            case 6:
                categoryConcrete = CategoryConcrete.SNACK;
                break;
            case 7:
                categoryConcrete = CategoryConcrete.DRINK;
                break;
            case 8:
                categoryConcrete = CategoryConcrete.SALAD;
                break;
            case 9:
                categoryConcrete = CategoryConcrete.SOUP;
                break;
            case 10:
                categoryConcrete = CategoryConcrete.SAUCE;
                break;
            case 11:
                categoryConcrete = CategoryConcrete.SIDE_DISH;
                break;
            case 12:
                categoryConcrete = CategoryConcrete.BREAD;
                break;
            case 13:
                categoryConcrete = CategoryConcrete.PASTA;
                break;
            case 14:
                categoryConcrete = CategoryConcrete.MEAT;
                break;
            case 15:
                categoryConcrete = CategoryConcrete.POULTRY;
                break;
            case 16:
                categoryConcrete = CategoryConcrete.SEAFOOD;
                break;
            case 17:
                categoryConcrete = CategoryConcrete.VEGETABLE;
                break;
            case 18:
                categoryConcrete = CategoryConcrete.FRUIT;
                break;
            case 19:
                categoryConcrete = CategoryConcrete.NUT;
                break;
            case 20:
                categoryConcrete = CategoryConcrete.HERB;
                break;
            case 21:
                categoryConcrete = CategoryConcrete.SPICE;
                break;
            case 22:
                categoryConcrete = CategoryConcrete.CONDIMENTS;
                break;
            case 23:
                categoryConcrete = CategoryConcrete.BEVERAGE;
                break;
            case 24:
                categoryConcrete = CategoryConcrete.NONE;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


        return categoryConcrete;


    }
}
