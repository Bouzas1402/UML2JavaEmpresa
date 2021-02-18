package es.carlosgs.UML2JavaEmpresa;

import java.util.List;

public class Directivo extends Empleado {
    private int categoria;

    private List<Empleado> subordinados;

    public Directivo() {
    }

    public Directivo(String nombre, int edad, float sueldoBruto, Empresa empresa, List<Directivo> superiores,
                     int categoria, List<Empleado> subordinados) {
        super(nombre, edad, sueldoBruto, empresa, superiores);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
}
