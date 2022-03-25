package model;

/**
 * @author Wael Mahrous
 * @version 1.0
 * @since 1.0
 */
public class Game {

    private Player player;
    private Map map;

    /**
     * Constructor for objects of class Game
     */
    public Game() {

        this.player = new Player();
        this.map = new Map(10, 10);

    }

    // PLace the Visible instance on the map

    /**
     * Place the Visible instance on the map
     * 
     * @param x       x coordinate
     * @param y       y coordinate
     * @param visible Visible instance
     */
    public void dropVisible(int x, int y, Object visible) {

        // this.map.set(x, y, visible);

        if (map.get(x, y) != null) {

            // If there is already something at the location,
            // create an array of the two objects and put it in the map.
            // If there is already an array, add the new object to the array

            if (map.get(x, y) instanceof Object[]) {

                Object[] array = (Object[]) map.get(x, y);
                Object[] newArray = new Object[array.length + 1];

                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }

                newArray[array.length] = visible;

                map.set(x, y, newArray);

            } else {

                Object[] array = new Object[2];
                array[0] = map.get(x, y);
                array[1] = visible;

                map.set(x, y, array);

            }

        } else {

            // If there is nothing at the location, just put the object in the map

            map.set(x, y, visible);

        }

    }

    // Drop an object on a random location on the map
    /**
     * Drop an object on a random location on the map
     * 
     * @param object Object to drop
     */
    public void dropRandom(Object object) {

        int x = (int) (Math.random() * this.map.getWidth());
        int y = (int) (Math.random() * this.map.getHeight());

        dropVisible(x, y, object);

    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer() {
        return player;
    }

}
