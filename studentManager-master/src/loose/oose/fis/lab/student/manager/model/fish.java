package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

class Briana{
    private String nume_familie;
    private int varsta;
    private String adresa;
    private double inaltime;
    
    public Briana(String nume_familie, int varsta, String adresa, double inaltime) {
        this.nume_familie = nume_familie;
        this.varsta = varsta;
        this.adresa = adresa;
        this.inaltime = inaltime;
    }

    public String toString() {
        return "Briana " + nume_familie + " are " + varsta + " de ani si locuieste pe strada " + adresa + "."
    }
}