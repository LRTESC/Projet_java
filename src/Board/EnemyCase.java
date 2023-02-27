package Board;
import character.Player;
import character.enemy.Enemy;

public class EnemyCase extends Case {
    private Enemy enemy;


    public EnemyCase(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String toString() {
        return "EnemyCase{" +
                "life=" + enemy.getLife() +
                ", attack=" + enemy.getAttack() +
                ", name=" + this.getClass().getName() +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    /**
     * @param player
     */
    @Override
        public void start (Player player) {
        System.out.println("Attention Enemy Danger");
        System.out.println("-----------------PLAYER-----------------");
        System.out.println(player);
        System.out.println("-----------------ENEMY-----------------");
        System.out.println(enemy);
        if(player.getAttack() >= getEnemy().getLife()) {
            System.out.println("Enemy died --> to be continued ");
        } else {
            enemy.setLife(enemy.getLife()- player.getAttack());
            player.setLife(player.getLife() - enemy.getAttack());
            System.out.println("The player loses " + enemy.getAttack() +" life points, it remains " + player.getLife());
            if(player.isAlive()){

            }
        }
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}



