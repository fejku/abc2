package abc.inrl;

public class InstytucjaDTO {
    protected String nazwa_instytucji;
    protected String adres;
    protected String identyfikator;
    protected String jednostka;
    protected String kontakt;
    protected String pracownik;

    public InstytucjaDTO() {
    }

    public String getNazwa_instytucji() {
        return nazwa_instytucji;
    }

    public void setNazwa_instytucji(String nazwa_instytucji) {
        this.nazwa_instytucji = nazwa_instytucji;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String identyfikator) {
        this.identyfikator = identyfikator;
    }

    public String getJednostka() {
        return jednostka;
    }

    public void setJednostka(String jednostka) {
        this.jednostka = jednostka;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getPracownik() {
        return pracownik;
    }

    public void setPracownik(String pracownik) {
        this.pracownik = pracownik;
    }
}
