# Tugas 2 - Sistem Rekening Bank (PBO)

Program ini merupakan simulasi pengelolaan **Sistem Rekening Bank** berbasis Java yang menerapkan konsep Object-Oriented Programming (OOP) seperti *Encapsulation*, *Constructor Validation*, *Static Variable*, serta *Method Validation*.

---

## 🚀 Fitur Utama
1. **Validasi Saldo Awal**: Memastikan saldo awal pembuatan akun minimal **Rp 50.000**.
2. **Informasi Rekening**: Menampilkan detail nomor rekening, nama pemilik, dan saldo berformat ribuan (contoh: `Rp 100.000`).
3. **Transfer Saldo**: Memindahkan nominal antar-rekening dengan validasi kecukupan saldo dan nominal transfer.
4. **Pencatatan Total Akun**: Menggunakan `static variable` untuk menghitung jumlah total rekening aktif secara otomatis.

---

## 📁 Struktur File
* `RekeningBank.java` - Class model yang berisi atribut, constructor, getter-setter, dan logika bisnis.
* `MainBank.java` - Class utama (*main class*) untuk menjalankan pengujian program.S

---

## 📊 Hasil Running Output

### 1. Pengujian Transfer Berhasil
Pada pengujian pertama, akun Aca mengirim saldo sebesar Rp 30.000 ke akun Siti. Karena saldo Aca mencukupi (Rp 100.000), proses transfer berhasil dan saldo kedua akun diperbarui secara otomatis.

![Hasil Running - Transfer Berhasil](Hasil_Running_1.png)

---

### 2. Pengujian Transfer Gagal (Saldo Tidak Mencukupi)
Pada pengujian kedua, sistem melakukan simulasi transfer saat saldo tidak mencukupi. Sistem secara otomatis menolak transaksi dengan pesan error `ERROR: Transfer gagal! Saldo tidak mencukupi.` sehingga saldo kedua akun tetap aman dan tidak berkurang.

![Hasil Running - Transfer Gagal](Hasil_Running_2.png)
