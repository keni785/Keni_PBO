public class MainBank {
    public static void main(String[] args) {
        System.out.println("===== SISTEM REKENING BANK =====");

        // 1. 2 objek rekening dengan saldo valid
        RekeningBank akun1 = new RekeningBank("101", "Aca", 100000);
        RekeningBank akun2 = new RekeningBank("102", "Siti", 200000);

        // 2. Menguji validasi saldo awal kurang dari Rp 50.000 (akan muncul error)
        System.out.println("\n--- Uji Validasi Saldo Awal ---");
        RekeningBank akunGagal = new RekeningBank("103", "Andi", 20000);
        akunGagal.tampilkanInformasi();

        // 3. Menampilkan informasi awal rekening
        System.out.println("\n--- Informasi Rekening Awal ---");
        akun1.tampilkanInformasi();
        System.out.println();
        akun2.tampilkanInformasi();

        // 4. Menguji method bisnis transfer
        System.out.println("\n--- Proses Transfer ---");
        akun1.transfer(30000, akun2);

        // 5. Menampilkan saldo setelah transfer
        System.out.println("\n--- Saldo Setelah Transfer ---");
        System.out.println("Saldo Aca: Rp " + String.format(java.util.Locale.GERMANY, "%,.0f", akun1.getSaldo()));
        System.out.println("Saldo Siti: Rp " + String.format(java.util.Locale.GERMANY, "%,.0f", akun2.getSaldo()));

        // 6. Menampilkan total akun yang dibuat (Static Variable)
        System.out.println("\n--- Total Rekening Terdaftar ---");
        System.out.println("Total rekening aktif: " + RekeningBank.totalRekening);
    }
}