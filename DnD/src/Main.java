import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scaa = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        String uIn = "";
        while (!uIn.equals("y")) {
            System.out.println("This program allows you to easily and quickly create a legal dnd character.");
            System.out.println("Would you like to begin. (y/n)");
            uIn = scaa.nextLine().toLowerCase();
        }// ask the user to begin
        int uInint = 0;
        while (uInint != 1 && uInint != 2 && uInint != 3) {
            System.out.println("How would you like to make your character? (1: Manual(WIP), 2: Simplified(WIP), 3:Randomized(WIP))");
            uInint = scaa.nextInt();
        }// ask the user to begin

        //Assuming uInt == 1 for now

        scaa.nextLine();
        uIn = "";
        while (!uIn.equals("y")) { //Step 1, just a second are you sure, should be skipped when randomized.
            System.out.println("");
            System.out.println("Step 1: the most important step.");
            System.out.println("The most important step when creating a character is to create a character concept,\nWhat kind of character are you looking to make?\nWhat kind of character would you enjoy role-playing?");
            System.out.println("Are you ready? (y/n)");
            uIn = scaa.nextLine().toLowerCase();
        }
        scaa.nextInt();
        uInint = 0;
        System.out.println("");
        System.out.println("Step 2: Physical Characteristics.");
        System.out.println("Choosing your characters physical description can be a simple fun detail, or it might be important to the core of your character.\n your characters race contributes will contribute to your stats later, other physical characteristics are mostly for flavor, and have little to no mechanical effects.\n(Fantasy race has mechanical effects, and are more akin to species or sub-species than races.)");
        System.out.println("");
        System.out.println("(1:");

        scaa.nextInt();
        uInint = 0;
        System.out.println("");
        System.out.println("Step 2: Class");
        System.out.println("You class is the most important thing about a character, while at higher levels you are allowed to \"Multiclass\" Taking levels in more than one class, for now you are only selecting your class for 1st level. ");
        System.out.println("(1:");


    }
}