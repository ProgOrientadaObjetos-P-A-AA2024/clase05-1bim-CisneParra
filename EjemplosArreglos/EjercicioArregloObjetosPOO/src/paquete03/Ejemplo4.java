/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class Ejemplo4 {

    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion[] calificaciones = new Calificacion[2];
        Profesor profesor1 = new Profesor("Franco", "nombramiento");
        Profesor profesor2 = new Profesor("Richard", "contrato");

        Calificacion c = new Calificacion(10, "Computación", profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica", profesor2);

        calificaciones[0] = c;
        calificaciones[1] = c2;

        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor(%s)\n",
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre());
            /*
            En la linea 30 se llama a un OBJETO de tipo PROFESOR es decir que 
            se abre camino desde obtener Profesor hasta obtener el nombre.
            */
        }

    }
}
