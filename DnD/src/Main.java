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
        int GenMode = uInint;
        //Assuming uInt == 1 for now

        scaa.nextLine();
        uIn = "";
        while (!uIn.equals("y") && (GenMode != 3)) { //Step 1, just a second are you sure, should be skipped when randomized.
            System.out.println();
            System.out.println("Step 1: the most important step.");
            System.out.println("The most important step when creating a character is to create a character concept,\nWhat kind of character are you looking to make?\nWhat kind of character would you enjoy role-playing?");
            System.out.println("Are you ready? (y/n)");
            uIn = scaa.nextLine().toLowerCase();
        }
        uInint = 0;
        System.out.println();
        if (GenMode != 3){
            System.out.println("Step 2: Ability Scores");
            System.out.println("A characters ability scores represent their innate physical and mental attributes,\nThey are: Strength (Str), Dexterity (Dex), Constitution (Con), Intelligence (Int), Wisdom (Wis), and Charisma (Cha).");
            while (uInint <= 1 || uInint > 6) {
                System.out.println("There are multiple ways to assign a characters stats, more than what is listed here, your DM has the final say on what methods are allowed.\n1:Give me more information\n2:Roll for stats (default)\n3:Standard array\n4:Point buy\n5:Randomize my stats please\n6:I'd like to apply my stats manually");
                uInint = scaa.nextInt();
                if (uInint == 1){
                    System.out.println("\nStrength represents physical strength, it is the primary stat of Barbarians, Fighters and Paladins, and determines your carrying capacity\nDexterity represents agility, finesse, and speed, it is the primary stat of Fighters, Monks, and Rangers, it determines your evasiveness in combat\nConstitution represents your toughness, and determines your maximum HP\nIntelligence represents your memory, book smarts, and ability to think quickly, it is the primary stat of Wizards\nWisdom represents experiential knowledge, street smarts, and, well, wisdom, it is the primary stat of Clerics, Druids, Monks, and Rangers, it determines your passive perception\nCharisma represents your force of personality, it is the primary stat of Bards, Paladins, Sorcerers, and Warlocks.\n");
                }
            }
        }else{
            uInint = 5;
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
        int speed = 0;
        int height = 0;
        int weight = 0;
        int baseHP = 0;
        ArrayList<Feature> features = new ArrayList<>();
        Proficencies skills = new Proficencies();
        while (cycle) {
            if (GenMode == 3) {
                uInint = (int) (Math.random() * 9) + 1;
            }else{
                System.out.println("Choose your characters race \n1:Dwarf, 2:Elf, 3:Halfling, 4:Human,\n5:Dragonborn, 6:Gnome, 7:Half-Elf, 8:Half-Orc\n9:Tiefling");
                uInint = scaa.nextInt();
            }
            scaa.nextLine();
            switch(uInint){
                case 1:
                    System.out.println("You have selected: Dwarf\nDwarves are short and stout humanoids, dwarves are known for their skill and resilience. They gain a +2 to Con and a subclass (+1-2)\nAre you sure You would like to play a dwarf: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")){
                        cycle = false;
                        race = "Dwarf";
                        speed = 25;
                        Con += 2;
                        features.add(new Feature("Darkvison", "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Dwarf", "PHB"));
                        features.add(new Feature("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage.", "Dwarf", "PHB"));
                        skills.addskill(new Skill("poison damage resistance", 1,  "Dr"));
                        skills.addskill(new Skill("handaxes", 1,  "sW"));
                        skills.addskill(new Skill("light hammers", 1,  "sW"));
                        skills.addskill(new Skill("warhammers", 1, "mW"));
                        while (uInint < 1 || uInint > 3) {
                            System.out.println("As a dwarf you are proficient with one of the following of your choice: 1:smith's tools, 2:brewer's supplies, or 3:mason's tools");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            skills.addskill(new Skill("smith's tools", 1,  "T"));

                        }else if (uInint == 2){
                            skills.addskill(new Skill("brewer's supplies", 1,  "T"));

                        }else if (uInint == 3){
                            skills.addskill(new Skill("mason's tools", 1,  "T"));

                        }
                        features.add(new Feature("Stonecunning", "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.", "Dwarf", "PHB"));
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Dwarfish", 1,  "L"));uInint = 0;
                        while (uInint < 1 || uInint > 2) {
                            System.out.println("Their are 2 subraces of dwarf:\nThe keen hill dwarves, who gain +1 wisdom and to their HP\nThe strong mountain dwarves, who gain +2 strength, and proficiency in light and medium armor\nWhat would you like to be 1:Hill Dwarf, 2:Mountain dwarf");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            Wis += 1;
                            subrace = "Hill Dwarf";
                            features.add(new Feature("Dwarven Toughness", "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.", "Hill Dwarf", "PHB"));
                            int uInint2 = 0;
                            while (uInint2 < 1 || uInint2 > 2) {
                                System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                                uInint2 = scaa.nextInt();
                            }
                            if (uInint2 == 1){
                                System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                                height = scaa.nextInt();
                                System.out.println("Enter weight in lbs:");
                                weight = scaa.nextInt();
                            }else if (uInint2 == 2){
                                int mod = (int) (4 * Math.random()) + (int) (4 * Math.random()) + 2;
                                height = 44 + mod;
                                weight = 115 + (mod * ((int) (6 * Math.random()) + (int) (6 * Math.random()) + 2));
                            }
                        }else if (uInint == 2){
                            Str += 2;
                            subrace = "Mountain Dwarf";
                            skills.addskill(new Skill("light armor", 1,  "A"));
                            skills.addskill(new Skill("medium armor", 1,  "A"));
                            int uInint2 = 0;
                            while (uInint2 < 1 || uInint2 > 2) {
                                System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                                uInint2 = scaa.nextInt();
                            }
                            if (uInint2 == 1){
                                System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                                height = scaa.nextInt();
                                System.out.println("Enter weight in lbs:");
                                weight = scaa.nextInt();
                            }else if (uInint2 == 2){
                                int mod = (int) (4 * Math.random()) + (int) (4 * Math.random()) + 2;
                                height = 48 + mod;
                                weight = 130 + (mod * ((int) (6 * Math.random()) + (int) (6 * Math.random()) + 2));
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("You have selected: Elf\nElves are slender and graceful humanoids, elves are known for their beauty, gracefulness and long-lifespans. They gain a +2 to Dex and a subclass (+1)\nAre you sure You would like to play an elf: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Elf";
                        speed = 30;
                        Dex += 2;
                        features.add(new Feature("Darkvision", "Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Elf", "PHB"));
                        features.add(new Feature("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic can't put you to sleep.", "Elf", "PHB"));
                        features.add(new Feature("Trance", "Elves do not sleep. Instead they meditate deeply, remaining semi-conscious, for 4 hours a day. The Common word for this meditation is \"trance.\" While meditating, you dream after a fashion; such dreams are actually mental exercises that have become reflexive after years of practice. After resting in this way, you gain the same benefit a human would from 8 hours of sleep.", "Elf", "PHB"));
                        skills.addskill(new Skill("perception", 1,  "Sk"));
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Elven", 1,  "L"));uInint = 0;

                        uInint = 0;
                        while (uInint < 1 || uInint > 3) {
                            System.out.println("Their are 3 subraces of elves:\nThe high elves, who gain +1 intelligence and a wizard cantrip\nThe wood elves, who gain +1 wisdom, and increased movement speed\nThe dark elves (drow), who gain +1 Charisma, increased darkvision, some minor magical abilities and a sensitivity to sunlight\nWhat would you like to be 1:High Elf, 2:Wood Elf, 3:Dark Elf");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            Int += 1;
                            subrace = "High Elf";
                            features.add(new Feature("Cantrip", "You know one cantrip of your choice from the Wizard spell list. Intelligence is your spellcasting ability for it.", "High Elf", "PHB"));
                            skills.addskill(new Skill("longswords", 1,  "mW"));
                            skills.addskill(new Skill("shortswords", 1,  "mW"));
                            skills.addskill(new Skill("shortbows", 1,  "sW"));
                            skills.addskill(new Skill("longbows", 1,  "mW"));
                            skills.addskill(new Skill("Any Language", 1,  "L"));uInint = 0;

                            int uInint2 = 0;
                            while (uInint2 < 1 || uInint2 > 2) {
                                System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                                uInint2 = scaa.nextInt();
                            }
                            if (uInint2 == 1){
                                System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                                height = scaa.nextInt();
                                System.out.println("Enter weight in lbs:");
                                weight = scaa.nextInt();
                            }else if (uInint2 == 2){
                                int mod = (int) (10 * Math.random()) + (int) (10 * Math.random()) + 2;
                                height = 54 + mod;
                                weight = 90 + (mod * ((int) (4 * Math.random()) +1));
                            }
                        }else if (uInint == 2){
                            Wis += 1;
                            subrace = "Wood Elf";
                            skills.addskill(new Skill("longswords", 1,  "mW"));
                            skills.addskill(new Skill("shortswords", 1,  "mW"));
                            skills.addskill(new Skill("shortbows", 1,  "sW"));
                            skills.addskill(new Skill("longbows", 1,  "mW"));
                            features.add(new Feature("Fleet of Foot", "Your base walking speed increases to 35 feet.", "Wood Elf", "PHB"));
                            speed = 35;
                            features.add(new Feature("Mask of the Wild", "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.", "Wood Elf", "PHB"));

                            int uInint2 = 0;
                            while (uInint2 < 1 || uInint2 > 2) {
                                System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                                uInint2 = scaa.nextInt();
                            }
                            if (uInint2 == 1){
                                System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                                height = scaa.nextInt();
                                System.out.println("Enter weight in lbs:");
                                weight = scaa.nextInt();
                            }else if (uInint2 == 2){
                                int mod = (int) (10 * Math.random()) + (int) (10 * Math.random()) + 2;
                                height = 54 + mod;
                                weight = 100 + (mod * ((int) (4 * Math.random()) +1));
                            }
                        }else if (uInint == 3){
                            Cha += 1;
                            subrace = "Dark Elf";
                            features.add(new Feature("Superior Darkvision", "Your darkvision has a range of 120 feet, instead of 60.", "Dark Elf", "PHB"));
                            features.add(new Feature("Sunlight Sensitivity", "You have disadvantage on attack rolls and Wisdom (Perception) checks that rely on sight when you, the target of the attack, or whatever you are trying to perceive is in direct sunlight.", "Dark Elf", "PHB"));
                            features.add(new Feature("Drow Magic", " You know the Dancing Lights cantrip. When you reach 3rd level, you can cast the Faerie Fire spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the Darkness spell once and regain the ability to do so when you finish a long rest. Charisma is your spellcasting ability for these spells.", "Dark Elf", "PHB"));
                            skills.addskill(new Skill("rapiers", 1,  "mW"));
                            skills.addskill(new Skill("shortswords", 1,  "mW"));
                            skills.addskill(new Skill("hand crossbows", 1,  "mW"));

                            int uInint2 = 0;
                            while (uInint2 < 1 || uInint2 > 2) {
                                System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                                uInint2 = scaa.nextInt();
                            }
                            if (uInint2 == 1){
                                System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                                height = scaa.nextInt();
                                System.out.println("Enter weight in lbs:");
                                weight = scaa.nextInt();
                            }else if (uInint2 == 2){
                                int mod = (int) (6 * Math.random()) + (int) (6 * Math.random()) + 2;
                                height = 53 + mod;
                                weight = 75 + (mod * ((int) (6 * Math.random()) +1));
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("You have selected: Halfling\nHalflings are small and friendly humanoids, Halflings are known for their hospitality, natural luck, and simple natures. They gain a +2 to Dex, and a subclass (+1)\nAre you sure You would like to play a Halfling: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Halfling";
                        speed = 25;
                        Dex += 2;
                        features.add(new Feature("Lucky", "When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die. You must use the new result, even if it is a 1.", "Halfling", "PHB"));
                        features.add(new Feature("Brave", "You have advantage on saving throws against being frightened.", "Halfling", "PHB"));
                        features.add(new Feature("Nimble", "You can move through the space of any creature that is of a size larger than yours.", "Halfling", "PHB"));
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Halfling", 1,  "L"));uInint = 0;
                        uInint = 0;
                        while (uInint < 1 || uInint > 2) {
                            System.out.println("Their are 2 subraces of halfling:\nThe lightfoot halflings, who gain +1 charisma and can hide more easily\nThe stout halflings, who gain +1 constitution, and resistance to poison\nWhat would you like to be 1:Lightfoot, 2:Stout");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            Cha += 1;
                            subrace = "Lightfoot Halfling";
                            features.add(new Feature("Naturally Stealthy", "You can attempt to hide even when you are only obscured by a creature that is at least one size larger than you.", "Lightfoot Halfling", "PHB"));

                        }else if (uInint == 2){
                            Con += 1;
                            subrace = "Stout Halfling";
                            features.add(new Feature("Stout Resilience", "You have advantage on saving throws against poison, and you have resistance to poison damage.", "Stout Halfling", "PHB"));
                            skills.addskill(new Skill("poison damage resistance", 1,  "Dr"));
                        }

                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1){
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        }else if (uInint2 == 2){
                            int mod = (int) (4 * Math.random()) + (int) (4 * Math.random()) + 2;
                            height = 31 + mod;
                            weight = 35 + (mod);
                        }
                    }
                    break;
                case 4:
                    System.out.println("You have selected: Human\nThey gain +1 to all stats, or optionally, they gain +1 to 2 ability scores of your choice(WIP)\nAre you sure You would like to play a Halfling: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().toLowerCase().equals("y")) {
                        cycle = false;
                        race = "Human";
                        speed = 30;
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Any Language", 1,  "L"));uInint = 0;
                        uInint = 0;
                        while (uInint < 1 || uInint > 1) {
                            System.out.println("Are you choosing Variant human 1:No, 2:Yes");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1) {
                            Str += 1;
                            Dex += 1;
                            Con += 1;
                            Int += 1;
                            Wis += 1;
                            Cha += 1;
                            subrace = "Standard Human";

                        } else if (uInint == 2) {

                        }

                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1) {
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        } else if (uInint2 == 2) {
                            int mod = (int) (10 * Math.random()) + (int) (10 * Math.random()) + 2;
                            height = 56 + mod;
                            weight = 110 + (mod * ((int) (4 * Math.random()) + ((int) (4 * Math.random()) + 2)));
                        }
                    }
                    break;
                    case 5:
                    System.out.println("You have selected: Dragonborn\nShaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race. They gain a +2 to Str, and +1 to Cha, and have a breath weapon\nAre you sure You would like to play a Dragonborn: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")){
                        cycle = false;
                        race = "Dragonborn";
                        speed = 30;
                        Str += 2;
                        Cha += 1;
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Draconic", 1,  "L"));uInint = 0;
                        uInint = 0;
                        while (uInint < 1 || uInint > 10) {
                            System.out.println("Their are many types of dragon, and as such many types of Dragonborn, you must choose one from which you inherit:\n1:Black, 2:Blue, 3:Brass, 4:Bronze, 5:Copper, 6:Gold, 7:Green, 8:Red, 9:Silver, 10:White");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            subrace = "Black Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Acid damage in a 5' by 30' line. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Black Dragonborn", "PHB"));
                            skills.addskill(new Skill("acid damage resistance", 1,  "Dr"));
                        }else if (uInint == 2){
                            subrace = "Blue Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Lightning damage in a 5' by 30' line. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Blue Dragonborn", "PHB"));
                            skills.addskill(new Skill("lightning damage resistance", 1,  "Dr"));
                        }else if (uInint == 3){
                            subrace = "Brass Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Fire damage in a 5' by 30' line. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Brass Dragonborn", "PHB"));
                            skills.addskill(new Skill("fire damage resistance", 1,  "Dr"));
                        }else if (uInint == 4){
                            subrace = "Bronze Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Lightning damage in a 5' by 30' line. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Bronze Dragonborn", "PHB"));
                            skills.addskill(new Skill("lightning damage resistance", 1,  "Dr"));
                        }else if (uInint == 5){
                            subrace = "Copper Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Acid damage in a 5' by 30' line. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Copper Dragonborn", "PHB"));
                            skills.addskill(new Skill("acid damage resistance", 1,  "Dr"));
                        }else if (uInint == 6){
                            subrace = "Gold Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Fire damage in a 15' cone. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Gold Dragonborn", "PHB"));
                            skills.addskill(new Skill("fire damage resistance", 1,  "Dr"));
                        }else if (uInint == 7){
                            subrace = "Green Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Poison damage in a 15' cone. When you use your breath weapon, all creatures in the area must make a Constitution saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Green Dragonborn", "PHB"));
                            skills.addskill(new Skill("poison damage resistance", 1,  "Dr"));
                        }else if (uInint == 8){
                            subrace = "Red Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Fire damage in a 15' cone. When you use your breath weapon, all creatures in the area must make a Dexterity saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Red Dragonborn", "PHB"));
                            skills.addskill(new Skill("fire damage resistance", 1,  "Dr"));
                        }else if (uInint == 9){
                            subrace = "Silver Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Cold damage in a 15' cone. When you use your breath weapon, all creatures in the area must make a Constitution saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "Silver Dragonborn", "PHB"));
                            skills.addskill(new Skill("cold damage resistance", 1,  "Dr"));
                        }else if (uInint == 10){
                            subrace = "White Dragonborn";
                            features.add(new Feature("Breath Weapon", " You can use your action to exhale destructive energy. It deals Cold damage in a 15' cone. When you use your breath weapon, all creatures in the area must make a Constitution saving throw. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.", "White Dragonborn", "PHB"));
                            skills.addskill(new Skill("cold damage resistance", 1,  "Dr"));
                        }

                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1) {
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        } else if (uInint2 == 2) {
                            int mod = (int) (8 * Math.random()) + (int) (8 * Math.random()) + 2;
                            height = 66 + mod;
                            weight = 175 + (mod * ((int) (6 * Math.random()) + ((int) (6 * Math.random()) + 2)));
                        }
                    }
                    break;
                case 6:
                    System.out.println("You have selected: Gnome\nGnomes are small and inventive humanoids, gnomes are known for their close-night communities, and love of invention and life. They gain a +2 to Int, and a subclass (+1)\nAre you sure You would like to play a Halfling: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")){
                        cycle = false;
                        race = "Gnome";
                        speed = 25;
                        Int += 2;
                        features.add(new Feature("Darkvision", "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Gnome", "PHB"));
                        features.add(new Feature("Gnome Cunning", "You have advantage on all Intelligence, Wisdom, and Charisma saves against magic.", "Gnome", "PHB"));
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Gnomish", 1,  "L"));uInint = 0;
                        uInint = 0;
                        while (uInint < 1 || uInint > 2) {
                            System.out.println("Their are 2 subraces of Gnome:\nForest Gnomes, who gain +1 Dex, can talk to small animals and create small illusions\nRock Gnomes, who gain +1 Con, and passing knowledge of artificey\nWhat would you like to be 1:Forest Gnome, 2:Rock Gnome");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            Dex += 1;
                            subrace = "Forest Gnome";
                            features.add(new Feature("Natural Illusionist", "You know the Minor Illusion cantrip. Intelligence is your spellcasting modifier for it.", "Forest Gnome", "PHB"));
                            features.add(new Feature("Speak with Small Beasts", "Through sound and gestures, you may communicate simple ideas with Small or smaller beasts", "Forest Gnome", "PHB"));
                        }else if (uInint == 2){
                            Con += 1;
                            subrace = "Rock Gnome";
                            features.add(new Feature("Artificer's Lore", "Whenever you make an Intelligence (History) check related to magical, alchemical, or technological items, you can add twice your proficiency bonus instead of any other proficiency bonus that may apply.", "Rock Gnome", "PHB"));
                            features.add(new Feature("Tinker", """
                                    You have proficiency with artisan tools (tinker's tools). Using those tools, you can spend 1 hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp).
                                    The device ceases to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time.
                                    When you create a device, choose one of the following options:
                                    Clockwork Toy. This toy is a clockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents.
                                    Fire Starter. The device produces a miniature flame, which you can use to light a candle, torch, or campfire. Using the device requires your action.
                                    Music Box. When opened, this music box plays a single song at a moderate volume. The box stops playing when it reaches the song's end or when it is closed.""", "Rock Gnome", "PHB"));

                        }

                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1) {
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        } else if (uInint2 == 2) {
                            int mod = (int) (4 * Math.random()) + (int) (4 * Math.random()) + 2;
                            height = 35 + mod;
                            weight = 35 + (mod);
                        }
                    }
                    break;
                    case 7:
                    System.out.println("You have selected: Half-Elf\nHalf-Elves are half elf, half human, and display a mix of the traits of both. They gain a +2 to Cha, and +1 to 2 other stats\nAre you sure You would like to play a Half-Elf: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Half-Elf";
                        speed = 30;
                        Cha += 2;
                        features.add(new Feature("Darkvision", "Thanks to your elven heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Half-Elf", "PHB"));
                        features.add(new Feature("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic can't put you to sleep.", "Half-Elf", "PHB"));
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Elven", 1,  "L"));uInint = 0;uInint = 0;
                        skills.addskill(new Skill("Any Language", 1,  "L"));uInint = 0;
                        while (uInint < 1 || uInint > 7) {
                            System.out.println("As a Half-Elf elf, you have the Half-Elf versatility feature, and must choose one of the following abilities based off of your Elven heritage:\n1:Skill Versatility (General), 2:Elf Weapon Training (High or Wood Elf Heritage), 3:Cantrip (High Elf Heritage), 4:Fleet of Foot (Wood Elf Heritage), 5:Mask of the Wild (Wood Elf Heritage), 6:Drow Magic (Dark Elf Heritage), 7:Swim Speed (Aquatic Elf Heritage)");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            features.add(new Feature("Skill Versatility", "", "Half-Elf", "PHB"));
                        }else if (uInint == 2){
                            skills.addskill(new Skill("longswords", 1,  "mW"));
                            skills.addskill(new Skill("shortswords", 1,  "mW"));
                            skills.addskill(new Skill("shortbows", 1,  "sW"));
                            skills.addskill(new Skill("longbows", 1,  "mW"));
                        }else if (uInint == 3){
                            features.add(new Feature("Cantrip", "You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.", "Half-Elf", "PHB"));
                        }else if (uInint == 4){
                            speed = 35;
                        }else if (uInint == 5){
                            features.add(new Feature("Mask of the Wild", "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.", "Half-Elf", "PHB"));
                        }else if (uInint == 6){
                            features.add(new Feature("Drow Magic", "You know the Dancing Lights cantrip. When you reach 3rd level, you can cast Faerie Fire once, and it recharges after a long rest. When you reach 5th level, you can cast Darkness once, and it recharges after a long rest. Charisma is your spellcasting ability for these spells.", "Half-Elf", "PHB"));
                        }else if (uInint == 7){
                            features.add(new Feature("Swim Speed", "You have a swimming speed of 30 feet.", "Half-Elf", "PHB"));
                        }
                        uInint = 0;
                        while (uInint < 1 || uInint > 10) {
                            System.out.println("As a Half-Elf elf, you gain +1 in two Ability scores other than Charisma, which two would you like:\n1: Str/Dex, 2:Str/Con\n3:Str/Int, 4:Str/Wis\n5:Dex/Con, 6:Dex/Int\n7:Dex/Wis, 8:Con/Int\n9:Con/Wis, 10:Int/Wis");
                            uInint = scaa.nextInt();
                        }
                        if (uInint == 1){
                            Str += 1;
                            Dex += 1;
                        }else if (uInint == 2){
                            Str += 1;
                            Con += 1;
                        }else if (uInint == 3){
                            Str += 1;
                            Int += 1;
                        }else if (uInint == 4){
                            Str += 1;
                            Wis += 1;
                        }else if (uInint == 5){
                            Con += 1;
                            Dex += 1;
                        }else if (uInint == 6){
                            Int += 1;
                            Dex += 1;
                        }else if (uInint == 7){
                            Wis += 1;
                            Dex += 1;
                        }else if (uInint == 8){
                            Con += 1;
                            Int += 1;
                        }else if (uInint == 9){
                            Con += 1;
                            Wis += 1;
                        }else if (uInint == 10){
                            Int += 1;
                            Wis += 1;
                        }

                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1) {
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        } else if (uInint2 == 2) {
                            int mod = (int) (8 * Math.random()) + (int) (8 * Math.random()) + 2;
                            height = 57 + mod;
                            weight = 110 + (mod * ((int) (4 * Math.random()) + ((int) (4 * Math.random()) + 2)));
                        }


                    }
                    break;
                case 8:
                    System.out.println("You have selected: Half-Orc\nHalf-Orcs are half orc, half human, and display a mix of the traits of both. They gain a +2 to Str, and +1 to Con, and have savage attacks and relentless endurance\nAre you sure You would like to play a Half-Orc: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                        cycle = false;
                        race = "Half-Orc";
                        speed = 30;
                        Str += 2;
                        Con += 1;
                        features.add(new Feature("Darkvision", "Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Half-Orc", "PHB"));
                        skills.addskill(new Skill("intimidation", 1, "Sk"));
                        features.add(new Feature("Relentless Endurance", "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use this feature again until you finish a long rest.", "Half-Orc", "PHB"));
                        features.add(new Feature("Savage Attacks", "When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit.", "Half-Orc", "PHB"));
                        skills.addskill(new Skill("Common", 1,  "L"));uInint = 0;
                        skills.addskill(new Skill("Orc", 1,  "L"));uInint = 0;
                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1) {
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        } else if (uInint2 == 2) {
                            int mod = (int) (10 * Math.random()) + (int) (10 * Math.random()) + 2;
                            height = 58 + mod;
                            weight = 140 + (mod * ((int) (6 * Math.random()) + ((int) (6 * Math.random()) + 2)));
                        }
                    }


                    break;
                case 9:
                    System.out.println("You have selected: Tiefling\nTiefling are mostly human, but with fiendish heritage somewhere in their bloodline. They gain a +2 to Cha, and +1 to Int, and have resistance to fire damage\nAre you sure You would like to play a Tiefling: (y/n)");
                    if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                        cycle = false;
                        race = "Tiefling";
                        speed = 30;
                        Cha += 2;
                        Int += 1;
                        features.add(new Feature("Darkvision", "Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.", "Tiefling", "PHB"));
                        skills.addskill(new Skill("fire damage resistance", 1, "Dr"));
                        features.add(new Feature("Infernal Legacy", "ou know the thaumaturgy cantrip. When you reach 3rd level, you can cast the hellish rebuke spell as a 2nd-level spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the darkness spell once with this trait and regain the ability to do so when you finish a long rest. Charisma is your spellcasting ability for these spells.", "Tiefling", "PHB"));
                        skills.addskill(new Skill("Common", 1,  "L"));
                        skills.addskill(new Skill("Infernal", 1,  "L"));
                        int uInint2 = 0;
                        while (uInint2 < 1 || uInint2 > 2) {
                            System.out.println("how would you like to assign height and weight? (1:Manually, 2: Randomly)");
                            uInint2 = scaa.nextInt();
                        }
                        if (uInint2 == 1) {
                            System.out.println("Enter Height in inches (4ft = 48in, 5ft = 60in):");
                            height = scaa.nextInt();
                            System.out.println("Enter weight in lbs:");
                            weight = scaa.nextInt();
                        } else if (uInint2 == 2) {
                            int mod = (int) (8 * Math.random()) + (int) (8 * Math.random()) + 2;
                            height = 57 + mod;
                            weight = 110 + (mod * ((int) (4 * Math.random()) + ((int) (4 * Math.random()) + 2)));
                        }
                    }
                    break;




            }
        }

        System.out.println("Race:" + race + "\nSubrace:" + subrace + "\nStr, Dex, Con, Int, Wis, Cha:" + Str + " " + Dex + " " + Con + ", " + Int + " " + Wis + " " + Cha + "\n Height: " + height / 12 + "ft " + height % 12 + "in\nWeight: " + weight );



        System.out.println();
        System.out.println("Step 4: Class");
        System.out.println("Character class is the most important thing about a character, while at higher levels you are allowed to \"Multiclass\" Taking levels in more than one class, for now you are only selecting your class for 1st level. ");
        System.out.println("1:Barbarian, 2:Bard, 3:Cleric, 4:Druid\n5:Fighter, 6:Monk, 7:Paladin, 8:Ranger\n9:Rogue, 10:Sorcerer, 11:Warlock, 12:Wizard");
        uInint = scaa.nextInt();
        scaa.nextLine();
        String cCl = "";
        ArrayList<Integer> hitDie = new ArrayList<>();
        switch(uInint){
            case 1:
                System.out.println("You have selected: Barbarian\n Barbarians are powerful warriors that use their brute strength and reckless anger to destroy foes, most barbarians are tanky melee fighters.\nAre you sure you would like to be a barbarian (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    cCl = "Barbarian";
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Medium Armor", 1,  "A"));
                    skills.addskill(new Skill("Shields", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Martial Weapons", 1,  "mW"));
                    skills.addskill(new Skill("Strength", 1,  "St"));
                    skills.addskill(new Skill("Constitution", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Animal Handling", 1, "Sk"));
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Nature", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("Survival", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 12;
                    hitDie.add(12);
                    features.add(new Feature("Rage", "In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action.\nWhile raging, you gain the following benefits if you aren't wearing heavy armor:\n\tYou have advantage on Strength checks and Strength saving throws.\n\tWhen you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n\tYou have resistance to bludgeoning, piercing, and slashing damage.\nIf you are able to cast spells, you can't cast them or concentrate on them while raging.\nIf you are able to cast spells, you can't cast them or concentrate on them while raging\nYour rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.\nOnce you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.", "Barbarian", "PHB"));
                    features.add(new Feature("Unarmored Defence", "While you are not wearing any armor, your armor class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.", "Barbarian", "PHB"));

                }
                break;
            case 2:
                System.out.println("You have selected: Bard\nBards are trained performers, musicians, and artists who channel magic through their art\nWould you like to be a bard: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    cCl = "Bard";
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Hand Crossbows", 1,  "mW"));
                    skills.addskill(new Skill("Longswords", 1,  "mW"));
                    skills.addskill(new Skill("Rapiers", 1,  "mW"));
                    skills.addskill(new Skill("Shortswords", 1,  "mW"));
                    skills.addskill(new Skill("Dexterity", 1,  "St"));
                    skills.addskill(new Skill("Charisma", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Acrobatics", 1, "Sk"));
                    Sks.add(new Skill("Animal Handling", 1, "Sk"));
                    Sks.add(new Skill("Arcana", 1, "Sk"));
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Deception", 1, "Sk"));
                    Sks.add(new Skill("History", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Investigation", 1, "Sk"));
                    Sks.add(new Skill("Medicine", 1, "Sk"));
                    Sks.add(new Skill("Nature", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("Performance", 1, "Sk"));
                    Sks.add(new Skill("Persuasion", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    Sks.add(new Skill("Slight of Hand", 1, "Sk"));
                    Sks.add(new Skill("Stealth", 1, "Sk"));
                    Sks.add(new Skill("Survival", 1, "Sk"));
                    System.out.println("Choose 3 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second
                    System.out.println("Last skill");
                    listSkill(Sks, skills); //Third

                    baseHP += 8;
                    hitDie.add(8);
                    features.add(new Feature("Spellcasting", "[WIP]", "Bard", "PHB"));
                    features.add(new Feature("Bardic Inspiration", "You can inspire others through stirring words or music. To do so, you use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.\n" +
                            "\n" +
                            "Once within the next 10 minutes, the creature can roll the die and add the number rolled to one ability check, attack roll, or saving throw it makes. The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the DM says whether the roll succeeds or fails. Once the Bardic Inspiration die is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time.\n" +
                            "\n" +
                            "You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a long rest.\n" +
                            "\n" +
                            "Your Bardic Inspiration die changes when you reach certain levels in this class. The die becomes a d8 at 5th level, a d10 at 10th level, and a d12 at 15th level.", "Bard", "PHB"));

                }
                break;
            case 3:
                System.out.println("You have selected: Cleric\nClerics are divine spellcasters, and often healers, but can happily fill nearly any roll in the party\nAre you sure You would like to play a Cleric: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    cCl = "Cleric";
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Medium Armor", 1,  "A"));
                    skills.addskill(new Skill("Shields", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Wisdom", 1,  "St"));
                    skills.addskill(new Skill("Charisma", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("History", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Medicine", 1, "Sk"));
                    Sks.add(new Skill("Persuasion", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 8;
                    hitDie.add(8);
                    features.add(new Feature("Spellcasting", "[WIP]", "Cleric", "PHB"));
                    //Subclass
                }
                break;
            case 4:
                System.out.println("You have selected: Druid\nDruids commune with and harness the forces of nature in their magic, and strive to protect the natural order, they will not wear metal.\nAre you sure You would like to play a Druid: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    cCl = "Druid";
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Medium Armor", 1,  "A"));
                    skills.addskill(new Skill("Shields", 1,  "A"));
                    skills.addskill(new Skill("Clubs", 1,  "sW"));
                    skills.addskill(new Skill("Daggers", 1,  "sW"));
                    skills.addskill(new Skill("Darts", 1,  "sW"));
                    skills.addskill(new Skill("Javelins", 1,  "sW"));
                    skills.addskill(new Skill("Maces", 1,  "sW"));
                    skills.addskill(new Skill("Quaterstaffs", 1,  "sW"));
                    skills.addskill(new Skill("Scimitars", 1,  "mW"));
                    skills.addskill(new Skill("Sickles", 1,  "sW"));
                    skills.addskill(new Skill("Slings", 1,  "sW"));
                    skills.addskill(new Skill("Spears", 1,  "sW"));
                    skills.addskill(new Skill("Herbalism Kit", 1,  "t"));
                    skills.addskill(new Skill("Wisdom", 1,  "St"));
                    skills.addskill(new Skill("Intelligence", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Animal Handling", 1, "Sk"));
                    Sks.add(new Skill("Arcana", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Nature", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("Survival", 1, "Sk"));
                    Sks.add(new Skill("Medicine", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 8;
                    hitDie.add(8);
                    features.add(new Feature("Druidic", "You know Druidic, the secret language of druids. You can speak the language and use it to leave hidden messages. You and others who know this language automatically spot such a message. Others spot the message's presence with a successful DC 15 Wisdom (Perception) check but can't decipher it without magic.", "Druid", "PHB"));
                    features.add(new Feature("Spellcasting", "[WIP]", "Druid", "PHB"));

                }
                break;
            case 5:
                System.out.println("You have selected: Fighter\nFighters are the masters of martial weapons, trained to perfection in their weapon of choice, and usually every other weapon\nAre you sure you want to play a fighter: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("All Armor", 1,  "A"));
                    skills.addskill(new Skill("Shields", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Martial Weapons", 1,  "mW"));
                    skills.addskill(new Skill("Strength", 1,  "St"));
                    skills.addskill(new Skill("Constitution", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Animal Handling", 1, "Sk"));
                    Sks.add(new Skill("Acrobatics", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("History", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("Survival", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 10;
                    hitDie.add(10);
                    features.add(new Feature("Second Wind", "You have a limited well of stamina that you can draw on to protect yourself from harm. On your turn, you can use a bonus action to regain hit points equal to 1d10 + your fighter level.\n" +
                            "\n" +
                            "Once you use this feature, you must finish a short or long rest before you can use it again.", "Fighter", "PHB"));
                    ArrayList<Skill> Fs = new ArrayList<>();
                    Fs.add(new FightingStyle("Archery", "You gain a +2 bonus to attack rolls you make with ranged weapons."));
                    Fs.add(new FightingStyle("Defense", "While you are wearing armor, you gain a +1 bonus to AC."));
                    Fs.add(new FightingStyle("Dueling", "When you are wielding a melee weapon in one hand and no other weapons, you gain a +2 bonus to damage rolls with that weapon."));
                    Fs.add(new FightingStyle("Great Weapon Fighting", "When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit."));
                    Fs.add(new FightingStyle("Protection", "When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the attack roll. You must be wielding a shield.\n"));
                    Fs.add(new FightingStyle("Two-Weapon Fighting", "When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack."));
                    listSkill(Fs, skills);
                }
                break;
            case 6:
                System.out.println("You have selected: Monk\nMonks live together in secluded monasteries, scattered throughout the countryside, these monks live and train together, and many of them, train in combat.\nMost monks never use this ability, but some leave their monestaries and become adventurers.\nThey are masters of their own bodies, are you sure you want to play a Monk: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Shortswords", 1,  "mW"));
                    //choose 1 tool
                    skills.addskill(new Skill("Strength", 1,  "St"));
                    skills.addskill(new Skill("Dexterity", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    Sks.add(new Skill("Acrobatics", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("History", 1, "Sk"));
                    Sks.add(new Skill("Stealth", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 8;
                    hitDie.add(8);
                    features.add(new Feature("Unarmored Defence", "Beginning at 1st level, while you are wearing no armor and not wielding a shield, your AC equals 10 + your Dexterity modifier + your Wisdom modifier.", "Monk", "PHB"));
                    features.add(new Feature("Martial Arts", "At 1st level, your practice of martial arts gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords and any simple melee weapons that don't have the two-handed or heavy property.\n" +
                            "\n" +
                            "You gain the following benefits while you are unarmed or wielding only monk weapons and you aren't wearing armor or wielding a shield:\n" +
                            "\n" +
                            "You can use Dexterity instead of Strength for the attack and damage rolls of your unarmed strikes and monk weapons.\n" +
                            "You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon. This die changes as you gain monk levels, as shown in the Martial Arts column of the Monk table.\n" +
                            "When you use the Attack action with an unarmed strike or a monk weapon on your turn, you can make one unarmed strike as a bonus action. For example, if you take the Attack action and attack with a quarterstaff, you can also make an unarmed strike as a bonus action, assuming you haven't already taken a bonus action this turn.\n" +
                            "Certain monasteries use specialized forms of the monk weapons. For example, you might use a club that is two lengths of wood connected by a short chain (called a nunchaku) or a sickle with a shorter, straighter blade (called a kama). Whatever name you use for a monk weapon, you can use the game statistics provided for the weapon on the Weapons page.", "Monk", "PHB"));

                }
                break;
            case 7:
                System.out.println("You have selected: Paladin\nPaladins are oath-swarn champions, often acting in sevice of a higher power, these knights use both their own might and the power of their oaths\nwould you like to play a paladin: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("All Armor", 1,  "A"));
                    skills.addskill(new Skill("Shields", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Martial Weapons", 1,  "mW"));
                    skills.addskill(new Skill("Wisdom", 1,  "St"));
                    skills.addskill(new Skill("Charisma", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Medicine", 1, "Sk"));
                    Sks.add(new Skill("Persuasion", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 10;
                    hitDie.add(10);
                    features.add(new Feature("Divine Sense", "The presence of strong evil registers on your senses like a noxious odor, and powerful good rings like heavenly music in your ears. As an action, you can open your awareness to detect such forces. Until the end of your next turn, you know the location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover. You know the type (celestial, fiend, or undead) of any being whose presence you sense, but not its identity (the vampire Count Strahd von Zarovich, for instance). Within the same radius, you also detect the presence of any place or object that has been consecrated or desecrated, as with the Hallow spell.\n" +
                            "\n" +
                            "You can use this feature a number of times equal to 1 + your Charisma modifier. When you finish a long rest, you regain all expended uses.", "Paladin", "PHB"));
                    features.add(new Feature("Lay On Hands", "Your blessed touch can heal wounds. You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal to your paladin level x 5.\n" +
                            "\n" +
                            "As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool.\n" +
                            "\n" +
                            "Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one.\n" +
                            "\n" +
                            "This feature has no effect on undead and constructs.", "Paladin", "PHB"));
                }
                break;
            case 8:
                System.out.println("You have selected: Ranger\nAre you sure You would like to play a Ranger: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Medium Armor", 1,  "A"));
                    skills.addskill(new Skill("Shields", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Martial Weapons", 1,  "mW"));
                    skills.addskill(new Skill("Strength", 1,  "St"));
                    skills.addskill(new Skill("Dexterity", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Animal Handling", 1, "Sk"));
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Investigation", 1, "Sk"));
                    Sks.add(new Skill("Nature", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("Stealth", 1, "Sk"));
                    Sks.add(new Skill("Survival", 1, "Sk"));
                    System.out.println("Choose 3 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second
                    System.out.println("Last skill");
                    listSkill(Sks, skills); //Third

                    baseHP += 10;
                    hitDie.add(10);
                    uInint = 0;
                    while (uInint < 1 || uInint > 2) {
                        System.out.println("As a Ranger you must choose between the Favored Enemy or Favored Foe features. 1:Favored Enemy, 2:Favored Foe");
                        uInint = scaa.nextInt();
                    }
                    if (uInint == 1){
                        features.add(new Feature("Favored Enemy","Beginning at 1st level, you have significant experience studying, tracking, hunting, and even talking to a certain type of enemy.\n" +
                                "\n" +
                                "Choose a type of favored enemy: aberrations, beasts, celestials, constructs, dragons, elementals, fey, fiends, giants, monstrosities, oozes, plants, or undead. Alternatively, you can select two races of humanoid (such as gnolls and orcs) as favored enemies.\n" +
                                "\n" +
                                "You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on Intelligence checks to recall information about them.\n" +
                                "\n" +
                                "When you gain this feature, you also learn one language of your choice that is spoken by your favored enemies, if they speak one at all.\n" +
                                "\n" +
                                "You choose one additional favored enemy, as well as an associated language, at 6th and 14th level. As you gain levels, your choices should reflect the types of monsters you have encountered on your adventures.","Ranger","PHB"));
                    }else if (uInint == 2){
                        features.add(new Feature("Favored Foe","This 1st-level feature replaces the Favored Enemy feature and works with the Foe Slayer feature. You gain no benefit from the replaced feature and don't qualify for anything in the game that requires it.\n" +
                                "\n" +
                                "When you hit a creature with an attack roll, you can call on your mystical bond with nature to mark the target as your favored enemy for 1 minute or until you lose your concentration (as if you were concentrating on a spell).\n" +
                                "\n" +
                                "The first time on each of your turns that you hit the favored enemy and deal damage to it, including when you mark it, you increase that damage by 1d4.\n" +
                                "\n" +
                                "You can use this feature to mark a favored enemy a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.\n" +
                                "\n" +
                                "This feature's extra damage increases when you reach certain levels in this class: to 1d6 at 6th level and to 1d8 at 14th level.","Ranger","PHB"));
                    }
                    uInint = 0;
                    while (uInint < 1 || uInint > 2) {
                        System.out.println("As a Ranger you must choose between the Natural Explorer or Deft Explorer features. 1:Natural Explorer, 2:Deft Explorer");
                        uInint = scaa.nextInt();
                    }
                    if (uInint == 1){
                        features.add(new Feature("Natural Explorer","Also at 1st level, you are particularly familiar with one type of natural environment and are adept at traveling and surviving in such regions. Choose one type of favored terrain: arctic, coast, desert, forest, grassland, mountain, swamp, or the Underdark. When you make an Intelligence or Wisdom check related to your favored terrain, your proficiency bonus is doubled if you are using a skill that you’re proficient in.\n" +
                                "\n" +
                                "While traveling for an hour or more in your favored terrain, you gain the following benefits:\n" +
                                "\n" +
                                "Difficult terrain doesn’t slow your group’s travel.\n" +
                                "Your group can’t become lost except by magical means.\n" +
                                "Even when you are engaged in another activity while traveling (such as foraging, navigating, or tracking), you remain alert to danger.\n" +
                                "If you are traveling alone, you can move stealthily at a normal pace.\n" +
                                "When you forage, you find twice as much food as you normally would.\n" +
                                "While tracking other creatures, you also learn their exact number, their sizes, and how long ago they passed through the area.\n" +
                                "You choose additional favored terrain types at 6th and 10th level.","Ranger","PHB"));
                    }else if (uInint == 2){
                        features.add(new Feature("Deft Explorer","This 1st-level feature replaces the Natural Explorer feature. You gain no benefit from the replaced feature and don't qualify for anything in the game that requires it.\n" +
                                "\n" +
                                "You are an unsurpassed explorer and survivor, both in the wilderness and in dealing with others on your travels. You gain the Canny benefit below, and you gain an additional benefit when you reach 6th level and 10th level in this class.\n" +
                                "\n" +
                                "Canny (1st Level)\n" +
                                "Choose one of your skill proficiencies. Your proficiency bonus is doubled for any ability check you make using the chosen skill.\n" +
                                "\n" +
                                "You can also speak, read, and write 2 additional languages of your choice.\n" +
                                "\n" +
                                "Roving (6th Level)\n" +
                                "Your walking speed increases by 5, and you gain a climbing speed and a swimming speed equal to your walking speed.\n" +
                                "\n" +
                                "Tireless (10th Level)\n" +
                                "As an action, you can give yourself a number of temporary hit points equal to 1d8 + your Wisdom modifier (minimum of 1 temporary hit point). You can use this action a number of times equal to your proficiency bonus, and you regain all expended uses when you finish a long rest.\n" +
                                "\n" +
                                "In addition, whenever you finish a short rest, your exhaustion level, if any, is decreased by 1.","Ranger","PHB"));
                    }

                }
                break;
            case 9:
                System.out.println("You have selected: Rogue\nRogues are stealthy and noble, and strike from the shadows when there least expected\nAre you sure You would like to play a Tiefling: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Longswords", 1,  "mW"));
                    skills.addskill(new Skill("Rapiers", 1,  "mW"));
                    skills.addskill(new Skill("Shortswords", 1,  "mW"));
                    skills.addskill(new Skill("Hand Crossbows", 1,  "mW"));
                    skills.addskill(new Skill("Theves Tool's", 1,  "t"));
                    skills.addskill(new Skill("Dexterity", 1,  "St"));
                    skills.addskill(new Skill("Intelligence", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Acrobatics", 1, "Sk"));
                    Sks.add(new Skill("Athletics", 1, "Sk"));
                    Sks.add(new Skill("Deception", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Investigation", 1, "Sk"));
                    Sks.add(new Skill("Perception", 1, "Sk"));
                    Sks.add(new Skill("Performance", 1, "Sk"));
                    Sks.add(new Skill("Persuasion", 1, "Sk"));
                    Sks.add(new Skill("Slight of Hand", 1, "Sk"));
                    Sks.add(new Skill("Stealth", 1, "Sk"));
                    System.out.println("Choose 4 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second
                    System.out.println("Third skill");
                    listSkill(Sks, skills); //Third
                    System.out.println("Fourth skill");
                    listSkill(Sks, skills); //4th

                    baseHP += 10;
                    hitDie.add(10);
                    features.add(new Feature("Sneak Attack","Beginning at 1st level, you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon.\n" +
                            "\n" +
                            "You don't need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn't incapacitated, and you don't have disadvantage on the attack roll.\n" +
                            "\n" +
                            "The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.","Rogue","PHB"));
                    features.add(new Feature("Thieves' Cant ","During your rogue training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly.\n" +
                            "\n" +
                            "In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.","Rogue","PHB"));
                    //Choose 2 lv 2

                }
                break;
            case 10:
                System.out.println("You have selected: Sorcerer\nSorcerers are people who gained magic, not through rigorous study, or through a deal or dealing with a higher power, but essentially at random\nAre you sure You would like to play a Sorcerer: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("Daggers", 1,  "sW"));
                    skills.addskill(new Skill("Darts", 1,  "sW"));
                    skills.addskill(new Skill("Slings", 1,  "sW"));
                    skills.addskill(new Skill("Quarterstaffs", 1,  "sW"));
                    skills.addskill(new Skill("Light Crossbows", 1,  "sW"));
                    skills.addskill(new Skill("Constitution", 1,  "St"));
                    skills.addskill(new Skill("Charisma", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Arcana", 1, "Sk"));
                    Sks.add(new Skill("Deception", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Persuasion", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 6;
                    hitDie.add(6);
                    features.add(new Feature("Spellcasting", "[WIP]", "Sorcerer", "PHB"));
                    //Subclass
                }
                break;
            case 11:
                System.out.println("You have selected: Warlock\nWarlocks are spellcasters that derive their power from a deal with a powerful entity\nAre you sure You would like to play a Warlock: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("Light Armor", 1,  "A"));
                    skills.addskill(new Skill("Simple Weapons", 1,  "sW"));
                    skills.addskill(new Skill("Wisdom", 1,  "St"));
                    skills.addskill(new Skill("Charisma", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Arcana", 1, "Sk"));
                    Sks.add(new Skill("Deception", 1, "Sk"));
                    Sks.add(new Skill("History", 1, "Sk"));
                    Sks.add(new Skill("Intimidation", 1, "Sk"));
                    Sks.add(new Skill("Investigation", 1, "Sk"));
                    Sks.add(new Skill("Nature", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second


                    baseHP += 8;
                    hitDie.add(8);
                    features.add(new Feature("Pact Magic", "[WIP]", "Warlock", "PHB"));
                    //subclass
                }
                break;
            case 12:
                System.out.println("You have selected: Wizard\nWizards are scholars of magic, who use their knowledge of the weave of magic to harness arcane power\nAre you sure You would like to play a Tiefling: (y/n)");
                if ((GenMode == 3 ) || scaa.nextLine().equalsIgnoreCase("y")) {
                    skills.addskill(new Skill("Daggers", 1,  "sW"));
                    skills.addskill(new Skill("Darts", 1,  "sW"));
                    skills.addskill(new Skill("Slings", 1,  "sW"));
                    skills.addskill(new Skill("Quarterstaffs", 1,  "sW"));
                    skills.addskill(new Skill("Light Crossbows", 1,  "sW"));
                    skills.addskill(new Skill("Wisdom", 1,  "St"));
                    skills.addskill(new Skill("Intelligence", 1,  "St"));

                    ArrayList<Skill> Sks = new ArrayList<>();
                    Sks.add(new Skill("Arcana", 1, "Sk"));
                    Sks.add(new Skill("History", 1, "Sk"));
                    Sks.add(new Skill("Insight", 1, "Sk"));
                    Sks.add(new Skill("Investigation", 1, "Sk"));
                    Sks.add(new Skill("Medicine", 1, "Sk"));
                    Sks.add(new Skill("Religion", 1, "Sk"));
                    System.out.println("Choose 2 Skills (one at a time)");
                    listSkill(Sks, skills); //first
                    System.out.println("Next skill");
                    listSkill(Sks, skills); //second

                    baseHP += 6;
                    hitDie.add(6);
                    features.add(new Feature("Spellcasting", "[WIP]", "Wizard", "PHB"));
                    features.add(new Feature("Arcane Recovery", "You have learned to regain some of your magical energy by studying your spellbook. Once per day when you finish a short rest, you can choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your wizard level (rounded up), and none of the slots can be 6th level or higher.\n" +
                            "\n" +
                            "For example, if you're a 4th-level wizard, you can recover up to two levels worth of spell slots. You can recover either a 2nd-level spell slot or two 1st-level spell slots.", "Wizard", "PHB"));

                }
                break;
        }



        System.out.println();
        System.out.println("Step 5: Backround");
        System.out.println("Your characters background represents who they were before they became an adventurer, it has some limited, and mostly flavorful, mechanical impact.");
        System.out.println("Choose a background:\n1:Acolyte, 2:Charlatan, 3:Criminal, 4:Entertainer\n5:Folk Hero, 6:Guild Artisan, 7:Hermit, 8:Noble\n9:Outlander, 10:Sage, 11:Sailor, 12:Soldier\n13:Urchin");
        if (GenMode == 3){
            uInint = (int)(Math.random() * 13 + 1);
        }
        uInint = scaa.nextInt();
        scaa.nextLine();
        String background = "";
        switch(uInint) {
            case 1:
                background = "Acolyte";
                skills.addskill(new Skill("Any Language", 1,  "l"));
                skills.addskill(new Skill("Any Language", 1,  "l"));
                skills.addskill(new Skill("Insight", 1,  "Sk"));
                skills.addskill(new Skill("Religion", 1,  "Sk"));
                break;
            case 2:
                background = "Charlatan";
                skills.addskill(new Skill("Deception", 1,  "Sk"));
                skills.addskill(new Skill("Sleight of Hand", 1,  "Sk"));
                skills.addskill(new Skill("Disguise Kit", 1,  "t"));
                skills.addskill(new Skill("Forgery Kit", 1,  "t"));
                break;
            case 3:
                background = "Criminal";
                skills.addskill(new Skill("Deception", 1,  "Sk"));
                skills.addskill(new Skill("Stealth", 1,  "Sk"));
                skills.addskill(new Skill("Thieves' tools", 1,  "t"));
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); Gaming set?
                break;
            case 4:
                background = "Entertainer";
                skills.addskill(new Skill("Acrobatics", 1,  "Sk"));
                skills.addskill(new Skill("Performance", 1,  "Sk"));
                skills.addskill(new Skill("Disguise Kit", 1,  "t"));
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); musical instrument?
                break;
            case 5:
                background = "Folk Hero";
                skills.addskill(new Skill("Animal Handling", 1,  "Sk"));
                skills.addskill(new Skill("Survival", 1,  "Sk"));
                skills.addskill(new Skill("Land Vehicles", 1,  "t"));//?
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); Artisans tool?
                break;
            case 6:
                background = "Guild Artisan";
                skills.addskill(new Skill("Insight", 1,  "Sk"));
                skills.addskill(new Skill("Persuasion", 1,  "Sk"));
                skills.addskill(new Skill("Any Language", 1,  "l"));//
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); Artisans tool?
                break;
            case 7:
                background = "Hermit";
                skills.addskill(new Skill("Medicine", 1,  "Sk"));
                skills.addskill(new Skill("Religion", 1,  "Sk"));
                skills.addskill(new Skill("Herbalism Kit", 1,  "t"));//?
                skills.addskill(new Skill("Any Language", 1,  "l"));
                break;
            case 8:
                background = "Noble";
                skills.addskill(new Skill("History", 1,  "Sk"));
                skills.addskill(new Skill("Persuasion", 1,  "Sk"));
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); Gaming set?
                skills.addskill(new Skill("Any Language", 1,  "l"));
                break;
            case 9:
                background = "Outlander";
                skills.addskill(new Skill("Athletics", 1,  "Sk"));
                skills.addskill(new Skill("Survival", 1,  "Sk"));
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); musical instrument?
                skills.addskill(new Skill("Any Language", 1,  "l"));
                break;
            case 10:
                background = "Sage";
                skills.addskill(new Skill("Arcana", 1,  "Sk"));
                skills.addskill(new Skill("History", 1,  "Sk"));
                skills.addskill(new Skill("Any Language", 1,  "l"));
                skills.addskill(new Skill("Any Language", 1,  "l"));
                break;
            case 11:
                background = "Sailor";
                skills.addskill(new Skill("Athletics", 1,  "Sk"));
                skills.addskill(new Skill("Perception", 1,  "Sk"));
                skills.addskill(new Skill("Navigator's Tools", 1,  "t"));
                skills.addskill(new Skill("Water Vehicles", 1,  "t"));//?
                break;
            case 12:
                background = "Soldier";
                skills.addskill(new Skill("Athletics", 1,  "Sk"));
                skills.addskill(new Skill("Intimidation", 1,  "Sk"));
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); Gaming set?
                skills.addskill(new Skill("Land Vehicles", 1,  "t"));//?
                break;
            case 13:
                background = "Urchin";
                skills.addskill(new Skill("Sleight of Hand", 1,  "Sk"));
                skills.addskill(new Skill("Stealth", 1,  "Sk"));
                skills.addskill(new Skill("Disguise kit", 1,  "t"));
                skills.addskill(new Skill("thieves' tools", 1,  "t"));
                break;
            default:
                background = "Other";
                ArrayList<Skill> Sks = new ArrayList<>();
                Sks.add(new Skill("Acrobatics", 1, "Sk"));
                Sks.add(new Skill("Animal Handling", 1, "Sk"));
                Sks.add(new Skill("Arcana", 1, "Sk"));
                Sks.add(new Skill("Athletics", 1, "Sk"));
                Sks.add(new Skill("Deception", 1, "Sk"));
                Sks.add(new Skill("History", 1, "Sk"));
                Sks.add(new Skill("Insight", 1, "Sk"));
                Sks.add(new Skill("Intimidation", 1, "Sk"));
                Sks.add(new Skill("Investigation", 1, "Sk"));
                Sks.add(new Skill("Medicine", 1, "Sk"));
                Sks.add(new Skill("Nature", 1, "Sk"));
                Sks.add(new Skill("Perception", 1, "Sk"));
                Sks.add(new Skill("Performance", 1, "Sk"));
                Sks.add(new Skill("Persuasion", 1, "Sk"));
                Sks.add(new Skill("Religion", 1, "Sk"));
                Sks.add(new Skill("Slight of Hand", 1, "Sk"));
                Sks.add(new Skill("Stealth", 1, "Sk"));
                Sks.add(new Skill("Survival", 1, "Sk"));
                Sks.add(new Skill("Background Bonus Language", 1, "l"));
                Sks.add(new Skill("Background Extra Language", 1, "l"));
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); Gaming set?
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); musical instrument?
                //skills.addskill(new Skill("Forgery Kit", 1,  "t")); tool?
                System.out.println("Choose 4 Skills (one at a time)");
                listSkill(Sks, skills); //first
                System.out.println("Next skill");
                listSkill(Sks, skills); //second
                System.out.println("Third skill");
                listSkill(Sks, skills); //second
                System.out.println("Last skill");
                listSkill(Sks, skills); //second
                break;
        }

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
    public static void listSkill(ArrayList<Skill> list, Proficencies prof){
        ArrayList<Skill> un = new ArrayList<Skill>();
        for (Skill i : list){
            if ((i.name.equalsIgnoreCase("Any Language")) || (prof.getskill(i.name) != 0)){
                un.add(i);
            }
        }
        if (un.size() == 0){
            return;
        }
        Scanner scaaTheSecond = new Scanner(System.in);
        int u2 = 0;
        while (u2 < 1 || u2 > un.size()) {
            System.out.print("\n");
            System.out.print("Which would you like? ");
            for (Skill i : un) {
                System.out.print(un.indexOf(i) + ":" + i.name + "\n");
            }
            u2 = scaaTheSecond.nextInt();
        }
        prof.addskill(un.get(u2 -1));
        return;
    }
}