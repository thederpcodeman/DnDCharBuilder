import java.util.ArrayList;
import java.util.Arrays;
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
            System.out.println();
            System.out.println("Step 1: the most important step.");
            System.out.println("The most important step when creating a character is to create a character concept,\nWhat kind of character are you looking to make?\nWhat kind of character would you enjoy role-playing?");
            System.out.println("Are you ready? (y/n)");
            uIn = scaa.nextLine().toLowerCase();
        }
        uInint = 0;
        System.out.println();
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
            Integer roll1 = rScore();
            Integer roll2 = rScore();
            Integer roll3 = rScore();
            Integer roll4 = rScore();
            Integer roll5 = rScore();
            Integer roll6 = rScore();
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(roll1, roll2, roll3, roll4, roll5, roll6));
            Collections.sort(list);
            System.out.println("You must assign each of these numbers to one of your stats:");
            for (Integer i : list){
                System.out.println(i);
            }
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("what Will your Str score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Str = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Dex score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Dex = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Con score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Con = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Int score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Int = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Wis score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Wis = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Cha score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Cha = uInint;
            list.remove((Integer)(uInint));

        }else if (uInint == 3){
            Integer roll1 = 15;
            Integer roll2 = 14;
            Integer roll3 = 13;
            Integer roll4 = 12;
            Integer roll5 = 10;
            Integer roll6 = 8;
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(roll1, roll2, roll3, roll4, roll5, roll6));
            Collections.sort(list);
            System.out.println("You must assign each of these numbers to one of your stats:");
            for (Integer i : list){
                System.out.println(i);
            }
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("what Will your Str score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Str = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Dex score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Dex = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Con score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Con = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Int score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Int = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Wis score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Wis = uInint;
            list.remove((Integer)(uInint));
            uInint = 0;
            while (!list.contains(uInint)) {
                System.out.println("Will your Cha score be");
                uInint = scaa.nextInt();
            }// ask the user to begin
            Cha = uInint;
            list.remove((Integer)(uInint));

        }else if (uInint == 4){

            //Point buy

            System.out.println("You have selected:point buy, you have 27 points to spend on your ability scores,\n8's are free, 9's cost 1, 10's cost 2, 11's cost 3, 12's cost 4, 13's cost 5\n\t14's cost 7, 15's cost 9.");
            uInint = 0;
            int sPoints = 27;
            while (uInint < 8 || uInint > 15 || (uInint == 15 && sPoints < 9) || (uInint == 14 && sPoints < 7) || (uInint == 13 && sPoints < 5) || (uInint == 12 && sPoints < 4) || (uInint == 11 && sPoints < 3) || (uInint == 10 && sPoints < 2) || (uInint == 9 && sPoints < 1) ) {
                System.out.println("Will your Str score be?");
                System.out.println("You have " + sPoints + " Points left");
                uInint = scaa.nextInt();
            }
            Str = uInint;
            switch (uInint){
                case 9:
                    sPoints -= 1;
                    break;
                case 10:
                    sPoints -= 2;
                    break;
                case 11:
                    sPoints -= 3;
                    break;
                case 12:
                    sPoints -= 4;
                    break;
                case 13:
                    sPoints -= 5;
                    break;
                case 14:
                    sPoints -= 7;
                    break;
                case 15:
                    sPoints -= 9;
                    break;
            }
            uInint = 0;

            while (uInint < 8 || uInint > 15 || (uInint == 15 && sPoints < 9) || (uInint == 14 && sPoints < 7) || (uInint == 13 && sPoints < 5) || (uInint == 12 && sPoints < 4) || (uInint == 11 && sPoints < 3) || (uInint == 10 && sPoints < 2) || (uInint == 9 && sPoints < 1) ) {
                System.out.println("Will your Dex score be?");
                System.out.println("You have " + sPoints + " Points left");
                uInint = scaa.nextInt();
            }
            Dex = uInint;
            switch (uInint){
                case 9:
                    sPoints -= 1;
                    break;
                case 10:
                    sPoints -= 2;
                    break;
                case 11:
                    sPoints -= 3;
                    break;
                case 12:
                    sPoints -= 4;
                    break;
                case 13:
                    sPoints -= 5;
                    break;
                case 14:
                    sPoints -= 7;
                    break;
                case 15:
                    sPoints -= 9;
                    break;
            }
            uInint = 0;

            while (uInint < 8 || uInint > 15 || (uInint == 15 && sPoints < 9) || (uInint == 14 && sPoints < 7) || (uInint == 13 && sPoints < 5) || (uInint == 12 && sPoints < 4) || (uInint == 11 && sPoints < 3) || (uInint == 10 && sPoints < 2) || (uInint == 9 && sPoints < 1) ) {
                System.out.println("Will your Con score be?");
                System.out.println("You have " + sPoints + " Points left");
                uInint = scaa.nextInt();
            }
            Con = uInint;
            switch (uInint){
                case 9:
                    sPoints -= 1;
                    break;
                case 10:
                    sPoints -= 2;
                    break;
                case 11:
                    sPoints -= 3;
                    break;
                case 12:
                    sPoints -= 4;
                    break;
                case 13:
                    sPoints -= 5;
                    break;
                case 14:
                    sPoints -= 7;
                    break;
                case 15:
                    sPoints -= 9;
                    break;
            }
            uInint = 0;

            while (uInint < 8 || uInint > 15 || (uInint == 15 && sPoints < 9) || (uInint == 14 && sPoints < 7) || (uInint == 13 && sPoints < 5) || (uInint == 12 && sPoints < 4) || (uInint == 11 && sPoints < 3) || (uInint == 10 && sPoints < 2) || (uInint == 9 && sPoints < 1) ) {
                System.out.println("Will your Int score be?");
                System.out.println("You have " + sPoints + " Points left");
                uInint = scaa.nextInt();
            }
            Int = uInint;
            switch (uInint){
                case 9:
                    sPoints -= 1;
                    break;
                case 10:
                    sPoints -= 2;
                    break;
                case 11:
                    sPoints -= 3;
                    break;
                case 12:
                    sPoints -= 4;
                    break;
                case 13:
                    sPoints -= 5;
                    break;
                case 14:
                    sPoints -= 7;
                    break;
                case 15:
                    sPoints -= 9;
                    break;
            }
            uInint = 0;

            while (uInint < 8 || uInint > 15 || (uInint == 15 && sPoints < 9) || (uInint == 14 && sPoints < 7) || (uInint == 13 && sPoints < 5) || (uInint == 12 && sPoints < 4) || (uInint == 11 && sPoints < 3) || (uInint == 10 && sPoints < 2) || (uInint == 9 && sPoints < 1) ) {
                System.out.println("Will your Wis score be?");
                System.out.println("You have " + sPoints + " Points left");
                uInint = scaa.nextInt();
            }
            Wis = uInint;
            switch (uInint){
                case 9:
                    sPoints -= 1;
                    break;
                case 10:
                    sPoints -= 2;
                    break;
                case 11:
                    sPoints -= 3;
                    break;
                case 12:
                    sPoints -= 4;
                    break;
                case 13:
                    sPoints -= 5;
                    break;
                case 14:
                    sPoints -= 7;
                    break;
                case 15:
                    sPoints -= 9;
                    break;
            }
            uInint = 0;

            while (uInint < 8 || uInint > 15 || (uInint == 15 && sPoints < 9) || (uInint == 14 && sPoints < 7) || (uInint == 13 && sPoints < 5) || (uInint == 12 && sPoints < 4) || (uInint == 11 && sPoints < 3) || (uInint == 10 && sPoints < 2) || (uInint == 9 && sPoints < 1) ) {
                System.out.println("Will your Cha score be?");
                System.out.println("You have " + sPoints + " Points left");
                uInint = scaa.nextInt();
            }
            Cha = uInint;
            switch (uInint){
                case 9:
                    sPoints -= 1;
                    break;
                case 10:
                    sPoints -= 2;
                    break;
                case 11:
                    sPoints -= 3;
                    break;
                case 12:
                    sPoints -= 4;
                    break;
                case 13:
                    sPoints -= 5;
                    break;
                case 14:
                    sPoints -= 7;
                    break;
                case 15:
                    sPoints -= 9;
                    break;
            }
            uInint = 0;

            //End of Point buy


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
        System.out.println();
        System.out.println("Step 3: Physical Characteristics.");
        System.out.println("Choosing your characters physical description can be a simple fun detail, or it might be important to the core of your character.\n your characters race contributes will contribute to your stats later, other physical characteristics are mostly for flavor, and have little to no mechanical effects.\n(Fantasy race has mechanical effects, and are more akin to species or sub-species than races.)");
        System.out.println();
        boolean cycle = true;
        String race = "";
        String subrace = "";
        ArrayList<Feature> features = new ArrayList<>();
        while (cycle) {
            System.out.println("Choose your characters race \n1:Dwarf, 2:Elf, 3:Halfling, 4:Human,\n5:Dragonborn, 6:Gnome, 7:Half-Elf, 8:Half-Orc\n9:Tiefling");
            uInint = scaa.nextInt();
            scaa.nextLine();
            switch(uInint){
                case 1:
                    System.out.println("You have selected: Dwarf\nDwarves are short and stout humanoids, dwarves are known for their skill and resilience. They gain a +2 to Con\nAre you sure You would like to play a dwarf: (y/n)");
                    if (scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Dwarf";
                        Con += 2;
                        features.add(new Feature("Darkvison", "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Dwarf", "PHB"));
                        features.add(new Feature("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage.", "Dwarf", "PHB"));
                        features.add(new Feature("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, light hammer, and warhammer.", "Dwarf", "PHB"));
                        while (uInint < 1 || uInint > 3) {
                            System.out.println("As a dwarf you are proficient with one of the following of your choice: 1:smith's tools, 2:brewer's supplies, or 3:mason's tools");
                        }
                        if (uInint == 1){
                            features.add(new Feature("Tool Proficiency", "You gain proficiency with smith's tools.", "Dwarf", "PHB"));

                        }else if (uInint == 2){
                            features.add(new Feature("Tool Proficiency", "You gain proficiency with brewer's supplies.", "Dwarf", "PHB"));

                        }else if (uInint == 3){
                            features.add(new Feature("Tool Proficiency", "You gain proficiency with mason's tools.", "Dwarf", "PHB"));

                        }
                        features.add(new Feature("Stonecunning", "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.", "Dwarf", "PHB"));
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard consonants and guttural sounds, and those characteristics spill over into whatever other language a dwarf might speak", "Dwarf", "PHB"));
                        uInint = 0;
                        while (uInint < 1 || uInint > 2) {
                            System.out.println("Their are 2 subraces of dwarf:\nThe keen hill dwarves, who gain +1 wisdom and to their HP\nThe strong mountain dwarves, who gain +2 strength, and proficiency in light and medium armor\nWhat would you like to be 1:Hill Dwarf, 2:Mountain dwarf");
                        }
                        if (uInint == 1){
                            Wis += 1;
                            subrace = "Hill Dwarf";
                            features.add(new Feature("Dwarven Toughness", "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.", "Hill Dwarf", "PHB"));

                        }else if (uInint == 2){
                            Str += 2;
                            subrace = "Mountain Dwarf";
                            features.add(new Feature("Dwarven Armor Training", "You have proficiency with light and medium armor.", "Mountain Dwarf", "PHB"));

                        }
                    }
                    break;
                case 2:
                    System.out.println("You have selected: Elf\nElves are slender and graceful humanoids, elves are known for their beauty, gracefulness and long-lifespans. They gain a +2 to Dex\nAre you sure You would like to play an elf: (y/n)");
                    if (scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Elf";
                        Dex += 2;
                        uInint = 0;
                        while (uInint < 1 || uInint > 3) {
                            System.out.println("Their are 3 subraces of dwarf:\nThe high elves, who gain +1 intelligence and a wizard cantrip\nThe wood elves, who gain +1 wisdom, and increased movement speed\nThe dark elves (drow), who gain +1 Charisma, increased darkvision, some minor magical abilities and a sensitivity to sunlight\nWhat would you like to be 1:High Elf, 2:Wood Elf, 3:Dark Elf");
                        }
                        if (uInint == 1){
                            Int += 1;
                            subrace = "High Elf";
                        }else if (uInint == 2){
                            Wis += 1;
                            subrace = "Wood Elf";
                        }else if (uInint == 3){
                            Cha += 1;
                            subrace = "Dark Elf";
                        }
                    }
                    break;
            }
        }


        scaa.nextInt();
        System.out.println();
        System.out.println("Step 4: Class");
        System.out.println("Character class is the most important thing about a character, while at higher levels you are allowed to \"Multiclass\" Taking levels in more than one class, for now you are only selecting your class for 1st level. ");
        System.out.println("(1:");


    }

    public static int rScore(){
        ArrayList<Integer> list = new ArrayList<>();
        int d6 = (int) (6 * Math.random() + 1);
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