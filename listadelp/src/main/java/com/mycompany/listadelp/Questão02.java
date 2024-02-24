/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadelp;

import java.util.Scanner;

/**
 *
 * @author Nicolas Leon
 */
public class Questão02 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int livro;
            double A, B;
            
            System.out.println("Digite a quantidade de Livros: ");
                livro = teclado.nextInt();
            
                A = (0.25*livro)+7.5;
                B = (0.50*livro)+2.5;
                
            System.out.println("Opção A: " +A+ "\nOpção B: " +B);
            
            if(A<B){
                System.out.println("A opção A é a melhor.");
            }
            if(B<A){
                System.out.println("A opção B é a melhor.");
            }    
            if(B==A){
                System.out.println("As duas opções são viáveis");
            }
    }
}

    

