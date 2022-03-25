package model;

import java.util.HashMap;

public class Map extends HashMap<int[], Object> {

    private int width;
    private int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;

        // Initialize map
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int[] location = { i, j };
                this.put(location, null);
            }
        }

    }

    // Replace the object at the given location
    public void set(int x, int y, Object object) {
        int[] location = this.keySet().stream().filter(key -> key[0] == x && key[1] == y).findFirst().get();
        this.put(location, object);
    }

    // Get the object at the given location
    public Object get(int x, int y) {
        int[] location = this.keySet().stream().filter(key -> key[0] == x && key[1] == y).findFirst().get();
        return this.get(location);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
