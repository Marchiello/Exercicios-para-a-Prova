/*
Faça um programa que informe o mês de acordo com o número digitado pelo
usuário. Exemplo: Entrada = 4. Saída = abril.
*/
import java.util.Scanner;
public class exercicio11 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("====================================================\n");
        System.out.println("Insira um número a seguir para exibir\nSeu Mês Equivalente");
        int mes = entrada.nextInt();
        System.out.println("\n");
        System.out.println("====================================================\n");
        switch (mes) {
            case 1:
                System.out.println("O Número Inserido Equivale ao Mês De: Janeiro\n");
                break;
            case 2:
                System.out.println("O Número Inserido Equivale ao Mês De: Fevereiro\n");
                break;
            case 3:
                System.out.println("O Número Inserido Equivale ao Mês De: Março\n");
                break;
            case 4:
                System.out.println("O Número Inserido Equivale ao Mês De: Abril\n");
                break;
            case 5:
                System.out.println("O Número Inserido Equivale ao Mês De: Maio\n");
                break;
            case 6:
                System.out.println("O Número Inserido Equivale ao Mês De: Junho\n");
                break;
            case 7:
                System.out.println("O Número Inserido Equivale ao Mês De: Julho\n");
                break;
            case 8:
                System.out.println("O Número Inserido Equivale ao Mês De: Agosto\n");
                break;
            case 9:
                System.out.println("O Número Inserido Equivale ao Mês De: Setembro\n");
                break;
            case 10:
                System.out.println("O Número Inserido Equivale ao Mês De: Outubro\n");
                break;
            case 11:
                System.out.println("O Número Inserido Equivale ao Mês De: Novembro\n");
                break;
            case 12:
                System.out.println("O Número Inserido Equivale ao Mês De: Dezembro\n");
                break;
            default:
                System.out.println("Não Existe Mês Equivalente a Esse Numero!\n");
                break;
        }
        System.out.println("====================================================\n");
        entrada.close();
    }
}
