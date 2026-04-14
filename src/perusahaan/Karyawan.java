package perusahaan; 

public class Karyawan {
    private String idKaryawan, nama;
    private int tahunMasuk;
    private double gajiPokok, ratingKinerja;

    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
 
        if (ratingKinerja >= 1.0 && ratingKinerja <= 5.0) {
            this.ratingKinerja = ratingKinerja;
        } else {
            this.ratingKinerja = 3.0; 
        }
    }

    public double hitungGajiTotal() {
        int masaKerja = 2026 - tahunMasuk; 
        double bonusLoyalitas = (0.05 * gajiPokok) * masaKerja; 
        double total = gajiPokok + bonusLoyalitas;

        if (ratingKinerja < 2.5) {
            total = total * 0.9; 
        }
        return total;
    }

    public void displayInfo() { 
        System.out.println("ID: " + idKaryawan + " | Nama: " + nama + 
                           " | Tahun: " + tahunMasuk + " | Rating: " + ratingKinerja);
    }

    public String getNama() { return nama; }
    public double getRatingKinerja() { return ratingKinerja; }
}