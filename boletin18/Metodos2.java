/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

//import java.util.Random;

import java.util.Scanner;


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
    
    public void mostrarArray(float[] array, String[] array2){
            for(int j=0;j<array.length ;j++){
                System.out.println(array2[j]);
                System.out.println(array[j]);
            }
        
    }
    
    public void InsertarDatos(float[] array, String[] array2){
        float num;
        String nomb;
        //Scanner sc = new Scanner(System.in);
        //Random rand = new Random();
        for(int i=0;i<array.length;i++){
            //num=sc.nextFloat();
            num=(float)(Math.random()*10);
            array[i]=num;
        }
        
        /*for(int i=0;i<array2.length;i++){
            nomb=sc.nextLine();
            array2[i]=nomb;
        }*/
        array2[0]="Rodrigo";
        array2[1]="Katalin";
        array2[2]="Óscar";
        array2[3]="Ricard";
        array2[4]="Jimena";
        array2[5]="Juan";
        array2[6]="Jorge";
        array2[7]="Consuela";
        array2[8]="Irma";
        array2[9]="Nuria";
        array2[10]="Laia";
        array2[11]="Lucila";
        array2[12]="Edelmiro";
        array2[13]="Petri";
        array2[14]="Soledad";
        array2[15]="Felipe";
        array2[16]="Vicente";
        array2[17]="Teodoro";
        array2[18]="Cecilio";
        array2[19]="Feliciano";
        array2[20]="Lorenzo";
        array2[21]="Marcelino";
        array2[22]="Joaquín";
        array2[23]="Jose";
        array2[24]="Aarón";
        array2[25]="Miguel";
        array2[26]="Mauro";
        array2[27]="Victor";
        array2[28]="Rafaela";
        array2[29]="Alfonso";
    }
    
    public String alumnoNotaAlta(float[] array, String[] array2){
        float nota=-1;
        int pos=0;
        for(int i=0;i<array.length;i++){
            //for(int j=0;j<array.length;j++){
                if(array[i]>nota){
                    nota=array[i];
                    pos=i;
                }
            //}
        }
        return array2[pos];
    }
    
    public void ordenarNotas(float[] array, String[] array2){
        float num, num2;
        String nomb, nomb2;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j]>array[i]){
                    num=array[j];
                    num2=array[i];
                    array[i]=num;
                    array[j]=num2;
                    nomb=array2[i];
                   nomb2=array2[j];
                    array2[i]=nomb2;
                    array2[j]=nomb;
                }
            }
        }
    }
    
    /*public void mostrarAprobado(float[] array,String[] array2){
        boolean cont=false;
        String nomb;
        Scanner sc=new Scanner(System.in);
        nomb=sc.nextLine();
        for(int i=0;i<array.length;i++){
            if(array[i]>=5 && nomb.equals(array2[i])){
                cont=true;
                System.out.println("\nAlumno: " + array2[i] + "\nNota: " + array[i]);
                break;
            }
        }
        if(cont==false){
            System.out.println("Alumno no encontrado.");
        }
    }*/
    public void mostrarAprobados(float[] array,String[] array2){
        System.out.println("Alumnos Aprobados:");
        for(int i=0;i<array.length;i++){
            if(array[i]>=5){
                System.out.println("Nombre: " + array2[i] + "\nNota: " + array[i]);
            }
        }
    }
    public void mostrarNota(float[] array, String[] array2){
        Scanner sc=new Scanner(System.in);
        String nomb;
        boolean enc=false;
        nomb=sc.nextLine();
        for(int i=0;i<array2.length;i++){
            if(nomb.equals(array2[i])){
                enc=true;
                System.out.println("Alumno:");
                System.out.println(array2[i] + "\nNota:\n" + array[i]);
                break;
            }
        }
        if(enc==false){
            System.out.println("Alumno no encontrado");
        }
    }
}
