public class Proyecto {
    double factorProductividad;
    String nombre, departamento, descripcion;

    public Proyecto(double factorProductividad, String nombre, String departamento, String descripcion) {
        this.factorProductividad = factorProductividad;
        this.nombre = nombre;
        this.departamento = departamento;
        this.descripcion = descripcion;
    }

    public double getFactorProductividad() {
        return factorProductividad;
    }

    public void setFactorProductividad(double factorProductividad) {
        this.factorProductividad = factorProductividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
