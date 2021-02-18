package es.carlosgs.UML2JavaEmpresa;

/**
 * La clase <code>Persona</code> que reúne las características comunes a las personas
 * ya sean físicas o jurídicas
 * @author Carlos G
 * @version 1.0
 * @since 1.0
 */
public class Persona {
    /**
     * Nombre y apellidos de la persona
     */
    private String nombre;

    /**
     * Edad de la persona en años. Si es una persona jurídca se refiere a los años
     * desde que se constituyó.
     */
    private int edad;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Muestra en pantalla los datos de la persona
     */
    public void mostrar() {
    }
}
