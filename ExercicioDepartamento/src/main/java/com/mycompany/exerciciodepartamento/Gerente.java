/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodepartamento;

/**
 *
 * @author aluno
 */
public class Gerente extends Empregado {
    public String departamento;
    public Gerente(String _nome, double _salario, String _departamento){
        super(_nome,_salario);
        this.departamento=_departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "O gerente "+this.getNome()+" tem o salario de "+salario+", ele é do departamento "+departamento;
    }
    
}
