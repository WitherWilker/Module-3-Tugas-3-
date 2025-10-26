// Class ini menyimpan data untuk satu mata kuliah
public class MataKuliah {
    private String nama;
    private String hari;
    private String jam;
    private String gkb;

    // Constructor untuk membuat objek MataKuliah
    public MataKuliah(String nama, String hari, String jam, String gkb) {
        this.nama = nama;
        this.hari = hari;
        this.jam = jam;
        this.gkb = gkb;
    }

    // Getter (encapsulation)
    public String getNama() { return nama; }
    public String getHari() { return hari; }
    public String getJam() { return jam; }
    public String getGkb() { return gkb; }

    // Menampilkan data mata kuliah dengan format rapi
    @Override
    public String toString() {
        return String.format("📚 %-30s | 🕒 %-11s | 🏫 %-10s", nama, jam, gkb);
    }
}
