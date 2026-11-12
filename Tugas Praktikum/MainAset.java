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