public class Persegi {
    public static int panjang;
    public static int lebar;

    public double luas(int panjang, int lebar) {
        Persegi.panjang = panjang;
        Persegi.lebar = lebar;
        return panjang * lebar;
    }

    public double Keliling(int panjang, int lebar) {
        Persegi.panjang = panjang;
        Persegi.lebar = lebar;
        return 2 * panjang + lebar;
    }
}
