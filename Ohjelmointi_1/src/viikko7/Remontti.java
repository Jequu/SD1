package viikko7;

import java.time.LocalDate;

public class Remontti {
    
    private int vuosi;
    private String kuvaus;


    Remontti() {
        LocalDate date = LocalDate.now();
        int vuosi = date.getYear();
        String kuvaus = "";
    }

    public int getVuosi() {

        return vuosi;
    }
    public String getKuvaus() {
        return kuvaus;
    }

    public boolean setVuosi(int vuosi) {
        LocalDate currentDate = LocalDate.now();
        if (vuosi <= currentDate.getYear()) {
            this.vuosi = vuosi;
            return true;
        } else {
            return false;
        }
    }    
    
    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

  
}
