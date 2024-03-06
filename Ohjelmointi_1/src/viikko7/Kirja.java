package viikko7;

public class Kirja {
    
    private String nimi;
    private String isbn;
    private double hinta;
    private int julkaisuvuosi;
    
    public Kirja() {
        nimi = "";
        isbn = "";
        hinta = 0.0;
        julkaisuvuosi = 0;
    }

    public Kirja (String nimi, String isbn, double hinta, int julkaisuvuosi) {
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public void setJulkaisuvuosi(int julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getHinta() {
        return hinta;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }

    @Override
    public String toString() {
        String myString = "Kirja [nimi= " + getNimi() + ", isbn= " + getIsbn() + ", hinta= " + getHinta() + ", vuosi= " + getJulkaisuvuosi() + "]";
        return myString;
    }
}
