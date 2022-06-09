package Entities;

import Command.CreateBikeCommand;
import Command.CreateDollCommand;

public class SantaClaus {
    private static SantaClaus _santaClausInstance;
    private CreateBikeCommand _createBike;
    private  CreateDollCommand _createDoll;

    private SantaClaus(){}

    public static SantaClaus getInstance(){
        if (_santaClausInstance == null){
            _santaClausInstance = new SantaClaus();
        }
        return  _santaClausInstance;
    }

    public String WantsDoll(){
        _createDoll.CreateToy();
        return "Doll";
    }

    public String WantsBike(){
        _createBike.CreateToy();
        return "Bike";
    }
}
