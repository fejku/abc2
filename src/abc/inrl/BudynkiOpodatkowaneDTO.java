package abc.inrl;

public class BudynkiOpodatkowaneDTO {
    protected String sl_przenaczenie;
    protected double wartosc;
    protected double powierzchnia_ogolem;
    protected double powierzchnia_powyzej_220;

    public BudynkiOpodatkowaneDTO() {
    }

    public String getSl_przenaczenie() {
        return sl_przenaczenie;
    }

    public void setSl_przenaczenie(String sl_przenaczenie) {
        this.sl_przenaczenie = sl_przenaczenie;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public double getPowierzchnia_ogolem() {
        return powierzchnia_ogolem;
    }

    public void setPowierzchnia_ogolem(double powierzchnia_ogolem) {
        this.powierzchnia_ogolem = powierzchnia_ogolem;
    }

    public double getPowierzchnia_powyzej_220() {
        return powierzchnia_powyzej_220;
    }

    public void setPowierzchnia_powyzej_220(double powierzchnia_powyzej_220) {
        this.powierzchnia_powyzej_220 = powierzchnia_powyzej_220;
    }
}
