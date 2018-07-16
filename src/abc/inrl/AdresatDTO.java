package abc.inrl;

public class AdresatDTO {
    protected String typ_podmiotu;
    protected OsobaDTO osobaDTO;
    protected InstytucjaDTO instytucja;

    public AdresatDTO() {
    }

    public OsobaDTO getOsobaDTO() {
        return osobaDTO;
    }

    public void setOsobaDTO(OsobaDTO osobaDTO) {
        this.osobaDTO = osobaDTO;
    }

    public String getTyp_podmiotu() {
        return typ_podmiotu;
    }

    public void setTyp_podmiotu(String typ_podmiotu) {
        this.typ_podmiotu = typ_podmiotu;
    }

    public InstytucjaDTO getInstytucja() {
        return instytucja;
    }

    public void setInstytucja(InstytucjaDTO instytucja) {
        this.instytucja = instytucja;
    }
}
