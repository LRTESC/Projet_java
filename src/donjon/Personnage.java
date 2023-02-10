package donjon;

/**
 * declaration de class
 **/
public class Personnage {


    private String type;
    /**
     * declartion d'attributs
     **/
    private String name;

    private int life;


    /**
     * declaration de constructeur x3
     **/
    public Personnage() {
        this.name = "Laurent";
        this.life = 10;
        this.type = "guerrier";
    }

    public Personnage(String name) {
        this.name = name;
        this.life = 10;
        this.type = "guerrier";
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.life = 10;
        this.type = type;
    }

    public String toString() {
        return name + "" + life + "" + type + "";
    }

    public String getName() {
        return name;
    }
}
