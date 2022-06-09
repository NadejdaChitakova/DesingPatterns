package Observer;

import Entities.Toy;

import java.util.ArrayList;
import java.util.List;

public class MagicBoards implements Observable{
    private static MagicBoards _magicBoardInstance;
    private List<Observer> _listenersList;

    private MagicBoards(){
        _listenersList = new ArrayList<>();
    }

    public static MagicBoards getInstance(){
        if (_magicBoardInstance == null){
            _magicBoardInstance = new MagicBoards();
        }
        return  _magicBoardInstance;
    }

    public Toy WantedToy(String requestedToy){
        return this.Notify(requestedToy);
    }

    @Override
    public void Add(Observer observer) {
        _listenersList.add(observer);
    }

    @Override
    public void Remove(Observer observer) {
        _listenersList.remove(observer);
    }

    @Override
    public Toy Notify( String requestedToy) {
        final Toy[] toy = {null};
        _listenersList.stream().forEach( listeners ->{ toy[0] = listeners.update(requestedToy); });
        return toy[0];
    }
}