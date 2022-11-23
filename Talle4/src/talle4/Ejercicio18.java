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
public class Ejercicio18 {

    /**
     * Realizar un algoritmo que calcule el salarioa pagarde un 
     * empleado según los siguientes parámetros:
     * DE: Salario
     * DS: Salario con los descuentos aplicados 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float salario; 
        float salarioPension;
        float salarioSalud;
        float salarioTrans;
        float salarioFinal;
        float salarioVida;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Dijite el salario del empleado");
        salario = read.nextInt();
        if (salario<700000){
            salarioPension = (float) (salario * 0.02);
            salarioSalud = (float) (salario * 0.04);
            salarioTrans = (float) (salario * 0.11);
            salarioFinal = salario - salarioPension - salarioSalud + salarioTrans;
            System.out.println("El Salario final es:"+ salarioFinal);
       }else{
            if ((salario>=741000)&&(salario<=999999)){
            salarioPension = (float) (salario * 0.04);
            salarioSalud = (float) (salario * 0.06);
            salarioTrans = (float) (salario * 0.09);
            salarioFinal = salario - salarioPension - salarioSalud + salarioTrans;
            System.out.println("El Salario final es:"+ salarioFinal);
        }else{
            if ((salario>=1000000)&&(salario<=1800000)){
            salarioPension = (float) (salario * 0.06);
            salarioVida = (float) (salario * 0.05);
            salarioSalud = (float) (salario * 0.06);
            salarioTrans = (float) (salario * 0.09);
            salarioFinal = salario - salarioPension - salarioVida - salarioSalud + salarioTrans;
            System.out.println("El Salario final es:"+ salarioFinal);
     
            }else{
            if ((salario>180000)&&(salario<=2500000)){
            salarioPension = (float) (salario * 0.06);
            salarioVida = (float) (salario * 0.05);
            salarioSalud = (float) (salario * 0.08);
            salarioTrans = (float) (salario * 0.08);
            salarioFinal = salario - salarioPension - salarioVida - salarioSalud + salarioTrans;
            System.out.println("El Salario final es:"+ salarioFinal);
            }else{
            if (salario>2500000){
            salarioPension = (float) (salario * 0.08);
            salarioVida = (float) (salario * 0.06);
            salarioSalud = (float) (salario * 0.1);
            salarioTrans = (float) (salario * 0.09);
            salarioFinal = salario - salarioPension - salarioVida - salarioSalud + salarioTrans;
            System.out.println("El Salario final es:"+ salarioFinal);
        }
        }
    }
            
            }
    }
    }
}