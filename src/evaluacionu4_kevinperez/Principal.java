/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionu4_kevinperez;

import dao.DEmpleadoO;
import dao.DEmpleadoP;
import modelos.Empleado;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\t\t\tEmpleado Oficina\n");
        DEmpleadoO empleadoO = new DEmpleadoO();
        Empleado a = new EmpleadoOficina(01, "Daniel", "Baldizon Matamoros", 1000, 100);
        empleadoO.agregarRegistro(a);
        Empleado b = new EmpleadoOficina(02, "Gabriel", "Fonseca Amador", 10526, 856);
        empleadoO.agregarRegistro(b);
        Empleado c = new EmpleadoOficina(03, "Matias", "Valle Medrano", 25130, 3546);
        empleadoO.agregarRegistro(c);
        empleadoO.mostrarRegistro();
        
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\t\t\tEmpleado Produccion\n");
        DEmpleadoP empleadoP = new DEmpleadoP();
        Empleado d = new EmpleadoProduccion(01, "Margaret", "Johansson Rogers", 5250, 500, 100);
        empleadoP.agregarRegistro(d);
        Empleado e = new EmpleadoProduccion(02, "Elizabeth", "Cerros Mendoza", 52000, 2100, 500);
        empleadoP.agregarRegistro(e);
        Empleado f = new EmpleadoProduccion(03, "Jelitssa", "Valle Urbina", 30510, 1000, 250);
        empleadoP.agregarRegistro(f);
        
        empleadoP.mostrarRegistro();
        
    }
    
}
