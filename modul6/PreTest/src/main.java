package minimarket;

public class Main {
    public static void main(String[] args) {
        MakananRingan cemilan = new MakananRingan("Keripik Singkong", 15000, "Balado");

        System.out.println("=== Detail Inventaris Minimarket ===");
        cemilan.tampilkanDetail();
    }
}
