/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.controller;

import java.util.List;
import penjalistaapp.model.Autor;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class ObradaAutor extends Obrada implements ObradaInterface<Autor>{

  

    
    public List<Autor> getEntiteti() {
        return session.createQuery(" from Autor").list();
    }

    
    public Autor dodaj(Autor a) throws MojException {
        kontrola(a);
        spremi(a);
        
        return a;
    }

    
    public Autor promjena(Autor a) throws MojException {
        kontrola(a);
        spremi(a);
        
        return a;
    }
    
       private void kontrola(Autor a) throws MojException{
        if(a.getIme().matches("/^[a-zA-Z\\s]*$/") || a.getPrezime().matches("/^[a-zA-Z\\s]*$/")){
            throw new MojException("Ime i prezime autora mogu sadržavati samo slova.");
           
        }
           if ((a.getIme() == null || a.getIme().isEmpty()) || (a.getPrezime() == null || a.getPrezime().isEmpty())) {
               throw new MojException("Ime i prezime obavezni.");
           }
    }
}
