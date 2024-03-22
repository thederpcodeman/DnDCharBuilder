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
        int speed = 0;
        int height = 0;
        int weight = 0;
        ArrayList<Feature> features = new ArrayList<>();
        Proficencies skills = new Proficencies();
        while (cycle) {
            System.out.println("Choose your characters race \n1:Dwarf, 2:Elf, 3:Halfling, 4:Human,\n5:Dragonborn, 6:Gnome, 7:Half-Elf, 8:Half-Orc\n9:Tiefling");
            uInint = scaa.nextInt();
            scaa.nextLine();
            switch(uInint){
                case 1:
                    System.out.println("You have selected: Dwarf\nDwarves are short and stout humanoids, dwarves are known for their skill and resilience. They gain a +2 to Con and a subclass (+1-2)\nAre you sure You would like to play a dwarf: (y/n)");
                    if (scaa.nextLine().equalsIgnoreCase("y")){
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
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard consonants and guttural sounds, and those characteristics spill over into whatever other language a dwarf might speak", "Dwarf", "PHB"));
                        uInint = 0;
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
                    if (scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Elf";
                        speed = 30;
                        Dex += 2;
                        features.add(new Feature("Darkvision", "Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Elf", "PHB"));
                        features.add(new Feature("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic can't put you to sleep.", "Elf", "PHB"));
                        features.add(new Feature("Trance", "Elves do not sleep. Instead they meditate deeply, remaining semi-conscious, for 4 hours a day. The Common word for this meditation is \"trance.\" While meditating, you dream after a fashion; such dreams are actually mental exercises that have become reflexive after years of practice. After resting in this way, you gain the same benefit a human would from 8 hours of sleep.", "Elf", "PHB"));
                        skills.addskill(new Skill("perception", 1,  "Sk"));
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Elven.", "Elf", "PHB"));

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
                            features.add(new Feature("Extra Language", "You can read, speak, and write one additional language of your choice.", "High Elf", "PHB"));

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
                    if (scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Halfling";
                        speed = 25;
                        Dex += 2;
                        features.add(new Feature("Lucky", "When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die. You must use the new result, even if it is a 1.", "Halfling", "PHB"));
                        features.add(new Feature("Brave", "You have advantage on saving throws against being frightened.", "Halfling", "PHB"));
                        features.add(new Feature("Nimble", "You can move through the space of any creature that is of a size larger than yours.", "Halfling", "PHB"));
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Halfling.", "Halfling", "PHB"));

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
                    if (scaa.nextLine().toLowerCase().equals("y")) {
                        cycle = false;
                        race = "Human";
                        speed = 30;
                        features.add(new Feature("Languages", "You can speak, read, and write Common and one extra language of your choice. Humans typically learn the languages of other peoples they deal with, including obscure dialects. They are fond of sprinkling their speech with words borrowed from other tongues: Orc curses, Elvish musical expressions, Dwarvish military phrases, and so on.", "Human", "PHB"));

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
                    if (scaa.nextLine().equalsIgnoreCase("y")){
                        cycle = false;
                        race = "Dragonborn";
                        speed = 30;
                        Str += 2;
                        Cha += 1;
                        features.add(new Feature("Languages", "You can read, speak, and write Common and Draconic.", "Dragonborn", "PHB"));

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
                    if (scaa.nextLine().equalsIgnoreCase("y")){
                        cycle = false;
                        race = "Gnome";
                        speed = 25;
                        Int += 2;
                        features.add(new Feature("Darkvision", "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Gnome", "PHB"));
                        features.add(new Feature("Gnome Cunning", "You have advantage on all Intelligence, Wisdom, and Charisma saves against magic.", "Gnome", "PHB"));
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Gnomish.", "Gnome", "PHB"));

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
                    if (scaa.nextLine().toLowerCase().equals("y")){
                        cycle = false;
                        race = "Half-Elf";
                        speed = 30;
                        Cha += 2;
                        features.add(new Feature("Darkvision", "Thanks to your elven heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Half-Elf", "PHB"));
                        features.add(new Feature("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic can't put you to sleep.", "Half-Elf", "PHB"));
                        features.add(new Feature("Languages", "You can read, speak, and write Common, Elven, and one language of your choice.", "Half-Elf", "PHB"));
                        uInint = 0;
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
                    if (scaa.nextLine().equalsIgnoreCase("y")) {
                        cycle = false;
                        race = "Half-Orc";
                        speed = 30;
                        Str += 2;
                        Con += 1;
                        features.add(new Feature("Darkvision", "Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", "Half-Orc", "PHB"));
                        skills.addskill(new Skill("intimidation", 1, "Sk"));
                        features.add(new Feature("Relentless Endurance", "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use this feature again until you finish a long rest.", "Half-Orc", "PHB"));
                        features.add(new Feature("Savage Attacks", "When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit.", "Half-Orc", "PHB"));
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Orc. Orc is a harsh, grating language with hard consonants. It has no script of its own but is written in the Dwarvish script.", "Half-Orc", "PHB"));

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
                    if (scaa.nextLine().equalsIgnoreCase("y")) {
                        cycle = false;
                        race = "Tiefling";
                        speed = 30;
                        Cha += 2;
                        Int += 1;
                        features.add(new Feature("Darkvision", "Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.", "Tiefling", "PHB"));
                        skills.addskill(new Skill("fire damage resistance", 1, "Dr"));
                        features.add(new Feature("Infernal Legacy", "ou know the thaumaturgy cantrip. When you reach 3rd level, you can cast the hellish rebuke spell as a 2nd-level spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the darkness spell once with this trait and regain the ability to do so when you finish a long rest. Charisma is your spellcasting ability for these spells.", "Tiefling", "PHB"));
                        features.add(new Feature("Languages", "You can speak, read, and write Common and Infernal.", "Tiefling", "PHB"));

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

        System.out.println("Race:" + race + "\nSubrace:" + subrace + "Str, Dex, Con, Int, Wis, Cha:" + Str + " " + Dex + " " + Con + ", " + Int + " " + Wis + " " + Cha + "\n Height: " + height / 12 + "ft " + height % 12 + "in" );



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