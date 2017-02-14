/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ejemplo.trycatch;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class SPP2EjemploTrycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciamos teclado
        Scanner kb= new Scanner (System.in);
        int varentera;
        boolean flag;
        do{
        
        System.out.println("Introduce un número entero");
        try{ 
            
            varentera= kb.nextInt ();
            flag=false;
            
        } catch (Exception ex){
            //Codigo para el manejo del error
            System.out.println("Introdujiste algo que no es entero. "+ ex);
            flag=true;
            kb.nextLine();
            }
        } while (flag);
    }
    
}
