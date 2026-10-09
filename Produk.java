public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;

    // Constructor
    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }

    // Getter & Setter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method untuk menampilkan info produk
    public void tampilkanInfo() {
        System.out.println("Kode: " + kodeProduk + " | Nama: " + nama + " | Stok: " + stok);
    }
}