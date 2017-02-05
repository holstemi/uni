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
public class Yliopistolainen {
    private String etunimi;
    private String sukunimi;
    private String mailiosote;
    public Yliopistolainen(String etunimi,String Sukunimi,String mailiosoite){
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.mailiosote = mailiosote;
    
}

    /**
     * @return the etunimi
     */
    public String getEtunimi() {
        return etunimi;
    }

    /**
     * @param etunimi the etunimi to set
     */
    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    /**
     * @return the sukunimi
     */
    public String getSukunimi() {
        return sukunimi;
    }

    /**
     * @param sukunimi the sukunimi to set
     */
    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    /**
     * @return the mailiosote
     */
    public String getMailiosote() {
        return mailiosote;
    }

    /**
     * @param mailiosote the mailiosote to set
     */
    public void setMailiosote(String mailiosote) {
        this.mailiosote = mailiosote;
    }
    
    
}
class Opiskelija extends Yliopistolainen{
    private int opiskelijanro;
    private int noppamaara;
    public Opiskelija(String etunimi, String Sukunimi, String mailiosoite, int opiskelijanro, int noppamaara) {
        super(etunimi, Sukunimi, mailiosoite);
        this.opiskelijanro = opiskelijanro;
        this.noppamaara = noppamaara;
    }

    /**
     * @return the opiskelijanro
     */
    public int getOpiskelijanro() {
        return opiskelijanro;
    }

    /**
     * @param opiskelijanro the opiskelijanro to set
     */
    public void setOpiskelijanro(int opiskelijanro) {
        this.opiskelijanro = opiskelijanro;
    }
      public int getNoppamaara() {
        return this.noppamaara;
      }

    /**
     * @param noppamaara the noppamaara to set
     */
    public void setNoppamaara(int noppamaara) {
        this.noppamaara = noppamaara;
    }
    public void lisaaNoppia(int lisays){
        this.noppamaara += lisays;
    
    }

    private static class noppamaara {

        public noppamaara() {
        }
    }
      

}
class Opettaja extends Yliopistolainen{
private int palkka;
private ArrayList<String> kurssit;
    public Opettaja(String etunimi, String Sukunimi, String mailiosoite, int palkka) {
        super(etunimi, Sukunimi, mailiosoite);
    }

    /**
     * @return the palkka
     */
    public int getPalkka() {
        return palkka;
    }

    /**
     * @param palkka the palkka to set
     */
    public void setPalkka(int palkka) {
        this.palkka = palkka;
    }

    /**
     * @return the kurssit
     */
    public ArrayList<String> getKurssit() {
        return kurssit;
    }

    /**
     * @param kurssit the kurssit to set
     */
    public void setKurssit(ArrayList<String> kurssit) {
        this.kurssit = kurssit;
    }
public void lisaaKurssi(String kurssi) {
    kurssit.add(kurssi);
    }
public void poistaKurssi( String kurssi){
this.kurssit.remove(kurssi);
}

}
