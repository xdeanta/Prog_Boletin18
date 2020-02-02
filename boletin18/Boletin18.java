/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos m = new Metodos();
        Metodos2 n = new Metodos2();
        //Menu men=new Menu();
        float[] alumnos=new float[30];
        String[] nombs=new String[30];
        /* EJERCICIO 1 */
        System.out.println("Ejercicio 1:");
        int[] init= new int[6];
        m.InsertarDatos(init);
        System.out.println("Array muestra:");
        m.mostrarArray(init);
        System.out.println("**************");
        /* EJERCICIO 2 */
        System.out.println("Ejercicio 2 y 3:");
        n.InsertarDatos(alumnos,nombs);
        n.ordenarNotas(alumnos, nombs);
        /*Estadisticas*/
        System.out.println("Estadisticas:");
        n.mostrarAprobados(alumnos);
        n.mostrarSuspensos(alumnos);
        System.out.println("promedio: " + n.media(alumnos));
        System.out.println("Nota Mas Alta: " + n.notaAlta(alumnos));
        System.out.println("***********");
        System.out.println("Listado y notas de alumnos ordenados de forma creciente:");
        n.mostrarArray(alumnos, nombs);
        System.out.println("***********");
        n.mostrarAprobados(alumnos, nombs);
        System.out.println("Escriba el nombre de un alumno:");
        n.mostrarNota(alumnos, nombs);
        System.out.println("***********");
        System.out.println("Ejercicio 3:");
        System.out.println("Introduzca un numero:");
        m.letraDNI();
    }
    
}
