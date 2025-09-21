/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.sandramartinez;

/**
 *
 * @author Sandra Martinez
 */
public class NaveEspacial {
    private final String nombre;
    private double combustible;
    private final double maxCombustible = 100.0;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public String getNombre() { return nombre; }
    public double getCombustible() { return combustible; }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no cumple con el avance de " + distancia + " unidades de combustible.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad > maxCombustible) {
            combustible = maxCombustible;
        } else {
            combustible += cantidad;
        }
        System.out.println(nombre + " recargó combustible. Nivel actualizado: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible inicial: " + combustible);
    }

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Houston", 50);

        nave1.mostrarEstado();

        nave1.avanzar(60);
        nave1.recargarCombustible(30);
        nave1.avanzar(60);

        nave1.mostrarEstado();
    }
}