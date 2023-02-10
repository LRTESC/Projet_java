package donjon;

public class EquipmentDefens {

    private String sheild;

    private String name;

    public EquipmentDefens() {
        this.name = "sheild";
    }

    public EquipmentDefens(String name) {
        this.name = name;
        this.sheild = "philtre";
    }

    public EquipmentDefens(String name, String sheild){
        this.name = name;
        this.sheild = sheild;

    }
    public String getName() {
        return name;
    }
}

