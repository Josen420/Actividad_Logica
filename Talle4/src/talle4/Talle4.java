/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talle4;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class Talle4 {

    /**
     * Realizar un programaque calcule el valor a pagar por algunos galones de 
     * gasolina si sabemos que cada litro de gasolina vale 9.500.Imprimir la 
     * cantidad de galones, precio por galón, cantidad de litros y 
     * precio a pagar.DT:CANTIDAD DE GALONES DE GASOLINA 
 DS:CANTIDAD DE GALONES, PRECIO DEL GALON, CANTIDAD DE LITROS Y PRECIO A
 PAGAR
     * @param args
     */
    
    public static void main(String[] args) {
        float cantgalon;
        float litros; 
        float precio;
        float precioGalon;
        
        Scanner read = new Scanner(System.in); 
        System.out.println("Introduzca los galones de gasolina");
        cantgalon = read.nextFloat();
        litros = (float) (cantgalon * 3.7854);
        precio = litros * 9500; 
        precioGalon = (float) ( 9500 / 0.264172);
       
        System.out.println("La cantidad de galones es:"+cantgalon);
        System.out.println("El precio por galon es:"+precioGalon);
        System.out.println("La cantidad de litros es:"+litros);
        System.out.println("El total a pagar es:"+precio);
    }   
    
}
