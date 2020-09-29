package org.pw;

public class Person {
    private int PersNr;
    private String Anrede;
    private String Name;
    private String Vorname;
    private String Plz;
    private String Ort;
    private int Eintrittsjahr;
    private double Salaer;
    private double Pensum;
    final int minEintrittsjahr = 1975;
    final double maxSalaer = 99999.95;

    public int getPersNr() {
        return PersNr;
    }

    public String getAnrede() {
        return Anrede;
    }

    public void setAnrede(String anrede) {
        Anrede = anrede;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getPlz() {
        return Plz;
    }

    public void setPlz(String plz) {
        Plz = plz;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public int getEintrittsjahr() {
        return Eintrittsjahr;
    }

    public void setEintrittsjahr(int eintrittsjahr) throws Exception {
        if(eintrittsjahr >= this.minEintrittsjahr && eintrittsjahr <= java.time.LocalDate.now().getYear()) {
            Eintrittsjahr = eintrittsjahr;
        }else {
            throw new Exception("not a valid year");
        }
    }

    public double getSalaer() {
        return Salaer;
    }

    public void setSalaer(double salaer) throws Exception {
        if(salaer >= 0.00 && salaer <= this.maxSalaer){
            Salaer = salaer;
        }else {
            throw new Exception("not a valid Salary");
        }
    }

    public double getPensum() {
        return Pensum;
    }

    public void setPensum(double pensum) {
        Pensum = pensum;
    }


}
