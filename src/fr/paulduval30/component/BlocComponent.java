package fr.paulduval30.component;

import fr.paulduval30.engine.Component;
import fr.paulduval30.engine.GameEngine;
import fr.paulduval30.engine.GameGraphics;
import fr.paulduval30.model.Bloc;

import java.awt.*;

public class BlocComponent extends Component {

    private Bloc bloc;

    public BlocComponent(Bloc bloc) {
        this.bloc = bloc;
    }

    @Override
    public void init() {

    }

    @Override
    public void render(GameEngine engine, GameGraphics gg) {
        gg.setColor(Color.LIGHT_GRAY);
        gg.fillRect(bloc.getPosX(), bloc.getPosY(), bloc.getWidth(), bloc.getHeight());
    }

    @Override
    public void update(GameEngine engine) {

    }
}
