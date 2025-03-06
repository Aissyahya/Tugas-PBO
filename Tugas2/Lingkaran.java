package Tugas2;

public class Lingkaran {
    private int r;
    private final double phi = 3.14;

    // Konstruktor
    public Lingkaran(int r) {
        this.r = r;
    }

    // Metode untuk menghitung luas
    public double hitungLuas() {
        return phi * r * r;
    }

    // Metode untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * phi * r;
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(21); // Contoh dengan jari-jari 21
        System.out.println("r (jari-jari) = " + lingkaran.r);
        System.out.println("Keliling = 2 * phi * " + lingkaran.r + " = " + lingkaran.hitungKeliling());
        System.out.println("Luas = phi * " + lingkaran.r + " * " + lingkaran.r + " = " + lingkaran.hitungLuas());
    }
}