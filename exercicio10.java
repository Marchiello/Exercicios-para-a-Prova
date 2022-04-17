/*
Faça um programa que leia três números inteiros positivos e efetue o cálculo de
uma das seguintes médias de acordo com um valor numérico digitado pelo usuário
na tabela a seguir.

Número digitado Média
1 Geométrica:
x*y*z
2 Ponderada:
x+2*y+3*z6
3 Aritmética:
x+y+z3
*/

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("A Seguir, Insira um valor para X:");
        int x = entrada.nextInt();
        System.out.println("\n");
        System.out.println("Agora, Insira Um valor para Y: ");
        int y = entrada.nextInt();
        System.out.println("\n");
        System.out.println("Por fim, Insira um valor para Z: ");
        int z = entrada.nextInt();
        System.out.println("\n");
        System.out.println("Insira um número para efetuar uma forma de calculo: ");
        int operacao = entrada.nextInt();
        System.out.println("\n");
        System.out.println("====================================================\n");
        int resultado;

        switch (operacao) {
            case 1:
                resultado = x*y*z;
                System.out.println("Resultado = "+resultado+"\n");
                break;
            case 2:
                resultado = x+2*y+3*z*6;
                System.out.println("Resultado = "+resultado+"\n");

                break;
            case 3:
                resultado = x+y+z*3;
                System.out.println("Resultado = "+resultado+"\n");
                break;
            default:
                System.out.println("A operação Inserida é inválida!\n");
                break;
        }
        System.out.println("====================================================\n");

        entrada.close();
    }
}
