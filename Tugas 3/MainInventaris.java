import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
    // HashMap sebagai storage
    HashMap<String, Produk> mapInventaris = new HashMap<>();
    
    // Menambahkan Produk
    mapInventaris.put("P001", new Produk("P001", "Buku", 30));
    mapInventaris.put("P002", new Produk("P002", "Tas", 10));
    mapInventaris.put("P003", new Produk("P003", "Pensil", 15));
    mapInventaris.put("P004", new Produk("P004", "Pulpen", 20));
    mapInventaris.put("P005", new Produk("P005", "Laptop", 35));
    mapInventaris.put("P006", new Produk("P006", "Printer", 5));
    mapInventaris.put("P007", new Produk("P007", "Mouse", 25));

    // Cetak daftar awal
    System.out.println("\n=== Daftar Inventaris Awal ===");
    cetakInventaris(mapInventaris);

    // Update
    String kodeUpdate = "P002";
    if (mapInventaris.containsKey(kodeUpdate)) {
        mapInventaris.get(kodeUpdate).setStok(15);
        System.out.println("\n[UPDATE] Stok " + kodeUpdate + " diubah menjadi" + " " + mapInventaris.get(kodeUpdate).getStok());
    }
    else {
        System.out.println("\n[UPDATE] Produk " + kodeUpdate + "tidak ditemukan!");
    }

    // Hapus satu produk
    String kodeHapus = "P007";
    if (mapInventaris.containsKey(kodeHapus)) {
        mapInventaris.remove(kodeHapus);
        System.out.println("\n[HAPUS] Produk " + kodeHapus + " berhasil dihapus.");
    }
    else {
        System.out.println("\n[HAPUS] Produk " + kodeHapus + " tidak ditemukan!");
    }

    // Cetak daftar akhir
    System.out.println("\n=== Daftar Inventaris Akhir ===");
    cetakInventaris(mapInventaris);
    }

    // Iterasi For-Each pakai keySet() + accumulator total stok
    private static void cetakInventaris(HashMap<String, Produk> mapInventaris) {
    int totalStok = 0;
    for (String key : mapInventaris.keySet()) {
        Produk p = mapInventaris.get(key);
        System.out.println("Kode: " + key + " | Nama: " + p.getNama() + " | Stok: " + p.getStok());
        totalStok += p.getStok();
    }
    System.out.println("Total produk : " + mapInventaris.size());
    System.out.println("Total stok   : " + totalStok);
    }
}
