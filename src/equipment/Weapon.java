package equipment;
import character.Player;
import character.Warrior;
import character.enemy.Enemy;
import character.enemy.Orcs;

public abstract class Weapon extends Item {

    public Weapon(int pointsAttack) {
        super(pointsAttack);
    }

    @Override
    public void equip(Player player) {
        player.setWeapon(this);
    }

    public int getPointsAttack(Enemy enemy) {
        return getPointsAttack();
    }


}