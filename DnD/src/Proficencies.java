import java.util.ArrayList;

public class Proficencies {
    public ArrayList<Skill> list;


    public Proficencies() {
        list = new ArrayList<>();
    }

    public void addskill(Skill n){
        if (n.level <= getskill(n.name.toLowerCase())){
                return;
        }
        for (Skill i : list){
            if (i.name.equalsIgnoreCase(n.name)){
                i.level = n.level;
                return;
            }
        }
        list.add(n);
        return;
    }

    public int getskill(String id){
        for (Skill i : list){
            if (i.name.equalsIgnoreCase(id)){
                return (i.level);
            }
        }
        return 0;
    }

}