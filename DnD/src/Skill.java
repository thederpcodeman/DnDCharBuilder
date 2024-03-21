public class Skill {
    public String name;
    public int level; // 0:not proficient, 1:Proficient, 2:Expertise
    public int mod; // 1:Str, 2:Dex, 3:Con, 4:Int, 5:Wis, 6:Cha, Anything_else:None

    public String type; // A, mW, sW, Sk, T, L
    public Skill(String call, int lv, int m, String t){
        name = call.toLowerCase();
        level = lv;
        mod = m;
        type = t;
    }
}
