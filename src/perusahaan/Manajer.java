package perusahaan;

public class Manajer extends Karyawan { 
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String id, String nama, int tahun, double gaji, double rating, String divisi, int anggota) {
        super(id, nama, tahun, gaji, rating); 
        this.divisi = divisi;
        this.jumlahAnggotaTim = anggota;
    }

    @Override
    public double hitungGajiTotal() { 
        double total = super.hitungGajiTotal(); 
        
        total += (jumlahAnggotaTim * 300000);

        if (getRatingKinerja() > 4.5) {
            total = total * 1.15; 
        }
        return total;
    }

    @Override
    public void displayInfo() { 
        super.displayInfo();
        System.out.println("Jabatan: Manajer Divisi " + divisi + " | Anggota Tim: " + jumlahAnggotaTim);
    }
}