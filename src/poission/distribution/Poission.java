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
public class Poission{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double Px;
        int x = sc.nextInt();
        int a = sc.nextInt();
        
        final double e=2.72;
        

<<<<<<< HEAD:src/poission/distribution/PoissionDistribution.java
       // Px=(Math.pow(a,x)*Math.pow(e,-a))/fact(x);
=======
        Px=(Math.pow(a,x)*Math.pow(e,-a))/fact(x);
        
        System.out.println("Probability P(x): "+Px);

    }
        public static int fact(int n){
        int i, res=1;
        for(i=1;i<=n;i++){
            res=res*i;
        } 
        return res;
>>>>>>> alien:src/poission/distribution/Poission.java
    }
}
        
    
      
