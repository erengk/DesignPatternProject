package org.example.components;

import org.example.entities.concretes.Category;

import java.util.HashSet;

public class CategoryComponent {
    static HashSet<Category> createCategoryList() {
        HashSet<Category> categories = new HashSet<Category>(3);

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
                    categories.add(Category.BREAKFAST);
                    break;
                case 2:
                    categories.add(Category.LUNCH);
                    break;
                case 3:
                    categories.add(Category.DINNER);
                    break;
                case 4:
                    categories.add(Category.DESSERT);
                    break;
                case 5:
                    categories.add(Category.APPETIZER);
                    break;
                case 6:
                    categories.add(Category.SNACK);
                    break;
                case 7:
                    categories.add(Category.DRINK);
                    break;
                case 8:
                    categories.add(Category.SALAD);
                    break;
                case 9:
                    categories.add(Category.SOUP);
                    break;
                case 10:
                    categories.add(Category.SAUCE);
                    break;
                case 11:
                    categories.add(Category.SIDE_DISH);
                    break;
                case 12:
                    categories.add(Category.BREAD);
                    break;
                case 13:
                    categories.add(Category.PASTA);
                    break;
                case 14:
                    categories.add(Category.MEAT);
                    break;
                case 15:
                    categories.add(Category.POULTRY);
                    break;
                case 16:
                    categories.add(Category.SEAFOOD);
                    break;
                case 17:
                    categories.add(Category.VEGETABLE);
                    break;
                case 18:
                    categories.add(Category.FRUIT);
                    break;
                case 19:
                    categories.add(Category.NUT);
                    break;
                case 20:
                    categories.add(Category.HERB);
                    break;
                case 21:
                    categories.add(Category.SPICE);
                    break;
                case 22:
                    categories.add(Category.CONDIMENTS);
                    break;
                case 23:
                    categories.add(Category.BEVERAGE);
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

    static Category selectCategory() {

        System.out.println("************************** CATEGORIES ************************** ");
        System.out.println("|   1. BREAKFAST            2. LUNCH                3. DINNER  |");
        System.out.println("|   4. DESSERT              5. APPETIZER            6. SNACK   |");
        System.out.println("|   7. DRINK                8. SALAD                9. SOUP    |");
        System.out.println("|   10. SAUCE               11. SIDE_DISH           12. BREAD   |");
        System.out.println("|   13. PASTA               14. MEAT                15. POULTRY |");
        System.out.println("|   16. SEAFOOD             17. VEGETABLE           18. FRUIT   |");
        System.out.println("|   19. NUT                 20. HERB                21. SPICE   |");
        System.out.println("|   22. CONDIMENTS          23. BEVERAGE            24. NONE    |");

        System.out.print("Select the category: ");

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

        Category category = Category.NONE;

        switch (choice) {
            case 1:
                category = Category.BREAKFAST;
                break;
            case 2:
                category = Category.LUNCH;
                break;
            case 3:
                category = Category.DINNER;
                break;
            case 4:
                category = Category.DESSERT;
                break;
            case 5:
                category = Category.APPETIZER;
                break;
            case 6:
                category = Category.SNACK;
                break;
            case 7:
                category = Category.DRINK;
                break;
            case 8:
                category = Category.SALAD;
                break;
            case 9:
                category = Category.SOUP;
                break;
            case 10:
                category = Category.SAUCE;
                break;
            case 11:
                category = Category.SIDE_DISH;
                break;
            case 12:
                category = Category.BREAD;
                break;
            case 13:
                category = Category.PASTA;
                break;
            case 14:
                category = Category.MEAT;
                break;
            case 15:
                category = Category.POULTRY;
                break;
            case 16:
                category = Category.SEAFOOD;
                break;
            case 17:
                category = Category.VEGETABLE;
                break;
            case 18:
                category = Category.FRUIT;
                break;
            case 19:
                category = Category.NUT;
                break;
            case 20:
                category = Category.HERB;
                break;
            case 21:
                category = Category.SPICE;
                break;
            case 22:
                category = Category.CONDIMENTS;
                break;
            case 23:
                category = Category.BEVERAGE;
                break;
            case 24:
                category = Category.NONE;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


        return category;


    }
}
