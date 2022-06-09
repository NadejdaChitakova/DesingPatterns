package Factory;

import Entities.Bike;
import Entities.Doll;

public class ToyFactory {
    public static Bike getBike(){
       return new Bike();
    }
    public static Doll getDoll(){
        return new Doll();
    }
}
