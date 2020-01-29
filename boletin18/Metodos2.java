/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

//import java.util.Random;

/**
 *
 * @author xdeantabelisario
 */
public class Metodos2 {
    
    public void InsertarDatos(float[] array){
        float num;
        //Random rand = new Random();
        for(int i=0;i<array.length;i++){
            num=(float)(Math.random()*10);
            array[i]=num;
        }
    }
        
    public float media(float[] array){
        float prom=0;
        float sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        prom=sum/array.length;
        return prom;
    }
    
    public float notaAlta(float[] array){
        float nota=-1;
        for(int i=0;i<array.length;i++){
            //for(int j=0;j<array.length;j++){
                if(array[i]>nota){
                    nota=array[i];
                }
            //}
        }
        return nota;
    }
    
    public void mostrarSuspensos(float[] array){
        int cont=0;
        for(int i=0;i<array.length;i++){
            if(array[i]<5){
                cont++;
            }
        }
        System.out.println("Suspensos: " + cont);
    }
    
    public void mostrarAprobados(float[] array){
        int cont=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=5){
                cont++;
            }
        }
        System.out.println("Aprobados: " + cont);
    }
    
    public void mostrarArray(float[] array){
            for(int j=0;j<array.length ;j++){
                System.out.println(array[j]);
            }
        
    }
}
