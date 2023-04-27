/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioingrasso;

/**
 *
 * @author aluno
 */
public class ExercicioIngrasso{

    public static void main(String[] args) {
        IngressoVIP vip = new IngressoVIP(20);
        Ingresso ing = new Ingresso(40);
        System.out.println("O valor do ingresso VIP é "+(ing.valor + vip.valorAdicional));
        System.out.println("O valor do ingresso normal é "+ing.valor);
    }
}
