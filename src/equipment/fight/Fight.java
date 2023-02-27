package equipment.fight;


public class Fight {
    private Battle battle;

    public Fight(Battle battle) {
        this.battle = battle;
    }

    public Battle getBattle() {
        return battle;
    }

    public void setBattle(Battle battle) {
        this.battle = battle;

    }
}
