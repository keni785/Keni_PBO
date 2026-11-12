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