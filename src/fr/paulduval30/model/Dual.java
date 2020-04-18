package fr.paulduval30.model;

public class Dual {
    public static final int CIRCLE_SPACE = 100;
    public static final float ROTATE_SPEED = 0.05f;
    
    private float orientation;
    private int posX;
    private int posY;

    private int circle1X;
    private int circle1Y;

    private int circle2X;
    private int circle2Y;


    private int circleRadius;

    public Dual(int orientation, int posX, int posY, int circleRadius) {
        this.orientation = orientation;
        this.posX = posX;
        this.posY = posY;
        this.circleRadius = circleRadius;
        this.circle1X = this.posX + CIRCLE_SPACE;
        this.circle1Y = this.posY;

        this.circle2X = this.posX - CIRCLE_SPACE;
        this.circle2Y = this.posY;
}

    public void rotate(float deltaAngle)
    {
        this.orientation += deltaAngle;
        this.circle1X = (int) (posX + CIRCLE_SPACE * Math.cos(orientation) - CIRCLE_SPACE * Math.sin(orientation));
        this.circle1Y = (int)(posY + CIRCLE_SPACE * Math.sin(orientation) +  CIRCLE_SPACE * Math.cos(orientation));

        this.circle2X = (int) (posX - CIRCLE_SPACE * Math.cos(orientation) + CIRCLE_SPACE * Math.sin(orientation));
        this.circle2Y = (int)(posY - CIRCLE_SPACE * Math.sin(orientation) -  CIRCLE_SPACE * Math.cos(orientation));
    }

    public void translate(int x, int y)
    {
        this.posX += x;
        this.posY += y;

        this.circle1X += x;
        this.circle1Y += y;

        this.circle2X += x;
        this.circle2Y += y;
    }

    public float getOrientation() {
        return orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    public int getCircle1X() {
        return circle1X;
    }

    public void setCircle1X(int circle1X) {
        this.circle1X = circle1X;
    }

    public int getCircle1Y() {
        return circle1Y;
    }

    public void setCircle1Y(int circle1Y) {
        this.circle1Y = circle1Y;
    }

    public int getCircle2X() {
        return circle2X;
    }

    public void setCircle2X(int circle2X) {
        this.circle2X = circle2X;
    }

    public int getCircle2Y() {
        return circle2Y;
    }

    public void setCircle2Y(int circle2Y) {
        this.circle2Y = circle2Y;
    }
}
