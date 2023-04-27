/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciobanco;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    public int diaRendimento;
    
    public ContaPoupanca(String _cliente, int _numConta, double _saldo){
        super(_cliente, _numConta, _saldo);
    }
    
    public void calcularNovoSaldo(){
        diaRendimento=(int) (saldo*1.07);
        System.out.println("Esse foi seu rendimento do dia "+diaRendimento);
    }
}
