package Modelos;

public class Carta {
    private String name;
    private String color;
    private String cost;
    private int cmc;
    private String supertype;
    private String type;
    private String subtype;
    private String description;
    private String power;
    private String toughness;
    private String rarity;
    private String edition;
    private boolean foil;
    private int quantity;


    public void setName(String name) {
        this.name = name;
    };

    public void setColor(String color) {
        this.color = color;
    };

    public void setCost(String cost) {
        this.cost = cost;
    };

    public void setCmc(int cmc) {
        this.cmc = cmc;
    };

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    };

    public void setTipo(String type) {
        this.type = type;
    };

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    };

    public void setDescription(String description) {
        this.description = description;
    };

    public void setPower(String power) {
        this.power = power;
    };

    public void setToughness(String toughness) {
        this.toughness = toughness;
    };

    public void setRarity(String rarity) {
        this.rarity = rarity;
    };

    public void setEdition(String edition) {
        this.edition = edition;
    };

    public void setFoil(boolean foil) {
        this.foil = foil;
    };

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    };

    public void apresentaCarta() {
        System.out.println("Carta: " + name);
        System.out.println("Cor: " + color);
        System.out.println("Custo: " + cost);
        System.out.println("CMC: " + cmc);
        System.out.println("Supertipo: " + supertype);
        System.out.println("Tipo: " + type);
        System.out.println("Subtipo: " + subtype);
        System.out.println("Descrição: " + description);
        System.out.println("Ataque/Resistência: " + power + "/" + toughness);
        System.out.println("Raridade: " + rarity);
        System.out.println("Edição: " + edition);
        System.out.println("Foil: " + foil);
        System.out.println("Quantidade: " + quantity);
    };
}