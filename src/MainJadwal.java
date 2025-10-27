/**
 * Class MataKuliah
 * -----------------
 * Menyimpan data satu mata kuliah seperti nama, hari, jam, dan ruangan.
 * Class ini digunakan sebagai blueprint untuk membuat objek jadwal kuliah.
 */
public class MataKuliah {
    private String nama;
    private String hari;
    private String jam;
    private String gkb;

    /**
     * Constructor untuk membuat objek MataKuliah baru.
     * @param nama nama mata kuliah
     * @param hari hari pelaksanaan kuliah
     * @param jam jam pelaksanaan kuliah
     * @param gkb lokasi atau ruang kuliah
     */
    public MataKuliah(String nama, String hari, String jam, String gkb) {
        this.nama = nama;
        this.hari = hari;
        this.jam = jam;
        this.gkb = gkb;
    }

    /** @return nama mata kuliah */
    public String getNama() { return nama; }

    /** @return hari kuliah */
    public String getHari() { return hari; }

    /** @return jam kuliah */
    public String getJam() { return jam; }

    /** @return lokasi kuliah (GKB/Ruang) */
    public String getGkb() { return gkb; }

    /**
     * Menampilkan informasi mata kuliah dalam format yang rapi.
     * @return string berisi nama, jam, dan ruang kuliah
     */
    @Override
    public String toString() {
        return String.format("📚 %-30s | 🕒 %-11s | 🏫 %-10s", nama, jam, gkb);
    }
}
