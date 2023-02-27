package equipment.fight;

import character.enemy.Enemy;

public class Battle {
    private Fight fight;

    public Battle(Fight fight) {
        this.fight = fight;
    }

    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }
}
