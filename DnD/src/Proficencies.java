public class Proficencies {

    private static final Proficencies instance = new Proficencies();

    // private constructor to avoid client applications using the constructor
    private Proficencies(){}

    public static Proficencies getInstance() {
        return instance;
    }

    public void addskill(){

    }

    public int getskill(String id){
        return 0;
    }
}