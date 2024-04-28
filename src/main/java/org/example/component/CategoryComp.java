package org.example.component;

import org.example.entity.concrete.Category;

import java.util.HashSet;

public class CategoryComp {
    static HashSet<Category> createCategoryList(){
        HashSet<Category> categories = new HashSet<>(3);

        System.out.println(">--------------Categories--------------<");

        System.out.println("Please choose the category of the recipe: ");
        System.out.println("|1.BREAKFAST        2.DINNER        3.DESSERT|");
        System.out.println("|4.LUNCH            5.APPETIZER     6.SNACK|");
        System.out.println("|7.DRINK            8.SALAD         9.SOUP|");
        System.out.println("|10.SIDE_DISH       11.SAUCE        12.BREAD|");
        System.out.println("|13.PASTA           14.MEAT         15.HERB|");
        System.out.println("|16.SPICE           17.CONDIMENTS   18.CHICKEN|");
        System.out.println("|19.SEAFOOD         20.VEGETABLE    21.FRUIT|");
        System.out.println("|22.NUT             23.BEVERAGE     24.NONE|");

        while (categories.size() < 3) {
            System.out.println("Please enter your choose: ");
            int choose = Integer.parseInt(System.console().readLine());
            if (choose == 24) break;
            switch (choose){
                case 1: categories.add(Category.BREAKFAST);
                break;
                case 2: categories.add(Category.DINNER);
                break;
                case 3: categories.add(Category.DESSERT);
                break;
                case 4: categories.add(Category.LUNCH);
                break;
                case 5: categories.add(Category.APPETIZER);
                break;
                case 6: categories.add(Category.SNACK);
                break;
                case 7: categories.add(Category.DRINK);
                break;
                case 8: categories.add(Category.SALAD);
                break;
                case 9: categories.add(Category.SOUP);
                break;
                case 10: categories.add(Category.SIDE_DISH);
                break;
                case 11: categories.add(Category.SAUCE);
                break;
                case 12: categories.add(Category.BREAD);
                break;
                case 13: categories.add(Category.PASTA);
                break;
                case 14: categories.add(Category.MEAT);
                break;
                case 15: categories.add(Category.HERB);
                break;
                case 16: categories.add(Category.SPICE);
                break;
                case 17: categories.add(Category.CONDIMENTS);
                break;
                case 18: categories.add(Category.CHICKEN);
                break;
                case 19: categories.add(Category.SEAFOOD);
                break;
                case 20: categories.add(Category.VEGETABLE);
                break;
                case 21: categories.add(Category.FRUIT);
                break;
                case 22: categories.add(Category.NUT);
                break;
                case 23: categories.add(Category.BEVERAGE);
                break;
                case 24:
                break;
                default:
                    System.out.println("Please enter a valid choice!");
                    break;
            }
        }
        return categories;
    }
    static Category selectCategory(){
        System.out.println(">--------------Categories--------------<");

        System.out.println("Please choose the category of the recipe: ");
        System.out.println("|1.BREAKFAST        2.DINNER        3.DESSERT|");
        System.out.println("|4.LUNCH            5.APPETIZER     6.SNACK|");
        System.out.println("|7.DRINK            8.SALAD         9.SOUP|");
        System.out.println("|10.SIDE_DISH       11.SAUCE        12.BREAD|");
        System.out.println("|13.PASTA           14.MEAT         15.HERB|");
        System.out.println("|16.SPICE           17.CONDIMENTS   18.CHICKEN|");
        System.out.println("|19.SEAFOOD         20.VEGETABLE    21.FRUIT|");
        System.out.println("|22.NUT             23.BEVERAGE     24.NONE|");

        System.out.println("Please select category: ");

        int choose;
        while (true){
            try {
                choose = Integer.parseInt(System.console().readLine());
                if (choose > 0 && choose < 25) break;
                else System.out.println("Please enter a valid choice!");
            }catch (Exception e){
                System.out.println("Please enter a valid choice!");
            }
        }

        Category category = Category.NONE;
        switch (choose){
            case 1: category = Category.BREAKFAST;
                break;
            case 2: category = Category.DINNER;
                break;
            case 3: category = Category.DESSERT;
                break;
            case 4: category = Category.LUNCH;
                break;
            case 5: category = Category.APPETIZER;
                break;
            case 6: category = Category.SNACK;
                break;
            case 7: category = Category.DRINK;
                break;
            case 8: category = Category.SALAD;
                break;
            case 9: category = Category.SOUP;
                break;
            case 10: category = Category.SIDE_DISH;
                break;
            case 11: category = Category.SAUCE;
                break;
            case 12: category = Category.BREAD;
                break;
            case 13: category = Category.PASTA;
                break;
            case 14: category = Category.MEAT;
                break;
            case 15: category = Category.HERB;
                break;
            case 16: category = Category.SPICE;
                break;
            case 17: category = Category.CONDIMENTS;
                break;
            case 18: category = Category.CHICKEN;
                break;
            case 19: category = Category.SEAFOOD;
                break;
            case 20: category = Category.VEGETABLE;
                break;
            case 21: category = Category.FRUIT;
                break;
            case 22: category = Category.NUT;
                break;
            case 23: category = Category.BEVERAGE;
                break;
            case 24: category = Category.NONE;
                break;
            default:
                System.out.println("Please enter a valid choice!");
                break;
        }
        return category;
    }
}
