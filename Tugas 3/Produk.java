public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;

    //Constructor
    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }

    // Getter
    public String getKodeProduk() { return kodeProduk; }
    public String getNama() { return nama; }
    public int getStok() { return stok; }

    // Setter
    public void setStok(int stok) {
        this.stok = stok;
    }

    // Tampilkan info
    public void tampilkanInformasi() {
        System.out.println("Kode: " + kodeProduk);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stok);
    }
}