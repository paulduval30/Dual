package fr.paulduval30.component;

import fr.paulduval30.engine.Component;
import fr.paulduval30.engine.GameEngine;
import fr.paulduval30.engine.GameGraphics;
import fr.paulduval30.model.Dual;

import java.awt.*;

public class DualComponent extends Component {

    private Dual dual;

    public DualComponent(Dual dual)
    {
        this.dual = dual;
    }
    @Override
    public void init() {

    }

    @Override
    public void render(GameEngine engine, GameGraphics gg) {
        gg.setColor(Color.RED);
        drawCircleByCenter(dual.getCircle1X(), dual.getCircle1Y(), dual.getCircleRadius() * 2, gg);

        gg.setColor(Color.BLACK);
        drawCircleByCenter(dual.getPosX(), dual.getPosY(), 10, gg);
        gg.setColor(Color.BLUE);
        drawCircleByCenter(dual.getCircle2X(), dual.getCircle2Y(), dual.getCircleRadius() * 2, gg);
    }

    @Override
    public void update(GameEngine engine) {
    }

    public void drawCircleByCenter(int posX, int posY, int diametre, GameGraphics gg)
    {
        posX -= diametre / 2;
        posY -= diametre / 2;

        gg.fillOval(posX, posY, diametre, diametre);
    }
}
