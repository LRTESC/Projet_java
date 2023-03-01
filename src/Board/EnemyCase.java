package Board;
import character.Player;
import character.enemy.Enemy;
import Board.Plateau;
import character.enemy.Sorcerer;
import equipment.Weapon;

import java.awt.*;
import java.util.Scanner;

public class EnemyCase extends Case {
    private Enemy enemy;
    private Plateau plateau;


    public EnemyCase(Enemy enemy, Plateau plateau) {
        this.enemy = enemy;
        this.plateau = plateau;
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
        System.out.println("-----------------PLAYER------------------");
        System.out.println(player);
        System.out.println("-----------------ENEMY-------------------");
        System.out.println(enemy);
        Weapon armedujoueur = player.getWeapon();
        Enemy enemysurlacase = getEnemy();
        int vieDeEnemis = enemysurlacase.getLife();
        int degatdelarme = armedujoueur.getPointsAttack();
        if(degatdelarme >= vieDeEnemis) {
            System.out.println("Enemy died --> to be continued ");
        } else {
            int vieActuelleEnemis = vieDeEnemis - degatdelarme;
            enemy.setLife(vieActuelleEnemis);
            int vieDujoueur = player.getLife();
            int degatdeLenemis = enemy.getAttack();
            int vieActuelleJoueur = vieDujoueur - degatdeLenemis;
            player.setLife(vieActuelleJoueur);
            System.out.println("The player loses " + enemy.getAttack() +" life points, it remains " + player.getLife());
            if(player.isAlive()){
                System.out.println("you can attack or run away");
                System.out.println("1- to flee he moves back two squares");
                System.out.println("2- attack again");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1){
                    this.plateau.setPositionPlayer(plateau.getPositionPlayer() -2 );
                    System.out.printf("You have reached cell %d \n", this.plateau.getPositionPlayer() + 1);
                    this.plateau.getCurrentCase().start(player);
                } else {
                    start(player);
                }
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



