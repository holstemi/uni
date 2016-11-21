/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 *
 */
public class Demo6 {

    /**
     * @param args tulostaa sanan ja muokkaa sitä tehtävänannon mukaan
     */
    public static void main(String[] args) {
        try{
            
        
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmainen merkkijono: ");
 String a = lukija.nextLine();
 System.out.print("Toinen merkkijono (lyhyempi): ");
 String b = lukija.nextLine();
 int blen = b.length();
 String c = new String();
 for (int i = 0; i < a.length(); i++){
            if (i < (a.length()-blen)){
                if (a.substring(i,i+blen).equals(b)){
                    c = c + a.substring(i,i+blen).toUpperCase();
                    i++;
  }
                    else{c = c + a.charAt(i);}
  }
            else{
                c = c + a.charAt(i);
            }    
 }
    
        System.out.println(c);
 lukija.close();  
}
        
  catch(Exception e){
                    System.out.println("Jokin meni pieleen, yrita uudelleen!");
                }
}
}
