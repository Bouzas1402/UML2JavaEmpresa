package es.carlosgs.UML2JavaEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String telefono;

    private List<Empresa> empresas;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String telefono, List<Empresa> empresas) {
        super(nombre, edad);
        this.telefono = telefono;
        this.empresas = empresas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }

    public void addEmpresa(Empresa empresa) {
        if (this.empresas == null)
            this.empresas = new ArrayList<>();
        this.empresas.add(empresa);
    }

}
