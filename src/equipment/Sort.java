package equipment;
import Board.Items;
import Board.ItemsCase;
import character.Player;
import character.Warrior;
import character.Wizard;

public class Sort extends Items {


    /**
     * Definit un constructeur pour la classe ItemsCase qui prends un parametre de type entier appelé "pointsAttack"
     * Lorsqu'un objet de la classe "ItemsCase" est créé en appelant ce constructeur, la valeur passée en argument
     * pour "pointsAttack" est stockée dans la variable d'instance "PointsAttack"
     * cela permet d'initialiser la variable "PointsAttack" lorsqu'un objet de la classe "ItemsCase" est créé avec
     * une valeur spécifiée pour les points d'attaque
     *
     * @param pointsAttack
     */
    public Sort(int pointsAttack) {
        super(pointsAttack);
    }

    @Override
    public void equip(Player player) {
        System.out.println("Great Sort");
            if (player instanceof Wizard) {
                int attackValue = player.getAttack() + getPointsAttack();
                player.setAttack(attackValue);
            }
    }
}
