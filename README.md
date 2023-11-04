# Assignment-1
## 1. _Project Overview_
memahami suatu program adalah hal yang sangat di perlukan di waktu sekarang. oleh karena itu kita sangat perlu belajar mengenai tipe tipe data dalam program dan sekarang saya membuat beberapa tipe data dalam program java sebagai tugas coding.

## 2. _penjelasan program "main"_

### 2.1_public class main_
adalah deklarasi kelas utama (main class) dalam program. Nama kelas harus sama dengan nama file Java, dan kelas ini akan berisi metode main yang akan 
dijalankan saat program dimulai.

### 2.3 _public statis void main (String [] args)_
adalah metode utama yang akan dieksekusi saat program dijalankan. Ini adalah titik masuk utama program Java. 
Parameter args adalah argumen baris perintah yang dapat diteruskan ke program.

### 2.4 _perulangan for_
Dalam perulangan for, variabel i mulai dari 1 hingga 100. Setiap iterasi dari perulangan mencetak nilai i menggunakan System.out.println(i);. 
Ini akan mencetak angka dari 1 hingga 100 di layar.

### 2.5 _system.out.print_
Setelah perulangan selesai, program mencetak tiga baris teks "Moahamad Irvan Ramadhansyah" menggunakan System.out.println("Moahamad Irvan Ramadhansyah");. 
Jadi, setelah mencetak angka dari 1 hingga 100, program mencetak teks "Moahamad Irvan Ramadhansyah" tiga kali.

### 2.6 _tipe data_
Tipe data yang digunakan dalam program ini adalah int untuk variabel i, yang digunakan untuk menghitung angka dalam perulangan. 
Tipe data String digunakan untuk mencetak teks "Moahamad Irvan Ramadhansyah."

## 3 _perulanganwhile_
While bisa kita artikan selama. Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true . 
Penjelasan: kondisi bisa kita isi dengan perbandingan maupun variabel boolean.
### 3.1 _penjelasan program_
Program yang saya buat adalah program Java yang menggunakan perulangan while untuk mencetak angka-angka kelipatan 2 hingga batas maksimum yang diinputkan oleh pengguna. 

#### a. _penjelasan lebih detail_

import java.util.Scanner; adalah pernyataan yang mengimpor kelas Scanner dari pustaka (library) Java java.util. Ini digunakan untuk menerima input dari pengguna.

public class perulanganwhile adalah deklarasi kelas yang diberi nama "perulanganwhile." Kelas ini berisi metode main yang akan dieksekusi saat program dimulai.

Di dalam metode main, program pertama-tama membuat objek Scanner untuk menerima input dari pengguna dengan pernyataan Scanner scanner = new Scanner(System.in);.

Program kemudian mencetak pesan "Masukkan batas maksimum: " dan menggunakan scanner.nextInt(); untuk membaca angka yang dimasukkan oleh 
pengguna dan menyimpannya dalam variabel batas.

Variabel angka diinisialisasi dengan nilai 2. Ini adalah angka awal yang akan digunakan dalam perulangan.

Selama nilai angka kurang dari atau sama dengan batas, program masuk ke dalam perulangan while.

Di dalam perulangan, program memeriksa apakah angka adalah kelipatan 2 dengan menggunakan kondisi if (angka % 2 == 0). Jika benar, 
program mencetak nilai angka dengan System.out.println(angka);.

Setelah mencetak angka, nilai angka ditambahkan dengan 2 (angka += 2;) sehingga program akan mencetak kelipatan 2 berikutnya pada iterasi berikutnya.

Setelah perulangan selesai, program menutup objek Scanner dengan scanner.close(); untuk membersihkan sumber daya.

Program yang saya buat hanya  akan mencetak semua kelipatan 2 mulai dari 2 hingga batas maksimum yang dimasukkan oleh pengguna.


## 4. _zodiac_ 
Zodiac berasal dari bahasa latin yaitu zodiacus yang berarti lingkaran hewan. Karena hal itu, sebagian besar nama dan lambang zodiac
adalah hewan. Sedangkan, menurut Kamus Besar Bahasa Indonesia (KBBI) zodiac berarti lingkaran khayal di langit yang berpusat di ekliptika dan dibagi menjadi dua belas tanda perbintangan. Dan jika kita ingin membuat program yang dapat menghasilkan zodiac kita sesuai tanggal dan bulan lahir maka 

### 4.1 _penjelasan program zodiac_
Program yang saya buat adalah program Java yang dimana akan meminta kita memasukkan tanggal lahir dalam format "hari-bulan," dan
kemudian menentukan zodiak berdasarkan tanggal lahir tersebut. 

#### a. _penjelasan lebih detail_
import java.util.Scanner;: Ini adalah pernyataan untuk mengimpor kelas Scanner dari paket java.util, yang digunakan untuk mengambil masukan dari pengguna.

public class zodiac {: Ini adalah deklarasi kelas Java dengan nama zodiac. Nama kelas harus sama dengan nama file yang menyimpan program (dalam hal ini, zodiac.java).

public static void main(String[] args) {: Ini adalah metode main, yang merupakan titik masuk utama program. Semua pernyataan dalam program dijalankan dari sini.

Deklarasi variabel:

int tanggal, bulan;: Variabel tanggal dan bulan digunakan untuk menyimpan input tanggal dan bulan lahir pengguna.
String zodiak = null;: Variabel zodiak digunakan untuk menyimpan nama zodiak yang akan ditentukan nanti. Nilai awalnya diatur ke null.
Scanner input = new Scanner(System.in);: Ini adalah deklarasi objek Scanner yang digunakan untuk membaca masukan dari pengguna.

Meminta tanggal dan bulan lahir:

System.out.print("Masukkan tanggal lahir: ");: Program mencetak pesan permintaan untuk memasukkan tanggal lahir.
tanggal = input.nextInt();: Program menggunakan objek input untuk membaca masukan integer (tanggal) dari pengguna.
System.out.print("Masukkan bulan lahir: ");: Program mencetak pesan permintaan untuk memasukkan bulan lahir.
bulan = input.nextInt();: Program menggunakan objek input untuk membaca masukan integer (bulan) dari pengguna.
Struktur switch-case:

Program menggunakan switch (bulan) untuk menentukan tindakan yang akan diambil berdasarkan nilai bulan yang dimasukkan oleh pengguna.
Setiap case pada struktur switch menguji nilai bulan dan kemudian menjalankan pernyataan yang sesuai dengan kasus tersebut. Misalnya, jika bulan adalah 1 (Januari), program akan menjalankan pernyataan-pernyataan dalam case 1.

Dalam masing-masing case, program menggunakan pernyataan if dalam beberapa kasus untuk menentukan zodiak berdasarkan tanggal lahir yang dimasukkan. Setelah menentukan zodiak, nilai zodiak diisi dengan nama zodiak yang sesuai.

// Tampilkan hasil: Ini adalah komentar yang digunakan untuk memberikan penjelasan bahwa program akan menampilkan hasilnya.

System.out.println("Zodiak Anda adalah: " + zodiak);: Program mencetak hasil dengan menampilkan nama zodiak yang telah ditentukan berdasarkan tanggal lahir pengguna.

Tutup kurung kurawal } menutup metode main.

Tutup kurung kurawal } menutup kelas zodiac.

## 5. _tipedataarray_
Tipe data array adalah tipe data terstruktur yang merujuk kepada sebuah atau sekumpulan elemen yang mempunyai tipe data yang sama melalui indeks. 
Array disimpan dengan urutan yang sesuai dengan definisi indeks secara kontinu (berurutan) dalam memori komputer.

### 5.1 _penjelasan program tipe data array_
Program yang saya buat dalam tipe data array kali ini adalah program Java yang menggunakan tipe data array untuk menyimpan dan mencetak daftar nama. 

#### a. _penjelasan lebih detail_

public class Array {: Ini adalah deklarasi kelas Java dengan nama Array. Nama kelas harus sama dengan nama file yang menyimpan program (dalam hal ini, Array.java).

public static void main(String[] args) {: Ini adalah metode main, yang merupakan titik masuk utama program. Semua pernyataan dalam program dijalankan dari sini.

Deklarasi array:

String[] topAktor = { ... };: Program mendefinisikan array topAktor yang berisi daftar nama aktor terkenal. Setiap nama aktor disimpan dalam bentuk string dan diinisialisasi sebagai elemen-elemen array.
Penggunaan array dalam perulangan for-each:

System.out.println("Top Aktor Terbaik di Dunia:");: Program mencetak judul "Top Aktor Terbaik di Dunia" ke layar.

for (String s : topAktor) {: Ini adalah perulangan for-each yang digunakan untuk mengiterasi melalui semua elemen dalam array topAktor. Setiap elemen array akan diwakili oleh variabel s yang merupakan tipe data String.

System.out.println(s);: Dalam setiap iterasi perulangan, program mencetak nilai variabel s, yang adalah nama aktor, ke layar. Ini akan mencetak daftar aktor terkenal satu per satu.

Tutup kurung kurawal } menutup metode main.

Tutup kurung kurawal } menutup kelas Array.


## Daftra Pustaka

[1] [ahmad muhardian. 2016. https://www.petanikode.com/. Belajar Java: Memahami 2 Jenis Perulangan dalam Java. tersedia di:https://www.petanikode.com/java-perulangan/])

[2] [debbbyani nurinda. 2023. https://www.sonora.id/. Apa Itu Zodiak dan Macamnya Berdasarkan Bulan dan Tanggal Lahir. tersedia di : 
https://www.sonora.id/read/423804779/apa-itu-zodiak-dan-macamnya-berdasarkan-bulan-dan-tanggal-
lahir#:~:text=Zodiak%20berasal%20dari%20bahasa%20latin,menjadi%20dua%20belas%20tanda%20perbintangan.]

[3] [murhardian ahmad. 2016. https://www.petanikode.com/. Belajar Java: Menggunakan Array untuk Menyimpan Banyak Hal. tersedia di: https://www.petanikode.com/java-array/]
