/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurssinhallinta;

import java.util.ArrayList;

/**
 *
 
 */
public class Periodi {
    private ArrayList<Kurssi> periodi;
    private String ajankohta;
    
   public Periodi(String ajankohta){
       this.ajankohta= ajankohta;
   }

    /**
     * @return the periodi
     */
    public ArrayList<Kurssi> getPeriodi() {
        return periodi;
    }

    /**
     * @param periodi the periodi to set
     */
    public void setPeriodi(ArrayList<Kurssi> periodi) {
        this.periodi = periodi;
    }
    public void setYksikurssi(Kurssi k) {
        this.periodi.add(k);
    }
    public void removeKurssi(Kurssi k){
     periodi.remove(k);
    }
    
    public String getAjankohta(){
    return ajankohta;
    }

    /**
     * @param ajankohta the ajankohta to set
     */
    public void setAjankohta(String ajankohta) {
        this.ajankohta = ajankohta;
    }
    
    
}
class Lukuvuosi{
private ArrayList<Periodi> lukuvuosi;
private int vuosi;
    public Lukuvuosi(int vuosi){
    this.vuosi=vuosi;
    }

    /**
     * @return the lukuvuosi
     */
    public ArrayList<Periodi> getLukuvuosi() {
        return lukuvuosi;
    }

    /**
     * @param lukuvuosi the lukuvuosi to set
     */
    public void setLukuvuosi(ArrayList<Periodi> lukuvuosi) {
        this.lukuvuosi = lukuvuosi;
    }

    /**
     * @return the vuosi
     */
    public int getVuosi() {
        return vuosi;
    }

    /**
     * @param vuosi the vuosi to set
     */
    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

}

