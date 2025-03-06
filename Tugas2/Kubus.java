package Tugas2;

public class Kubus {
    private int sisi;

    // Konstruktor
    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    // Metode untuk menghitung luas
    public int hitungLuas() {
        return 6 * sisi * sisi;
    }

    // Metode untuk menghitung keliling
    public int hitungKeliling() {
        return 12 * sisi;
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Kubus kubus = new Kubus(6); // Contoh dengan sisi 6
        System.out.println("Sisi(s) = " + kubus.sisi);
        System.out.println("Keliling = 12 * " + kubus.sisi + " = " + kubus.hitungKeliling());
        System.out.println("Luas = 6 * " + kubus.sisi + " * " + kubus.sisi + " = " + kubus.hitungLuas());
    }
}