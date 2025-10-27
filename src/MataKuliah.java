import java.util.Scanner;

/**
 * Class MainJadwal
 * ----------------
 * Class utama yang menjalankan program dan menampilkan menu interaktif.
 * User bisa memilih fitur untuk melihat, mencari, atau menambah jadwal kuliah.
 */
class MainJadwal {
    /**
     * Method utama (entry point program)
     * Menampilkan menu utama dan menjalankan aksi sesuai pilihan user.
     * @param args argumen dari command line (tidak digunakan di sini)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PengelolaJadwal pj = new PengelolaJadwal();
        int pilihan = 0;

        do {
            System.out.println("===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan jadwal hari ini");
            System.out.println("2. Tampilkan semua jadwal");
            System.out.println("3. Cari mata kuliah");
            System.out.println("4. Tambah jadwal baru");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                pilihan = 0;
            }

            switch (pilihan) {
                case 1 -> pj.tampilkanHariIni();
                case 2 -> pj.tampilkanSemua();
                case 3 -> pj.cariMataKuliah();
                case 4 -> pj.tambahJadwal();
                case 5 -> System.out.println("👋 Terima kasih sudah menggunakan program ini!");
                default -> System.out.println("⚠️ Pilihan tidak valid, coba lagi!\n");
            }

        } while (pilihan != 5);
    }
}
