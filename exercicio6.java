/*
Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
peso ideal, utilizando as seguintes fórmulas (em que “h” corresponde à altura):
Homens: (72,2*h) - 58
Mulheres (62,1*h) - 44,7
*/

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira sua altura:");
        float altura = entrada.nextFloat();
        System.out.println("\n");
        System.out.println("====================================================\n");
        System.out.println("Insira seu Sexo(M para Masculino e F para Feminino): ");
        char sexo = entrada.next().charAt(0);
        System.out.println("\n");
        System.out.println("====================================================\n");
        if (sexo == 'm' | sexo == 'M'){
            double pesoideal = 72.2 *altura - 58;
            System.out.println("Seu peso ideal é "+pesoideal+" Kg\n");
        }else if (sexo == 'f' | sexo == 'F'){
            double pesoideal = 62.1 * altura - 44.7;
            System.out.println("Seu peso ideal é "+pesoideal+" Kg\n");
        }else{
            System.out.println("Escolha M para Mascuino ou F para Feminino!\n");
        }
        System.out.println("====================================================\n");

            entrada.close();
        

    }
}
