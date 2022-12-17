import java.util.Scanner;
import java.util.ArrayList;
abstract class heros extends combattant{
    warrior wr = new warrior();
    hunter ht = new hunter();
    mage mg = new mage();
    Healer hl = new Healer();
    String war = "warrior";
    String hunt = "hunter";
    String mag = "mage";
    String heal = "healer";

    private int degatSurVie;

    private int armure;
    private int name;

    private int degatSurArme;

    private int manapoints;

    private int Arrow;


    private int life;

    ArrayList<potion> potions = new ArrayList<>();
    ArrayList<food> food = new ArrayList<>();
    public int getManapoints() {return manapoints;}
    public int getArmor() {return armure;}
    public int getName() {return name;}
    public int getLifePoints() {return degatSurArme;}
    public int getArrow() {return Arrow;}

    public void editarmor(int armor) {
        this.armure += armor;
    }
    public void editlifepoints(int point) {
        this.degatSurVie += point;
    }
    public void editweapondamage(int degat) {
        this.degatSurArme += degat;
    }

    @Override
    void Class() {
        for (int i=0;i < nombresCombattant(); i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ecrire la classe de votre hero numero "+i);
            String name = scanner.next();
            if (name ==  war ){
                name = wr.toString();
            }
            if (name == hunt){
                name = ht.toString();
            }
            if (name == mag){
                name = mg.toString();
            }
            if (name == heal){
                name = hl.toString();
            }

        }
    }

    public abstract int attack();

    public abstract int defend();

    public abstract void useconsumable(consumable);
}
