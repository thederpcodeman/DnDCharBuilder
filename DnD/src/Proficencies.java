public class Proficencies {
    public int Atokens;

    public int Wtokens;

    public int Stokens;

    public int Ttokens;



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