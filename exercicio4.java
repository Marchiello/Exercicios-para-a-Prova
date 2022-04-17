/*
Faça um programa que leia o salário de um trabalhador e o valor da prestação de um
empréstimo. Se a prestação:
For maior que 20% do salário, imprima: “Empréstimo não concedido;
Caso contrário, imprima: “Empréstimo concedido”
*/
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("==========================================\n");
        System.out.println("Insira a seguir, seu Salário\n");
        float salario = entrada.nextFloat();
        System.out.println("\n");
        System.out.println("Insira a Seguir, O Valor do Impréstimo Desejado\n");
        float imprestimo = entrada.nextFloat();
        System.out.println("\n");
        System.out.println("==========================================\n");


        if (imprestimo > 0.2*salario){
            System.out.println("Impréstimo Não Concedido\n");
        }else{
            System.out.println("Impréstimo Concedido!\n");
        }
        System.out.println("==========================================\n");

        entrada.close();
    }
}
