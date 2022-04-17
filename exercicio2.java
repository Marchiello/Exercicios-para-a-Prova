/*======================================================[]

2. Faça um programa calculadoras com as seguintes operações:
    Soma
    Subtrair
    Multiplicar
    Dividir

========================================================[]*/

import java.util.Scanner;

public class exercicio2{

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int repet = 1;

        while (repet == 1){
        float resultado = 0;

            System.out.println("================================================\n");
            System.out.println("Insira um Numero a Seguir:");
            float num1 = entrada.nextFloat();
            System.out.println();

            System.out.println("Insira a Operação Desejada:\n");
            char operacao = entrada.next().charAt(0);
            System.out.println("\n");

            System.out.println("Insira outro numero para realizar a operação: ");
            float num2 = entrada.nextFloat();
            System.out.println();
            System.out.println("================================================[]\n");
            if (operacao == '+'){
                resultado = num1 + num2;
            }else if (operacao == '-'){
                resultado = (num1 - num2);
            }else if (operacao == '*'){
                resultado = (num1 * num2);
            }else if (operacao == '/'){
                resultado = (num1 / num2);
            }
            
            System.out.println(resultado+"\n");
            System.out.println("========================================[]");

            System.out.println("Deseja Realizar Uma Nova Conta?\n");
            System.out.println("Se sim, Digite 'S', se Não, Digite 'N'.\n");
            char condicao = entrada.next().charAt(0);
            System.out.println("\n");

            if (condicao == 'N'){
                repet = 0;
            }else if (condicao == 'S'){
            }else{
                System.out.println("Opção Inválida!");
                repet = 0;
            }
            
        
        
        

        }
        entrada.close();

    }
}