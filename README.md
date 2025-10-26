
# 🧾 Tugas: Obyek Terdistribusi (Java RMI)

Proyek ini merupakan implementasi sederhana dari **Obyek Terdistribusi** menggunakan **Java RMI (Remote Method Invocation)**.  
Contoh kasus yang digunakan adalah **Sistem Pemesanan Tiket Online**, di mana client dapat memesan tiket ke server melalui komunikasi antarobjek jarak jauh.

---

## 👨‍💻 Identitas Mahasiswa

**Nama:** Alexander Djumat Tupen  
**NIM:** 20240040227  

---

## 📘 Deskripsi Proyek

Sistem ini terdiri dari dua pihak:
- **Server** yang menyediakan layanan pemesanan tiket (`TicketServer`)
- **Client** yang memesan tiket (`TicketClient`)

Komunikasi antara keduanya menggunakan konsep **Remote Object** dalam **Java RMI**,  
di mana method pada server bisa dipanggil dari client walaupun dijalankan di komputer berbeda.

---

## ⚙️ Struktur File Proyek

| File | Fungsi |
|------|---------|
| `TicketService.java` | Interface remote yang mendefinisikan layanan pemesanan tiket |
| `TicketServer.java` | Implementasi layanan dan pendaftaran ke RMI Registry |
| `TicketClient.java` | Client yang mengakses layanan dari server |

---

## 🚀 Cara Menjalankan Program

1. **Buka terminal di folder proyek**

2. **Kompilasi semua file Java**

3. **Jalankan Server**
Output server:
Server siap dan menunggu client...

4. **Jalankan Client** (di terminal baru)
Output client:
Response dari server: Tiket untuk Alexander ke Jakarta berhasil dipesan!

---

## 📸 Hasil Eksekusi

**Tampilan Server**
Server siap dan menunggu client...

**Tampilan Client**
Client → Client Stub → ORB ↔ ORB → Server Skeleton → Server

Keterangan:
- **Client:** Mengirim permintaan ke objek jarak jauh  
- **Stub:** Meneruskan permintaan ke jaringan  
- **ORB:** Penghubung utama antarobjek  
- **Skeleton:** Menerima permintaan di sisi server  
- **Server:** Menjalankan layanan dan mengirimkan hasil ke client  

---

## 💡 Kesimpulan

Implementasi Java RMI ini menunjukkan bahwa:
- Client dapat memanggil method di server jarak jauh seolah-olah objek tersebut lokal.  
- Sistem ini menggambarkan prinsip dasar dari **obyek terdistribusi** yang sering digunakan pada sistem berskala besar.  
- Konsep ini dapat diterapkan pada berbagai sistem nyata, seperti pemesanan tiket, sistem pembayaran, dan manajemen data jarak jauh.

---

## 🧾 Daftar Pustaka
1. Tanenbaum, A. S. *Distributed Systems: Principles and Paradigms.* Prentice Hall, 2007.  
2. Dokumentasi Oracle Java RMI — [https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/)  
3. Materi kuliah Sistem Paralel dan Terdistribusi – Topik Obyek Terdistribusi.

---

© 2025 **Alexander Djumat Tupen**
