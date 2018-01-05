/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poission.distribution;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author actions-reactions
 */
public class Poission{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double Px;
        System.out.print("Input x : ");
        int x = sc.nextInt();
        System.out.print("Input alpha : ");
        int a = sc.nextInt();
       
        Px=(Math.pow(a,x)*Math.pow(Math.E,-a))/fact(x);
        
        System.out.println("Probability P(x): "+Px);

    }
        public static int fact(int n){
        int i, fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        } 
        return fact;

    }
}
        
    
      
