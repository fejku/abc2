package abc.inrl;

import java.util.List;

public class NieruchomoscDTO {
    protected String adres_gospodarstwa;
    protected List<DzialkaInrlDTO> dzialki;
    protected List<NieruchomosciZwolnioneDTO> nieruchomosci_zwolnione;
    protected List<BudynkiOpodatkowaneDTO> budynki_opodatkowane;
    protected List<NieruchomosciOpodatkowaneDTO> nieruchomosci_opodatkowa;
    protected List<LasyZwolnioneDTO> lasy_zwolnione;
    protected List<LasyOpodatkowaneDTO> lasy_opodatkowane;
    protected List<GruntyZUlgamiDTO> grunty_z_ulgami;
    protected List<GruntyOpodatkowaneDTO> grunty_opodatkowane;

    public NieruchomoscDTO() {
    }

    public String getAdres_gospodarstwa() {
        return adres_gospodarstwa;
    }

    public void setAdres_gospodarstwa(String adres_gospodarstwa) {
        this.adres_gospodarstwa = adres_gospodarstwa;
    }

    public List<DzialkaInrlDTO> getDzialki() {
        return dzialki;
    }

    public void setDzialki(List<DzialkaInrlDTO> dzialki) {
        this.dzialki = dzialki;
    }

    public List<NieruchomosciZwolnioneDTO> getNieruchomosci_zwolnione() {
        return nieruchomosci_zwolnione;
    }

    public void setNieruchomosci_zwolnione(List<NieruchomosciZwolnioneDTO> nieruchomosci_zwolnione) {
        this.nieruchomosci_zwolnione = nieruchomosci_zwolnione;
    }

    public List<BudynkiOpodatkowaneDTO> getBudynki_opodatkowane() {
        return budynki_opodatkowane;
    }

    public void setBudynki_opodatkowane(List<BudynkiOpodatkowaneDTO> budynki_opodatkowane) {
        this.budynki_opodatkowane = budynki_opodatkowane;
    }

    public List<NieruchomosciOpodatkowaneDTO> getNieruchomosci_opodatkowa() {
        return nieruchomosci_opodatkowa;
    }

    public void setNieruchomosci_opodatkowa(List<NieruchomosciOpodatkowaneDTO> nieruchomosci_opodatkowa) {
        this.nieruchomosci_opodatkowa = nieruchomosci_opodatkowa;
    }

    public List<LasyZwolnioneDTO> getLasy_zwolnione() {
        return lasy_zwolnione;
    }

    public void setLasy_zwolnione(List<LasyZwolnioneDTO> lasy_zwolnione) {
        this.lasy_zwolnione = lasy_zwolnione;
    }

    public List<LasyOpodatkowaneDTO> getLasy_opodatkowane() {
        return lasy_opodatkowane;
    }

    public void setLasy_opodatkowane(List<LasyOpodatkowaneDTO> lasy_opodatkowane) {
        this.lasy_opodatkowane = lasy_opodatkowane;
    }

    public List<GruntyZUlgamiDTO> getGrunty_z_ulgami() {
        return grunty_z_ulgami;
    }

    public void setGrunty_z_ulgami(List<GruntyZUlgamiDTO> grunty_z_ulgami) {
        this.grunty_z_ulgami = grunty_z_ulgami;
    }

    public List<GruntyOpodatkowaneDTO> getGrunty_opodatkowane() {
        return grunty_opodatkowane;
    }

    public void setGrunty_opodatkowane(List<GruntyOpodatkowaneDTO> grunty_opodatkowane) {
        this.grunty_opodatkowane = grunty_opodatkowane;
    }
}
