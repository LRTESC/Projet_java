package character;

import java.util.Random;

public class Wizard extends Player{
    private static final Random random = new Random();

    /**
     * Create a new player using given parameters
     *
     * @param name             of the player
     * @param type
     */
    public Wizard(String name, String type) {
        super(name, random.nextInt(3,6), random.nextInt(8,15), type );
    }
}
