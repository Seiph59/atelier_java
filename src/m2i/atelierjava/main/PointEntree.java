/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.main;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class PointEntree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
          
          int a = 10;
          int b = 20;
          int c = 30;
          int e;
          long d;
          
          d = a + b +c;
          System.out.println(d);
          
          e = b;
          b = a;
          a = e;
          
          System.out.println("a = " + a);
          System.out.println("b = " + b);
//        //Page d'authentification + saisie Login
//        
//        String monLogin;
//        String monMotDePasse;
//       
//        // Créer objet scanner  qui lit ( avec nextline/nextInt/...)        
//        Scanner maVarScanner = new Scanner(System.in);
//        
//        System.out.print("Votre identifiant:");
//        monLogin = maVarScanner.nextLine();
//        
//        System.out.print("Votre mot de passe:");
//        monMotDePasse = maVarScanner.nextLine();
    }
    
}
