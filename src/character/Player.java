package character;
import equipment.Item;
import equipment.Weapon;
import equipment.usable.Usable;

/**
 * déclaration de abstract class player donc je dois changer mes player
 * par "Warrior" et "Wizzard" dans mon createPlayer car on ne peut plus les instancier en abstract.
 */
public abstract class Player {
    /**
     * Name of the player
     */
    private String name;
    private int life;

    private Weapon weapon;

    private Usable usable;



    /**
     * Create a new player using given parameters
     *
     * @param name of the player
     */
    public Player (String name, int life, Weapon armedujoueur) {
        this.name = name;
        this.life = life;
        this.weapon = armedujoueur;



    }
    public boolean isAlive(){
        if(life > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean backOff(int i) {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Usable getUsable() {
        return usable;
    }

    public void setUsable(Usable usable) {
        this.usable = usable;
    }

    @Override
    public String toString() {
        return "character.Player{" +
                "name='" + name + '\'' +
                ", life=" + life +
                '}';
    }
}