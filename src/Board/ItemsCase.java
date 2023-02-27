package Board;
import character.Player;
import equipment.Items;

public class ItemsCase extends Case {

    private Items items;
    /**
     * Definit un constructeur pour la classe ItemsCase qui prends un parametre de type entier appelé "pointsAttack"
     * Lorsqu'un objet de la classe "ItemsCase" est créé en appelant ce constructeur, la valeur passée en argument
     * pour "pointsAttack" est stockée dans la variable d'instance "PointsAttack"
     * cela permet d'initialiser la variable "PointsAttack" lorsqu'un objet de la classe "ItemsCase" est créé avec
     * une valeur spécifiée pour les points d'attaque
     *
     * @param pointsAttack
     */

    public ItemsCase(Items items) {
        this.items = items;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public void start(Player player) {
    }
}
