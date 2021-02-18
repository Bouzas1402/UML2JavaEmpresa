package es.carlosgs.UML2JavaEmpresa;

import java.util.List;

public class Empleado extends Persona {
    private float sueldoBruto;

    private Empresa empresa;
    private List<Directivo> superiores;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, float sueldoBruto, Empresa empresa, List<Directivo> superiores) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
        this.empresa = empresa;
        this.superiores = superiores;
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }

    public void calcularSalarioNeto() {

    }
}
