package fr.paulduval30;

import fr.paulduval30.engine.GameEngine;
import fr.paulduval30.model.Bloc;
import fr.paulduval30.model.Dual;
import fr.paulduval30.model.World;
import fr.paulduval30.screen.DualScreen;

public class Main {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine("Dual", 600, 1000);
        World w = new World(new Dual(0, 300, 800, 20), 600, 1000);
        w.addBloc(new Bloc(300,0,100,50));
        engine.setScreen(new DualScreen(w));
        engine.start();
    }
}
