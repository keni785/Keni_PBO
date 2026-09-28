public class MainAkademik {
    public static void main(String[] args) {
        // 1. Membuat 2 objek dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("12025001", "Keni", 20, 3.2);
        Mahasiswa mhs2 = new Mahasiswa("12025002", "Kace", 20, 3.3);

        // 2. Menampilkan data SEBELUM penambahan nilai
        System.out.println("==== Data Sebelum Update ====");
        mhs1.tampilkanData();
        mhs2.tampilkanData();

        // 3. Memanggil Method Overloading untuk simulasi penambahan nilai semester
        mhs1.hitungIPKSemester(3.5);        // Menggunakan versi 1 parameter (double nilaiAkhir)
        mhs2.hitungIPKSemester(3.6);

        mhs1.hitungIPKSemester(3.7, 4);     // Menggunakan versi 2 parameter (double nilaiAkhir, bobotSks)
        mhs2.hitungIPKSemester(3.9, 2);

        // 4. Menampilkan data SESUDAH penambahan nilai
        System.out.println("==== Data Sesudah Update ====");
        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }
}