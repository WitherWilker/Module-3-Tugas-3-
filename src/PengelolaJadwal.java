import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class ini berfungsi untuk mengatur dan menyimpan seluruh jadwal kuliah
public class PengelolaJadwal {
    private List<MataKuliah> daftarJadwal = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Constructor: langsung isi data awal
    public PengelolaJadwal() {
        isiJadwalAwal();
    }

    // Data awal jadwal kuliah
    private void isiJadwalAwal() {
        daftarJadwal.add(new MataKuliah("Prak. Pemrograman Lanjut", "Senin", "10:20 - 12:10", "LAB EF"));
        daftarJadwal.add(new MataKuliah("Algoritma Pemrograman", "Senin", "14:10 - 16:00", "215 - GKB I"));
        daftarJadwal.add(new MataKuliah("Jaringan Komputer", "Selasa", "09:10 - 11:00", "606 - GKB IV"));
        daftarJadwal.add(new MataKuliah("AIK III", "Selasa", "13:10 - 15:00", "Masjid Ruang E"));
        daftarJadwal.add(new MataKuliah("Statistik dan Probabilitas", "Rabu", "07:00 - 08:50", "208 - GKB I"));
        daftarJadwal.add(new MataKuliah("Pemrograman Lanjut", "Rabu", "10:20 - 12:10", "605 - GKB IV"));
        daftarJadwal.add(new MataKuliah("Komunikasi Data", "Kamis", "07:00 - 08:50", "606 - GKB IV"));
        daftarJadwal.add(new MataKuliah("Interaksi Manusia Komputer", "Kamis", "09:10 - 11:00", "308 - GKB II"));
        daftarJadwal.add(new MataKuliah("Prak. Jaringan Komputer", "Kamis", "11:10 - 13:00", "LAB CD"));
        daftarJadwal.add(new MataKuliah("Teori Bahasa dan Otomata", "Kamis", "13:10 - 15:00", "308 - GKB II"));
        daftarJadwal.add(new MataKuliah("Metode Numerik", "Jumat", "07:00 - 08:50", "401 - GKB II"));
        daftarJadwal.add(new MataKuliah("Prak. Komunikasi Data", "Jumat", "09:10 - 11:00", "LAB AB"));
    }

    // Menampilkan jadwal hari ini (otomatis baca dari sistem)
    public void tampilkanHariIni() {
        LocalDate tanggal = LocalDate.now();
        DayOfWeek day = tanggal.getDayOfWeek();
        String namaHari = ubahHari(day);

        System.out.println("\n===== JADWAL HARI INI =====");
        System.out.println("📆 " + tanggal + " | " + namaHari + "\n");

        boolean ada = false;
        for (MataKuliah mk : daftarJadwal) {
            if (mk.getHari().equalsIgnoreCase(namaHari)) {
                System.out.println(mk);
                ada = true;
            }
        }

        if (!ada) System.out.println("🎉 Tidak ada jadwal kuliah hari ini.");
        System.out.println("=============================\n");
    }

    // Menampilkan semua jadwal seminggu penuh
    public void tampilkanSemua() {
        System.out.println("\n===== SEMUA JADWAL MINGGU INI =====");
        for (MataKuliah mk : daftarJadwal) {
            System.out.println("📆 " + mk.getHari() + " | " + mk);
        }
        System.out.println("===================================\n");
    }

    // Mencari mata kuliah berdasarkan keyword
    public void cariMataKuliah() {
        System.out.print("\n🔍 Masukkan nama mata kuliah yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase();
        boolean ditemukan = false;

        for (MataKuliah mk : daftarJadwal) {
            if (mk.getNama().toLowerCase().contains(keyword)) {
                System.out.println("📚 " + mk);
                ditemukan = true;
            }
        }

        if (!ditemukan) System.out.println("❌ Mata kuliah tidak ditemukan.");
    }

    // Menambahkan jadwal baru lewat input user
    public void tambahJadwal() {
        try {
            System.out.print("Nama mata kuliah: ");
            String nama = input.nextLine();

            System.out.print("Hari: ");
            String hari = input.nextLine();

            System.out.print("Jam: ");
            String jam = input.nextLine();

            System.out.print("GKB/Ruang: ");
            String gkb = input.nextLine();

            daftarJadwal.add(new MataKuliah(nama, hari, jam, gkb));
            System.out.println("✅ Jadwal berhasil ditambahkan!\n");
        } catch (Exception e) {
            System.out.println("⚠️ Terjadi kesalahan input. Coba lagi!");
        }
    }

    // Mengubah nama hari dari Inggris ke Bahasa Indonesia
    private String ubahHari(DayOfWeek day) {
        switch (day) {
            case MONDAY: return "Senin";
            case TUESDAY: return "Selasa";
            case WEDNESDAY: return "Rabu";
            case THURSDAY: return "Kamis";
            case FRIDAY: return "Jumat";
            case SATURDAY: return "Sabtu";
            case SUNDAY: return "Minggu";
            default: return "Tidak diketahui";
        }
    }
}
