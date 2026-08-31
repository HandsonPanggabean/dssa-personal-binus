// Soal 1.1 : Class Mahasiswa
public class Mahasiswa {
    // Soal 1.1 : list atribut
    String nama;
    String nim;
    String jurusan;
    double ipk;

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
}