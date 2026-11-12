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