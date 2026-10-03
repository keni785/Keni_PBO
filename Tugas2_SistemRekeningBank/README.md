# Tugas 2 - Sistem Rekening Bank (PBO)

Program ini dibuat untuk mensimulasikan **Sistem Rekening Bank** berbasis Java dengan menerapkan konsep **Encapsulation** serta penggunaan keyword seperti `private`, `this`, dan `static`.

---

## 🚀 Fitur & Alur Program
1. **Atribut yang Di privat**: Menggunakan *access modifier* `private` untuk data penting seperti nomor rekening, nama pemilik, dan saldo agar tidak bisa diakses sembarangan dari luar class.
2. **Static Variable**: Menggunakan variabel `static` (`totalRekening`) untuk menghitung jumlah total akun/rekening yang dibuat secara otomatis.
3. **Constructor & Validasi**: Menyiapkan objek rekening baru sekaligus melakukan validasi saldo awal minimal **Rp 50.000**.
4. **Getter & Setter**: Menyediakan method untuk mengambil nilai saldo (`getSaldo`) dan merubah/meng-update saldo (`setSaldo`) dengan pengecekan saldo tidak boleh negatif.
5. **Method Bisnis**: 
   * `tampilkanInformasi()`: Menampilkan detail akun dan format saldo sesuai standar ribuan.
   * `transfer()`: Mengelola transaksi antar-rekening lengkap dengan pengecekan batas nominal dan kecukupan saldo.

---

## 📁 Struktur File
* `RekeningBank.java` - Class model yang berisi atribut, constructor, getter-setter, dan logika bisnis.
* `MainBank.java` - Class utama (*main class*) untuk menjalankan pengujian program.

---

## 📊 Hasil Running Output

### 1. Pengujian Transfer Berhasil
Pada pengujian pertama, akun Aca mengirim saldo sebesar Rp 30.000 ke akun Siti. Karena saldo Aca mencukupi (Rp 100.000), proses transfer berhasil dan saldo kedua akun diperbarui secara otomatis.

![Hasil Running - Transfer Berhasil](Hasil%20Running%201.png)

---

### 2. Pengujian Transfer Gagal (Saldo Tidak Mencukupi)
Pada pengujian kedua, sistem melakukan simulasi transfer saat saldo tidak mencukupi. Sistem secara otomatis menolak transaksi dengan pesan error `ERROR: Transfer gagal! Saldo tidak mencukupi.` sehingga saldo kedua akun tetap aman dan tidak berkurang.

![Hasil Running - Transfer Gagal](Hasil%20Running%202.png)

