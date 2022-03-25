package view;

import controller.GameController;
import model.Game;
import model.Visible;

public class GameView {

    private GameController gameController;
    private Game game;

    public GameView(GameController gameController) {
        this.gameController = gameController;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void showMap() {

        for (int i = 0; i < game.getMap().getWidth(); i++) {
            for (int j = 0; j < game.getMap().getHeight(); j++) {

                if (game.getMap().get(i, j) instanceof Visible) {
                    System.out.print(((Visible) game.getMap().get(i, j)).getShape());

                } else if (game.getMap().get(i, j) instanceof Object[]) {

                    // Print the size of the array
                    System.out.print("[" + ((Object[]) game.getMap().get(i, j)).length + "]");

                } else {
                    System.out.print(" ");
                }

                System.out.print("\t");

            }
            System.out.println();
        }

    }

}
