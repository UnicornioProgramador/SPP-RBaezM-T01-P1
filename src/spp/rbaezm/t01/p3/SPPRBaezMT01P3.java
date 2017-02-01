/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.t01.p3;
import java.util.Scanner;
////Rubén Daniel Báez Muñiz A01411504 IMT
/**
 *
 * @author Ruben 
 */
public class SPPRBaezMT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Matr, Calif1, Calif2, Calif3, Calif4, Calif5, Prom;
        Scanner kb= new Scanner (System.in);
        //Introducir variable
        
        //Pedir Datos
        System.out.println("Introduzca su matrícula sin A");
        Matr= kb.nextDouble();
        
        System.out.println("Digite su calif 1");
        Calif1= kb.nextDouble();
        System.out.println("Digite su calif 2");
        Calif2= kb.nextDouble();
        System.out.println("Digite su calif 3");
        Calif3= kb.nextDouble();
        System.out.println("Digite su calif 4");
        Calif4= kb.nextDouble();
        System.out.println("Digite su calif 5");
        Calif5= kb.nextDouble();
        //Indicar promedio
        
        System.out.println("Su promedio es ="+ Prom);
        
        //Indicar Status
        Prom= ((Calif1+Calif2+Calif3+Calif4+Calif5)/5);
        if (Prom > 6.9)
            System.out.println("APROBADO");
        else if (Prom < 7.0)
            System.out.println("REPROBADO");
        
        
    }
    
}
