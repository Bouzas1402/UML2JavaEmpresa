package es.carlosgs.UML2JavaEmpresa;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Nueva empresa y cliente
        Empresa empresa = new Empresa ("Carlos Consulting", null);
        Cliente cliente = new Cliente("Medias Puri", 10, "555-012-345", null);
        // Asociar cliente y empresa entre sí
        empresa.addCliente(cliente);
        cliente.addEmpresa(empresa);
        // Nuevo empleado y asociar a empresa
        Empleado empleado = new Empleado("Carlos González", 52, 60000, empresa, null);
        empresa.addEmpleado(empleado);


    }
}
