package equipment;

import character.enemy.Dragon;

public class Arch extends Gun{
    /**
     * Definit un constructeur pour la classe ItemsCase qui prends un parametre de type entier appelé "pointsAttack"
     * Lorsqu'un objet de la classe "ItemsCase" est créé en appelant ce constructeur, la valeur passée en argument
     * pour "pointsAttack" est stockée dans la variable d'instance "PointsAttack"
     * cela permet d'initialiser la variable "PointsAttack" lorsqu'un objet de la classe "ItemsCase" est créé avec
     * une valeur spécifiée pour les points d'attaque
     *
     * @param pointsAttack
     */
    public Arch(int pointsAttack) {
        super(pointsAttack);
    }
}
