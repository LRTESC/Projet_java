package equipment;
import character.Player;


public abstract class Item {
    public Item() {
    }
    private int PointsAttack;

    public Item(int pointsAttack) {
        PointsAttack = pointsAttack;
    }

    public int getPointsAttack () {
        return PointsAttack;
    }
    public abstract void equip(Player player);

    public void setPointsAttack ( int pointsAttack){
        PointsAttack = pointsAttack;
    }
}

