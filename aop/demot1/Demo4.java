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
public class Demo4 {

    /**
     * kysyy sähköpostiosoitetta, tulostaa domainin
     * @param args
     */
    public static void main(String[] args) {
    System.out.print("Sahkopostiosoitteesi: ");
    Scanner lukija = new Scanner(System.in);
    String mail = lukija.nextLine();
    int mp = mail.indexOf('@');
    int pit = mail.length();
    String dom = mail.substring(mp+1,pit);
    System.out.println("------------------------");
    System.out.println("Sahkopostiosoitteesi domain -osa: " + dom);
    lukija.close();
    }
}
    

