/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p1;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES DE AÑO
        int año, b;
        año=introduceAño();
        CalcularAño(año);
    }
    public static int introduceAño(){//METODO PARA PEDIR AÑO
        int año;
        Scanner Teclado=new Scanner(System.in);
        System.out.println("Introduce el Año");
        año=Teclado.nextInt();
        
        return año;
    }
    public static void CalcularAño(int a){//METODO PARA CLACULAR AÑO BICIESTO O NO
      
  if( (a%400==0) &&  (a%100==0) || (a%4==0 ) )
   System.out.print("El año es bisiesto"); 
  else
   System.out.print("El año no es bisiesto.");
 }
}

    
