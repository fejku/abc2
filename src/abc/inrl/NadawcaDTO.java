package abc.inrl;

public class NadawcaDTO {
    protected String typ_podmiotu;
    protected OsobaDTO osoba;
    protected InstytucjaDTO instytucjaDTO;

    public NadawcaDTO() {
    }

    public String getTyp_podmiotu() {
        return typ_podmiotu;
    }

    public void setTyp_podmiotu(String typ_podmiotu) {
        this.typ_podmiotu = typ_podmiotu;
    }

    public OsobaDTO getOsoba() {
        return osoba;
    }

    public void setOsoba(OsobaDTO osoba) {
        this.osoba = osoba;
    }

    public InstytucjaDTO getInstytucjaDTO() {
        return instytucjaDTO;
    }

    public void setInstytucjaDTO(InstytucjaDTO instytucjaDTO) {
        this.instytucjaDTO = instytucjaDTO;
    }
}
