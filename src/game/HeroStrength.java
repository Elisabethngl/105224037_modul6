package game;

public class HeroStrength extends Hero{
    String type = "Strength";
    
    public HeroStrength (String nama, double health, double attackPower){
        super(nama, health, attackPower);
        this.type = "Strength";
    }
    
    @Override
    public void display(){
        super.display ();
        System.out.println("Tipe : " + this.type);
    }
    
    public void terimaSerangan(double damage) {
        double damageMasuk = damage - (damage * 0.5); 
        
        System.out.println("karakter " + this.nama + " menerima damage" + "damageMasuk");
        System.out.println("\n");
    }
}
