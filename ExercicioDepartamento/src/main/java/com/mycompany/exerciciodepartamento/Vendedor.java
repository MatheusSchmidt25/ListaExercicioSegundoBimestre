/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodepartamento;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado{
    private double comissao;
    public Vendedor(String _nome, double _salario, double _comissao){
        super(_nome,_salario);
        this.comissao=_comissao;
    }
    
    public void setPercentualComissao(double percentualComissao) {
        this.comissao = percentualComissao;
    }

    public double calcularSalario() {
        return salario + (salario * (comissao / 100));
    }

    @Override
    public String toString() {
        return "O nome do vendedor é "+this.getNome()+", seu salario sem comissão é de "+salario+ ", seu salario com comissão é "+calcularSalario()+", e seu percentual da comissão é "+comissao+" %";
    }
    
    
    
}
