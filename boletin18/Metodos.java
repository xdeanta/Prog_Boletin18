/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.Random;

/**
 *
 * @author xdeantabelisario
 */
public class Metodos {
    public void mostrarArray(int[] array){
            for(int j=array.length-1;j>=0 ;j--){
                System.out.println(array[j]);
            }
        
    }
    
    public void InsertarDatos(int[] array){
        int num;
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            num=rand.nextInt(50)+1;
            array[i]=num;
        }
    }
}
