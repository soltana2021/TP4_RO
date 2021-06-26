/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ro;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ex1_Q2_Q3 {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Veuillez saisir un nombre n :");
   int n = sc.nextInt();
   int a=0;
   int nb_6=0;
   int dé01=0;
   while(a!= n){
      
        dé01=1+(int) (Math.random()*6);
        System.out.println(" dé01 est "+ dé01 );
        a=a+1;
        if(dé01==6){
            nb_6=nb_6+1;    
        }
   }
   System.out.println(" le nbr de fois pour la face 6 est:" +nb_6 );
         
     }
    
}
