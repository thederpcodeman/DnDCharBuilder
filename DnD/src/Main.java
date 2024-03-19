import java.util.ArrayList;
import java.util.Collections;
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
        uInint = 0;
        System.out.println("");
        System.out.println("Step 2: Ability Scores");
        System.out.println("A characters ability scores represent their innate physical and mental attributes,\nThey are: Strength (Str), Dexterity (Dex), Constitution (Con), Intelligence (Int), Wisdom (Wis), and Charisma (Cha).");
        while (uInint <= 1 || uInint > 6) {
            System.out.println("There are multiple ways to assign a characters stats, more than what is listed here, your DM has the final say on what methods are allowed.\n1:Give me more information\n2:Roll for stats (default)\n3:Standard array\n4:Point buy\n5:Randomize my stats please\n6:I'd like to apply my stats manually");
            uInint = scaa.nextInt();
            if (uInint == 1){
                System.out.println("\nStrength represents physical strength, it is the primary stat of Barbarians, Fighters and Paladins, and determines your carrying capacity\nDexterity represents agility, finesse, and speed, it is the primary stat of Fighters, Monks, and Rangers, it determines your evasiveness in combat\nConstitution represents your toughness, and determines your maximum HP\nIntelligence represents your memory, book smarts, and ability to think quickly, it is the primary stat of Wizards\nWisdom represents experiential knowledge, street smarts, and, well, wisdom, it is the primary stat of Clerics, Druids, Monks, and Rangers, it determines your passive perception\nCharisma represents your force of personality, it is the primary stat of Bards, Paladins, Sorcerers, and Warlocks.\n");
            }
        }
        int Str = 0;
        int Dex = 0;
        int Con = 0;
        int Int = 0;
        int Wis = 0;
        int Cha = 0;
        if (uInint == 2){
            int roll1 = rScore();
            int roll2 = rScore();
            int roll3 = rScore();
            int roll4 = rScore();
            int roll5 = rScore();
            int roll6 = rScore();
        }else if (uInint == 3){
            int roll1 = 15;
            int roll2 = 14;
            int roll3 = 13;
            int roll4 = 12;
            int roll5 = 10;
            int roll6 = 8;
        }else if (uInint == 4){

        }else if (uInint == 5){
            Str = rScore();
            Dex = rScore();
            Con = rScore();
            Int = rScore();
            Wis = rScore();
            Cha = rScore();
        }else if (uInint == 6){
            System.out.println("What is your Str?");
            Str = scaa.nextInt();
            System.out.println("What is your Dex?");
            Dex = scaa.nextInt();
            System.out.println("What is your Con?");
            Con = scaa.nextInt();
            System.out.println("What is your Int?");
            Int = scaa.nextInt();
            System.out.println("What is your Wis?");
            Wis = scaa.nextInt();
            System.out.println("What is your Cha?");
            Cha = scaa.nextInt();
        }
        System.out.println("Your stats:\nStr:" + Str);
        System.out.println("Dex:" + Dex);
        System.out.println("Con:" + Con);
        System.out.println("Int:" + Int);
        System.out.println("Wis:" + Wis);
        System.out.println("Cha:" + Cha);



        uInint = 0;
        System.out.println("");
        System.out.println("Step 3: Physical Characteristics.");
        System.out.println("Choosing your characters physical description can be a simple fun detail, or it might be important to the core of your character.\n your characters race contributes will contribute to your stats later, other physical characteristics are mostly for flavor, and have little to no mechanical effects.\n(Fantasy race has mechanical effects, and are more akin to species or sub-species than races.)");
        System.out.println("");
        System.out.println("(1:");


        scaa.nextInt();
        uInint = 0;
        System.out.println("");
        System.out.println("Step 4: Class");
        System.out.println("Character class is the most important thing about a character, while at higher levels you are allowed to \"Multiclass\" Taking levels in more than one class, for now you are only selecting your class for 1st level. ");
        System.out.println("(1:");


    }

    public static int rScore(){
        ArrayList<Integer> list = new ArrayList<>();
        Integer d6 = (int) (6 * Math.random() + 1);
        list.add(d6);
        d6 = (int) (6 * Math.random() + 1);
        list.add(d6);
        d6 = (int) (6 * Math.random() + 1);
        list.add(d6);
        d6 = (int) (6 * Math.random() + 1);
        list.add(d6);
        Collections.sort(list);
        return (list.get(1) + list.get(2) + list.get(3));
    }
}