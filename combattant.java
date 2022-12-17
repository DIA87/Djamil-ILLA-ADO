import java.security.PrivateKey;
import java.util.Scanner;

abstract class combattant extends game {
    private String name;
    heros heros = new heros() {
        @Override
        public int attack() {
            return 0;
        }

        @Override
        public int defend() {
            return 0;
        }

        @Override
        public void useconsumable() {

        }
    };
    enemy enemy = new enemy();
    hunter hunter = new hunter();
    warrior warrior = new warrior();
    mage mage = new mage();
    Healer healer = new Healer();
    abstract void Class();
    public static int nombresCombattant(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre le nombre de combattant:");
        return scanner.nextInt();
    }
    public static int NombreEnemy(){
        return nombresCombattant();
    }

    public void CreationHeros(){
        for (int i = 1; i<= nombresCombattant();i++){
            heros heros = new heros() {
                @Override
                public int attack() {
                    return 0;
                }

                @Override
                public int defend() {
                    return 0;
                }

                @Override
                public void useconsumable() {

                }
            };
        }
    }
    public void CreationEnemy(){
        for (int i = 1; i<= NombreEnemy();i++){
            enemy enemis = new enemy();
        }

    }
    public void Combattre(){
        if (combattants == hunter){
            String fleche;

        }
        if (combattants == warrior){
            String hands;

        }
        if (combattants == mage){
            String magie;

        }
        if (combattants == healer){
            String sort;

        }
    }
    public void Defendre(){
        if (combattants == hunter){
            armure armure = new armure() {
                @Override
                void Consommer() {

                }
            };

        }
        if (combattants == warrior){
            armure armure = new armure() {
                @Override
                void Consommer() {

                }
            };

        }
        if (combattants == mage){
            armure armure = new armure() {
                @Override
                void Consommer() {

                }
            };

        }
        if (combattants == healer){
            armure armure = new armure() {
                @Override
                void Consommer() {

                }
            };

        }
    }
}
