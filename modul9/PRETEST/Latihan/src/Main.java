public class Main {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Andi", "Spesialis Anak");
        Dokter dokter2 = new Dokter("Budi", "Spesialis Jantung");

        Pasien pasien1 = new Pasien("Cici", 7);
        Pasien pasien2 = new Pasien("Dedi", 45);

        dokter1.periksaPasien(pasien1);
        dokter2.periksaPasien(pasien2);

        RSSehat rs = new RSSehat("RS Sehat Selalu");

        rs.tambahDokter(dokter1);
        rs.tambahDokter(dokter2);

        rs.cetakDaftarRuangan();
        rs.cetakDaftarDokter();
        System.out.println();
        rs = null;
    
        System.out.println("Mengecek data Dokter di sistem pusat:");
        System.out.println("- Nama Dokter 1: " + dokter1.getNama() + " (" + dokter1.getSpesialisasi() + ")");
        System.out.println("- Nama Dokter 2: " + dokter2.getNama() + " (" + dokter2.getSpesialisasi() + ")");
        
        System.out.println("\nMengecek data Pasien di sistem pusat:");
        System.out.println("- Nama Pasien 1: " + pasien1.getNama() + ", Umur: " + pasien1.getUmur() + " tahun");
        
    }
}