import donjon.Personnage;
import donjon.EquipmentAttack;
import donjon.EquipmentDefens;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Personnage perso = new Personnage("Laurent");
        EquipmentAttack attack = new EquipmentAttack("Weapon");
        EquipmentDefens defens = new EquipmentDefens("Sheild");
        System.out.println(perso.getName());
        System.out.println(attack.getName());
        System.out.println(defens.getName());

    }

}