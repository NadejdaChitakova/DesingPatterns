package com.company;

import Entities.SantaClaus;
import Entities.Toy;
import Factory.ToyFactory;
import Observer.MagicBoards;

public class Main {

    public static void main(String[] args) {
        SantaClaus _santaClaus = SantaClaus.getInstance();
        MagicBoards _magicBoard = MagicBoards.getInstance();
        Toy toy  = _magicBoard.WantedToy( _santaClaus.WantsDoll());
        ToyFactory.getDoll();
    }
}
