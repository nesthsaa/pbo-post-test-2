# Penjelasan Source Code

Program yang dibuat merupakan program untuk mengelola daftar treatment di sebuah Nail Art Studio. Program ini memanfaatkan konsep pemrograman berorientasi objek (OOP) dengan memanfaatkan kelas dan objek. Program terdiri dari dua kelas yaitu NailArtStudioo dan Treatment. Berikut adalah penjelasan mengenai setiap kelas:

1. **Kelas NailArtStudioo**:
-	Merupakan kelas utama yang mengatur jalannya program.
-	Memiliki fungsi-fungsi untuk menambahkan, menampilkan, mengedit, mencari, dan menghapus treatment.
-	Menggunakan kelas Scanner untuk mendapatkan input dari pengguna.
-	Menggunakan kelas Treatment untuk merepresentasikan treatment.
-	Penggunaan final pada Metode (final method):
Mendeklarasikan metode sebagai final mencegah metode tersebut dari di-override di kelas turunannya. Hal ini bermanfaat saat ingin memastikan bahwa perilaku suatu metode tidak dapat diubah oleh kelas turunan.
-	addTreatment(): Menambahkan treatment baru dengan mendapatkan input dari pengguna (ID, nama, harga) dan menyimpannya dalam list treatments.
-	displayAllTreatments(): Menampilkan semua treatment yang ada dalam list treatments.
-	editTreatment(): Memungkinkan pengguna untuk memilih nomor treatment yang ingin diubah dan mengubahnya dengan input baru.
-	deleteTreatment(): Memungkinkan pengguna untuk menghapus treatment berdasarkan nama treatment yang dimasukkan.
-	searchTreatment(): Memungkinkan pengguna untuk mencari treatment berdasarkan nama treatment yang dimasukkan.

2. **Kelas Treatment**:
-	Merupakan kelas yang merepresentasikan treatment, dengan atribut ID, nama, dan harga.
-	Memiliki konstruktor untuk inisialisasi objek treatment.
-	Memiliki beberapa getter untuk mendapatkan informasi ID, nama, dan harga.
-	Memiliki beberapa setter untuk mengubah nama dan harga treatment.
-	Memiliki method inputData() untuk mendapatkan input dari pengguna terkait nama dan harga treatment.
-	Override method toString() untuk menghasilkan representasi String dari objek treatment.
-	Penggunaan final pada kelas Treatment (final class):
Mendeklarasikan kelas sebagai final memastikan bahwa kelas tersebut tidak dapat memiliki kelas turunan (subclass). Ini mengunci implementasi kelas sehingga tidak dapat diubah atau di-extend.
-	Penggunaan final pada atribut id_treatment (final properties):
Mendeklarasikan atribut sebagai final membuat atribut tersebut menjadi konstan yang tidak dapat diubah setelah inisialisasi. Ini berguna untuk membuat nilai yang tetap dan tidak berubah.

# Output/Alur Kerja:
1. **Menu Utama:**
Program akan memulai dengan menampilkan menu utama dengan berbagai opsi yaitu tambah treatment, tampilkan semua treatment, edit treatment, cari treatment, hapus treatment, dan keluar

2. **Tambah Treatment:**
Apabila pengguna memilih opsi "Tambah Treatment". Program meminta pengguna untuk memasukkan ID, nama, dan harga treatment. Setelah pengguna memasukkan informasi, program akan menambahkan treatment baru ke dalam daftar.

3. **Tampilkan Semua Treatment:**
Apabila pengguna memilih opsi "Tampilkan Semua Treatment". Program akan menampilkan daftar semua treatment beserta detailnya.

4. **Edit Treatment:**
Apabila pengguna memilih opsi "Edit Treatment". Program akan menampilkan daftar treatment. Lalu, pengguna memilih nomor treatment yang ingin diubah. Kemudian, program meminta pengguna untuk memasukkan informasi baru untuk treatment yang dipilih. Program akan mengubah informasi treatment sesuai dengan input pengguna.

5. **Cari Treatment:**
Apabila pengguna memilih opsi "Cari Treatment". Program akan meminta pengguna untuk memasukkan nama treatment yang ingin dicari. Program akan mencari treatment dengan nama yang cocok dan menampilkan detailnya jika ditemukan.

6. **Hapus Treatment:**
Apabila pengguna memilih opsi "Hapus Treatment". Program akan meminta pengguna untuk memasukkan nama treatment yang ingin dihapus. Kemudian, program akan mencari treatment dengan nama yang cocok dan menghapusnya jika ditemukan.

7. **Keluar:**
Apabila pengguna memilih opsi "Keluar". Program akan berhenti.
