import game.Hero;
import game.HeroStrength;

public class main{
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Krisna", 100, 80);
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Balaram", 150, 40);
        hero2.display();

        hero1.display();
        hero2.display();

        hero1.berlatih();
        hero2.berlatih();

        hero1.terimaSerangan(100 );
        hero2.terimaSerangan(100);

        hero1.display();
        hero2.display();
    }
}