/*
Faça um programa que leia um número e, caso ele seja positivo, calcule e mostre:
O número digitado ao quadrado;
A raiz quadrada do número digitado.
*/

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("====================================================\n");
        System.out.println("Insira um Número a Seguir para calcular sua raiz");
        int numero = entrada.nextInt();
        System.out.println("\n");
        System.out.println("====================================================\n");

        double raiz;
        if (numero > 0){
            raiz = Math.sqrt(numero);
            System.out.println("A raiz do número inserido é: "+raiz+"\n");
            System.out.println("====================================================\n");
        }else{
            System.out.println("Não É possivel calcular a raiz do numero inserido!\n");
            System.out.println("====================================================\n");
        }
        entrada.close(); 
    }
    
}
