/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciobanco;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {
    public double limite;
    
    public ContaEspecial (String _cliente, int _numConta, double _saldo, double _limite){
        super (_cliente, _numConta, _saldo);
        this.limite=_limite;
    }
    
    public void sacar(){
        System.out.println("Esse é seu saldo "+saldo);
        
    }
}
