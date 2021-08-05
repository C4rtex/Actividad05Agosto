/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad05agosto;

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
        values[0]=nota1;
        values[1]=nota2;
        values[2]=nota3;
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        double average = ((double) sum) / values.length;
        return average;

    }
    public void imprimir(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nCodigo: "+codigo+"\nnota 1: "+nota1+"\nnota 2: "+nota2+"\nnota 3: "+nota3
                +"\nPromedio: "+promedio());
    }

}
