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
public class Questão04 {
        public static void main(String[] args) {
            int cont = 0, num;
            Scanner teclado = new Scanner(System.in);
            
        System.out.println("Digite um número maior que 0: ");   
            num = teclado.nextInt();
            
        if(num == 0){
            cont = 1;
        }    
        else{
            while(num > 0){
                num /= 10;
                cont++;
            }
        }
            System.out.println("A quantidade de digitos desse número é: " + cont);
    }
}


