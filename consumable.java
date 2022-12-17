public abstract class consumable extends item {
    food food = new food();
    potion potion = new potion();
    abstract void Consommer();
    private int degatSurVie;
    private String name;
    private String type;
    public void Consumable(int degatSurVie,String name,  String type) {
        this.degatSurVie = degatSurVie;
        this.name = name;
        this.type = type;

    }
}
