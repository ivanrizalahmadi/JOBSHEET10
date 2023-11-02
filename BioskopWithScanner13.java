import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        int menuSelection = 0;

        while (menuSelection != 3) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menuSelection = sc.nextInt();
            sc.nextLine();

            switch (menuSelection) {
                case 1:
                    System.out.println("Input data penonton:");
                    System.out.println("Masukkan nama: ");
                    nama = sc.nextLine();

                    boolean kursiTerisi = true;
                    do {
                        System.out.println("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.println("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                                kursiTerisi = false;
                            } else {
                                System.out.println("Kursi sudah terisi. Masukkan baris dan kolom kembali.");
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia. Masukkan baris dan kolom kembali.");
                        }
                    } while (kursiTerisi);
                    break;

                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        }
        sc.close();
    }
}
