package org.pw;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private static int sAnzahlPersonen = 0;
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

    public Person() {
        PersNr = -1;
        Anrede = "Frau";
        Name = "Neue person";
        Plz = "6000";
        Ort = "Luzern";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Eintrittsjahr = calendar.get(Calendar.YEAR);
        Salaer = 5000;
        Pensum = 100;
        Person.sAnzahlPersonen ++;
    }

    public Person(int persNum) {
        PersNr = Person.sAnzahlPersonen;
        Person.sAnzahlPersonen ++;
    }

    public Person(int persNum, String Anrede, String Name, String Vorname) {
        PersNr = Person.sAnzahlPersonen;
        this.Anrede = Anrede;
        this.Name = Name;
        this.Vorname = Vorname;
        Person.sAnzahlPersonen ++;
    }

    public Person(int persNum, String Anrede, String Name, String Vorname, int Eintritsjahr) {
        PersNr = persNum;
        this.Anrede = Anrede;
        this.Name = Name;
        this.Vorname = Vorname;
        this.Eintrittsjahr = Eintritsjahr;
        Person.sAnzahlPersonen ++;
    }

    public static double CalculateLohn(double salaer, int pensum) {
        return (salaer / 100) * pensum;
    }

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
