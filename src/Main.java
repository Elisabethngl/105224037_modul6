import perusahaan.*; 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();

        listKaryawan.add(new Karyawan("039", "Haruka", 2025, 6000000, 3.0));
        listKaryawan.add(new Developer("001", "Silviana", 2022, 9000000, 4.0, "Senior", 20));
        listKaryawan.add(new Developer("033", "Zakia", 2024, 7000000, 3.8, "Mid", 15));
        listKaryawan.add(new Manajer("028", "Neila", 2019, 13000000, 4.8, "IT", 10));
        listKaryawan.add(new Manajer("037", "Elisabeth", 2023, 10000000, 4.5, "HR", 5));

        double totalAnggaran = 0;
        double totalRating = 0;
        Karyawan highestEarner = listKaryawan.get(0);

        System.out.println();
        for (Karyawan k : listKaryawan) {
            double gaji = k.hitungGajiTotal(); 
            k.displayInfo();
            System.out.printf("Total Gaji Bulan Ini: Rp%.0f\n", gaji);
            System.out.println("-------------------------------------------------");

            totalAnggaran += gaji; 
            totalRating += k.getRatingKinerja(); 

            if (gaji > highestEarner.hitungGajiTotal()) {
                highestEarner = k;
            }
        }

        System.out.println("\n=== KESIMPULAN DATA PERUSAHAAN ===");
        System.out.printf("Total Anggaran Gaji: Rp%.0f\n", totalAnggaran);
        System.out.println("Highest Earner: " + highestEarner.getNama());
        System.out.printf("Rata-rata Rating Kinerja: %.2f\n", (totalRating / listKaryawan.size()));
    }
}