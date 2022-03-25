package model;

public class Player implements Visible {

    private int health;
    private int score;

    private int x;
    private int y;

    public Player() {
        this.health = 100;
        this.score = 0;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public int incrementScore() {
        score++;
        return score;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getShape() {
        return "P";
    }

}
