public class RekeningBank {
    // 1. Atribut private (Encapsulation)
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    // 2. Statis Variable
    public static int totalRekening = 0;

    // 3. Constructor
    public RekeningBank(String noRekening, String namaPemilik, double saldo) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        // Validasi
        if (saldo >= 50000)
            this.saldo = saldo;
        else { System.out.println("ERROR: Saldo awal minimal RP 50.000!");
            this.saldo = 0;
        }
        totalRekening++;
    }

    // 4. Getter & Setter
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("ERROR: Saldo tidak boleh negatif!");
        }
    }

    // 5. Method Bisnis
    public void tampilkanInformasi() {
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo       : Rp " + String.format(java.util.Locale.GERMANY, "%,.0f", saldo));
    }

    public void transfer(double nominal, RekeningBank tujuan) {
        if (nominal <= 0) {
            System.out.println("ERROR: Nominal transfer harus lebih dari 0!");
        } else if (nominal > this.saldo) {
            System.out.println("ERROR: Transfer gagal! Saldo tidak mencukupi.");
        } else {
            this.saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Transfer sebesar RP " + String.format(java.util.Locale.GERMANY, "%,.0f", nominal) + " ke " + tujuan.namaPemilik + " berhasil!");
        }
    }
}