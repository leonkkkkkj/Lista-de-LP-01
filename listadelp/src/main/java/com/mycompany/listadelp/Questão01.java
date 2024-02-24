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
public class Questão01 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, media, rec, mediafinal;
        Scanner
        tex = new             
        
        Scanner(System.in);
                
        System.out.println("Digite a Nota da Primeira Prova: ");
            nota1 = tex.nextFloat();
        System.out.println("Digite a Nota da Segunda Prova: ");    
            nota2 = tex.nextFloat();
        System.out.println("Digite a Nota da Terceira Prova: ");
            nota3 = tex.nextFloat();
         
         media = (nota1+nota2+nota3)/3;
         System.out.println("A sua média é: "+media);
         if (media>=7){
         System.out.println("Você está Aprovado!");
        
        
         }
         else{
             System.out.println("Você está de Recuperação.");
             System.out.println("Digite a Nota da Recuperação: ");
                rec = tex.nextFloat();
             
             mediafinal = (media+rec)/2;
             System.out.println("A sua média após a Recuperação é: "+mediafinal);
             
             if(mediafinal>=7){
             System.out.println("Você está Aprovado!");
             
             }
             else{ 
                 System.out.println("Você foi Reprovado.");
             } 
    }       
} 

}
