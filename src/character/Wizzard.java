package character;

import equipment.EquipmentAttack;
import equipment.EquipmentDefence;

public class Wizzard extends Player{
    /**
     * Create a new player using given parameters
     *
     * @param name             of the player
     * @param life
     * @param attack
     * @param type
     * @param equipmentAttack
     * @param equipmentDefence
     */
    public Wizzard(String name, int life, int attack, String type, EquipmentAttack equipmentAttack, EquipmentDefence equipmentDefence) {
        super(name, life, attack, type, equipmentAttack, equipmentDefence);
    }
}
