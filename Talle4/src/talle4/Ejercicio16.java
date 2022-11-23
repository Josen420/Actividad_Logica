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
public class Ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuántogana 
     * semanalmente y mensualmente, si el trabajador debe trabajar mínimo 38h 
     * semanales y un máximo de 56h.Se debe pedir la cantidad de horas 
 trabajadas y verificar que esté dentro del rango permitido, también se 
 debe pedir el precio de la hora.  Imprimir la cantidad de horas 
 trabajadas y el pago.
 
 DE:Numero de horas trabajadas y valor de la hora 
 DS: Cantidad de horas tranajadas y pago 
     * @param args
     */
    public static void main(String[] args) {
       
        int horasSemana;
        float precioHora;
        int horasMensuales; 
        float pagoMes;
   
        
         Scanner read = new Scanner(System.in);
        System.out.println("Dijite numero de horas trabajadas en la semana");
        horasSemana = read.nextInt();
        Scanner leer = new Scanner(System.in);
        System.out.println("Dijite precio de la hora trabajada");
        precioHora = leer.nextFloat();
        if ((horasSemana>=38) && (horasSemana<=56)){
            System.out.println("El empleado trabajo en la semana:"+horasSemana);
            horasMensuales = horasSemana * 4;
            System.out.println("El empleado trabajo en el mes:"+horasMensuales);
            precioHora = horasSemana * precioHora;
            System.out.println("Se le debe pagar al empleado por la semana:"+precioHora);
            pagoMes = horasMensuales * precioHora;
            System.out.println("Se le debe pagar al empleado por el mes:"+ pagoMes);
            
        
    }else {
            System.out.println("No es valido el numero de horas");
           
    }
  } 
}

