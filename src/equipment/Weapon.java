package equipment;
import character.Player;
import character.Warrior;

public abstract class Weapon extends Item {

    public Weapon(int pointsAttack) {
        super(pointsAttack);
    }

    @Override
    public void equip(Player player) {
        player.setWeapon(this);
    }
}