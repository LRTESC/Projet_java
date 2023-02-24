package Board;
import character.Player;

public class EnemyCase extends Case {

    private int life;
    private int attack;

    public EnemyCase(){
    }

    public EnemyCase(int life, int attack) {
        this.life = life;
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "EnemyCase{" +
                "life=" + life +
                ", attack=" + attack +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
        public void start (Player player) {
        System.out.println("Attention Enemy Danger");
        if(player.getAttack() > life){
            System.out.println("Enemy died --> to be continued ");
        } else {
            player.setLife(player.getLife() - attack);
            System.out.println("The player loses " + attack +" life points, it remains " + player.getLife());

        }
    }
}



