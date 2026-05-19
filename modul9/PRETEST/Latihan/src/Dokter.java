import java.text.ParseException;

public class Dokter {

    private String nama;
    private String spesialis;
    public Pasien pasien;

    public Dokter (String nama, String spesialis){
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getNama(){
        return nama;
    }

    public void setNama( String nama){
        this.nama = nama;
    }

    public String getSpesialis(){
        return spesialis;
    }

    public void setSpesialis (String spesialis){
        this.spesialis = spesialis;
    }

    public void periksaPasien (Pasien pasien){
        System.out.println("Dokter " + nama);
        System.out.println("Spesialis = " + spesialis);
        System.out.println("sedang periksa pasien" + pasien.getNama());
        System.out.println("Umur =" + pasien.getUmur() +"tahun");
    }
}

