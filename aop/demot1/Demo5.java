/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*

/**
 *
 * 
 */
import java.util.Scanner;
public class Demo5 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ratkaistaan 2. asteen yhtälö, joka muotoa ax²+bx+c=0, jossa a, b ja c kokonaislukuja");
 System.out.println("------------------------");
 System.out.print("a:n arvo:: ");
 int a = lukija.nextInt();
 System.out.print("b:n arvo: ");
 int b = lukija.nextInt();
 System.out.print("Lausekkeen vakiotermi c : ");
 int c = lukija.nextInt();
 double disk = b*b-4*a*c;
 System.out.println("------------------------");
 if (disk > 0){
  System.out.println("Juuri no. 1: " + (-b+Math.sqrt(disk))/(2*a));
  System.out.println("Juuri no. 2: " + (-b-Math.sqrt(disk))/(2*a));
 }else if( disk == 0){
            System.out.println("Kaksoisreaalijuuri :"+ (-b+Math.sqrt(disk))/(2*a));
        }else{
            System.out.println("Kahta reallijuurta ei loytynyt");}
        lukija.close();
    }
}
    
