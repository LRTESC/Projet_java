import character.Player;
import exception.PersonnageHorsPlateauException;

/**
 * Hold details about the current game
 */
public class Game{
    public static final int NB_CASE = 64;
    private Player player;
    private Dice dice;
    private int playerPosition;
    public Game() {
        this.player = null;
        this.playerPosition = 0;
        this.dice = new Dice();
    }


    public Player getPlayer() {
       return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void run() {
        System.out.println("TODO : run Game");
    }
        public void playTurn() {
            // The player throw the dice
            System.out.println("you launch the dice...");
            int moves = this.dice.throwDice();
            // and advance is player accordingly
            System.out.printf("You move %d cases forward...",moves);
            System.out.println();
            this.playerPosition += moves;
            try {
                isFinished();
                    System.out.println("You reach the end of the board");

            } catch (PersonnageHorsPlateauException e) {

                System.out.printf("You have reached cell %d", this.playerPosition + 1);
            }
        }

        public boolean hasPlayer() {
            return this.player != null;
        }

        public void unsetPlayer() {
            this.player = null;
        }

        public void isFinished () throws PersonnageHorsPlateauException {
            if(this.playerPosition > NB_CASE){
                throw new PersonnageHorsPlateauException();
            }
        }
    }