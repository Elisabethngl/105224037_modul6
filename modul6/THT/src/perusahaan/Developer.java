package perusahaan;

public class Developer extends Karyawan { 
    private String level;
    private int jumlahBugFix;

    public Developer(String id, String nama, int tahun, double gaji, double rating, String level, int bugFix) {
        super(id, nama, tahun, gaji, rating); 
        this.level = level;
        this.jumlahBugFix = bugFix;
    }

    @Override
    public double hitungGajiTotal() { 
        double total = super.hitungGajiTotal(); 
      
        if (level.equalsIgnoreCase("Mid")) total += 1500000;
        else if (level.equalsIgnoreCase("Senior")) total += 3000000;

        if (getRatingKinerja() >= 3.0) {
            total += (jumlahBugFix * 50000);
        }
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jabatan: Developer " + level + " | Bug Fix: " + jumlahBugFix);
    }
}