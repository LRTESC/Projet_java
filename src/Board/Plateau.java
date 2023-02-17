package Board;

import Board.Case;
import Board.EmptyCase;
import Board.EnemyCase;
import Board.Gun;

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
                case 3, 18, 28, 38, 48, 58, 61 -> {
                    this.cases[i] = new Gun();
                }
                case 6, 13, 17, 21, 27, 35, 37, 43, 55 -> {
                    this.cases[i] = new PotionCase();
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


