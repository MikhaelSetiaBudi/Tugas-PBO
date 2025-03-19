# NightFall Clinic 
NightFall Clinic adalah sistem manajemen klinik sederhana yang ditulis dalam Java. 
Sistem ini dirancang untuk mengelola dokter, pasien, janji temu, dan pencatatan diagnosis menggunakan pendekatan pemrograman berorientasi objek (OOP).

# Struktur Proyek
```
clinic-oop-Mikhael/
├── src/
│   ├── Guided/
│   │   ├── driver/
│   │   │   ├── TestPackage.java
│   │   ├── hargabuku/
│   │   │   ├── KelasHarga.java
│   │   ├── hargatoken/
│   │   │   ├── KelasToken.java
│   │   ├── Animal.java
│   │   ├── Cat.java
│   │   ├── DriverLB.java
│   │   ├── LibraryBook.java
│   ├── Unguided/
│   │   ├── entities/
│   │   │   ├── Appointment.java
│   │   │   ├── DataChecker.java
│   │   │   ├── DiagnosisCounter.java
│   │   │   ├── Doctor.java
│   │   │   ├── Patient.java
│   │   ├── main/
│   │   │   ├── Main.java
├── README.md
```

# Deskripsi Class
## 1. Appointment
Merupakan class yang mewakili janji temu antara seorang dokter dan pasien pada tanggal tertentu.

### Atribut
a. doctor : Dokter yang menangani janji temu.

b. patient : Pasien yang menghadiri janji temu.

c. date : Tanggal janji temu.

### Metode 
a. getDoctor() : Mengembalikan dokter yang ditugaskan.

b. getPatient() : Mengembalikan pasien yang ditugaskan.

c. getDate() : Mengembalikan tanggal janji temu.

## 2. DataChecker
Kelas yang digunakan untuk memvalidasi data pasien.
### Metode
ValidatePatientAge(int age) : memastikan bahwa usia pasien di antara 0 dan 120

## 3. DiagnosisCounter
Melacak jumlah diagnosis yang telah dicatat.
### Atribut
diagnosisCount : Peta statis yang menyimpan jumlah diagnosis tertentu.
### Metode
a. incrementDiagnosis(String diagnosis) : Menambahkan jumlah diagnosis tertentu.

b. getDiagnosisCount(String diagnosis) : Mengembalikan jumlah suatu diagnosis.

## 4. Doctor 
Merupakan class yang mewakili seorang dokter yang bekerja di klinik.
### Atribut
a. name : Nama dokter.

b. specialization : Spesialisasi dokter.

c. appointments : Daftar janji temu yang dimiliki dokter.
### Metode
a. getName() : Mengembalikan nama dokter.

b. getSpecialization() : Mengembalikan spesialisasi dokter.

c. addAppointment(Appointment appointment) : Menambahkan janji temu ke daftar dokter.

d. getAppointments() : Mengembalikan daftar janji temu dokter

## 5. Patient
Class yang mewakili seorang pasien di klinik.
### Atribut
a. name : Nama Pasien

b. age : Usia pasien

c. diagnosis : Kondisi medis pasien (disimpan dalam format terenkripsi)

### Metode 
a. getName() : Mengembalikan nama pasien.

b. getAge() : Mengembalikan usia pasien.

c. getDiagnosis() : Mengembalikan diagnosis yang telah didekripsi.

d. encryptDiagnosis(String diagnosis) : Mengenkripsi diagnosis(membalikan string).

e. decryptDiagnosis(String diagnosis) : Mendekripsi diagnosis (membalikan string kembali).

## 6. Main
Class utama yang digunakan untuk menjalankan program
### Fungsi 
a.Membuat objek dokter dan pasien.

b. Memvalidasi usia pasien.

c. Membuat janji temu dan menetapkannya ke dokter.

d. Menampilkan detail dokter, pasien, dan statistik diagnosis.

## Hubungan Antar Class
1. Doctor dengan Appointment: Setiap dokter dapat memiliki banyak janji temu.

2. Patient dengan Appointment: Setiap janji temu terhubung dengan satu pasien.

3. Appointment berisi Doctor dan Patient: Janji temu menghubungkan pasien dengan dokter.

4. DataChecker (Kelas utilitas): Digunakan untuk memvalidasi data pasien (misalnya, validasi usia).

5. DiagnosisCounter (Kelas statis): Melacak jumlah diagnosis yang tercatat.

6. Main menginisialisasi semua objek dan mengelola interaksi.

7. Kelas dalam Guided memiliki hubungan tersendiri yang mendukung fitur tambahan seperti harga buku, harga token, dan perpustakaan.

## Output
```
run:
Data Rumah Sakit:
Doctor: Dr. John Doe | Specialization: Cardiology
Patient: Bruno Smith | Age: 30 | Diagnosis: Heart Arrhythmia
Appointment Date: 2025-03-18
Diagnosis Count for 'Heart Arrhythmia': 1


Doctor: Dr. Mike Reu | Specialization: Endocrine
Patient: Kevin Brown | Age: 40 | Diagnosis: Diabetes
Appointment Date: 2025-05-1
Diagnosis Count for 'Diabetes': 1
BUILD SUCCESSFUL (total time: 1 second)
```
### 1. "Data Rumah Sakit:"
Menandakan awal dari informasi yang akan ditampilkan terkait dokter, pasien, dan janji temu.

### 2. Informasi Dokter dan Pasien Pertama
Doctor: Dr. John Doe (Spesialisasi: Kardiologi)
Patient: Bruno Smith (Usia: 30 tahun)
Diagnosis: Heart Arrhythmia
Appointment Date: 18 Maret 2025
Diagnosis Count: 1 (Menunjukkan bahwa diagnosis "Heart Arrhythmia" telah dicatat satu kali dalam sistem)

### 3. Informasi Dokter dan Pasien Kedua
Doctor: Dr. Mike Reu (Spesialisasi: Endokrinologi)
Patient: Kevin Brown (Usia: 40 tahun)
Diagnosis: Diabetes
Appointment Date: 1 Mei 2025
Diagnosis Count: 1 (Menunjukkan bahwa diagnosis "Diabetes" telah dicatat satu kali dalam sistem)

### 4. BUILD SUCCESSFUL (total time: 1 second)
Menunjukkan bahwa program berhasil dikompilasi dan dijalankan tanpa error dalam waktu 1 detik.

# Kesimpulan 
Sistem The NightFall Clinic telah berhasil dikembangkan sebagai sistem manajemen klinik berbasis Java dengan pendekatan Object-Oriented Programming (OOP).
Sistem ini mampu mengelola dokter, pasien, janji temu, serta pencatatan jumlah diagnosis dengan baik. 
Dari hasil eksekusi program, terlihat bahwa setiap komponen berfungsi sesuai perannya. 
Kelas Doctor mampu menyimpan daftar janji temu, sementara Patient mencatat informasi pasien dengan diagnosis yang telah dienkripsi. Validasi usia pasien berjalan dengan baik melalui kelas DataChecker, dan DiagnosisCounter berhasil mencatat jumlah diagnosis yang telah terdaftar.
