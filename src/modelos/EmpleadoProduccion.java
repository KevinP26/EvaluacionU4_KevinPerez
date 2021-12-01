/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Usuario
 */
public class EmpleadoProduccion extends Empleado{
    
   private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(int id, String nombre, String apellidos, double salarioBase, double horasExtras, double bono) {
        super(id, nombre, apellidos, salarioBase, horasExtras);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
    public float calcularSalarioNetoEP(){
    
        float salarioNetoEP;
        
        salarioNetoEP = (float) ((calcularSalarioBruto() + bono) - calcularSeguro());
        
        return salarioNetoEP;
    }

    @Override
    public String toString() {
        return "Empleado Produccion{" + "ID: " +id+ " Nombre:  " +nombre+ " Apellido: " 
                +apellidos+ " Salario Base: " +salarioBase+ " Horas Extras: " 
                +horasExtras+ " Bono: " +bono+ "Salario Bruto: " +(calcularSalarioBruto()+bono)+ " Seguro: " 
                +calcularSeguro()+ " Salario Neto: " +calcularSalarioNetoEP()+'}';
    }
   
   
    
    
}
