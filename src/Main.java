import perusahaan.*; 
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     
        System.out.println();

        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>(); 

       
        daftarKaryawan.add(new Karyawan("039", "Haruka", 2025, 6000000, 3.0));
        daftarKaryawan.add(new Developer("001", "Silviana", 2022, 9000000, 4.0, "Senior", 20));
        daftarKaryawan.add(new Developer("033", "Zakia", 2024, 7000000, 3.8, "Mid", 15));
        daftarKaryawan.add(new Manajer("028", "Neila", 2019, 13000000, 4.8, "IT", 10));
        daftarKaryawan.add(new Manajer("037", "Elisabeth", 2023, 10000000, 4.5, "HR", 5));

        double totalPengeluaranGaji = 0;
        double akumulasiRating = 0;
        Karyawan karyawanGajiTertinggi = daftarKaryawan.get(0);

        System.out.println("=== DATA KARYAWAN PERUSAHAAN A (TAHUN 2026) ===\n");

        for (Karyawan k : daftarKaryawan) {
            double gajiSekarang = k.hitungGajiTotal();
            k.displayInfo();
            System.out.printf("Total Gaji Bulan Ini: Rp%.0f\n", gajiSekarang);
            System.out.println("-----------------------------------------------");

            totalPengeluaranGaji += gajiSekarang; 
            akumulasiRating += k.getRatingKinerja(); 

            if (gajiSekarang > karyawanGajiTertinggi.hitungGajiTotal()) {
                karyawanGajiTertinggi = k;
            }
        }

        double rataRataPerforma = akumulasiRating / daftarKaryawan.size();

        System.out.println("\n=== CEK HASIL AKHIR ===");
        System.out.printf("Total Gaji Semua Karyawan : Rp%.0f\n", totalPengeluaranGaji);
        System.out.println("Juara Gaji Terbesar       : " + karyawanGajiTertinggi.getNama());
        System.out.printf("Rata-rata Rating Kerja    : %.2f\n", rataRataPerforma);
    }
}