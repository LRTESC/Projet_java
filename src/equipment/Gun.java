package equipment;
import Board.Items;
import Board.ItemsCase;
import character.Player;
import character.Warrior;

public abstract class Gun extends Items {

    /**
     * Definit un constructeur pour la classe ItemsCase qui prends un parametre de type entier appelé "pointsAttack"
     * Lorsqu'un objet de la classe "ItemsCase" est créé en appelant ce constructeur, la valeur passée en argument
     * pour "pointsAttack" est stockée dans la variable d'instance "PointsAttack"
     * cela permet d'initialiser la variable "PointsAttack" lorsqu'un objet de la classe "ItemsCase" est créé avec
     * une valeur spécifiée pour les points d'attaque
     *
     * @param pointsAttack
     */
    public Gun(int pointsAttack) {
        super(pointsAttack);
    }

    /**
     * Definit un constructeur pour la classe ItemsCase qui prends un parametre de type entier appelé "pointsAttack"
     * Lorsqu'un objet de la classe "ItemsCase" est créé en appelant ce constructeur, la valeur passée en argument
     * pour "pointsAttack" est stockée dans la variable d'instance "PointsAttack"
     * cela permet d'initialiser la variable "PointsAttack" lorsqu'un objet de la classe "ItemsCase" est créé avec
     * une valeur spécifiée pour les points d'attaque
     */

    @Override
    public void equip(Player player) {
        if (player instanceof Warrior) {
            int attackValue = player.getAttack() + getPointsAttack();
            player.setAttack(attackValue);
            System.out.println("Great weapon");
        }
    }
}