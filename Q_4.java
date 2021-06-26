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
public class Q_4 {
     public static void main(String[] args) {
   
   int dé01=0;
   int c=-1;
   while(dé01!= 6){
       dé01=1+(int) (Math.random()*6);
        System.out.println(" dé01 est "+ dé01 );
        c=c+1;
   
   if(dé01 ==6){
       break;     
   }       
   }
    System.out.println(" le nombre de lancers avant d'obtenir le premier ‘6’ :  "+ c);
    
}
}    

