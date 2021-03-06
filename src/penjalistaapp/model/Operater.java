/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Profesor
 */
@Entity
public class Operater extends Entitet {

    private String ime;
    private String prezime;
    @Column(unique = true)
    private String email;
    private String lozinka;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String getCSV() {
        return getIme() + "\t" + getPrezime() + "\t" + getEmail();
    }

}
