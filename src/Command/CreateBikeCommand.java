package Command;

import Entities.Toy;
import Observer.MagicBoards;

public class CreateBikeCommand implements Command{
    @Override
    public Toy CreateToy() {
        return MagicBoards.getInstance().WantedToy("Bike");
    }
}
