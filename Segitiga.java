package Tugas;
public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisiMiring; // Atribut tambahan untuk keliling.

    public void setAlas(float alas) { this.alas = alas; }
    public void setTinggi(float tinggi) { this.tinggi = tinggi; }
    public void setSisiMiring(float sisiMiring) { this.sisiMiring = sisiMiring; }
    public float getAlas() { return alas; }
    public float getTinggi() { return tinggi; }
    public float getSisiMiring() { return sisiMiring; }

    @Override
    protected float luas() { return 0.5f * alas * tinggi; }

    @Override
    protected float keliling() { return alas + tinggi + sisiMiring; }
}
