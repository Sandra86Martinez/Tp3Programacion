/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.sandramartinez;

/**
 *
 * @author Sandra Martinez
 */
public class Gallina {
    private final int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() { return idGallina; }
    public int getEdad() { return edad; }
    public int getHuevosPuestos() { return huevosPuestos; }

    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    public void envejecer() {
        edad += 1;
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
    }

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(1, 2, 5);
        Gallina gallina2 = new Gallina(2, 3, 8);

        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();

        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
    }
}