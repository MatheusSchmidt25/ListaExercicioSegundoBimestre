/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodepartamento;


public class Empregado {
    private String nome;
    protected double salario;

    public Empregado(String _nome,double _salario) {
        this.nome = _nome;
        this.salario = _salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado " + nome + " tem o salario de " + salario+" reais.";
    }
    
    
}
