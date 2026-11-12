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