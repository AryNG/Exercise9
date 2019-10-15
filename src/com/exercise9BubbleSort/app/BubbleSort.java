package com.exercise9BubbleSort.app;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		//Metodos de ordenamiento generados a base de numeros pseudo aleatorios. 
		final int elements =100;
		
		int temp=0;
		
		//Arrays
		int[] disorderedA= new int [elements];
		int[] orderedA= new int [elements];
		
		//random
		Random random = new Random(System.nanoTime());
		
		//poblar de datos
		for (int i=0;i<elements;i++) {
			disorderedA[i]= random.nextInt(100);
		}
	for (int i=0;i<elements;i++) {
		for (int j=0; j<elements-1;j++) {
			if (disorderedA[j]<disorderedA[j+1]) {
				temp = disorderedA[j+1];
				disorderedA[j+1] = disorderedA[j];
				disorderedA[j] = temp;
			}
		}
	}		
		
		//Esto es para poder mostrarlo en pantalla
		System.out.println("Vector desordenado");
		for (int i=0;i<elements;i++) {
			System.out.print(disorderedA[i]+" ");


	}
	}
}
/* for (int i=0; i<elementos;i++){
 * for (int j=0; j<elementos-1; j++){
 * if (condicion necesaria) esto es la base de todos los metodos de ordenamientos
 * if (vector[j] >vector[j+1]){
 *  temp= v[j+1];
 *  v[j+1] = v[j];
 *  v[j] = temp;*/
