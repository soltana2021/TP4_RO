/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_ro;

import static com.sun.javafx.util.Utils.sum;
import java.util.Vector;

/**
 *
 * @author user
 */

public class Ex_2 {
     public static void main(String[] args) {
            
      Vector v = new Vector();
      int A[][] = {{1,2},{3,4}};
  
      v.add(1);
      v.add(0);
      v.add(2);
      System.out.println(v);  
      int vectore;
      if (somme(v)==1){
          System.out.println(" vecteur stochastique ");
          
      }
      else{
          System.out.println(" vecteur non stochastique ");
      }    
     }
     public static int somme(Vector v) {
    int s=0;
    for (int i=0; i<v.size();i++) 
        s += ((Integer)v.elementAt(i)).intValue();
    return s;
    }
    
}
