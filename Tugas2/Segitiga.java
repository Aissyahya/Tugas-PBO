package Tugas2;

public class Segitiga {
    private int alas;
    private int tinggi;
    private int sisiA;
    private int sisiB;
    private int sisiC;

    // Konstruktor
    public Segitiga(int alas, int tinggi, int sisiA, int sisiB, int sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    // Metode untuk menghitung luas
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Metode untuk menghitung keliling
    public int hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(12, 9, 12, 9, 15); // Contoh dengan alas 12, tinggi 9. sisi 12, 9, 15
        System.out.println("Alas = " + segitiga.alas);
        System.out.println("Tinggi = " + segitiga.tinggi);
        System.out.println("Luas = 1/2 * " + segitiga.alas + " * " + segitiga.tinggi + " = " + segitiga.hitungLuas());
        System.out.println("Keliling = " + segitiga.sisiA + " + " + segitiga.sisiB + " + " + segitiga.sisiC + " = " + segitiga.hitungKeliling());
    }
}
