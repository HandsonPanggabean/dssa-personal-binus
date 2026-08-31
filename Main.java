import java.util.Scanner;

public class Main {
	// Soal 2 : Helper function menu untuk update ipk salah satu mahasiswa
	public static void updateIpkMahasiswa(Mahasiswa[] daftar, Scanner scanner) {
		// Soal 2.5 : tampilkan input NIM kepada user untuk di isi
		System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
		String nimInput = scanner.nextLine();

		// Soal 2.5 : tampilkan input IPK kepada user untuk di isi
		System.out.print("Masukkan IPK baru: ");
		double ipkBaru = Double.parseDouble(scanner.nextLine());

		// Soal 2.5 : Mencari mahasiswa dengan NIM yang sesuai lalu memperbarui IPK-nya
		Mahasiswa mahasiswaDiupdate = null;
		for (Mahasiswa mhs : daftar) {
			// cek apakah nim yang di input user exist di daftar mahasiswa
			if (mhs.getNim().equals(nimInput)) {
				mhs.updateIpk(ipkBaru); // update current ipk mahasiswa menjadi ipk yang di input oleh user
				mahasiswaDiupdate = mhs; // isi variable mahasiswaDiupdate
				break; // hentikan proses loop
			}
		}

		// Soal 2.5 : jika mahasiswa dengan nim ditemukan dan berhasil di update 
		if (mahasiswaDiupdate != null) {
			// Soal 2.5 : Tampilkan informasi mahasiswa beserta status kelulusan
			System.out.println("Data berhasil diperbarui!\n");
			System.out.println("=== Data Mahasiswa ===");
			mahasiswaDiupdate.tampilkanInfo();
			mahasiswaDiupdate.cekKelulusan();
		} else {
			// Soal 2.5 : Jika tidak tampilkan pesan mahasiswa tidak ditemukan
			System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
		}
		System.out.println();
	}

	// Soal 3 : Helper function menu untuk menampilkan predikat setiap mahasiswa
	public static void tampilkanPredikat(Mahasiswa[] daftar) {
		System.out.println("=== Data Mahasiswa dengan Predikat Akademik ===");
		for (Mahasiswa mhs : daftar) {
			mhs.tampilkanInfo();
			mhs.cekKelulusan();
			System.out.println("Predikat: " + mhs.hitungPredikat());
			System.out.println();
		}
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Soal 1.4 : Membuat 5 objek Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        // Soal 1.4 : Tampilkan seluruh data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa mhs : daftar) {
            mhs.tampilkanInfo();
            System.out.println();
        }

        // Menu pilihan supaya user bisa memilih menu yang ingin di akses
        int pilihan;
        do {
            // Tampilkan menu ke terminal / konsol
            System.out.println("=== MENU ===");
            System.out.println("1. Update IPK Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa dengan Predikat Akademik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (pilihan) {
                case 1:
                    updateIpkMahasiswa(daftar, scanner); // menu 1 untuk jawaban dari soal nomor 2
                    break;
                case 2:
                    tampilkanPredikat(daftar); // menu 2 untuk jawaban dari soal nomor 3
                    break;
                case 0:
                    System.out.println("Program selesai."); // menu 0 untuk menghentikan / keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.\n"); // validasi jika user tidak menginput dengan benar
            }

        } while (pilihan != 0);

		scanner.close();
    }
}