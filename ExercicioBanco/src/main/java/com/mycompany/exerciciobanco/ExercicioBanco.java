/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciobanco;

/**
 *
 * @author aluno
 */
public class ExercicioBanco {
    public static void main(String[]args){
    ContaBancaria  cBa = new ContaBancaria("Julia",10,2000);
    System.out.println(cBa);
    cBa.sacar();
    cBa.depositar();
    ContaPoupanca cPo = new ContaPoupanca("Pedro",20,5000);
    cPo.calcularNovoSaldo();
    
    }
}
