package Board;
import character.enemy.Dragon;
import character.enemy.Gobelin;
import character.enemy.Sorcerer;
import equipment.*;

public class Plateau {
    private Case[] cases = new Case[64];
    int PositionPlayer;

    public Plateau() {
        this.PositionPlayer = 0;
        for (int i = 0; i < 64; i++) {
            switch (i) {
                case 2, 4, 9, 19, 29, 44, 59, 62 -> {
                    this.cases[i] = new EnemyCase();
                }
                case 3, 18, 28, 38 -> {
                    Items items = new Sword();
                    this.cases[i] = new ItemsCase(items);
                }
                case 48, 58, 61 -> {
                    this.cases[i] = new ItemsCase(new Club());
                }
                case 1, 47, 57, 20, 30 -> {
                    this.cases[i] = new ItemsCase(new Lightining());
                }
                case 5, 10, 31, 39, 49, 63 -> {
                    this.cases[i] = new ItemsCase(new FireBall());
                }
                case 6, 13, 17, 21, 27 -> {
                    this.cases[i] = new LifePotion();
                }
                case 35, 37, 43, 55 -> {
                    this.cases[i] = new BigLifePotion();
                }
                case 7, 22, 33, 50, 56 -> {
                    this.cases[i] = new Sorcerer();
                }
                case 15, 24, 45, 52, 60 -> {
                    this.cases[i] = new Gobelin();
                }
                case 14, 23, 40, 51, 54 -> {
                    this.cases[i] = new Dragon();
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


