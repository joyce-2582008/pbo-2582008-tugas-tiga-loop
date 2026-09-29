import java.util.Scanner;

public class TigaLoob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println("\n===== SATU DERET, TIGA LOOP =====");

        // 1. Loop FOR
        System.out.print("for      : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Loop WHILE
        System.out.print("while    : ");
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // 3. Loop DO-WHILE
        System.out.print("do-while : ");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= n);
        System.out.println();

        // Ketentuan 3: Bukti meleset satu (off-by-one)
        int kurang = 0;
        for (int i = 1; i < n; i++) {
            kurang++;
        }

        int kurangSama = 0;
        for (int i = 1; i <= n; i++) {
            kurangSama++;
        }

        System.out.println("\ni <  n berputar : " + kurang + " kali");
        System.out.println("i <= n berputar : " + kurangSama + " kali");

        // Ketentuan 4: Penyaringan deret 1-10 memakai angka tetap 1..10
        System.out.print("Disaring : ");
        int countPrintln = 0;

        for (int i = 1; i <= 10; i++) {
            // Lewati angka genap
            if (i % 2 == 0) {
                continue;
            }
            // Berhenti jika i > 7
            if (i > 7) {
                break;
            }

            System.out.print(i + " ");
            countPrintln++;
        }

        System.out.println("\nSampai println  : " + countPrintln + " kali");

        input.close();

        /*
        ========================================================================
        HASIL KELUARAN SAAT DIJALANKAN DUA KALI:
        ========================================================================

        1. Jalankan Pertama (n = 5):
        ----------------------------------
        Batas deret (n) : 5

        ===== SATU DERET, TIGA LOOP =====
        for      : 1 2 3 4 5
        while    : 1 2 3 4 5
        do-while : 1 2 3 4 5

        i <  n berputar : 4 kali
        i <= n berputar : 5 kali
        Disaring : 1 3 5 7
        Sampai println  : 4 kali


        2. Jalankan Kedua (n = 0):
        ----------------------------------
        Batas deret (n) : 0

        ===== SATU DERET, TIGA LOOP =====
        for      :
        while    :
        do-while : 1

        i <  n berputar : 0 kali
        i <= n berputar : 0 kali
        Disaring : 1 3 5 7
        Sampai println  : 4 kali

        ========================================================================
        PENJELASAN & KESIMPULAN:
        ========================================================================

        [Penjelasan kenapa do-while mencetak angka 1 saat n = 0]
        Kesimpulan: do-while mengecek kondisinya sesudah badan loop dijalankan,
        jadi badannya pasti jalan minimal sekali.

        [Penjelasan Ketentuan 5: Kenapa loop tidak berhenti di i = 8]
        Penjelasan: Loop tidak pernah mengeksekusi 'break' pada i = 8 karena
        angka 8 adalah bilangan genap. Saat i = 8, perintah 'if (i % 2 == 0)'
        di atasnya bernilai true sehingga 'continue' dijalankan terlebih dahulu,
        yang langsung melompati sisa kode di bawahnya (termasuk pemeriksaan break
        dan println) dan lanjut ke i = 9. Baru saat i = 9 (ganjil), kondisi
        'if (i > 7)' terpenuhi dan 'break' akhirnya dieksekusi.

         */
    } // Akhir main
}     // Akhir class