/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad05agosto;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Actividad05Agosto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Estudiante miEstudiante=new Estudiante();
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        miEstudiante.setNombre(nombre);
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = entrada.nextLine();
        miEstudiante.setApellido(apellido);
        System.out.print("Ingrese el codigo del estudiante: ");
        String codigo = entrada.nextLine();
        miEstudiante.setCodigo(codigo);
        System.out.print("Ingrese la nota 1: ");
        double nota1 = entrada.nextInt();
        miEstudiante.setNota1(nota1);
        System.out.print("Ingrese la nota 2: ");
        double nota2 = entrada.nextInt();
        miEstudiante.setNota2(nota2);
        System.out.print("Ingrese la nota 3: ");
        double nota3 = entrada.nextInt();
        miEstudiante.setNota3(nota3);
        
        miEstudiante.imprimir();
        
        
        

    }

}
