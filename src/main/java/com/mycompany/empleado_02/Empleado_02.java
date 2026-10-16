/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleado_02;

public class Empleado_02 {
         String nombre;
         int horasTrabajadas;
         double costoHoras;
         int sueldo;
         int sueldoAnual;
         int yearincome;
         int horasExtras;
         int totalHorasExtras;
         int calcularIngresos;

        public int calcularImpuesto(){
        var retorno= 0.0;
        if(this.sueldo< 500){
            retorno= 0;
        }else{
            if(this.sueldo <=1000){
                retorno= 0.05*this.sueldo;
            }else{
                if(this.sueldo <= 2000 ){
                    retorno= 0.12*this.sueldo;
                }else{
                   retorno= 0.25*this.sueldo;
                }
            }
        }
        return (int) retorno;
    }
}
