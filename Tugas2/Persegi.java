package Tugas2;

public class Persegi {
    private int sisi;

    // Konstruktor
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    // Metode untuk menghitung luas
    public int hitungLuas() {
        return sisi * sisi;
    }

    // Metode untuk menghitung keliling
    public int hitungKeliling() {
        return 4 * sisi;
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5); // Contoh dengan sisi 5
        System.out.println("Sisi = " + persegi.sisi);
        System.out.println("Luas = " + persegi.sisi + " * " + persegi.sisi + " = " + persegi.hitungLuas());
        System.out.println("Keliling Persegi = 4 * " + persegi.sisi + " = " + persegi.hitungKeliling());
    }
}
