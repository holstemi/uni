/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * Iikka Luoma-aho 605814 
 */
public class Demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner lukija = new Scanner(System.in);
            System.out.print("Syntymavuotesi :");  //kysytään ikä
            int svuosi = lukija.nextInt();
            String ika;
            if (2015 - svuosi < 18){ //lasketaan ikä 2015 vuoden lopussa
                ika = "Alaikainen";
            }
            else {
                ika = "Taysi-ikainen";
            }
            System.out.println("------------------------");
            System.out.println("Vuoden 2015 lopussa olit: " + ika);
            lukija.close();
        }catch(Exception e){
            System.out.println("Jokin meni pieleen, yrita uudelleen!");
      }
}
}

