package es.carlosgs.UML2JavaEmpresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Un <code>Cliente</code> es una <code>Persona</code> que usa los servicios de una o varias <code>Empresa</code>s
 * @author Carlos G
 * @see Empresa
 * @see Persona
 * @version 1.0
 * @since 1.0
 */
public class Cliente extends Persona {
    /**
     * Teléfono de contacto
     */
    private String telefono;

    /**
     * Lista de empresas contratadas
     */
    private List<Empresa> empresas;

    /**
     * Constructor vacío
     */
    public Cliente() {
    }

    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param edad
     * @param telefono
     * @param empresas
     */
    public Cliente(String nombre, int edad, String telefono, List<Empresa> empresas) {
        super(nombre, edad);
        this.telefono = telefono;
        this.empresas = empresas;
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
     * Añade una empresa a la lista de empresas
     * @param empresa
     */
    public void addEmpresa(Empresa empresa) {
        if (this.empresas == null)
            this.empresas = new ArrayList<>();
        this.empresas.add(empresa);
    }

}
