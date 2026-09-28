public class Mahasiswa {
    // 1. Deklarasi Atribut
    public String nim;
    public String nama;
    public int sks;
    public double ipk;

    // 2. Constructor dengan 4 parameter
    public Mahasiswa(String nim, String nama, int sks, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.ipk = ipk;
    }

    // 3. Overloaded versi 1 parameter
    public void hitungIPKSemester(double nilaiAkhir) {
        ipk = (ipk + nilaiAkhir) / 2;
    }

    // 4. Overloaded versi 2 parameter
    public void hitungIPKSemester(double nilaiAkhir, int bobotSks) {
        ipk = ((ipk * sks) + (nilaiAkhir * bobotSks)) / (sks + bobotSks);
        sks = sks + bobotSks;
    }

    public void tampilkanData() {
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Total SKS       : " + sks);
        System.out.printf("IPK saat ini    : %.2f%n", this.ipk);
        System.out.println("------------------------------");
    }
}