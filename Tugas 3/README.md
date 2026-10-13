# Sistem Informasi Inventaris Barang

Mengimplementasikan **Java Collections Framework** (`HashMap`) dan **Enhanced For-Loop** 
untuk mengelola data inventaris barang secara dinamis.

## 🗂️ Struktur File

```
├── Produk.java              # Class blueprint objek (atribut + constructor + getter/setter)
├── MainInventaris.java      # Program utama (HashMap, simulasi CRUD sederhana)
└── README.md
```

## 🚀 Cara Menjalankan

```bash
# 1. Clone repository ini
git clone https://github.com/username-kamu/nama-repo-kamu.git
cd nama-repo-kamu

# 2. Compile
javac Produk.java MainInventaris.java

# 3. Run
java MainInventaris
```

## 📖 Penjelasan Program

### Class `Produk`
Blueprint objek produk dengan 3 atribut private (`kodeProduk`, `nama`, `stok`), 
constructor, getter, dan setter stok — menerapkan **encapsulation**.

### Class `MainInventaris`
| Langkah | Keterangan |
|:---|:---|
| 1 | Menambahkan 7 produk ke `HashMap` dengan `.put()` |
| 2 | Mencetak daftar awal + total stok (accumulator) |
| 3 | Mengubah stok produk `P002` via `.get(kode).setStok()` |
| 4 | Menghapus produk `P007` via `.remove(kode)` |
| 5 | Mencetak daftar akhir + total stok |

&gt; **Kenapa HashMap bukan ArrayList?** Karena inventaris butuh pencarian cepat 
&gt; berdasarkan `kodeProduk` (lookup O(1)), bukan berdasarkan urutan/index.

## 📸 Output Program

### 1️⃣ Daftar Inventaris Awal
```
=== Daftar Inventaris Awal ===
Kode: P001 | Nama: Buku | Stok: 30
Kode: P002 | Nama: Tas | Stok: 10
Kode: P003 | Nama: Pensil | Stok: 15
Kode: P004 | Nama: Pulpen | Stok: 20
Kode: P005 | Nama: Laptop | Stok: 35
Kode: P006 | Nama: Printer | Stok: 5
Kode: P007 | Nama: Mouse | Stok: 25
Total produk : 7
Total stok   : 140
```
![Daftar Awal](screenshots/Daftar-Awal.png)


### 2️⃣ Proses Update & Hapus
```
[UPDATE] Stok P002 diubah menjadi 15
[HAPUS] Produk P007 berhasil dihapus.
```
![Proses Update](screenshots/Proses-Update.png)

### 3️⃣ Daftar Inventaris Akhir
```
=== Daftar Inventaris Akhir ===
Kode: P001 | Nama: Buku | Stok: 30
Kode: P002 | Nama: Tas | Stok: 15
Kode: P003 | Nama: Pensil | Stok: 15
Kode: P004 | Nama: Pulpen | Stok: 20
Kode: P005 | Nama: Laptop | Stok: 35
Kode: P006 | Nama: Printer | Stok: 5
Total produk : 6
Total stok   : 120
```
![Daftar Akhir](screenshots/Daftar-Akhir.png)

## 📝 Method Penting yang Digunakan

| Method | Fungsi |
|:---|:---|
| `.put(key, value)` | Menyimpan pasangan Key-Value |
| `.get(key)` | Mengambil objek berdasarkan key |
| `.containsKey(key)` | Cek key ada atau tidak (hindari null) |
| `.remove(key)` | Menghapus pasangan berdasarkan key |
| `.keySet()` | Mengambil semua key untuk iterasi For-Each |

---

⭐ Dibuat untuk memenuhi tugas Pemrograman Berbasis Objek — Pertemuan 4
