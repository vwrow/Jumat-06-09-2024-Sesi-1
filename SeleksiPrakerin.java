import java.util.Scanner;

public class SeleksiPrakerin {
    public static void main(String[] args) {
        
        String nama, kelas, perilaku;
        int nilai;

        Scanner a = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = a.nextLine();
        System.out.print("Kelas (X/XI/XII): ");
        kelas = a.nextLine();

        if (kelas.equalsIgnoreCase("XII")) {
            System.out.print("Perilaku Siswa (Baik/Cukup): ");
            perilaku = a.nextLine();
            if (perilaku.equalsIgnoreCase("Baik")) {
                System.out.print("Nilai Rata-Rata Siswa: ");
                nilai = a.nextInt();
                if (nilai >= 85) {
                    System.out.println("Ananda " +nama +" Dinyatakan LOLOS Dan Bisa Mengikuti Prakerin");
                } else {
                    System.out.println("Maaf Nilai Anda Tidak Cukup");
                }
            } else {
                System.out.println("Maaf Perilaku Anda Kurang Sesuai");
            }
        } else {
            System.out.println("Maaf Anda Bukan Kelas XII");
        }
        a.close();
    }
}
