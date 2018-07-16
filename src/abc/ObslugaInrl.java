package abc;

import abc.inrl.*;

//import javax.annotation.security.PermitAll;
//import javax.ejb.LocalBean;
//import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

//@Stateless
//@LocalBean
//@PermitAll
public class ObslugaInrl {

    public InrlDTO zwrocTestowyPodatek() {
        InrlDTO inrlDTO = new InrlDTO();
        inrlDTO.setAdresat(stworzAdresata());
        inrlDTO.setNadawca(stworzNadawace());
        inrlDTO.setTresc_dokumentu_elektronicznego(stworzInformacje());
        return inrlDTO;
    }

    private AdresatDTO stworzAdresata() {
        AdresatDTO adresatDTO = new AdresatDTO();
        adresatDTO.setInstytucja(stworzInstytucje());
        return adresatDTO;
    }

    private InstytucjaDTO stworzInstytucje() {
        InstytucjaDTO instytucjaDTO = new InstytucjaDTO();
        instytucjaDTO.setAdres("PARKOWA 1\\n66-600 KROSNO ODRZAŃSKIE");
        instytucjaDTO.setNazwa_instytucji("Burmistrz Krosna Odrzańskiego");
        return instytucjaDTO;
    }

    private TrescDokumentuElektornicznegoDTO stworzInformacje() {
        TrescDokumentuElektornicznegoDTO informacjeDTO = new TrescDokumentuElektornicznegoDTO();
        informacjeDTO.setInformacja_wystawiona_za_rok(2018L);
        informacjeDTO.setData_wyplenienia("2018-07-09");
        informacjeDTO.setDotyczy_nieruchomosci(stworzListeNieruchomosci());
        informacjeDTO.setOkolicznosci_zlozenia_informacji("korekta uprzednio złożonej informacji");
        informacjeDTO.setOswiadczenie_podatnika_imie("JULIANNA");
        informacjeDTO.setOswiadczenie_podatnika_nazwisko("WAGAN");
        return informacjeDTO;
    }

    private NadawcaDTO stworzNadawace() {
        NadawcaDTO nadawcaDTO = new NadawcaDTO();
        nadawcaDTO.setOsoba(stworzOsobe());
        nadawcaDTO.setTyp_podmiotu("F");
        return nadawcaDTO;
    }

    private OsobaDTO stworzOsobe() {
        OsobaDTO osobaDTO = new OsobaDTO();
        osobaDTO.setAdres(stworzAdres());
        osobaDTO.setIdentyfikator_osoby(stworzId());
        osobaDTO.setImie_nazwisko(stworzImieNazwisko());
        return osobaDTO;
    }

    private IdentyfikatorOsobyDTO stworzId() {
        IdentyfikatorOsobyDTO idDTO = new IdentyfikatorOsobyDTO();
        idDTO.setNip("8378822643");
        idDTO.setPesel("97110448514");
        idDTO.setInne_identyfikatory("");
        return idDTO;
    }

    private ImieNazwiskoDTO stworzImieNazwisko() {
        ImieNazwiskoDTO imieNazwiskoDTO = new ImieNazwiskoDTO();
        imieNazwiskoDTO.setImie("JULIANNA");
        imieNazwiskoDTO.setImie_drugie("");
        imieNazwiskoDTO.setNazwisko("WAGAN");
        return imieNazwiskoDTO;
    }

    private AdresDTO stworzAdres() {
        AdresDTO adresDTO = new AdresDTO();
        adresDTO.setKraj("POLSKA");
        adresDTO.setWojewodztwo("");
        adresDTO.setPowiat("");
        adresDTO.setGmina("");
        adresDTO.setUlica("");
        adresDTO.setBudynek("23");
        adresDTO.setLokal("");
        adresDTO.setMiejscowosc("BIELÓW");
        adresDTO.setKod_pocztowy("66-660");
        adresDTO.setPoczta("KROSNO ODRZANSKIE");
        adresDTO.setSimc("");
        adresDTO.setSkrytka_pocztowa("");
        adresDTO.setTerc("");
        adresDTO.setUlic("");
        adresDTO.setUwagi("");
        return adresDTO;
    }

    private List<NieruchomoscDTO> stworzListeNieruchomosci() {
        NieruchomoscDTO nieruchomoscDTO = new NieruchomoscDTO();
        nieruchomoscDTO.setAdres_gospodarstwa("BIELÓW");
        nieruchomoscDTO.setDzialki(stworzListeDzialek());
        nieruchomoscDTO.setNieruchomosci_zwolnione(stworzListeNieruchomosciZwolnionych());
        nieruchomoscDTO.setNieruchomosci_opodatkowa(stworzListeNieruchomosciOpodatkowanyhc());
        List<NieruchomoscDTO> listaNieruchomosci = new ArrayList<>();
        listaNieruchomosci.add(nieruchomoscDTO);
        return listaNieruchomosci;
    }

    private List<DzialkaInrlDTO> stworzListeDzialek() {
        DzialkaInrlDTO dzialka = new DzialkaInrlDTO();
        dzialka.setNumery_dzialek("89");
        dzialka.setIdentyfikatory_geodezyjne_budynkow("89");
        dzialka.setNumery_kw("");
        List<DzialkaInrlDTO> listaDzialek = new ArrayList<>();
        listaDzialek.add(dzialka);
        return listaDzialek;
    }

    private List<NieruchomosciZwolnioneDTO> stworzListeNieruchomosciZwolnionych() {
        NieruchomosciZwolnioneDTO nieruchomosciZwolnioneDTO = new NieruchomosciZwolnioneDTO();
        nieruchomosciZwolnioneDTO.setSl_tytul_prawny_zwolnienia("Zwolnienie z tytułu wpisania do rejestrów zabytków");
        nieruchomosciZwolnioneDTO.setPowierzchnia_gruntu(19087.0000);
        List<NieruchomosciZwolnioneDTO> listaNieruchomosci = new ArrayList<>();
        listaNieruchomosci.add(nieruchomosciZwolnioneDTO);
        return listaNieruchomosci;
    }

    private List<NieruchomosciOpodatkowaneDTO> stworzListeNieruchomosciOpodatkowanyhc() {
        NieruchomosciOpodatkowaneDTO nieruchomosciOpodatkowaneDTO = new NieruchomosciOpodatkowaneDTO();
        nieruchomosciOpodatkowaneDTO.setPowierzchnia(642.0000);
        nieruchomosciOpodatkowaneDTO.setSl_przeznaczenie("Grunty pozostałe");
        List<NieruchomosciOpodatkowaneDTO> listaNieruchomosci = new ArrayList<>();
        listaNieruchomosci.add(nieruchomosciOpodatkowaneDTO);
        return listaNieruchomosci;
    }
}
