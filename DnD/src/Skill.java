public class Skill {
    public String name;
    public int level; // 0:not proficient (default), 1:Proficient, 2:Expertise

    public String type; // A = Armor, mW = Martial Weapon, sW = Simple weapon, Sk = Skill, T = Toll, L = Language, St = Saving throw, Dr = Resistance (2 is immunity), Dw = Weakness, Ci = Immunity (condition)
    public Skill(String call, int lv, String t){
        name = call.toLowerCase();
        level = lv;
        type = t;
    }
}


