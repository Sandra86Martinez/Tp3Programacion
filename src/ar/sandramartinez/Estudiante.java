/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.sandramartinez;

/**
 *
 * @author Sandra Martinez
 */
class EstudianteInfo {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public EstudianteInfo(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    void mostrarCalificacion() {
        System.out.println("Calificación: " + calificacion);
    }

    void subirCalificacion(double puntos) {
        calificacion += puntos;
    }

    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }
}

public class Estudiante {
    public static void main(String[] args) {
        EstudianteInfo estudiante1 = new EstudianteInfo("Sandra", "Martinez", "Programación II", 8.0);

        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(1.0);
        estudiante1.mostrarCalificacion();
        estudiante1.bajarCalificacion(2.0);
        estudiante1.mostrarCalificacion();
    }
}