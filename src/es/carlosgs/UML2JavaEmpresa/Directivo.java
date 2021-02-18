package es.carlosgs.UML2JavaEmpresa;

import java.util.List;

/**
 * Define un <code>Empleado</code> que pertenece a la Dirección de la Empresa
 * @author Carlos G
 * @see Empleado
 * @see Empresa
 * @version 1.0
 * @since 1.0
 */
public class Directivo extends Empleado {
    /**
     * Categoría del directivo. Es un número del 1 al 3 siendo el 1 el de mayor nivel.
     */
    private int categoria;

    /**
     * Lista de empleados a su cargo
     */
    private List<Empleado> subordinados;

    /**
     * Constructor vacío
     */
    public Directivo() {
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param edad
     * @param sueldoBruto
     * @param empresa
     * @param superiores
     * @param categoria
     * @param subordinados
     */
    public Directivo(String nombre, int edad, float sueldoBruto, Empresa empresa, List<Directivo> superiores,
                     int categoria, List<Empleado> subordinados) {
        super(nombre, edad, sueldoBruto, empresa, superiores);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    /**
     * Sobrescribe el método de la clase madre
     * @see Empleado#mostrar()
     */
    @Override
    public void mostrar() {
        super.mostrar();
    }
}
