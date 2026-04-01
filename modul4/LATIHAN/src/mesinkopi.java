class Mesinkopi {
    int stokKopi;
    int isiAir;
    int takaranSusu;

    public Mesinkopi() {
        this.stokKopi = 0;
        this.isiAir = 0;
        this.takaranSusu = 0;
    }

    public void nambahBahan(int nambahKopi, int nambahAir, int nambahSusu) {
        this.stokKopi += nambahKopi;
        this.isiAir += nambahAir;
        this.takaranSusu += nambahSusu;
        System.out.println("Bahan Baku berhasil diisi ulang");
    }

    public boolean cekStokCappuccino() {
 
        return this.stokKopi >= 15 && this.isiAir >= 50 && this.takaranSusu >= 100;
    }
}