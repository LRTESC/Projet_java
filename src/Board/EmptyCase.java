package Board;

import character.Player;

public class EmptyCase extends Case {

    @Override
    public void start(Player player) {
        System.out.println("Nothing to see here !!");
    }
}
