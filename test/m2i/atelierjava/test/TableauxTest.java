/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class TableauxTest {
    
    @Test
    public void test(){
        String[] tab = new String[] {"abc","def","ghi"};
        
            for(int i =0;i<tab.length;i++){
                System.out.println(tab[i]);
            }
            for (String g : tab) {
                System.out.println(g);
            
            }
    }
    
    @Test
    public void test1 (){
        String[] tab1 = new String[9];
        int j=1;
        for (int i =0;i < tab1.length;i++){
            tab1[i] = "" + j*j;
            j++;
            System.out.println(tab1[i]);
            
        }
    }
}
