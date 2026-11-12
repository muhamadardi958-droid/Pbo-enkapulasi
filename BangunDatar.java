package Tugas;
public abstract class BangunDatar {
    // Protected digunakan agar method dapat dioverride oleh class anak.
    protected abstract float luas();
    protected abstract float keliling();

    public float getLuas() { return luas(); }
    public float getKeliling() { return keliling(); }
}
