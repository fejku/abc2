package abc.inrl;

import java.util.List;

public class TrescDokumentuElektornicznegoDTO {
    protected Long informacja_wystawiona_za_rok;
    protected String okolicznosci_zlozenia_informacji;
    protected String oswiadczenie_podatnika_imie;
    protected String oswiadczenie_podatnika_nazwisko;
    protected String data_wyplenienia;
    protected List<NieruchomoscDTO> dotyczy_nieruchomosci;
    protected String il;
    protected String in;
    protected String korekta_za;
    protected String podmiot_zobowiazany;
    protected String razem_podatek;
    protected String zalaczniki;

    public TrescDokumentuElektornicznegoDTO() {
    }

    public Long getInformacja_wystawiona_za_rok() {
        return informacja_wystawiona_za_rok;
    }

    public void setInformacja_wystawiona_za_rok(Long informacja_wystawiona_za_rok) {
        this.informacja_wystawiona_za_rok = informacja_wystawiona_za_rok;
    }

    public String getOkolicznosci_zlozenia_informacji() {
        return okolicznosci_zlozenia_informacji;
    }

    public void setOkolicznosci_zlozenia_informacji(String okolicznosci_zlozenia_informacji) {
        this.okolicznosci_zlozenia_informacji = okolicznosci_zlozenia_informacji;
    }

    public String getOswiadczenie_podatnika_imie() {
        return oswiadczenie_podatnika_imie;
    }

    public void setOswiadczenie_podatnika_imie(String oswiadczenie_podatnika_imie) {
        this.oswiadczenie_podatnika_imie = oswiadczenie_podatnika_imie;
    }

    public String getOswiadczenie_podatnika_nazwisko() {
        return oswiadczenie_podatnika_nazwisko;
    }

    public void setOswiadczenie_podatnika_nazwisko(String oswiadczenie_podatnika_nazwisko) {
        this.oswiadczenie_podatnika_nazwisko = oswiadczenie_podatnika_nazwisko;
    }

    public String getData_wyplenienia() {
        return data_wyplenienia;
    }

    public void setData_wyplenienia(String data_wyplenienia) {
        this.data_wyplenienia = data_wyplenienia;
    }

    public List<NieruchomoscDTO> getDotyczy_nieruchomosci() {
        return dotyczy_nieruchomosci;
    }

    public void setDotyczy_nieruchomosci(List<NieruchomoscDTO> dotyczy_nieruchomosci) {
        this.dotyczy_nieruchomosci = dotyczy_nieruchomosci;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getKorekta_za() {
        return korekta_za;
    }

    public void setKorekta_za(String korekta_za) {
        this.korekta_za = korekta_za;
    }

    public String getPodmiot_zobowiazany() {
        return podmiot_zobowiazany;
    }

    public void setPodmiot_zobowiazany(String podmiot_zobowiazany) {
        this.podmiot_zobowiazany = podmiot_zobowiazany;
    }

    public String getRazem_podatek() {
        return razem_podatek;
    }

    public void setRazem_podatek(String razem_podatek) {
        this.razem_podatek = razem_podatek;
    }

    public String getZalaczniki() {
        return zalaczniki;
    }

    public void setZalaczniki(String zalaczniki) {
        this.zalaczniki = zalaczniki;
    }
}
