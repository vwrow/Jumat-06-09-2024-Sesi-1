import java.util.Scanner;

public class TarifParkir {
    public static void main(String[] args) {
        
        int harga, tJam;
        String nopol;
            
        Scanner a = new Scanner(System.in);
    
        System.out.print("Plat Nopol: ");
        nopol = a.nextLine();
        System.out.print("Total Jam Parkir: ");
        tJam = a.nextInt();
    
        if (tJam >0 && tJam <=1) {
            harga = 3000;
        } else if (tJam >1 && tJam <=4) {
            harga = 7000;
        } else if (tJam > 4) {
            harga = 10000;
        } else {
            System.out.println();
            System.out.println("*System Error*");
            harga = 0;
        }
    
        System.out.println();
        System.out.println("Plat Nopol: " +nopol);
        System.out.println("Tarif Parkir: " +harga);
        a.close();
    
    }
    
}
