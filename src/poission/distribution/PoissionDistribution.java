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
 * @author Al-amin
 */
public class PoissionDistribution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double Px = sc.nextDouble();
        int x = sc.nextInt();
        int a = sc.nextInt();
        
        final double e=2.72;
        

        Px=(Math.pow(a,x)*Math.pow(e,-a))/fact(x);
    }
      
}
