package viikko7;

public class Asunto {

private String tyyppi;
private String osoite;
private double pintaala;
private double hinta;
private String kuvaus;

public Asunto() {
    tyyppi = "";
    osoite = "";
    pintaala = 0.0;
    hinta = 0.0;
    kuvaus = "";
}

public Asunto(String tyyppi, String osoite, double pintaala, double hinta, String kuvaus) {
this.tyyppi = tyyppi;
this.osoite = osoite;
this.pintaala = pintaala;
this.hinta = hinta;
this.kuvaus = kuvaus;
    
}

public String getTyyppi() {
    return tyyppi;
}
public String getOsoite() {
    return osoite;
}
public double getPintaala() {
    return pintaala;
}
public double getHinta() {
    return hinta;
}
public String getKuvaus() {
    return kuvaus;
}
public void setTyyppi(String tyyppi) {
    this.tyyppi = tyyppi;
}
public void setOsoite(String osoite) {
    this.osoite = osoite;
}
public void setPintaala(double pintaala) {
    this.pintaala = pintaala;
}
public void setKuvaus(String kuvaus) {
    this.kuvaus = kuvaus;
}
public void setHinta(double hinta) {
    this.hinta = hinta;
}

@Override
public String toString(){
String myString = "asdads";
return myString;
}
}