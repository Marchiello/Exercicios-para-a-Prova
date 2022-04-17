/*
Faça um programa que leia dois números e mostre o maior deles. Se, por acaso, os dois
números forem iguais, imprima a mensagem “Números iguais”.
*/
//-----------------------------------------------------------------------[]

import java.util.Scanner;

public class exercicio3{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("==========================================\n");
        System.out.println("Insira um número a seguir: \n");
        float num1 = entrada.nextFloat();
        System.out.println("");
        System.out.println("Insira novamente, um número \n");
        float num2 = entrada.nextFloat();
        System.out.println("\n");
        System.out.println("==========================================\n");

        if (num1 > num2){
            System.out.println("O número "+num1+" é maior que o número "+num2+".\n");
        }else if (num2 > num1){
            System.out.println("O número "+num2+" é maior que o número "+num1+".\n"); 
        }else
            System.out.println("Os números inseridos são iguais!\n");
        System.out.println("==========================================\n");
        entrada.close();
    }
}