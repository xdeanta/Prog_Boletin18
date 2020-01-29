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
        float[] alumnos=new float[30];
        /*int[] init= new int[6];
        m.InsertarDatos(init);
        System.out.println("Array muestra:");
        m.mostrarArray(init);*/
        
        n.InsertarDatos(alumnos);
        n.mostrarArray(alumnos);
        System.out.println("Promedio: " + n.media(alumnos));
        System.out.println("Nota Alta: " + n.notaAlta(alumnos));
        n.mostrarSuspensos(alumnos);
        n.mostrarAprobados(alumnos);
    }
    
}
