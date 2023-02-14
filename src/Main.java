import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(g, sc);
        menu.run();
        EquipmentDefence defence = new EquipmentDefence("shield");
        EquipmentAttack attack = new EquipmentAttack("weapon");
    }
}
