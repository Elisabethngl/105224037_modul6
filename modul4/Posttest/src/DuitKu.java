class DuitKu {
    String nama;
    String nomorPonsel;
    double saldo;

    public DuitKu(String nama, String nomorPonsel) {
        this.nama = nama;
        this.nomorPonsel = nomorPonsel;
        this.saldo = 0; // Saldo awal nol mutlak [cite: 501]
    }

    public void isiDana(double jumlah) {
        if (jumlah >= 10000) { 
            this.saldo += jumlah;
            System.out.println("Setoran Berhasil: Rp " + jumlah);
        } else {
            System.out.println("PERINGATAN: Nominal di bawah Rp 10.000 diblokir!");
    }
}

   public boolean bayarTagihan(double tagihan) {
        if (this.saldo >= tagihan) { 
            this.saldo -= tagihan;
            System.out.println("Pembayaran Berhasil!"); [cite: 505]
            return true; 
            System.out.println("GAGAL: Dana tidak mencukupi."); [cite: 505]
            return false; 
    }
}