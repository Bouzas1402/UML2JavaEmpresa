package es.carlosgs.UML2JavaEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;

    private final List<Empleado> empleados;
    private List<Cliente> clientes;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public Empresa (String nombre, List<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.empleados = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        if (this.clientes == null)
            this.clientes = new ArrayList<>();
        this.clientes.add(cliente);
    }

    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
}
