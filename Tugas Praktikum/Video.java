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