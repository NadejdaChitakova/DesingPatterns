package Entities;

public class SantaClausSingleton {
    private static SantaClausSingleton _santaClausInstance;

    private SantaClausSingleton(){}

    public static SantaClausSingleton getInstance(){
        if (_santaClausInstance == null){
            _santaClausInstance = new SantaClausSingleton();
        }
        return  _santaClausInstance;
    }
}
