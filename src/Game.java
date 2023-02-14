/**
 * Hold details about the current game
 */
public class Game {
    private Player player;

    public Game(){
        this.player = null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void run(){
        System.out.println("TODO : run Game");
    }

    public boolean hasPlayer(){
        return this.player != null;
    }

    public void unsetPlayer(){
        this.player = null;
    }
}
