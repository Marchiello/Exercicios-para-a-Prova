/*
Faça um programa que leia a altura e o peso de uma pessoa. De acordo com a tabela
a seguir, verifique e mostre qual a classificação dessa pessoa.

Altura

Peso

Até 60 Entre 60-90 (inclusive) Acima de 90
Menor do que 1,20 A D G
1,20-1,70 B E H
Maior do que 1,70 C F I
*/

import java.util.Scanner;
public class exercicio9 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira sua Altura em Centimetros:");
        int altura = entrada.nextInt();
        System.out.println("\n");
        System.out.println("Agora, Insira seu Peso em KG: ");
        float peso = entrada.nextFloat();
        System.out.println("\n");
        System.out.println("====================================================\n");
        if (altura < 120){
            if (peso <= 60){
                System.out.println("Você pertence ao grupo A.\n");
            }else if (peso >60 && peso <= 90){
                System.out.println("Você pertence ao grupo D.\n");
            }else if (peso >90){
                System.out.println("Você pertence ao grupo G\n");
            }
        }else if (altura >= 120 && altura <= 170){
            if (peso <= 60){
                System.out.println("Você pertence ao grupo B.\n");
            }else if (peso >60 && peso <= 90){
                System.out.println("Você pertence ao grupo E.\n");
            }else if (peso >90){
                System.out.println("Você pertence ao grupo H\n");
            }
        }else if (altura > 170){
            if (peso <= 60){
                System.out.println("Você pertence ao grupo C.\n");
            }else if (peso >60 && peso <= 90){
                System.out.println("Você pertence ao grupo F.\n");
            }else if (peso >90){
                System.out.println("Você pertence ao grupo I\n");
            }
        }
        System.out.println("====================================================\n");
        entrada.close();
         
    }
    
}
