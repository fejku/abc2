package abc.inrl;

//INFORMACJA W SPRAWIE PODATKU OD NIERUCHOMOŚCI, ROLNEGO I LEŚNEGO - INRL

public class InrlDTO {

    protected AdresatDTO adresat;
    protected NadawcaDTO nadawca;
    protected TrescDokumentuElektornicznegoDTO tresc_dokumentu_elektronicznego;
    protected String nazwa_dokumentu;
    protected String data_otrzymania_dokumentu;
    protected String data_utworzenia_dokumentu;
    protected String data_wyslania_dokumentu;

    public InrlDTO() {
    }

    public AdresatDTO getAdresat() {
        return adresat;
    }

    public void setAdresat(AdresatDTO adresat) {
        this.adresat = adresat;
    }

    public NadawcaDTO getNadawca() {
        return nadawca;
    }

    public void setNadawca(NadawcaDTO nadawca) {
        this.nadawca = nadawca;
    }

    public TrescDokumentuElektornicznegoDTO getTresc_dokumentu_elektronicznego() {
        return tresc_dokumentu_elektronicznego;
    }

    public void setTresc_dokumentu_elektronicznego(TrescDokumentuElektornicznegoDTO tresc_dokumentu_elektronicznego) {
        this.tresc_dokumentu_elektronicznego = tresc_dokumentu_elektronicznego;
    }
}
