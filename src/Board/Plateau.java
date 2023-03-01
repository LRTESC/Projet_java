package Board;
import character.enemy.*;
import equipment.*;
import equipment.usable.BigLifePotion;
import equipment.usable.LifePotion;
import equipment.weapon.Club;
import equipment.weapon.FireBall;
import equipment.weapon.Sword;

public class Plateau {
    private Case[] cases = new Case[64];
    int PositionPlayer;

    public Plateau() {
        this.PositionPlayer = 0;
        for (int i = 0; i < 64; i++) {
            switch (i) {
                case 3, 18, 28, 38 -> {
                    Item items = new Sword();
                    this.cases[i] = new ItemsCase(items);
                }
                case 48, 58, 61 -> {
                    this.cases[i] = new ItemsCase(new Club());
                }
                case 1, 47, 57, 20, 30 -> {
                    this.cases[i] = new ItemsCase(new FireBall());
                }
                case 5, 10, 31, 39, 49, 63 -> {
                    this.cases[i] = new ItemsCase(new FireBall());
                }
                case 6, 13, 17, 21, 27 -> {
                    this.cases[i] = new ItemsCase(new LifePotion());;
                }
                case 35, 37, 43, 55 -> {
                    this.cases[i] = new ItemsCase(new BigLifePotion());
                }
                case 7, 22, 33, 50, 56 -> {
                    Enemy e = new Sorcerer();
                    Plateau p = this;
                    this.cases[i] = new EnemyCase(e,p);
                }
                case 15, 24, 45, 52, 60 -> {
                    Enemy e = new Gobelin();
                    Plateau p = this;
                    this.cases[i] = new EnemyCase(e,p);
                }
                case 14, 23, 40, 51, 54 -> {
                    Enemy e = new Dragon();
                    Plateau p = this;
                    this.cases[i] = new EnemyCase(e,p);
                }
                case 2, 4, 9, 59-> {
                    Enemy e = new Orcs();
                    Plateau p = this;
                    this.cases[i] = new EnemyCase(e,p);
                }
                case 19, 29, 44, 62-> {
                    Enemy e = new BadSpirits();
                    Plateau p = this;
                    this.cases[i] = new EnemyCase(e,p);
                }
                default -> {
                    this.cases[i] = new EmptyCase();
                }
            }
        }
    }
    public int getPositionPlayer() {
        return PositionPlayer;
    }

    public void setPositionPlayer(int positionPlayer) {
        PositionPlayer = positionPlayer;
    }

    public Case getCurrentCase(){
        return cases[PositionPlayer];
    }
}


