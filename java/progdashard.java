import java.util.Scanner;

public class progdashard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); 

        System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = obj.nextInt();

        int[] nilai = new int[jumlahSiswa];
        int totalNilai = 0;

        //memasukkan nilai
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai untuk siswa ke-" + (i + 1) + ": ");
            nilai[i] = obj.nextInt();
            totalNilai += nilai[i];
        }

        System.out.println("-----------------------------------------");
        //rata-rata nilai
        int rataRata = totalNilai / jumlahSiswa;

        //hasil
        System.out.println("Rata-rata nilai ujian dari " + jumlahSiswa + " siswa adalah: " + rataRata);

        obj.close();
    }
}
