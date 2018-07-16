package abc.inrl;

public class NieruchomosciZwolnioneDTO {
    //Należy określić typy
    protected String sl_tytul_prawny_zwolnienia;
    protected double wartosc_budowli;
    protected double powierzchnia_budynku;
    protected double powierzchnia_gruntu;

    public NieruchomosciZwolnioneDTO() {
    }

    public String getSl_tytul_prawny_zwolnienia() {
        return sl_tytul_prawny_zwolnienia;
    }

    public void setSl_tytul_prawny_zwolnienia(String sl_tytul_prawny_zwolnienia) {
        this.sl_tytul_prawny_zwolnienia = sl_tytul_prawny_zwolnienia;
    }

    public double getWartosc_budowli() {
        return wartosc_budowli;
    }

    public void setWartosc_budowli(double wartosc_budowli) {
        this.wartosc_budowli = wartosc_budowli;
    }

    public double getPowierzchnia_budynku() {
        return powierzchnia_budynku;
    }

    public void setPowierzchnia_budynku(double powierzchnia_budynku) {
        this.powierzchnia_budynku = powierzchnia_budynku;
    }

    public double getPowierzchnia_gruntu() {
        return powierzchnia_gruntu;
    }

    public void setPowierzchnia_gruntu(double powierzchnia_gruntu) {
        this.powierzchnia_gruntu = powierzchnia_gruntu;
    }
}
