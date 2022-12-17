public abstract class SpellCaster extends heros{
    weapon weapon = new weapon();
    potion potion = new potion();
    food food = new food();
    consumable consumable;

    abstract void lancement();
    @Override
    public int attack() {

        return 0;
    }

    @Override
    public  int defend() {

        return 0;
    }
}
