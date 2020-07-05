/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numcubicos;
import java.util.Scanner;
/**
 *
 * @author Ana Karen
 */
public class NumCubicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner (System.in);
        double num,raiz;
        int ent;
        System.out.println("Ingrese el numero: ");
        num=x.nextInt();
        
        raiz= Math.cbrt(num);
     
        ent = (int) raiz;
        
        if(raiz-ent==0){
            System.out.println("Este numero es cubico");
        }
        
        else{
            System.out.println("Este numero no es cubico");
        } 
    }
    
}
