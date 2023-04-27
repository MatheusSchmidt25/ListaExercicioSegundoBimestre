/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciodepartamento;

/**
 *
 * @author aluno
 */
public class ExercicioDepartamento {

    public static void main(String[] args) {
        Empregado em = new Empregado("Matheus",2000);
        System.out.println(em);
        Gerente ge = new Gerente("Lucas",5000,"Desenvolvedor");
        System.out.println(ge);
        Vendedor ve = new Vendedor("Daniel",3500,6.0);
        System.out.println(ve);
    }
}
