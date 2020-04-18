package fr.paulduval30.model;

import java.util.ArrayList;
import java.util.Collections;

public class World {

    public static final int GAME_SPEED = 3;

    private Dual dual;
    private int width;
    private int height;
    private int y;

    private ArrayList<Bloc> blocs;

    public World(Dual dual, int width, int height) {
        this.dual = dual;
        this.width = width;
        this.height = height;

        this.blocs = new ArrayList<>();
    }

    public void addBloc(Bloc b)
    {
        this.blocs.add(b);
    }

    public Dual getDual() {
        return this.dual;
    }

    public ArrayList<Bloc> getBlocs()
    {
        return this.blocs;
    }

    public ArrayList<Bloc> generateBlocsShape()
    {
        blocs.removeIf(b -> b.getPosY() > y + height);
        int shape = (int)(Math.random() * 6);
        ArrayList<Bloc> shapes = new ArrayList<>();
        if(blocs.size() >= 12)
            return shapes;

        int lastY = blocs.size() > 0 ? blocs.get(blocs.size() - 1).getPosY() : 0;
        int newY = lastY - Dual.CIRCLE_SPACE * 4;

        if(shape == 0)
        {
            System.out.println("Generating : " + 0);
            shapes.add(new Bloc(0, newY, 250, 50));
        }
        if(shape == 1)
        {
            System.out.println("Generating : " + 1);
            shapes.add(new Bloc(dual.getPosX() - 30, newY, 60, 50));
        }
        if(shape == 2)
        {
            System.out.println("Generating : " + 2);
            shapes.add(new Bloc(this.width - 250, newY, 250, 50));
        }
        if(shape == 3)
        {
            System.out.println("Generating : " + 2);
            shapes.add(new Bloc(0, newY, 250, 50));
            shapes.add(new Bloc(this.width - 250, newY, 250, 50));
        }
        if(shape == 4)
        {
            System.out.println("Generating : " + 2);
            shapes.add(new Bloc(0, newY, 350, 50));
        }
        if(shape == 5)
        {
            System.out.println("Generating : " + 2);
            shapes.add(new Bloc(this.width - 350, newY, 350, 50));
        }

        return shapes;
    }

    public void translate(int y)
    {
        this.y += y;
        this.dual.translate(0, y);
        blocs.addAll(this.generateBlocsShape());
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
