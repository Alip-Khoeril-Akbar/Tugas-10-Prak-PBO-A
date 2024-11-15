1. Menambahkan fitur Ubah PIN
   - Membuat metode changePin() dalam kelas Account untuk mengubah PIN dengan mealkukan verifikasi/memasukan PIN lama, meminta nasabah untuk memasukan PIN baru dua kali, validasi bahwa dua PIN yang dimasukan nasabah cocok, lalu perbarui PIN juka validasi berhasil.
   - Menambahkan opsi "Ubah PIN" pada menu utama. Dimana jika opsi ini di pilih akan memanggil metode changePIN().
   
   Source Code metode changePin()
   ![Screenshot 2024-11-15 132833](https://github.com/user-attachments/assets/85b117f4-8bfc-4bd6-bc3a-48a6b84f7420)

   Tampilan Saat memilih opsi "Ubah PIN"
   ![Screenshot 2024-11-14 153849](https://github.com/user-attachments/assets/123fb8af-0ab3-4312-b311-65010ee046de)

2. Validasi Saldo Minial pada saat Penarikan
   - Merubah/memodifikasi fitur penarikan. Dimana nasabah harus menyisakan saldo minimal Rp50.000 saat melakukan penarikan.
   - Membuat konstanta MINIMUM_BALANCE dengan nilai 50000 dalam kelas Account untuk menentukan minimum sisa saldo yang harus di sisakan.
   - Memodifikasi metode execute() dalam kelas Withdrawal. Dimana metode ini berfungsi untuk memeriksa apa saldo setelah penarikan tidak kurang dari saldo minimal yaitu 50000.
   - lalu buat pesan kesalahan jika saldo tidak mencukupi.

   Source Code metode execute() yang telah dimodifikasi
   ![Screenshot 2024-11-15 133446](https://github.com/user-attachments/assets/cf5b0c42-612c-4cc5-b8da-1bb91e7b66b0)

    Tampilan dari modifikasi fitur penarikan.
   ![Screenshot 2024-11-14 154215](https://github.com/user-attachments/assets/d7a1b137-a54f-493b-93aa-1ee20bf7d73e)

Jadi hasil akhir dari sistem ATM terdapat beberapa opsi, diantaranya:
1. Penarikan
2. Deposit
3. Transfer
4. Cek Saldo
5. Ubah PIN
6. Keluar

Tampilan dari semua tarnsaksi dari semua opsi
![Screenshot 2024-11-14 161304](https://github.com/user-attachments/assets/d38780c9-6543-40b5-aff9-75195cdec593)
![Screenshot 2024-11-14 161424](https://github.com/user-attachments/assets/cbd89f5d-f65d-4f45-bdd0-01f24470d214)
![Screenshot 2024-11-14 161445](https://github.com/user-attachments/assets/02ab8e98-f52a-4a81-a5e9-3d1a98381932)
