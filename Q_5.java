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
public class Q_5 {
     public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Veuillez saisir un nombre n :");
   int n = sc.nextInt();
   int[] valeurs = { 0, 1 };
   // 1 pour pile
   //0 pour face;
   int aleatoire;
   int a=0;
   while(a!= n){
      
        aleatoire = valeurs[(int) (Math.random() * valeurs.length)];
        System.out.println(" le tirage d’une pièce de monnaie est  "+ aleatoire );
        a=a+1;
        
               }
  
     }
    
}
