/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Chaotixx
 */
import java.util.*;

public class Project1 {

    public static final String LUNCHDINNER_ITEM_1 = "Chick-fil-A Chicken Sandwich";
    public static final String LUNCHDINNER_ITEM_2 = "Spicy Chicken Sandwich";
    public static final String LUNCHDINNER_ITEM_3 = "Grilled Chicken Sandwich";
    public static final String LUNCHDINNER_ITEM_4 = "Waffle Potato Fries";
    public static final String LUNCHDINNER_ITEM_5 = "Milkshake";
    public static final String BREAKFAST_ITEM_1 = "Chick-fil-A Chicken Biscuit";
    public static final String BREAKFAST_ITEM_2 = "Chicken, Egg & Cheese Bagel";
    public static final String BREAKFAST_ITEM_3 = "Hash Brown Scramble Burrito ";
    public static final String BREAKFAST_ITEM_4 = "Egg White Grill ";
    public static final String BREAKFAST_ITEM_5 = "Hash Browns";

    public static void main(String[] args) {
        System.out.println("Name:             Xavier Ijewere");
        System.out.println("Date:             2/5/2023");
        System.out.println("Email:            xaijewere@gmail.com");
        System.out.println("Course Number:    CSC2290");
        System.out.println("Assignment Title: FSC Chick-fil-A Ordering System");
        System.out.println("FSC Honor Code:   ");
        //Create Scanner
        Scanner in = new Scanner(System.in);
        //Call readAndVerifyMain
        int mainMenuChoice = readAndVerifyMain(in);

    }

    public static void showMainMenu() {
        System.out.println("""
                           ----------------------------------------------------------
                           |             FSC Chick-fil-A Ordering System            |
                           ----------------------------------------------------------
                           | Please choose from the following menu:                 |
                           |     1. Place a food order.                             |
                           |     2. Nutritional Information.                        |
                           |     3. Exit the Ordering System.                       |
                           ----------------------------------------------------------""");
        System.out.print("> Enter your choice: ");
    }

    public static int readAndVerifyMain(Scanner in) {
        while (true) {
            showMainMenu();
            String mainMenuChoice1 = (in.nextLine());
            System.out.println("");

            //Check if main menu choice is a digit
            if ((!onlyDigits(mainMenuChoice1))) {
                System.out.println("> You entered an invalid option. Please try again.");
                System.out.println();

            } else {
                int mainMenuChoice = Integer.parseInt(mainMenuChoice1);
                if (mainMenuChoice == 1 || mainMenuChoice == 2) {
                    String FoodOrderMenuChoice = readAndVerifyBLDchoice(in);
                    return mainMenuChoice;
                } else if (mainMenuChoice == 3) {
                    break;
                } else {
                    System.out.println("> You entered an invalid option. Please try again.");
                    System.out.println();
                }

            }
        }
    }

    public static void showFoodOrderMenu() {
        System.out.println("""
                           ----------------------------------------------------------
                           |                  Placing a Food Order                  |
                           ----------------------------------------------------------
                           | Please choose from the following menu:                 |
                           |     Enter "Breakfast" to place a breakfast order       |
                           |     Enter "Lunch" to place a lunch order               |
                           |     Enter "Dinner" to place a dinner order             |
                           |     Or, enter "Return" to return to previous menu      | 
                           ----------------------------------------------------------""");
        System.out.print("> Enter your choice: ");
    }

    public static String readAndVerifyBLDchoice(Scanner in) {
        while (true) {
            showFoodOrderMenu();
            String foodOrderMenuChoice = (in.nextLine());
            System.out.println("");

            if (foodOrderMenuChoice.equalsIgnoreCase("breakfast")) {
                showFoodOrderMenu();
                int foodOrderMenuChoiceNum = readAndVerifyFoodChoice(in, "breakfast");
                return foodOrderMenuChoice;
            } else if (foodOrderMenuChoice.equalsIgnoreCase("lunch")) {
                int foodOrderMenuChoiceNum = readAndVerifyFoodChoice(in, "lunch");
                return foodOrderMenuChoice;
            } else if (foodOrderMenuChoice.equalsIgnoreCase("dinner")) {
                int foodOrderMenuChoiceNum = readAndVerifyFoodChoice(in, "dinner");
                return foodOrderMenuChoice;
            } else if (foodOrderMenuChoice.equalsIgnoreCase("Return")) {
                return foodOrderMenuChoice;
            } else {
                System.out.println("> You entered an invalid option. Please try again.");
                System.out.println();
            }

        }
    }

    public static void showNutritionalMenu() {
        System.out.println("""
                           ------------------Nutritional Information-----------------
                           Please choose from the following:
                            Enter "Breakfast" to view breakfast nutritional info.
                            Enter "Lunch" to view lunch nutritional info.
                            Enter "Dinner" to view dinner nutritional info.
                            Or, enter "Return" to return to previous menu.""");
        System.out.print("Enter your choice: ");

    }

    public static String readAndVerifyNMchoice(Scanner in) {
        while (true) {
            showNutritionalMenu();
            String nutritionalMenuChoice = (in.nextLine());
            System.out.println("");
            if (nutritionalMenuChoice.equalsIgnoreCase("breakfast")) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("""
                               +-------------------> Breakfast Menu <-------------------+
                               ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                               +                                                        +""");
                System.out.printf("+     %-48s   + \n", "1. " + BREAKFAST_ITEM_1);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 440, 20, 48, 16);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "2. " + BREAKFAST_ITEM_2);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 460, 18, 49, 26);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "3. " + BREAKFAST_ITEM_3);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 690, 38, 52, 35);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "4. " + BREAKFAST_ITEM_4);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 300, 7, 31, 25);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "5. " + BREAKFAST_ITEM_5);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 250, 17, 23, 3);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("");

            } else if (nutritionalMenuChoice.equalsIgnoreCase("lunch")) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("""
                               +------------------->   Lunch Menu   <-------------------+
                               ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                               +                                                        +""");
                System.out.printf("+     %-48s   + \n", "1. " + LUNCHDINNER_ITEM_1);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 440, 19, 40, 28);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "2. " + LUNCHDINNER_ITEM_2);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 450, 19, 41, 29);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "3. " + LUNCHDINNER_ITEM_3);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 310, 6, 36, 29);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "4. " + LUNCHDINNER_ITEM_4);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 310, 6, 43, 5);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "5. " + LUNCHDINNER_ITEM_5);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 580, 22, 88, 12);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("");

            } else if (nutritionalMenuChoice.equalsIgnoreCase("dinner")) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("""
                               +------------------->  Dinner Menu  <--------------------+
                               ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                               +                                                        +""");
                System.out.printf("+     %-48s   + \n", "1. " + LUNCHDINNER_ITEM_1);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 440, 19, 40, 28);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "2. " + LUNCHDINNER_ITEM_2);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 450, 19, 41, 29);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "3. " + LUNCHDINNER_ITEM_3);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 310, 6, 36, 29);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "4. " + LUNCHDINNER_ITEM_4);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 310, 6, 43, 5);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.printf("+     %-48s   + \n", "5. " + LUNCHDINNER_ITEM_5);
                System.out.printf("+     |%10s|%11s|%11s|%11s|   +\n", "Calories", "Fat", "Carbs", "Protein");
                System.out.printf("+     |%10d|%10dg|%10dg|%10dg|   +\n", 580, 22, 88, 12);
                System.out.println("+    ------------------------------------------------    +");
                System.out.println("+                                                        +");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("");

            } else if (nutritionalMenuChoice.equalsIgnoreCase("return")) {
                return nutritionalMenuChoice;

            } else {
                System.out.println("> You entered an invalid option. Please try again.");
                System.out.println();
            }
        }

    }

    public static void showBreakfastMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println("""
                           --------------------> Breakfast Menu <--------------------
                               1. Chick-fil-A Chicken Biscuit               $3.49
                               2. Chicken, Egg & Cheese Bagel               $3.69
                               3. Hash Brown Scramble Burrito               $3.79
                               4. Egg White Grill                           $3.65
                               5. Hash Browns                               $1.09
                           ----------------------------------------------------------""");
    }

    public static void showLunchDinnerMenu(String mealtype) {
        if (mealtype.equalsIgnoreCase("Lunch")) {
            System.out.println("");
            System.out.println("");
            System.out.println("""
                               -------------------->  Lunch Menu  <----------------------
                                   1. Chick-fil-A Chicken Sandwich              $3.49
                                   2. Spicy Chicken Sandwich                    $3.75
                                   3. Grilled Chicken Sandwich                  $4.75
                                   4. Waffle Potato Fries                       $1.85
                                   5. Milkshake                                 $2.99
                               ----------------------------------------------------------
                               """);
            System.out.println("Enter your choice (1, 2, 3, 4, or 5): ");

        }
        if (mealtype.equalsIgnoreCase("Dinner")) {
            System.out.println("");
            System.out.println("");
            System.out.println("""
                               -------------------->  Dinner Menu  <---------------------
                                   1. Chick-fil-A Chicken Sandwich              $3.49
                                   2. Spicy Chicken Sandwich                    $3.75
                                   3. Grilled Chicken Sandwich                  $4.75
                                   4. Waffle Potato Fries                       $1.85
                                   5. Milkshake                                 $2.99
                               ----------------------------------------------------------
                               """);
            System.out.println("Enter your choice (1, 2, 3, 4, or 5): ");
        }

    }

    public static int readAndVerifyFoodChoice(Scanner in, String mealType) {
        while (true) {
            if (mealType.equalsIgnoreCase("Breakfast")) {
                showBreakfastMenu();
                int BreakfastMenuChoice = Integer.parseInt(in.nextLine());
                return BreakfastMenuChoice;
            } else if (mealType.equalsIgnoreCase("Lunch")) {
                showLunchDinnerMenu("lunch");
                int LunchMenuChoice = Integer.parseInt(in.nextLine());
                return LunchMenuChoice;
            } else if (mealType.equalsIgnoreCase("Dinner")) {
                showLunchDinnerMenu("dinner");
                int DinnerMenuChoice = Integer.parseInt(in.nextLine());
                return DinnerMenuChoice;
            } else {
                System.out.println("> You entered an invalid option. Please try again.");
                System.out.println();
            }

        }
    }

    public static boolean readAndVerifyYesNo(Scanner in) {
        System.out.println("Would you like another item (Y/N): ");
        String userInput = in.nextLine();
        while (true){
        if (userInput.equalsIgnoreCase("y")){
            return true;
        }
        else if (userInput.equalsIgnoreCase("n")){
            return false;
        }
        else   {
            System.out.println("> You entered an invalid option. Please try again.");
            System.out.println();
        }
        }

    }

    public static char readAndVerifyDiscountType(Scanner in) {
        System.out.println("""
                           Florida Southern College Discount Program:
                               Enter "s" for Student or "f" for Faculty/Staff.
                           Enter your choice: """);
        String discountType = in.nextLine();
       
        if (discountType.equalsIgnoreCase("s")){
            char discountType1 = 's';
            return discountType1;
        }
        else if (discountType.equalsIgnoreCase("f")){
            char discountType1 = 'f';
            return discountType1;
        }
        else   {
            System.out.println("> You entered an invalid option. Please try again.");
            System.out.println();
        }
        return 0;

    }

    public static void printReceipt(String receiptHeader, String itemsOrdered, double subtotal, char discountType, int numItems) {

    }

    public static void printNutritionalInfo(String nutritionalInfo) {

    }

    public static String centerString(int size, String words) {
        //Create the number of spaces
        int numofspacesafter = size - words.length();
        int numofspacesbefore = words.length() + numofspacesafter / 2;
        //Create spaces before and left aligns
        words = String.format("%" + numofspacesbefore + "s", words);
        //Creates spaces after and right aligns
        words = String.format("%-" + size + "s", words);
        //Returns the central aligned string
        return words;
    }

    public static boolean onlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static void exit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
