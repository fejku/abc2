package abc.inrl;

public class GruntyOpodatkowaneDTO {
    protected String sl_typ_powierzchni;
    protected String sl_rodzaj_zarybienia;
    protected String sl_uzytek_gruntowy;
    protected String sl_klasa;
    protected double powierzchnia;

    public GruntyOpodatkowaneDTO() {
    }

    public String getSl_typ_powierzchni() {
        return sl_typ_powierzchni;
    }

    public void setSl_typ_powierzchni(String sl_typ_powierzchni) {
        this.sl_typ_powierzchni = sl_typ_powierzchni;
    }

    public String getSl_rodzaj_zarybienia() {
        return sl_rodzaj_zarybienia;
    }

    public void setSl_rodzaj_zarybienia(String sl_rodzaj_zarybienia) {
        this.sl_rodzaj_zarybienia = sl_rodzaj_zarybienia;
    }

    public String getSl_uzytek_gruntowy() {
        return sl_uzytek_gruntowy;
    }

    public void setSl_uzytek_gruntowy(String sl_uzytek_gruntowy) {
        this.sl_uzytek_gruntowy = sl_uzytek_gruntowy;
    }

    public String getSl_klasa() {
        return sl_klasa;
    }

    public void setSl_klasa(String sl_klasa) {
        this.sl_klasa = sl_klasa;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }
}
