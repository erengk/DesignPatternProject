package org.example.constituents;

import org.example.entities.concretes.TagConcrete;

import java.util.HashSet;

public class TagConstituent {
    static HashSet<TagConcrete> createTagList(){
        HashSet<TagConcrete> tagConcreteList = new HashSet<TagConcrete>(3);


        System.out.println("***************************** TAGS *****************************");
        System.out.println("Please select up to 3 different tags from the list below: ");
        System.out.println("|   1. SPICY                2. SWEET                3. SOUR     |");
        System.out.println("|   4. SALTY                5. BITTER               6. FRESH    |");
        System.out.println("|   7. COLD                 8. HOT                  9. QUICK    |");
        System.out.println("|   10. EASY                11. HARD                12. HEALTHY |");
        System.out.println("|   13. UNHEALTHY           14. VEGETARIAN          15. VEGAN   |");
        System.out.println("|   16. GLUTEN_FREE         17. NONE                            |");


        while (tagConcreteList.size() < 3) {
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(System.console().readLine());
            if(choice == 17) break;
            switch (choice) {
                case 1:
                    tagConcreteList.add(TagConcrete.SPICY);
                    break;
                case 2:
                    tagConcreteList.add(TagConcrete.SWEET);
                    break;
                case 3:
                    tagConcreteList.add(TagConcrete.SOUR);
                    break;
                case 4:
                    tagConcreteList.add(TagConcrete.SALTY);
                    break;
                case 5:
                    tagConcreteList.add(TagConcrete.BITTER);
                    break;
                case 6:
                    tagConcreteList.add(TagConcrete.FRESH);
                    break;
                case 7:
                    tagConcreteList.add(TagConcrete.COLD);
                    break;
                case 8:
                    tagConcreteList.add(TagConcrete.HOT);
                    break;
                case 9:
                    tagConcreteList.add(TagConcrete.QUICK);
                    break;
                case 10:
                    tagConcreteList.add(TagConcrete.EASY);
                    break;
                case 11:
                    tagConcreteList.add(TagConcrete.HARD);
                    break;
                case 12:
                    tagConcreteList.add(TagConcrete.HEALTHY);
                    break;
                case 13:
                    tagConcreteList.add(TagConcrete.UNHEALTHY);
                    break;
                case 14:
                    tagConcreteList.add(TagConcrete.VEGETARIAN);
                    break;
                case 15:
                    tagConcreteList.add(TagConcrete.VEGAN);
                    break;
                case 16:
                    tagConcreteList.add(TagConcrete.GLUTEN_FREE);
                    break;
                case 17:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        return tagConcreteList;
    }

    public static TagConcrete selectTag() {
        System.out.println("***************************** TAGS *****************************");
        System.out.println("Please select the tag of the recipe:");
        System.out.println("|   1. SPICY                2. SWEET                3. SOUR     |");
        System.out.println("|   4. SALTY                5. BITTER               6. FRESH    |");
        System.out.println("|   7. COLD                 8. HOT                  9. QUICK    |");
        System.out.println("|   10. EASY                11. HARD                12. HEALTHY |");
        System.out.println("|   13. UNHEALTHY           14. VEGETARIAN          15. VEGAN   |");
        System.out.println("|   16. GLUTEN_FREE                                             |");


        System.out.print("Enter your choice: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                if(choice > 0 && choice < 17) break;
                else System.out.println("Invalid choice (1-16)");
            } catch (Exception e) {
                System.out.println("Invalid choice (input a number)");
            }
        }
        switch (choice) {
            case 1:
                return TagConcrete.SPICY;
            case 2:
                return TagConcrete.SWEET;
            case 3:
                return TagConcrete.SOUR;
            case 4:
                return TagConcrete.SALTY;
            case 5:
                return TagConcrete.BITTER;
            case 6:
                return TagConcrete.FRESH;
            case 7:
                return TagConcrete.COLD;
            case 8:
                return TagConcrete.HOT;
            case 9:
                return TagConcrete.QUICK;
            case 10:
                return TagConcrete.EASY;
            case 11:
                return TagConcrete.HARD;
            case 12:
                return TagConcrete.HEALTHY;
            case 13:
                return TagConcrete.UNHEALTHY;
            case 14:
                return TagConcrete.VEGETARIAN;
            case 15:
                return TagConcrete.VEGAN;
            case 16:
                return TagConcrete.GLUTEN_FREE;
            default:
                System.out.println("Invalid choice");
                return null;
        }

    }
}
