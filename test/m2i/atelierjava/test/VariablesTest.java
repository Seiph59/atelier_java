/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class VariablesTest {

//    @Test
    public void testVariableObjets() {

        String a = ("Jamaique");
        String b = ("Kingston");

        String c = a.toUpperCase() + ", " + b.toUpperCase();
        System.out.println(c);
    }
//    //@Test

    public void testVariableObjets2() {

        int a = 123;
        String b = " Coucou";
        System.out.println(a + " " + b);
        System.out.println(b + " " + a);

    }
//    @Test 

    public void testVariableObjets3() {
        int a = 20;
        String b = "10";
        int c;
        c = Integer.parseInt(b);
        int d;
        d = a + c;
        int e;
        e = c + a;

        System.out.println(" a + b = " + d);
        System.err.println(" b + a = " + e);
    }

    public int carre(int n) {

        int o = n * n;

        return o;
    }
    
    @Test 
    public void ex4(){
        int z;
        z = carre(4);
        System.out.println(z);
    }
    
    public int puissance(int no, int pui){
            int res =1;
        for(int i = 1; i <= pui; i++){
            
            res *= no;
            
        }
        return res;
    }
    
    @Test
    public void ex5(){
        int y; 
        y = puissance(5, 2);
        System.out.println(y);
        
    }
       
    public int factoriel(int n1){
        if(n1 == 1){
            return 1;
        }
        else{
            return n1 * factoriel(n1-1);
        }
    }
    
    @Test
    public void ex6(){
        int x; 
        x = factoriel(4);
        System.out.println(x);
    }
}

