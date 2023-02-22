import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(g, sc);
        menu.run();
        Random rand = new Random();
        int res = rand.nextInt(1,7);
    }
}
