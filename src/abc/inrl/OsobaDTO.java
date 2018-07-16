package abc.inrl;

public class OsobaDTO {
    protected ImieNazwiskoDTO imie_nazwisko;
    protected AdresDTO adres;
    protected KontaktDTO kontakt;
    protected IdentyfikatorOsobyDTO identyfikator_osoby;

    public OsobaDTO() {
    }

    public ImieNazwiskoDTO getImie_nazwisko() {
        return imie_nazwisko;
    }

    public void setImie_nazwisko(ImieNazwiskoDTO imie_nazwisko) {
        this.imie_nazwisko = imie_nazwisko;
    }

    public AdresDTO getAdres() {
        return adres;
    }

    public void setAdres(AdresDTO adres) {
        this.adres = adres;
    }

    public IdentyfikatorOsobyDTO getIdentyfikator_osoby() {
        return identyfikator_osoby;
    }

    public void setIdentyfikator_osoby(IdentyfikatorOsobyDTO identyfikator_osoby) {
        this.identyfikator_osoby = identyfikator_osoby;
    }

    public KontaktDTO getKontakt() {
        return kontakt;
    }

    public void setKontakt(KontaktDTO kontakt) {
        this.kontakt = kontakt;
    }
}
