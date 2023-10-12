#Penjelasan Source Code

Program yang dibuat merupakan program untuk mengelola daftar treatment di sebuah Nail Art Studio. Program ini memanfaatkan konsep pemrograman berorientasi objek (OOP) dengan memanfaatkan kelas dan objek. Program terdiri dari dua kelas: `NailArtStudioo` dan `Treatment`. Berikut adalah penjelasan mengenai setiap kelas:

1. **Kelas `NailArtStudioo`**:
-	Merupakan kelas utama yang mengatur jalannya program.
-	Memiliki fungsi-fungsi untuk menambahkan, menampilkan, mengedit, mencari, dan menghapus treatment.
-	Menggunakan kelas `Scanner` untuk mendapatkan input dari pengguna.
-	Menggunakan kelas `Treatment` untuk merepresentasikan treatment.
-	Penggunaan final pada Metode (final method):
Mendeklarasikan metode sebagai final mencegah metode tersebut dari di-override di kelas turunannya. Hal ini bermanfaat saat ingin memastikan bahwa perilaku suatu metode tidak dapat diubah oleh kelas turunan.
Metode-metode dalam kelas NailArtStudioo:
-	addTreatment(): Menambahkan treatment baru dengan mendapatkan input dari pengguna (ID, nama, harga) dan menyimpannya dalam list treatments.
-	displayAllTreatments(): Menampilkan semua treatment yang ada dalam list treatments.
-	editTreatment(): Memungkinkan pengguna untuk memilih nomor treatment yang ingin diubah dan mengubahnya dengan input baru.
-	deleteTreatment(): Memungkinkan pengguna untuk menghapus treatment berdasarkan nama treatment yang dimasukkan.
-	searchTreatment(): Memungkinkan pengguna untuk mencari treatment berdasarkan nama treatment yang dimasukkan.

2. **Kelas `Treatment`**:
-	Merupakan kelas yang merepresentasikan treatment, dengan atribut ID, nama, dan harga.
-	Memiliki konstruktor untuk inisialisasi objek treatment.
-	Memiliki beberapa getter untuk mendapatkan informasi ID, nama, dan harga.
-	Memiliki beberapa setter untuk mengubah nama dan harga treatment.
-	Memiliki method `inputData()` untuk mendapatkan input dari pengguna terkait nama dan harga treatment.
-	Override method `toString()` untuk menghasilkan representasi String dari objek treatment.
-	Penggunaan final pada kelas Treatment (final class):
Mendeklarasikan kelas sebagai final memastikan bahwa kelas tersebut tidak dapat memiliki kelas turunan (subclass). Ini mengunci implementasi kelas sehingga tidak dapat diubah atau di-extend.
-	Penggunaan final pada atribut id_treatment (final properties):
Mendeklarasikan atribut sebagai final membuat atribut tersebut menjadi konstan yang tidak dapat diubah setelah inisialisasi. Ini berguna untuk membuat nilai yang tetap dan tidak berubah.
