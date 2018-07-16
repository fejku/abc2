package abc.inrl;

public class LasyZwolnioneDTO {
    protected String sl_tytul_prawny_zwolnienia;
    protected double powierzchnia;
    protected double ulga_wartosc;

    public LasyZwolnioneDTO() {
    }

    public String getSl_tytul_prawny_zwolnienia() {
        return sl_tytul_prawny_zwolnienia;
    }

    public void setSl_tytul_prawny_zwolnienia(String sl_tytul_prawny_zwolnienia) {
        this.sl_tytul_prawny_zwolnienia = sl_tytul_prawny_zwolnienia;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public double getUlga_wartosc() {
        return ulga_wartosc;
    }

    public void setUlga_wartosc(double ulga_wartosc) {
        this.ulga_wartosc = ulga_wartosc;
    }
}
