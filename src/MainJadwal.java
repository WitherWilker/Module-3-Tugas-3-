import java.util.Scanner;

// Class utama, berfungsi untuk menjalankan menu interaktif
public class MainJadwal {
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
                case 1:
                    pj.tampilkanHariIni();
                    break;
                case 2:
                    pj.tampilkanSemua();
                    break;
                case 3:
                    pj.cariMataKuliah();
                    break;
                case 4:
                    pj.tambahJadwal();
                    break;
                case 5:
                    System.out.println("👋 Terima kasih sudah menggunakan program ini!");
                    break;
                default:
                    System.out.println("⚠️ Pilihan tidak valid, coba lagi!\n");
            }

        } while (pilihan != 5);
    }
}

// ===============================================
// README - TUGAS 3 PBO
// ===============================================
// Nama Program : Sistem Penjadwalan Mata Kuliah
// Pembuat : [Nama Kamu]
// Kelas : [Isi kelas kamu]
// Mata Kuliah : Pemrograman Berorientasi Objek
//
// Deskripsi :
// Program ini dibuat untuk menyelesaikan tugas 3 PBO.
// Program ini menerapkan konsep OOP secara penuh dengan
// 3 class utama: MataKuliah, PengelolaJadwal, dan MainJadwal.
//
// Fungsinya untuk menampilkan jadwal kuliah berdasarkan hari.
// Program akan membaca hari otomatis dari sistem (hari laptop).
// Selain itu user bisa lihat semua jadwal, cari mata kuliah,
// dan juga menambah jadwal baru langsung lewat input.
//
// -----------------------------------------------
// FITUR UTAMA:
// 1. Menampilkan jadwal hari ini (otomatis sesuai tanggal laptop)
// 2. Menampilkan semua jadwal seminggu penuh
// 3. Mencari mata kuliah berdasarkan nama
// 4. Menambah jadwal baru dari input user
// 5. Menangani kesalahan input (pakai try-catch)
//
// -----------------------------------------------
// KONSTRUKSI PROGRAM:
// Class 1: MataKuliah
//  -> Menyimpan data (nama, hari, jam, gkb)
//
// Class 2: PengelolaJadwal
//  -> Menyimpan list semua jadwal (pakai ArrayList)
//  -> Punya fungsi untuk tampil, cari, tambah, dll.
//
// Class 3: MainJadwal
//  -> Class utama yang menampilkan menu interaktif
//
// -----------------------------------------------
// CONTOH OUTPUT:
//
// ===== MENU JADWAL KULIAH =====
// 1. Tampilkan jadwal hari ini
// 2. Tampilkan semua jadwal
// 3. Cari mata kuliah
// 4. Tambah jadwal baru
// 5. Keluar
// Pilih menu: 1
//
// ===== JADWAL HARI INI =====
// 📆 2025-10-28 | Selasa
//
// 📚 Jaringan Komputer            | 🕒 09:10 - 11:00 | 🏫 606 - GKB IV
// 📚 AIK III                      | 🕒 13:10 - 15:00 | 🏫 Masjid Ruang E
// ==============================
//
// -----------------------------------------------
// PENJELASAN SINGKAT CARA KERJA:
// - Program ambil tanggal sekarang dari sistem (LocalDate.now())
// - Ambil nama harinya (getDayOfWeek())
// - Ubah hari ke Bahasa Indonesia (pakai switch)
// - Cocokkan jadwal di ArrayList dengan nama hari
// - Tampilkan jadwal yang sesuai di console
// - Kalau user pilih tambah, data disimpan ke ArrayList juga
//
// -----------------------------------------------
// TUJUAN TUGAS 3:
// ✅ Penerapan konsep OOP (class & object)
// ✅ Pemakaian ArrayList
// ✅ Exception Handling (try-catch)
// ✅ Encapsulation (atribut private + getter)
// ✅ Program interaktif dan modular
//
// -----------------------------------------------
// STATUS : SELESAI ✅
// ===============================================
