package controller;

import model.Game;
import view.GameView;

public class GameController {

    private Game game;
    private GameView gameView;

    public GameController() {
        this.game = new Game();
        this.gameView = new GameView(this);

        gameView.setGame(game);

    }

    public Game getGame() {
        return game;
    }

    public GameView getGameView() {
        return gameView;
    }

}
