import java.util.Random;

public class Dice {
    private final Random random;
    /**
     * generer un nombre aleatoire
     */
    public Dice(){
        this.random = new Random();
    }
    public int throwDice(){
        /*
          je dois generer un nombre entier entre 1 et 6
         */
        return this.random.nextInt(1, 7);
    }
}
