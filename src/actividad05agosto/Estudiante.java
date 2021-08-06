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
public class Estudiante extends Persona {

    private String codigo;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double promedio() {

        double values[] = new double[3];
        values[0] = nota1;
        values[1] = nota2;
        values[2] = nota3;
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        double average = ((double) sum) / values.length;
        return average;

    }

    public void imprimir() {
        System.out.println();
        System.out.println("nombre: \t" + nombre);
        System.out.println("apellido: \t" + apellido);
        System.out.println("codigo: \t" + codigo);
        System.out.println("nota 1: \t" + nota1);
        System.out.println("nota 2: \t" + nota2);
        System.out.println("nota 3: \t" + nota3);
        System.out.printf("promedio: \t%.2f", promedio());
        System.out.println("");
    }

    public void pedirDatos() {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        this.nombre=nombre;
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = entrada.nextLine();
        this.apellido=apellido;
        System.out.print("Ingrese el codigo del estudiante: ");
        String codigo = entrada.nextLine();
        this.codigo=codigo;
        System.out.print("Ingrese la nota 1: ");
        double nota1 = entrada.nextDouble();
        this.nota1=nota1;
        System.out.print("Ingrese la nota 2: ");
        double nota2 = entrada.nextDouble();
        this.nota2=nota2;
        System.out.print("Ingrese la nota 3: ");
        double nota3 = entrada.nextDouble();
        this.nota3=nota3;
    }

}
