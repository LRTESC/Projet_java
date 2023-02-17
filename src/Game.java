import Board.Case;
import character.Player;
import Board.Plateau;

/**
 * Hold details about the current game
 */
public class Game {
    public static final int NB_CASE = 64;
    private Player player;
    private Dice dice;

    private Plateau plateau;

    public Game() {
        this.player = null;
        this.dice = new Dice();
        this.plateau = new Plateau();
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
            System.out.printf("You move throwdice cases forward...",moves);
            System.out.println();
            this.plateau.setPositionPlayer(plateau.getPositionPlayer() + moves);

            if (this.isFinished()) {
                System.out.println("You reach the end of the board");
            } else {
                this.plateau.getCurrentCase().start();
                System.out.printf("You have reached cell %d", this.plateau.getPositionPlayer() + 1);
            }
        }


        public boolean hasPlayer() {
            return this.player != null;
        }

        public void unsetPlayer() {
            this.player = null;
        }

        public boolean isFinished () {
            return this.plateau.getPositionPlayer() > 64;
        }
    }