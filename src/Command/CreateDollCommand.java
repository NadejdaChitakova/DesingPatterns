package Command;

import Entities.Toy;
import Observer.MagicBoards;

public class CreateDollCommand implements Command{
    @Override
    public Toy CreateToy() {
        return MagicBoards.getInstance().WantedToy("Doll");
    }
}
