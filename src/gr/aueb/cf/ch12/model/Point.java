package gr.aueb.cf.ch12.model;

/**
 * Defines a 2-dimension point.
 */
public class Point {
    private static int no0fPoints = 0;
    private int x;
    private int y;

    public Point() {
        no0fPoints++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        no0fPoints++;
    }

    public static int getNoOfPoints() {
        return no0fPoints;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
