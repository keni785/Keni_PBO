
public abstract class AsetDigital {
    //Atribut
    protected String id;
    protected String namaFile;
    protected double ukuranMB;

    // Constructor
    public AsetDigital(String id, String namaFile, double ukuranMB) {
        this.id = id;
        this.namaFile = namaFile;
        this.ukuranMB = ukuranMB;
    }

    // Method Abstrak
    public abstract void tampilkanPreview();

    // Method Konkrit
    public void getInfo() {
        System.out.println("\n=== Info Aset ===");
        System.out.println("ID      : " + id);
        System.out.println("Nama    : " + namaFile);
        System.out.println("Ukuran  : " + ukuranMB + " MB");
    }
}

public class Gambar extends AsetDigital {
    private String resolusi;

    public Gambar(String id, String namaFile, double ukuranMB, String resolusi) {
        super(id, namaFile, ukuranMB);
        this.resolusi = resolusi;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("[REVIEW GAMBAR] Menampilkan gambar dengan resolusi: " + resolusi);
    }
}

public class Video extends AsetDigital {
    private String durasi;

    public Video(String id, String namaFile, double ukuranMB, String durasi) {
        super(id, namaFile, ukuranMB);
        this.durasi = durasi;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("[REVIEW VIDEO] Memutar video dengan durasi: " + durasi);
    }
}

public class Dokumen extends AsetDigital {
    private int jumlahHalaman;

    public Dokumen(String id, String namaFile, double ukuranMB, int jumlahHalaman) {
        super(id, namaFile, ukuranMB);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("[REVIEW DOKUMEN] Menampilkan dokumen sebanyak: " + jumlahHalaman + " halaman");
    }
}

public interface DapatDipromosikan {
    // Method abstrak
    void promosikan();

    // Default Method
    default void infoPromosi() {
        System.out.println(">>> Aset ini berstatus: DAPAT DIPROMOSIKAN.\n");
    }
}

public class VideoPromosi extends Video implements DapatDipromosikan {
    public VideoPromosi(String id,String namaFile, double ukuranMB, String durasi) {
        super(id, namaFile,ukuranMB, durasi);
    }

    // Wajib override method abstark dari interface
    @Override
    public void promosikan() {
        System.out.println(">>> [PROMOSI] " + namaFile + " berhasil diunggah ke media sosial!");
    }
}

import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {

        // 1. ArrayList<AsetDigital> 1 objek dari masing-masing subclass
        // Polimorfisme via abstract class
        ArrayList<AsetDigital> daftarAset = new ArrayList<>();

        daftarAset.add(new Gambar("G01", "Pemandangan.jpg", 2.5, "1920x1080"));
        daftarAset.add(new Video("V01", "Tutorial.mp4", 15.0, "10 Menit"));
        daftarAset.add(new Dokumen("D01", "Laporan Hasil Analisis.pdf", 1.2, 25));
        daftarAset.add(new VideoPromosi("VP01", "Iklan Produk.mp4", 8.5, "1 Menit"));

        System.out.println("\n=========================================");
        System.out.println("   POLIMORFISME VIA ABSTRACT CLASS       ");
        System.out.println("=========================================");

        // 2. Iterasi dan panggil tampilkanPreview()
        for (AsetDigital aset : daftarAset) {
            aset.getInfo();
            aset.tampilkanPreview();

            // 3. Instanceof untuk mengecek objek yang mengimplementasikan DapatDipromosikan
            if (aset instanceof DapatDipromosikan) {
                // Downcasting
                DapatDipromosikan asetPromosi = (DapatDipromosikan) aset;
                asetPromosi.promosikan();
            }
            System.out.println("------------------------------");
        }

        System.out.println("\n=========================================");
        System.out.println("   POLIMORFISME VIA INTERFACE            ");
        System.out.println("=========================================");

        // 4. ArrayList<DapatDipromosikan>
        // Polimorfisme via Interface
        ArrayList<DapatDipromosikan> listPromosi = new ArrayList<>();

        VideoPromosi videoIklan = new VideoPromosi("VP", "Promo Akhir Tahun.mp4", 5.0, "30 Detik");
        listPromosi.add(videoIklan);

        for (DapatDipromosikan dp : listPromosi) {
            dp.promosikan();
            dp.infoPromosi();   // Memanggil default method
        }
    }
}
