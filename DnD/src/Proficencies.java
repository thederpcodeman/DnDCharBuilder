import java.util.ArrayList;

public class Proficencies {
    public ArrayList<Skill> list;
    public int totalLangs;


    public Proficencies() {
        list = new ArrayList<>();
        totalLangs = 0;
    }

    public void addskill(Skill n){
        if (n.type.equalsIgnoreCase("l")){
            totalLangs += 1;
        }
        if (n.name.equalsIgnoreCase("Any Language")){ // Extra language stacking
            for (Skill i : list){
                if (i.name.equalsIgnoreCase(n.name)){
                    i.level += n.level;
                    return;
                }
            }
            list.add(n);
            return;
        }

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