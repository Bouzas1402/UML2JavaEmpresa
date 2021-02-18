package es.carlosgs.UML2JavaEmpresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Una <code>Empresa</code> da empleo a una serie de empleados y genera ingresos procedentes de la
 * prestación de servicios a clientes
 * @author Carlos G
 * @see Empleado
 * @see Cliente
 * @version 1.0
 * @since 1.0
 */

public class Empresa {
    /**
     * Nombre de la empresa
     */
    private String nombre;

    /**
     * Lista de empleados que trabajan en la empresa
     */
    private final List<Empleado> empleados;
    /**
     * Lista de clientes a los que presta servicio
     */
    private List<Cliente> clientes;

    /**
     * Constructor vacío
     */
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param clientes
     */
    public Empresa (String nombre, List<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.empleados = new ArrayList<>();
    }

    /**
     * Añade un cliente a la lista de clientes
     * @param cliente
     */
    public void addCliente(Cliente cliente) {
        if (this.clientes == null)
            this.clientes = new ArrayList<>();
        this.clientes.add(cliente);
    }

    /**
     * Añade un empleado a la lista de empleados
     * @param empleado
     */
    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
}
