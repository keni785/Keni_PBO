# Tugas 2 - Sistem Rekening Bank (PBO)

Program ini dibuat untuk mensimulasikan **Sistem Rekening Bank** berbasis Java dengan menerapkan konsep **Encapsulation** serta penggunaan keyword seperti `private`, `this`, dan `static`.

---

## 🚀 Fitur & Alur Program
1. **Validasi Saldo Awal**: Menggunakan *access modifier* `private` pada atribut saldo dan menerapkan validasi pembuatan akun minimal **Rp 50.000**.
2. **Informasi Rekening**: Menampilkan detail nomor rekening, nama pemilik, dan jumlah saldo.
3. **Proses Transfer Saldo**: Logika pemindahan nominal saldo antar-rekening dengan validasi kecukupan saldo pengirim.
4. **Status Saldo**: Menampilkan pembaruan saldo kedua rekening setelah proses transfer (berhasil/gagal).
5. **Total Rekening Aktif**: Menggunakan variabel `static` untuk menghitung total akun yang berhasil terdaftar secara otomatis.

---

## 📁 Struktur File
* `RekeningBank.java` - Class model yang berisi atribut, constructor, getter-setter, dan logika bisnis.
* `MainBank.java` - Class utama (*main class*) untuk menjalankan pengujian program.S

---

## 📊 Hasil Running Output

### 1. Pengujian Transfer Berhasil
Pada pengujian pertama, akun Aca mengirim saldo sebesar Rp 30.000 ke akun Siti. Karena saldo Aca mencukupi (Rp 100.000), proses transfer berhasil dan saldo kedua akun diperbarui secara otomatis.

![Hasil Running - Transfer Berhasil](Hasil%20Running%201.png)

---

### 2. Pengujian Transfer Gagal (Saldo Tidak Mencukupi)
Pada pengujian kedua, sistem melakukan simulasi transfer saat saldo tidak mencukupi. Sistem secara otomatis menolak transaksi dengan pesan error `ERROR: Transfer gagal! Saldo tidak mencukupi.` sehingga saldo kedua akun tetap aman dan tidak berkurang.

![Hasil Running - Transfer Gagal](Hasil%20Running%202.png)

