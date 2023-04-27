/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciobanco;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    public String cliente;
    public int numConta;
    public double saldo;

    public ContaBancaria(String _cliente, int _numConta, double _saldo) {
        this.cliente = _cliente;
        this.numConta = _numConta;
        this.saldo = _saldo;
    }
    
    
    public double sacar;
    public double novoSaldo;
    public void sacar(){
       
        Scanner ler = new Scanner(System.in);
        System.out.println("Quanto voce gostaria de sacar:");
        sacar = ler.nextDouble();
        novoSaldo=saldo-sacar;
        System.out.println("Seu novo saldo é de "+novoSaldo);
        
    }
    public double depositar;
    public void depositar(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Quanto voce gostaria de depositar");
        depositar = ler.nextDouble();
        novoSaldo=novoSaldo+depositar;
        System.out.println("Seu novo saldo é "+novoSaldo);
        
    }
    
    public String toString(){
        return "Nome: " +cliente+"\nNumero da conta: "+numConta+"\nSaldo: "+saldo;
    }

   
}
