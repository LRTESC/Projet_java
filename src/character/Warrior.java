package character;

import equipment.weapon.Sword;

import java.util.Random;

public class Warrior extends Player {
    private static final Random random = new Random();


    /**
     * Create a new player using given parameters
     *
     * @param name of the player
     * @param type

     */
    public Warrior(String name) {
        super(name, random.nextInt(15,20),new Sword());
    }
}
