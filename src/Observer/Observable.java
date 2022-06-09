package Observer;

import Entities.Toy;

public interface Observable {
    void Add(final Observer observer);

    void Remove(final Observer observer);

    Toy Notify(String requestedToy);
}
