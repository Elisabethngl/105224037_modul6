public class MainLatihan {
    public static void main(String[] args) {
        Mesinkopi mesinLobby = new Mesinkopi();

        mesinLobby.nambahBahan(100, 500, 1000);

        if (mesinLobby.cekStokCappuccino()) {
            System.out.println("Cappuccino tersedia");
        } else {
            System.out.println("Cappuccino tidak tersedia");
        }

        System.out.println("Jumlah biji kopi: " + mesinLobby.stokKopi);
        System.out.println("Jumlah air: " + mesinLobby.isiAir);
        System.out.println("Jumlah susu: " + mesinLobby.takaranSusu);

        Mesinkopi mesinKedua = new Mesinkopi();
    }
}