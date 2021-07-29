/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Jilan Ariqo Nafisa
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan beberapa data (maks 20) :");
        int a = sc.nextInt();
        int[]x = new int[a];
        for(int i=0; i<x.length; i++){
            System.out.print("masukan data:");
            x[i]=sc.nextInt();
        }
        System.out.print("data yang dimasukan:");
        for(int i:x){
            System.out.print(" " +i);
        }
        System.out.print("\nMean adalah:"+ Mean(x));
        System.out.print("\nMedian adalah:"+ Median(x));
        
        Arrays.sort(x);
        for(int index:x){
        System.out.println("\nTelah diurutkan :"+index);
     }
    }
    private static float Mean(int[]n){
        float t = 0;
        float r;
        for(int i:n){
            t += i;
        }
        r = t/n.length;
        return r;
    }
    private static double Median(int[]n){
        int M = n.length%2;
        double m;
        if (M == 1){
            m = n[n.length/2];
            return m;
        }else{
            m = (n[n.length/2+1]+n[n.length/2]);
            m = m/2;
            return m;
        }
    }
    
}
