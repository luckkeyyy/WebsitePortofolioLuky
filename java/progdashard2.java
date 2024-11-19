import java.util.Scanner;

public class progdashard2 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah Baris : ");
    int bar = scan.nextInt();
    System.out.print("Masukkan jumlah kolom : ");
    int kol = scan.nextInt();

    //minta input
    int[][] m1 = new int[bar][kol];
    int[][] m2 = new int[bar][kol];
    int[][] hasil = new int[bar][kol];

    //masukan matriks 1
    System.out.println("Masukan nilai baris pertama");
    for (int i = 0; i < bar; i++) {
        for (int j = 0; j < kol; j++) {
            System.out.print("Nilai [" + i + "][" + j + "]: ");
            m1[i][j] = scan.nextInt();
        }
    }

    //masukan matriks 2
    System.out.println("Masukkan nilai baris kedua:");
    for (int i = 0; i < bar; i++) {
        for (int j = 0; j < kol; j++) {
            System.out.print("Nilai [" + i + "][" + j + "]: ");
            m2[i][j] = scan.nextInt();
        }
    }

    //rumus 
    for (int i = 0; i < bar; i++) {
        for (int j = 0; j < kol; j++) {
            hasil[i][j] = m1[i][j] + m2[i][j];
        }
    }

    System.out.println("-----------------------------------------");
    //hasil
    System.out.println("Hasil penjumlahan matriks:");
    for (int i = 0; i < bar; i++) {
        for (int j = 0; j < kol; j++) {
            System.out.print(hasil[i][j] + " ");
        }
        System.out.println();
    }
    scan.close();
   }  
}
