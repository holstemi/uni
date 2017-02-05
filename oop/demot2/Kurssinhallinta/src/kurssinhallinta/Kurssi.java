/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurssinhallinta;

import java.util.ArrayList;

/**
 *
 *
 */
public class Kurssi {
    private String nimi;
    private String aihe;
    private ArrayList<Opiskelija> osallistujat;
    private ArrayList<Opettaja> opettajat;
public Kurssi(String nimi, String aihe, Opettaja opettaja){
this.aihe = aihe;
this.nimi = nimi;
this.opettajat.add(opettaja);
}
    /**
     * @return the nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * @param nimi the nimi to set
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * @return the aihe
     */
    public String getAihe() {
        return aihe;
    }

    /**
     * @param aihe the aihe to set
     */
    public void setAihe(String aihe) {
        this.aihe = aihe;
    }

    /**
     * @return the osallistujat
     */
    public ArrayList<Opiskelija> getOsallistujat() {
        return osallistujat;
    }

    /**
     * @param osallistujat the osallistujat to set
     */
    public void setOsallistujat(ArrayList<Opiskelija> osallistujat) {
        this.osallistujat = osallistujat;
    }

    /**
     * @return the opettajat
     */
    public ArrayList<Opettaja> getOpettajat() {
        return opettajat;
    }

    /**
     * @param opettajat the opettajat to set
     */
    public void setOpettajat(ArrayList<Opettaja> opettajat) {
        this.opettajat = opettajat;
    }
    public void lisaaHenkilo(Opiskelija o){
        this.osallistujat.add(o);
        
    }
    public void lisaaOpettaja(Opettaja o){
        this.opettajat.add(o);
        
    }
    public void poistaHenkilo(Opiskelija o){
        this.osallistujat.remove(o);
        
    }
     public void poistaHenkilo(Opettaja o){
        this.opettajat.remove(o);
        
    }
     public void poistaHenkilo(Opettaja o){
       this.opettajat.remove(o);
     }
    public boolean onkoKurssilla( Opiskelija o){
        boolean kurssilla = false;
        for (int i =0; i < osallistujat.size(); i++){
        if( osallistujat.get(i).equals(o)) {
        kurssilla = true;
        break;
        } 
        
         
        
    }
  return kurssilla;
    
}
  public void printOpiskelijat {
      String Etunimi;
      String Sukunimi;
  for(int i = 0; i < osallistujat.size();i++){
      etunimi = osallistujat.get(i).getEtunimi();
      sukunimi = osallistujat.get(i).getSukunimi();
      System.out.println(etunimi,sukunimi);
  }
}
    }
  public void printOpettajat {
      String Etunimi;
      String Sukunimi;
  for(int i = 0; i < opettajat.size();i++){
      etunimi = opettajat.get(i).getEtunimi();
      sukunimi = opettajat.get(i).getSukunimi();
      System.out.println(etunimi,sukunimi);
  }
}
}
