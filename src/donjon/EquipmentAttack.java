package donjon;

public class EquipmentAttack {
    private String weapon;

    private String name;

    public EquipmentAttack() {
        this.weapon = "shield";
    }

    public EquipmentAttack(String name) {
        this.name = name;
        this.weapon = "shield";
    }

    public EquipmentAttack(String weapon, String name) {
        this.weapon = weapon;
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
