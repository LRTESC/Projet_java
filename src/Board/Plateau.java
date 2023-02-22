package Board;

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
                    this.cases[i] = new Sword();
                }
                case 48, 58, 61 -> {
                    this.cases[i] = new Club();
                }
                case 1, 47, 57, 20, 30 -> {
                    this.cases[i] = new Lightining();
                }
                case 5, 10, 31, 39, 49, 63 -> {
                    this.cases[i] = new FireBall();
                }
                case 6, 13, 17, 21, 27 -> {
                    this.cases[i] = new LifePotion();
                }
                case 35, 37, 43, 55 -> {
                    this.cases[i] = new BigLifePotion();
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


