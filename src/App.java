import controller.GameController;
import model.Food;

public class App {

    public static void main(String[] args) {

        GameController gameController = new GameController();

        gameController.getGame().dropVisible(1, 1, gameController.getGame().getPlayer());

        for (int i = 0; i < 20; i++) {
            gameController.getGame().dropRandom(new Food());
        }

        gameController.getGameView().showMap();

    }

}