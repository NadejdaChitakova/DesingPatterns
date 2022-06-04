package Factory;

import Entities.Bike;
import Entities.Doll;
import Entities.Toy;

public class ToyFactory {
    public static Toy getToy(String type){
        if ("Doll".equalsIgnoreCase(type)){
            return  new Doll();
        }else if("Bike".equalsIgnoreCase(type)){
            return new Bike();
        }
        return null;
    }
}
