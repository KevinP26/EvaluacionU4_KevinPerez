/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpleadoOficina;
import modelos.IOperaciones;

/**
 *
 * @author Usuario
 */
public class DEmpleadoO implements IOperaciones{
    
    private ArrayList<EmpleadoOficina> lista = new ArrayList();
     
    @Override
    public void agregarRegistro(Object o) {
         lista.add((EmpleadoOficina) o);
    }
    
    public void agregarRegistro(int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
         lista.add(new EmpleadoOficina(id, nombre, apellidos, salarioBase, horasExtras));
    }

    @Override
    public void mostrarRegistro() {
        for(EmpleadoOficina eo: lista){
            System.out.println(eo.toString());
        
        }
    }
    
}
