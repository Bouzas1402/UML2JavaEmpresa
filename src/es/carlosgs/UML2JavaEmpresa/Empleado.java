package es.carlosgs.UML2JavaEmpresa;

import java.util.List;

/**
 * La clase <code>Empleado</code> define un tipo de <code>Persona</code> que trabaja en una <code>Empresa</code>
 * @author Carlos G
 * @see Persona
 * @see Empresa
 * @version 1.0
 * @since 1.0
 */
public class Empleado extends Persona {
    /**
     * El sueldo bruto anual en euros.
     */
    private float sueldoBruto;

    /**
     * La empresa para la que trabaja
     */
    private Empresa empresa;

    /**
     * Los directivos que están por encima de la persona en la jerarquía.
     */
    private List<Directivo> superiores;

    /**
     * Constructor vacío
     */
    public Empleado() {
    }

    /**
     * COnstructor con todos los atributos:
     * @param nombre
     * @param edad
     * @param sueldoBruto
     * @param empresa
     * @param superiores
     */
    public Empleado(String nombre, int edad, float sueldoBruto, Empresa empresa, List<Directivo> superiores) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
        this.empresa = empresa;
        this.superiores = superiores;
    }

    /**
     * Sobrescribe el método de la clase madre
     * @see Persona#mostrar()
     */
    @Override
    public void mostrar() {
        super.mostrar();
    }

    /**
     * Calcula el salario neto teniendo en cuenta 14 pagas al año
     */
    public float calcularSalarioNeto() {
        return sueldoBruto / 14;
    }
}
