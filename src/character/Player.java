package character;
import equipment.Items;
import java.util.Objects;

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
    private int attack;
    private String type;
    private Items items;


    /**
     * Create a new player using given parameters
     *
     * @param name of the player
     */
    public Player (String name, int life, int attack, String type) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.type = type;

    }
    public boolean isAlive(){
        if(life > 0){
            return true;
        } else {
            return false;
        }
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "character.Player{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return life == player.life && attack == player.attack && Objects.equals(name, player.name) && Objects.equals(type, player.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, life, attack, type);
    }
}