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
  <img width="383" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/18b36f51-433e-401f-8a5a-e76f0290480d">

-	displayAllTreatments(): Menampilkan semua treatment yang ada dalam list treatments.
  <img width="413" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/e811ceaf-c646-4da1-ba6f-fe1653ccc5df">

-	editTreatment(): Memungkinkan pengguna untuk memilih nomor treatment yang ingin diubah dan mengubahnya dengan input baru.
  <img width="419" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/97a3ff9f-cd54-4564-b8af-11bb93e0b839">

-	deleteTreatment(): Memungkinkan pengguna untuk menghapus treatment berdasarkan nama treatment yang dimasukkan.
  <img width="539" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/72cf6cae-ba58-4384-978a-4414b3247b25">

-	searchTreatment(): Memungkinkan pengguna untuk mencari treatment berdasarkan nama treatment yang dimasukkan.
  <img width="540" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/72c54c6c-e45a-45aa-a321-f647f0004dfb">

  - iterasi.
<img width="423" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/98f671f5-d669-409f-9bdf-781b723b94b2">
    
   Iterasi dilakukan menggunakan Iterator<Treatment2> untuk mengakses elemen di dalam List treatments. Setiap elemen diperiksa, dan jika nama treatment cocok, treatment tersebut dihapus menggunakan iterator.remove()




2. **Kelas Treatment**:
-	Merupakan kelas yang merepresentasikan treatment, dengan atribut ID, nama, dan harga.
-	Memiliki konstruktor untuk inisialisasi objek treatment.
  <img width="355" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/a01c629b-ce51-4b35-8f2a-1cb90ddc4711">

-	Memiliki beberapa getter untuk mendapatkan informasi ID, nama, dan harga.
  <img width="426" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/26386c0b-508c-414f-ab87-5424c84b7161">

-	Memiliki beberapa setter untuk mengubah nama dan harga treatment.
  <img width="232" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/2ae3d998-e66e-4aed-be90-0c73c5a44958">

-	Memiliki method inputData() untuk mendapatkan input dari pengguna terkait nama dan harga treatment.
  <img width="321" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/cc5bb2b3-5b64-4956-9671-67e6643879dc">

-	Override method toString() untuk menghasilkan representasi String dari objek treatment.
  <img width="514" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/f7082dcc-7b08-4708-bd88-094499393ed5">

-	Penggunaan final pada kelas Treatment (final class): Mendeklarasikan kelas sebagai final memastikan bahwa kelas tersebut tidak dapat memiliki kelas turunan (subclass). Ini mengunci implementasi kelas sehingga tidak dapat diubah atau di-extend.
  <img width="191" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/bcdf91bd-8440-493a-88d5-84000810e446">

-	Penggunaan final pada atribut id_treatment (final properties): Mendeklarasikan atribut sebagai final membuat atribut tersebut menjadi konstan yang tidak dapat diubah setelah inisialisasi. Ini berguna untuk membuat nilai yang tetap dan tidak berubah.
  <img width="154" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/262abf04-4a40-4fcb-bda1-190f4bac82aa">


# Output/Alur Kerja:
1. **Menu Utama:**
<img width="181" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/2f60df43-19a0-4fb9-b9c7-36f1f20d7ceb">

Program akan memulai dengan menampilkan menu utama dengan berbagai opsi yaitu tambah treatment, tampilkan semua treatment, edit treatment, cari treatment, hapus treatment, dan keluar

2. **Tambah Treatment:**
<img width="203" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/fd4486ec-3f3d-437f-9a8b-27b5e249b494">

Apabila pengguna memilih opsi "Tambah Treatment". Program meminta pengguna untuk memasukkan ID, nama, dan harga treatment. Setelah pengguna memasukkan informasi, program akan menambahkan treatment baru ke dalam daftar.

3. **Tampilkan Semua Treatment:**
<img width="310" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/2d8b39f1-ac54-4ac4-be14-61c1d6cc5aac">

Apabila pengguna memilih opsi "Tampilkan Semua Treatment". Program akan menampilkan daftar semua treatment beserta detailnya.

4. **Edit Treatment:**
<img width="312" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/c03bcd39-3a65-4c1f-b3ec-0f4024b84235">

Apabila pengguna memilih opsi "Edit Treatment". Program akan menampilkan daftar treatment. Lalu, pengguna memilih nomor treatment yang ingin diubah. Kemudian, program meminta pengguna untuk memasukkan informasi baru untuk treatment yang dipilih. Program akan mengubah informasi treatment sesuai dengan input pengguna.

5. **Cari Treatment:**
<img width="505" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/18285558-1b67-41ab-824a-fd7263751243">

Apabila pengguna memilih opsi "Cari Treatment". Program akan meminta pengguna untuk memasukkan nama treatment yang ingin dicari. Program akan mencari treatment dengan nama yang cocok dan menampilkan detailnya jika ditemukan.

6. **Hapus Treatment:**
<img width="395" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/1e9d91f8-f7b0-4f6d-8ba2-bc8fe99a983e">

Apabila pengguna memilih opsi "Hapus Treatment". Program akan meminta pengguna untuk memasukkan nama treatment yang ingin dihapus. Kemudian, program akan mencari treatment dengan nama yang cocok dan menghapusnya jika ditemukan.

7. **Keluar:**
<img width="200" alt="image" src="https://github.com/nesthsaa/pbo-post-test-2/assets/127474858/3953c65d-293e-483f-8d4b-816004372084">

Apabila pengguna memilih opsi "Keluar". Program akan berhenti.
