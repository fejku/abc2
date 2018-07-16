package abc;

import java.io.File;
import java.net.MalformedURLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;

import abc.inrl.InrlDTO;

public class Test {

	private static Element createElement(String name, Element el, Document doc) {
		Element element = doc.createElement(name);
		el.appendChild(element);
		return element;
	}

	private static void createElement(String name, Element el, Document doc, String value) {
		Element element = doc.createElement(name);
		el.appendChild(element);
		if (!value.equals("")) {
			element.setTextContent(value);
		}
	}
	
	private static void utworzIdentyfikator(Element el, Document doc, String typIdentyfikatora, String wartosc) {
	  Element identyfikator = createElement("meta:Identyfikator", el, doc);
    identyfikator.setAttribute("typIdentyfikatora", typIdentyfikatora);
    createElement("meta:Wartosc", identyfikator, doc, wartosc);
	}

	public static void main(String[] args)
			throws ParserConfigurationException, TransformerException, MalformedURLException {
		ObslugaInrl t = new ObslugaInrl();
		InrlDTO inrl = t.zwrocTestowyPodatek();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		dbf.setIgnoringElementContentWhitespace(true);
		dbf.setValidating(false);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		doc.setXmlStandalone(true);
		
//		ProcessingInstruction stylesheet = doc.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"http://int.epuap.gov.pl/fe-model-web/wzor_lokalny/euslugiLW/ILNR_1_UG_NML_21/styl.xsl\"");
		ProcessingInstruction stylesheet = doc.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"\"");		
		doc.appendChild(stylesheet);	
		
//		Element dokument = doc.createElementNS("http://int.epuap.gov.pl/fe-model-web/wzor_lokalny/euslugiLW/ILNR_1_UG_NML_21/", "Dokument");
		Element dokument = doc.createElementNS("", "Dokument");
		dokument.setPrefix("wnio");
		dokument.setAttribute("xmlns:adr", "http://crd.gov.pl/xml/schematy/adres/2009/11/09/");
		dokument.setAttribute("xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
		dokument.setAttribute("xmlns:ev", "http://www.w3.org/2001/xml-events");
		dokument.setAttribute("xmlns:inst", "http://crd.gov.pl/xml/schematy/instytucja/2009/11/16/");
		dokument.setAttribute("xmlns:meta", "http://crd.gov.pl/xml/schematy/meta/2009/11/16/");
		dokument.setAttribute("xmlns:oso", "http://crd.gov.pl/xml/schematy/osoba/2009/11/16/");
		dokument.setAttribute("xmlns:str", "http://crd.gov.pl/xml/schematy/struktura/2009/11/16/");
		dokument.setAttribute("xmlns:wyr", "http://crd.gov.pl/wzor/2008/05/09/1/");
		dokument.setAttribute("xmlns:xf", "http://www.w3.org/2002/xforms");
		dokument.setAttribute("xmlns:xs", "http://www.w3.org/2001/XMLSchema");
		dokument.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		dokument.setAttribute("xmlns:xxforms", "http://orbeon.org/oxf/xml/xforms");
//		dokument.setAttribute("xsi:schemaLocation", "http://int.epuap.gov.pl/fe-model-web/wzor_lokalny/euslugiLW/ILNR_1_UG_NML_21/ http://int.epuap.gov.pl/fe-model-web/wzor_lokalny/euslugiLW/ILNR_1_UG_NML_21/schemat.xsd");	
		doc.appendChild(dokument);
		
		Element opisDokumentu = createElement("wnio:OpisDokumentu", dokument, doc);
		createElement("str:CID", opisDokumentu, doc, "");
		utworzIdentyfikator(opisDokumentu, doc, "idFormularza", "");
		utworzIdentyfikator(opisDokumentu, doc, "TypDokumentuPUMA", "");
		
		Element daneDokumentu = createElement("wnio:DaneDokumentu", dokument, doc);
		if (inrl.getAdresat() != null) { 
			Element adresaci = createElement("str:Adresaci", daneDokumentu, doc);
			Element podmiot = createElement("meta:Podmiot", adresaci, doc);
			Element instytucja = createElement("inst:Instytucja", podmiot, doc);
			createElement("inst:NazwaInstytucji", instytucja, doc, inrl.getAdresat().getInstytucja().getNazwa_instytucji());
			Element adres = createElement("adr:Adres", instytucja, doc);
			createElement("adr:KodPocztowy", adres, doc, "10-900");
			createElement("adr:Miejscowosc", adres, doc, "Boguszów-Gorce");
			createElement("adr:Ulica", adres, doc, "Plac Odrodzenia");
			createElement("adr:Budynek", adres, doc, "1");
			createElement("adr:Lokal", adres, doc, "");
		}
		
    if (inrl.getNadawca() != null) { 
      Element nadawcy = createElement("str:Nadawcy", daneDokumentu, doc);
      Element podmiot = createElement("meta:Podmiot", nadawcy, doc);
      Element osoba = createElement("oso:Osoba", podmiot, doc);
      Element idOsoby = createElement("oso:IdOsoby", osoba, doc);
      createElement("oso:PESEL", idOsoby, doc, "31121648239");
      createElement("oso:NIP", idOsoby, doc, "1213091197");
      Element innyIdentyfikator = createElement("oso:InnyIdentyfikator", idOsoby, doc);
      createElement("oso:TypIdentyfikatora", innyIdentyfikator, doc, "DataUrodzenia");
      createElement("oso:WartoscIdentyfikatora", innyIdentyfikator, doc, "2018-05-01"); 
      createElement("oso:Imie", osoba, doc, "Mateusz");
      createElement("oso:ImieDrugie", osoba, doc, "Tomasz"); 
      createElement("oso:Nazwisko", osoba, doc, "Kowalski"); 
      Element adres = createElement("adr:Adres", osoba, doc);
      createElement("adr:KodPocztowy", adres, doc, "10-900");
      createElement("adr:Poczta", adres, doc, "Olsztyn");      
      createElement("adr:Miejscowosc", adres, doc, "Boguszów-Gorce");
      createElement("adr:Ulica", adres, doc, "Plac Odrodzenia");
      createElement("adr:Budynek", adres, doc, "1");
      createElement("adr:Lokal", adres, doc, "");
      createElement("adr:Kraj", adres, doc, "PL");
      createElement("adr:Wojewodztwo", adres, doc, "Warmińsko-Mazurskie");
      createElement("adr:Powiat", adres, doc, "Olsztyn");
      createElement("adr:Gmina", adres, doc, "Olsztyn");      
      Element kontakt = createElement("adr:Kontakt", osoba, doc);  
      createElement("adr:Email", kontakt, doc, "ad@wp.pl");
      createElement("adr:Faks", kontakt, doc, "125215314");
      createElement("adr:Telefon", kontakt, doc, "2352353654");      
    }
    
    Element trescDokumentu = createElement("wnio:TrescDokumentu", dokument, doc);
    Element dotyczyNieruchomosci = createElement("wnio:dotyczyNieruchomosci", trescDokumentu, doc);
    createElement("wnio:zarybienie22", dotyczyNieruchomosci, doc, "");
    createElement("wnio:zarybienie21", dotyczyNieruchomosci, doc, "");
    createElement("wnio:zarybienie20", dotyczyNieruchomosci, doc, "");
    Element sumaPowierzchni = createElement("wnio:SumaPowierzchni", dotyczyNieruchomosci, doc);
    createElement("wnio:sumapowierzchniopodatkowania", sumaPowierzchni, doc, "");
    createElement("wnio:uzytkiZInnejGminy", dotyczyNieruchomosci, doc, ""); 
    Element adresGospodarstwa = createElement("wnio:adresGospodarstwa", dotyczyNieruchomosci, doc); 
    createElement("adr:KodPocztowy", adresGospodarstwa, doc, "10-900");
    createElement("adr:Poczta", adresGospodarstwa, doc, "Olsztyn");
    createElement("adr:Miejscowosc", adresGospodarstwa, doc, "Olsztyn");
    createElement("adr:Ulica", adresGospodarstwa, doc, "Jesienna");
    createElement("adr:Budynek", adresGospodarstwa, doc, "1");
    createElement("adr:Lokal", adresGospodarstwa, doc, "2");
    Element dzialki = createElement("wnio:dzialki", dotyczyNieruchomosci, doc);
    Element ksiegaWieczysta = createElement("wnio:ksiegaWieczysta", dzialki, doc);
    createElement("wnio:nazwaSadu", ksiegaWieczysta, doc, "Sąd Rejonowy w Nowym Mieście Lubawskim");
    createElement("wnio:numerKsiegiWieczystej", ksiegaWieczysta, doc, "xxx");
    
    createElement("wnio:numerBudynku", dzialki, doc, "234");
    createElement("wnio:numerDzialki", dzialki, doc, "356");

    Element gruntyOpodatkowane = createElement("wnio:gruntyOpodatkowane", dotyczyNieruchomosci, doc);
    createElement("wnio:slTypPowierzchni", gruntyOpodatkowane, doc, "Grunty pod stawami");
    createElement("wnio:slUzytekGruntowy", gruntyOpodatkowane, doc, "Pastwiska");
    createElement("wnio:slKlasa", gruntyOpodatkowane, doc, "V");
    createElement("wnio:powierzchnia", gruntyOpodatkowane, doc, "0.0000"); 
    
    Element nieruchomosciZwolnione = createElement("wnio:nieruchomosciZwolnione", dotyczyNieruchomosci, doc);
    createElement("wnio:powierzchniaGruntu", nieruchomosciZwolnione, doc, "0.00");
    createElement("wnio:slTytulPrawnyZwolnienia", nieruchomosciZwolnione, doc, "art. 7 ust. 1 pkt. 10 – grunty");    
    

		
//		StreamResult result = new StreamResult(new File("/home/fejq/Praca/jsonToXML/test.xml"));
		StreamResult result = new StreamResult(new File("D:\\test\\test.xml"));
		DOMSource source = new DOMSource(doc);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.transform(source, result);
	}

//	private String getJson() {
//		return "{\"adresat\":{\"typ_podmiotu\":\"P\",\"osoba\":null,\"instytucja\":{\"nazwa_instytucji\":\"Burmistrz Krosna Odrzańskiego\",\"adres\":\"PARKOWA 1\\n66-600 KROSNO ODRZAŃSKIE\",\"identyfikator\":null,\"jednostka\":null,\"kontakt\":null,\"pracownik\":null}},\"data_otrzymania_dokumentu\":null,\"data_utworzenia_dokumentu\":null,\"data_wyslania_dokumentu\":null,\"nadawca\":{\"typ_podmiotu\":null,\"osoba\":{\"imie_nazwisko\":{\"imie\":null,\"imie_drugie\":null,\"nazwisko\":null},\"adres\":{\"kraj\":null,\"wojewodztwo\":null,\"powiat\":null,\"gmina\":null,\"ulica\":null,\"budynek\":null,\"lokal\":null,\"miejscowosc\":null,\"kod_pocztowy\":null,\"poczta\":null,\"simc\":null,\"skrytka_pocztowa\":null,\"terc\":null,\"ulic\":null,\"uwagi\":null},\"identyfikator_osoby\":{\"nip\":null,\"pesel\":null,\"inne_identyfikatory\":null},\"kontakt\":{\"telefon\":\"48 4109700\",\"faks\":null,\"email\":null}},\"instytucja\":null},\"nazwa_dokumentu\":null,\"tresc_dokumentu_elektronicznego\":{\"data_wypelnienia\":\"2018-07-12\",\"dotyczy_nieruchomosci\":null,\"il\":null,\"in\":null,\"informacja_wystawiona_za_rok\":2018,\"ir\":null,\"korekta_za\":null,\"okolicznosci_zlozenia_informacji\":\"korekta uprzednio złożonej informacji\",\"oswiadczenie_podatnika_imie\":null,\"oswiadczenie_podatnika_nazwisko\":null,\"podmiot_zobowiazany\":null,\"razem_podatek\":null,\"zalaczniki\":null}}";
//	}

}
