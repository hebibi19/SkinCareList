import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CareList cl = new CareList();
        DB db = new DB(cl);

        initialMenu(cl, db);

    }

    // CHOOSE PRODUCT METHODS
    // ALl work the same - only document one of the methods

    public static void chooseExfoliator(CareList cl, DB db) {
        // displays the current item
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getExfoliator());
        System.out.println("Choose a new product or return to your list");
        // prints out the options to choose from
        db.printExfoliator();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            // if the user enters 1 - 4, the current product changes into a different product
            if (choice == 1){
                cont = 0;
                cl.setExfoliator(db.getExfoliator(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setExfoliator(db.getExfoliator(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setExfoliator(db.getExfoliator(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setExfoliator(db.getExfoliator(3));
                currList(cl,db);
            }
            // entering 5 will return the user to the main menu and al progress will be lost
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            // entering 6 will return the user to the current list
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseSunscreen(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getSunscreen());
        System.out.println("Choose a new product or return to your list");
        db.printSunscreen();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setSunscreen(db.getSunscreen(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setSunscreen(db.getSunscreen(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setSunscreen(db.getSunscreen(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setSunscreen(db.getSunscreen(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseLotion(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getLotion());
        System.out.println("Choose a new product or return to your list");
        db.printLotion();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setLotion(db.getLotion(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setLotion(db.getLotion(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setLotion(db.getLotion(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setLotion(db.getLotion(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseSerum(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getSerum());
        System.out.println("Choose a new product or return to your list");
        db.printSerum();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setSerum(db.getSerum(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setSerum(db.getSerum(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setSerum(db.getSerum(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setSerum(db.getSerum(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseEssence(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getEssence());
        System.out.println("Choose a new product or return to your list");
        db.printEssence();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setEssence(db.getEssence(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setEssence(db.getEssence(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setEssence(db.getEssence(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setEssence(db.getEssence(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseToner(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getToner());
        System.out.println("Choose a new product or return to your list");
        db.printToner();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setToner(db.getToner(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setToner(db.getToner(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setToner(db.getToner(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setToner(db.getToner(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseWater(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getWaterCleanser());
        System.out.println("Choose a new product or return to your list");
        db.printWater();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setWaterCleanser(db.getWater(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setWaterCleanser(db.getWater(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setWaterCleanser(db.getWater(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setWaterCleanser(db.getWater(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }

    public static void chooseOil(CareList cl, DB db) {
        System.out.println("\n[CHOSEN ITEM]\n" + cl.getOilCleanser());
        System.out.println("Choose a new product or return to your list");
        db.printOil();
        System.out.println("[6] Current List");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                cl.setOilCleanser(db.getOil(0));
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                cl.setOilCleanser(db.getOil(1));
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                cl.setOilCleanser(db.getOil(2));
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                cl.setOilCleanser(db.getOil(3));
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl, db);
            }
            if (choice == 6){
                cont = 0;
                currList(cl,db);
            }
        }

    }


    // NUMBER OF PRODUCTS IN LIST
    // all methods work the same

    public static void threeOptions(CareList cl, DB db) {
        System.out.println("\n[4] Print Receipt");
        System.out.println("[5] Main Menu");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 5) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                chooseWater(cl,db);
            }
            if (choice == 2){
                cont = 0;
                chooseToner(cl,db);
            }
            if (choice == 3){
                cont = 0;
                chooseLotion(cl,db);
            }
            if (choice == 4){
                cont = 0;
                printReceipt(cl);
            }
            if (choice == 5){
                cont = 0;
                initialMenu(cl,db);
            }
        }

    }

    public static void fourOptions(CareList cl, DB db) {
        System.out.println("\n[5] Print Receipt");
        System.out.println("[6] Main Menu");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 6) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                chooseWater(cl,db);
            }
            if (choice == 2){
                cont = 0;
                chooseToner(cl,db);
            }
            if (choice == 3){
                cont = 0;
                chooseLotion(cl,db);
            }
            if (choice == 4){
                cont = 0;
                chooseSunscreen(cl,db);
            }
            if (choice == 5){
                cont = 0;
                printReceipt(cl);
            }
            if (choice == 6){
                cont = 0;
                initialMenu(cl,db);
            }
        }

    }

    public static void fiveOptions(CareList cl, DB db) {
        System.out.println("\n[6] Print Receipt");
        System.out.println("[7] Main Menu");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 7) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                chooseWater(cl,db);
            }
            if (choice == 2){
                cont = 0;
                chooseToner(cl,db);
            }
            if (choice == 3){
                cont = 0;
                chooseLotion(cl,db);
            }
            if (choice == 4){
                cont = 0;
                chooseSunscreen(cl,db);
            }
            if (choice == 5){
                cont = 0;
                chooseExfoliator(cl,db);
            }
            if (choice == 6){
                cont = 0;
                printReceipt(cl);
            }
            if (choice == 7){
                cont = 0;
                initialMenu(cl,db);
            }
        }

    }

    public static void sixOptions(CareList cl, DB db) {
        System.out.println("\n[7] Print Receipt");
        System.out.println("[8] Main Menu");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 8) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                chooseWater(cl,db);
            }
            if (choice == 2){
                cont = 0;
                chooseToner(cl,db);
            }
            if (choice == 3){
                cont = 0;
                chooseEssence(cl,db);
            }
            if (choice == 4){
                cont = 0;
                chooseLotion(cl,db);
            }
            if (choice == 5){
                cont = 0;
                chooseSunscreen(cl,db);
            }
            if (choice == 6){
                cont = 0;
                chooseExfoliator(cl,db);
            }
            if (choice == 7){
                cont = 0;
                printReceipt(cl);
            }
            if (choice == 8){
                cont = 0;
                initialMenu(cl,db);
            }
        }

    }

    public static void sevenOptions(CareList cl, DB db) {
        System.out.println("\n[8] Print Receipt");
        System.out.println("[9] Main Menu");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 9) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                chooseOil(cl,db);
            }
            if (choice == 2){
                cont = 0;
                chooseWater(cl,db);
            }
            if (choice == 3){
                cont = 0;
                chooseToner(cl,db);
            }
            if (choice == 4){
                cont = 0;
                chooseEssence(cl,db);
            }
            if (choice == 5){
                cont = 0;
                chooseLotion(cl,db);
            }
            if (choice == 6){
                cont = 0;
                chooseSunscreen(cl,db);
            }
            if (choice == 7){
                cont = 0;
                chooseExfoliator(cl,db);
            }
            if (choice == 8){
                cont = 0;
                printReceipt(cl);
            }
            if (choice == 9){
                cont = 0;
                initialMenu(cl,db);
            }
        }

    }

    public static void eightOptions(CareList cl, DB db) {
        System.out.println("\n[9] Print Receipt");
        System.out.println("[10] Main Menu");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 10) {
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                chooseOil(cl,db);
            }
            if (choice == 2){
                cont = 0;
                chooseWater(cl,db);
            }
            if (choice == 3){
                cont = 0;
                chooseToner(cl,db);
            }
            if (choice == 4){
                cont = 0;
                chooseEssence(cl,db);
            }
            if (choice == 5){
                cont = 0;
                chooseSerum(cl,db);
            }
            if (choice == 6){
                cont = 0;
                chooseLotion(cl,db);
            }
            if (choice == 7){
                cont = 0;
                chooseSunscreen(cl,db);
            }
            if (choice == 8){
                cont = 0;
                chooseExfoliator(cl,db);
            }
            if (choice == 9){
                cont = 0;
                printReceipt(cl);
            }
            if (choice == 10){
                cont = 0;
                initialMenu(cl,db);
            }
        }

    }


    /**
     * Method redirects you to the correct number of displayed items
     * (works as a helper method between other methods)
     */
    public static void currList(CareList cl, DB db){
        System.out.println("\nEnter a number to see more or edit choice!");
        int steps = cl.printCurrent();

        if (steps == 3) {
            threeOptions(cl,db);
        }
        if (steps == 4){
            fourOptions(cl, db);
        }
        if (steps == 5){
            fiveOptions(cl,db);
        }
        if (steps == 6){
            sixOptions(cl,db);
        }
        if (steps == 7){
            sevenOptions(cl,db);
        }
        if (steps == 8){
            eightOptions(cl,db);
        }

    }

    /**
     * Method prints a receipt of all chosen products
     */
    public static void printReceipt(CareList cl) {
        System.out.println(cl);
        cl.printTotal();
        System.out.println("\n--------------------------------------------------------------------------------");

    }

    /**
     * Method allows use to choose the number of products they want in their
     * skin care list. Ranges from 3 to 8.
     */
    public static void genSkinCare(CareList cl, DB db) {
        System.out.println("Choose the number of steps you'd like in your skin care routine:");
        System.out.println("[1] Most Basic Routine (3 steps)");
        System.out.println("[2] 4 step routine");
        System.out.println("[3] 5 step routine");
        System.out.println("[4] 6 step routine");
        System.out.println("[5] 7 step routine");
        System.out.println("[6] Full Routine (8 steps)");
        System.out.println("[7] Main Menu");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 7){
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                db.genThree();
                currList(cl,db);
            }
            if (choice == 2){
                cont = 0;
                db.genFour();
                currList(cl,db);
            }
            if (choice == 3){
                cont = 0;
                db.genFive();
                currList(cl,db);
            }
            if (choice == 4){
                cont = 0;
                db.genSix();
                currList(cl,db);
            }
            if (choice == 5){
                cont = 0;
                db.genSeven();
                currList(cl,db);
            }
            if (choice == 6){
                cont = 0;
                db.genEight();
                currList(cl,db);
            }
            if (choice == 7) {
                initialMenu(cl, db);
                cont = 0;
            }

        }

    }

    /**
     * Initial Menu or Main Menu
     * Allows user to select between generating a new Skin Care List or adding a new product to the database
     */
    public static void initialMenu(CareList cl, DB db){
        System.out.println("\nWelcome to the Skin Care Management System!");
        System.out.println("What would you like to do?");
        System.out.println("[1] Generate a Skin Care List");
        System.out.println("[2] Add a new product to the database");
        System.out.println("[3] Exit");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int cont = 1;
        while (cont == 1) {
            if (choice < 1 || choice > 3){
                System.out.println("ERROR! Please enter a valid input.");
                choice = input.nextInt();
                cont = 1;
            }
            if (choice == 1){
                cont = 0;
                genSkinCare(cl, db);
            }
            if (choice == 2){
                cont = 0;
                addSkinCare(cl, db);
            }
            if (choice == 3) {
                System.out.println("program terminated.");
                System.exit(0);
            }

        }


    }

    /**
     *
     */
    public static void addSkinCare(CareList cl, DB db) {
        initialMenu(cl,db);
    }
}