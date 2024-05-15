/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";
        LibretaCalificacion libretae = new LibretaCalificacion(nombreEstudiante,
        notas);
        libretae.establecerPromedio();
        libretae.establecerPromedioCualitativo();
        /*
        En el momento de comentar las lineas 20 y 21 y ejecutamos el codigo
        se presentaran los valores por defecto de los objetos, los cuales serian
        0 y null
        */
        System.out.printf("\n%s\n", libretae);
    }
}
