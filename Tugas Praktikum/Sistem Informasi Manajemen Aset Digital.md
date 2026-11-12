# 📚Sistem Informasi Manajemen Aset Digital

---

## Deskripsi Proyek
Proyek ini adalah implementasi tugas praktikum untuk mengelola berbagai jenis aset digital (Gambar, Video, Dokumen) menggunakan kombinasi konsep Abstract Class dan Interface dalam bahasa Java.

---

## ✨ Fitur Utama Sistem

Berikut adalah fitur-fitur yang tersedia di dalam sistem ini:

### 1. Manajemen Multi-Aset Digital
Sistem dapat menampung dan mengelola berbagai jenis aset digital dalam satu wadah terpusat (menggunakan `ArrayList`). Aset yang terdaftar meliputi:
*   **Gambar:** Menyimpan informasi resolusi gambar.
*   **Video:** Menyimpan informasi durasi video.
*   **Dokumen:** Menyimpan informasi jumlah halaman dokumen.

### 2. Fitur Preview Aset (Polimorfisme)
Setiap aset memiliki cara unik untuk menampilkan *preview*-nya. Sistem ini secara otomatis memanggil method `tampilkanPreview()` yang sesuai dengan jenis asetnya masing-masing berkat konsep **Polimorfisme** dari Abstract Class `AsetDigital`.

### 3. Sistem Promosi Khusus (Interface)
Sistem membedakan aset biasa dengan aset yang bisa dipromosikan. Fitur ini menggunakan interface `DapatDipromosikan`. 
*   Jika sebuah aset (misalnya `VideoPromosi`) mendukung promosi, sistem akan otomatis mendeteksinya menggunakan `instanceof` dan menjalankan method `promosikan()`.
*   Sistem juga menampilkan info status promosi menggunakan `default method` `infoPromosi()`.

### 4. Pemisahan Grup Aset Berdasarkan Kemampuan
Selain dikelompokkan berdasarkan jenis aset, sistem juga memungkinkan pengelompokan aset berdasarkan "kemampuan" (kemampuan promosi) menggunakan wadah `ArrayList<DapatDipromosikan>`. Ini membuktikan fleksibilitas Polimorfisme via Interface.

---

## 🛠️ Konsep OOP yang Diterapkan
*   **Abstract Class:** Digunakan pada `AsetDigital` sebagai *blueprint* dasar yang menampung atribut umum (`id`, `namaFile`, `ukuranMB`).
*   **Inheritance (Pewarisan):** Subclass seperti `Gambar`, `Video`, dan `Dokumen` mewarisi sifat dari `AsetDigital`.
*   **Interface:** Digunakan pada `DapatDipromosikan` sebagai kontrak kemampuan tambahan (*can-do*).
*   **Polymorphism:** Objek dapat diperlakukan sebagai tipe induknya (`AsetDigital`) atau sebagai tipe kemampuan (`DapatDipromosikan`).
*   **Downcasting:** Digunakan untuk mengubah referensi `AsetDigital` menjadi `DapatDipromosikan` saat memanggil method promosi.

---

## 💻 Cara Menjalankan Program
1. Pastikan kamu sudah menginstal **Java JDK** di komputermu.
2. *Clone* repository ini atau *download* semua file `.java`.
3. Buka terminal atau Command Prompt di folder tempat file disimpan.
4. Compile semua file: `javac *.java`
5. Jalankan program utama: `java MainAset`

---

## Output
<img width="1920" height="1020" alt="Screenshot 2026-11-12 101549" src="https://github.com/user-attachments/assets/395bad99-143f-46c7-b427-b05a1be9ebf9" />
<img width="1920" height="1020" alt="Screenshot 2026-11-12 101619" src="https://github.com/user-attachments/assets/998eb757-6c1f-4cc7-9dab-d607fee71f5f" />

