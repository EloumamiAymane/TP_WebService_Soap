package org.example;

import java.util.Date;

public class Compte {
    private int code;
    private double montant;
    private Date dateCreation;

    public Compte() {
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Compte(int code, double montant, Date dateCreation) {
        this.code = code;
        this.montant = montant;
        this.dateCreation = dateCreation;
    }
}
