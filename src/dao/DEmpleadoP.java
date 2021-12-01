/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpleadoProduccion;
import modelos.IOperaciones;

/**
 *
 * @author Usuario
 */
public class DEmpleadoP implements IOperaciones{
    private ArrayList<EmpleadoProduccion> lista = new ArrayList();
    
    @Override
    public void agregarRegistro(Object o) {
        lista.add((EmpleadoProduccion) o); //To change body of generated methods, choose Tools | Templates.
    }
    public void agregarRegistro(int id, String nombre, String apellidos, double salarioBase, double horasExtras, double bono){
    
        lista.add(new EmpleadoProduccion(id, nombre, apellidos, salarioBase, horasExtras, bono));
    
    } 

    @Override
    public void mostrarRegistro() {
       for(EmpleadoProduccion ep: lista){
           System.out.println(ep.toString());
       
       } //To change body of generated methods, choose Tools | Templates.
    }
    
}
