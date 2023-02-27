package character.enemy;
import Board.EnemyCase;

public abstract class Enemy {
    private int life;
    private int attack;


    public Enemy(int life, int attack) {
        this.life = life;
        this.attack = attack;

    }
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    @Override
    public String toString() {
        return "EnemyCase{" +
                "life=" + getLife() +
                ", attack=" + getAttack() +
                ", name=" + this.getClass().getSimpleName() +
                '}';
    }
}
