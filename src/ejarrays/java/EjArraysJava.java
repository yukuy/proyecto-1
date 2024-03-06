/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejarrays.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JHONNY
 */
public class EjArraysJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      
        ArrayList<Aprendiz> listaAprendiz = new ArrayList<Aprendiz>();
        Scanner teclado = new Scanner(System.in );
       
        for (int i = 0; i <1; i++){
            Aprendiz miAprendiz = new Aprendiz();
            
            miAprendiz.setId(i);
            System.out.println("ingrese el nombre del aprendiz");
            miAprendiz.setNombre(teclado.next()); 
            System.out.println("ingrese la n1");
            miAprendiz.setN1(teclado.nextInt());
            System.out.println("ingrese la n2");
            miAprendiz.setN2(teclado.nextInt());
            System.out.println("ingrese la n3");
            miAprendiz.setN3(teclado.nextInt());
            listaAprendiz.add(miAprendiz);    
        }
        
        
        System.out.println("Aprendices agregados a la lista");
        for(Aprendiz var: listaAprendiz){
            float pro = (var.getN1()+var.getN2()+var.getN3())/3f;
            System.out.println(" el aprendiz" +var.getNombre() +"tiene promedio" +pro);
            
        }
        
    }
    
}
