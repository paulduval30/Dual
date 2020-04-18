package fr.paulduval30.screen;

import fr.paulduval30.component.BlocComponent;
import fr.paulduval30.component.DualComponent;
import fr.paulduval30.engine.GameEngine;
import fr.paulduval30.engine.GameGraphics;
import fr.paulduval30.engine.Screen;
import fr.paulduval30.model.Dual;
import fr.paulduval30.model.World;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DualScreen extends Screen {

    private World world;
    private DualComponent dualComponent;

    public DualScreen(World world) {
        this.world = world;
        this.dualComponent = new DualComponent(world.getDual());
    }

    @Override
    public void init() {

    }

    @Override
    public void render(GameEngine engine, GameGraphics gg) {
        gg.setColor(Color.BLACK);
        gg.fillRect(0 - engine.getCamera().getX(),0 - engine.getCamera().getY(), world.getWidth(), world.getHeight());
        dualComponent.render(engine, gg);
        for(int i = 0; i < world.getBlocs().size(); i++)
            new BlocComponent(world.getBlocs().get(i)).render(engine, gg);
    }

    @Override
    public void update(GameEngine engine) {
        if(engine.getInput().isKeyDown(KeyEvent.VK_RIGHT))
            world.getDual().rotate(Dual.ROTATE_SPEED);
        if(engine.getInput().isKeyDown(KeyEvent.VK_LEFT))
            world.getDual().rotate(-Dual.ROTATE_SPEED);

        engine.getCamera().translate(0, World.GAME_SPEED);
        world.translate(-World.GAME_SPEED);
    }
}
