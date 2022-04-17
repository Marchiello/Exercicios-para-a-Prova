/*
Usando o comando switch, escreva um programa que leia um inteiro entre 1 e 7 e
imprima o dia da semana correspondente a esse número. Isto é, domingo, se 1 é
segunda-feira, se 2, e assim por diante.
*/
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira um número a seguir para exibir\no dia da semana equivalente ao mesmo.");
        int dia = entrada.nextInt();
        System.out.println("");
        System.out.println("====================================================\n");
        switch (dia){
            case 1:
                System.out.println("O Número Inserido Equivale ao Dia de: Domingo\n");
                break;
            case 2:
                System.out.println("O Número Inserido Equivale ao Dia de: Segunda-Feira\n");
                break;
            case 3:
                System.out.println("O Número Inserido Equivale ao Dia de: Terça-Feira\n");
                break;
            case 4:
                System.out.println("O Número Inserido Equivale ao Dia de: Quarta-Feira\n");
                break;
            case 5:
                System.out.println("O Número Inserido Equivale ao Dia de: Quinta-Feira\n");
                break;
            case 6:
                System.out.println("O Número Inserido Equivale ao Dia de: Sexta-Feira\n");
                break;
            case 7:
                System.out.println("O Número Inserido Equivale ao Dia de: Sábado\n");
                break;
            default:
                System.out.println("O Número Inserido Não Possui Nenhum Dia Equivalente.");
                break;
        }
        System.out.println("====================================================\n");
        entrada.close();
    }
}
