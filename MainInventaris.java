import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        // 1. Inisialisasi HashMap (Key: kodeProduk, Value: objek Produk)
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        // 2. Tambahkan 10 produk ke HashMap
        mapInventaris.put("P01", new Produk("P01", "Buku Tulis", 50));
        mapInventaris.put("P02", new Produk("P02", "Pulpen", 100));
        mapInventaris.put("P03", new Produk("P03", "Pensil 2B", 75));
        mapInventaris.put("P04", new Produk("P04", "Penggaris", 30));
        mapInventaris.put("P05", new Produk("P05", "Penghapus", 40));
        mapInventaris.put("P06", new Produk("P06", "Tipe-X", 25));
        mapInventaris.put("P07", new Produk("P07", "Spidol", 60));
        mapInventaris.put("P08", new Produk("P08", "Stabilo", 35));
        mapInventaris.put("P09", new Produk("P09", "Stopmap", 90));
        mapInventaris.put("P10", new Produk("P10", "Gunting", 20));

        // 3. Iterasi For-Each untuk cetak daftar awal & hitung total stok
        System.out.println("=== DAFTAR PRODUK AWAL ===");
        int totalStokAwal = 0;
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
            totalStokAwal += p.getStok();
        }
        System.out.println("Total Stok: " + totalStokAwal);

        // 4. Simulasi: Ubah stok salah satu produk via .get(kode).setStok()
        System.out.println("\n--- Mengubah stok P01 (Buku Tulis) menjadi 80 ---");
        mapInventaris.get("P01").setStok(80);

        // 5. Simulasi: Hapus satu produk via .remove(kode)
        System.out.println("--- Menghapus produk P03 (Pensil 2B) ---");
        mapInventaris.remove("P03");

        // 6. Iterasi For-Each untuk cetak daftar akhir & hitung total stok
        System.out.println("\n=== DAFTAR PRODUK AKHIR ===");
        int totalStokAkhir = 0;
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            p.tampilkanInfo();
            totalStokAkhir += p.getStok();
        }
        System.out.println("Total Stok: " + totalStokAkhir);
    }
}