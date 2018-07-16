package abc.inrl;

public class IdentyfikatorOsobyDTO {
    protected String nip;
    protected String pesel;
    protected String inne_identyfikatory;

    public IdentyfikatorOsobyDTO() {
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getInne_identyfikatory() {
        return inne_identyfikatory;
    }

    public void setInne_identyfikatory(String inne_identyfikatory) {
        this.inne_identyfikatory = inne_identyfikatory;
    }
}
