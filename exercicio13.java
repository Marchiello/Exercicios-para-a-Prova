/*
Faça um programa para verificar se determinado número inteiro lido é divisível
por 3 ou 5, mas não simultaneamente pelos dois.
*/
import java.util.Scanner;
public class exercicio13 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira um número para verificar se o mesmo é\ndivisivel por 3 ou 5");
        int num = entrada.nextInt();
        System.out.println("\n");
        System.out.println("====================================================\n");
        
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("O Número Inserido É Divisivel por 3 e por 5\n");
        }else if (num % 3 == 0){
            System.out.println("O Número Inserido É Divisivel por 3\n");
        }else if (num % 5 == 0){
            System.out.println("O Número Inserido É Divisivel por 5\n");
        }
        System.out.println("====================================================\n");
        entrada.close();
    }
}
