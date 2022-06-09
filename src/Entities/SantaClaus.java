package Entities;

public class SantaClaus {
    private static SantaClaus _santaClausInstance;

    private SantaClaus(){}

    public static SantaClaus getInstance(){
        if (_santaClausInstance == null){
            _santaClausInstance = new SantaClaus();
        }
        return  _santaClausInstance;
    }
}
