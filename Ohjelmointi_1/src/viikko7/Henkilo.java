package viikko7;

public class Henkilo {
    
    private String nimi;
    private String osoite;

    Henkilo() {
        nimi = "";
        osoite = "";
    }

    Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }
    public void setOsoite(String osoite) {
        this.osoite = osoite;

    }

    public String toString() {
        return "Nimi: " + getNimi() + "Osoite: " + getOsoite();
    }


}
