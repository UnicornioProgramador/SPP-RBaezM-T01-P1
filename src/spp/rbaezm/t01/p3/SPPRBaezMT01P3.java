/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.t01.p3;
import java.util.Scanner;

/**
 *
 * @author Ruben Daniel Baez Muñiz A01411504
 */
public class SPPRBaezMT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Matr, C1, C2, C3, C4, C5, Prom;
        Scanner kb= new Scanner (System.in);
        //Introducir variable
        
        //Pedir Datos
        System.out.println("Introduce tú Matrícula");
        Matr= kb.nextDouble();
        System.out.println("Introduce tus calificaciones");
        System.out.println("Introduce tu C1");
        C1= kb.nextDouble();
        System.out.println("Introduce tu C2");
        C2= kb.nextDouble();
        System.out.println("Introduce tu C3");
        C3= kb.nextDouble();
        System.out.println("Introduce tu C4");
        C4= kb.nextDouble();
        System.out.println("Introduce tu C5");
        C5= kb.nextDouble();
        
        //Resolver Promedio
        Prom= ((C1+C2+C3+C4+C5)/5);
        if (Prom > 6.9)
            System.out.println("APROBADO");
        else if (Prom < 7.0)
            System.out.println("REPROBADO");
        
        //Mostrar Resultado
        System.out.println("Tu promedio es="+ Prom);
    }
    
}
