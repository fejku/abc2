package abc.inrl;

public class KontaktDTO {
    protected String telefon;
    protected String faks;
    protected String email;

    public KontaktDTO() {
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFaks() {
        return faks;
    }

    public void setFaks(String faks) {
        this.faks = faks;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
