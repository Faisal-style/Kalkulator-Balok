public class Balok extends Persegi {

    public double volume(int tinggi) {
        return luas(panjang, lebar) * tinggi;
    }

    public double luasPermukaan(int tinggi) {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
