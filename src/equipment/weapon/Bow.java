package equipment.weapon;

import character.enemy.Dragon;
import character.enemy.Enemy;
import equipment.Weapon;

public class Bow extends Weapon {

    public Bow(int pointsAttack) {
        super(pointsAttack);
    }

    @Override
    public int getPointsAttack(Enemy enemy) {
        if (enemy instanceof Dragon){
            return 6;
        } else {
            return 4;
        }
    }
}
