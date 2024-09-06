import java.util.Scanner;

public class PembelianBarang {
    public static void main(String[] args) {
        
        double total, diskon = 10, pothar = 5000;

        Scanner i = new Scanner(System.in);
        System.out.print("Total Pembeian: ");
        total = i.nextDouble();

        if (total > 150000) {
            diskon = (total/100)*diskon;
            total -= diskon;
            System.out.println("Selamat Anda Mendapatkan Diskon 10%");
        } else if (total > 10000) {
            total -= pothar;
            System.out.println("Selamat Anda Mendapatkan Potongan Harga Rp 5000");
        }
        System.out.println("Total Pembelian Akhir: " +total);
        i.close();
    }
}
