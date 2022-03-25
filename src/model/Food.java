package model;

public class Food implements Visible {

    private int score;
    private String shape;

    private int x;
    private int y;

    public Food() {
        this.score = 0;
        this.shape = "*";
    }

    public int getScore() {
        return score;
    }

    public String getShape() {
        return shape;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
