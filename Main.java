package Tugas;
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(5);

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(8);
        pp.setLebar(4);

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(4);
        segitiga.setSisiMiring(5);

        System.out.println("===== HASIL PERHITUNGAN BANGUN DATAR =====");

        System.out.println("\nPERSEGI");
        System.out.println("Sisi: " + persegi.getSisi());
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());

        System.out.println("\nLINGKARAN");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.printf("Luas: %.2f%n", lingkaran.getLuas());
        System.out.printf("Keliling: %.2f%n", lingkaran.getKeliling());

        System.out.println("\nPERSEGI PANJANG");
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());

        System.out.println("\nSEGITIGA");
        System.out.println("Alas: " + segitiga.getAlas());
        System.out.println("Tinggi: " + segitiga.getTinggi());
        System.out.println("Sisi miring: " + segitiga.getSisiMiring());
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
    }
}
