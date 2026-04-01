public class MainPosttest {
    public static void main(String[] args) {

        DuitKu anton = new DuitKu("Anton", "081234567");

        anton.isiDana(50000); 
        System.out.println("Anton mencoba bayar tagihan Rp 60.000...");
        anton.bayarTagihan(60000); 

        anton.isiDana(20000);
        
        System.out.println("Anton mencoba lagi bayar tagihan Rp 60.000...");
        anton.bayarTagihan(60000);
        System.out.println("Sisa uang Anton: Rp " + anton.saldo);
    }
}