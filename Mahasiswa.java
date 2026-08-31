// Soal 1.1 : Class Mahasiswa
public class Mahasiswa {
    // Soal 1.1 : list atribut
    String nama;
    String nim;
    String jurusan;
    private double ipk; // Soal 2.1 : ubah atribut ipk menjadi private

    // Soal 1.2 : constructor untuk menginisialisasi data Mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Soal 1.3 : method tampilkanInfo() untuk menampilkan data mahasiswa.
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n", ipk);
    }

    // Soal 2.2 : Buat getter dan setter untuk mengakses serta memperbarui nilai ipk.
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Soal 2.3 : Tambahkan method cekKelulusan() untuk menampilkan status kelulusan
    // IPK >= 3.00 ~> lulus, else ~> tidak lulus
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    // Soal 2.4 : Tambahkan method updateIpk(double ipkBaru) untuk memperbarui IPK
    public void updateIpk(double ipkBaru) {
       setIpk(ipkBaru);
    }
}