package Board;
import character.Player;
import character.Warrior;
import character.Wizard;

public class ItemsCase extends Case {


    private int PointsAttack;

    /**
     * Definit un constructeur pour la classe ItemsCase qui prends un parametre de type entier appelé "pointsAttack"
     * Lorsqu'un objet de la classe "ItemsCase" est créé en appelant ce constructeur, la valeur passée en argument
     * pour "pointsAttack" est stockée dans la variable d'instance "PointsAttack"
     * cela permet d'initialiser la variable "PointsAttack" lorsqu'un objet de la classe "ItemsCase" est créé avec
     * une valeur spécifiée pour les points d'attaque
     *
     * @param pointsAttack
     */

    public ItemsCase(int pointsAttack) {
        PointsAttack = pointsAttack;
    }

    @Override
    public void start(Player player) {
    }

    public int getPointsAttack() {
        return PointsAttack;
    }

    public void setPointsAttack(int pointsAttack) {
        PointsAttack = pointsAttack;
    }
}


