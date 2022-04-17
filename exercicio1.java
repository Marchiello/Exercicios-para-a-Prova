/*=====================================================
1. Faça um programa que receba via teclado os dados de um produto. Os dados que
representam o produto estão listados abaixo:
Nome (String);
Modelo (String);
Tamanho (sendo float);
Preço (sendo double);
Quantidade (int).
-------------------------------------------------------*/

import java.util.Scanner;

public class exercicio1{

    public static void main(String[]args){

//-------------------[Definindo Variáveis/Entrada]-------------------[]

        Scanner entrada = new Scanner(System.in);

        System.out.println("==============================================\n");
        System.out.println("Insira o Nome do Produto:");
        String nome = entrada.nextLine();

        System.out.println();
        System.out.println("Insira o Modelo do Produto:");
        String modelo = entrada.nextLine();

        System.out.println();
        System.out.println("Insira o Tamanho do Produto:");
        float tamanho = entrada.nextFloat();

        System.out.println();
        System.out.println("Insira o Preço do Produto:");;
        double preco = entrada.nextDouble();

        System.out.println();
        System.out.println("Insira a Quantidade do Produto:");
        int quantidade = entrada.nextInt();
        System.out.println();
//------------------------------------------------------------[]



//-----------------------[Saida]------------------------------[]

        System.out.println("==============================================");
        System.out.println("    Dados do Produto:\n");
        System.out.println("Nome: "+nome);
        System.out.println("Modelo: "+modelo);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Preço: R$"+preco);
        System.out.println("Quantidade: "+quantidade+"\n");
        System.out.println("==============================================");

//------------------------------------------------------------[]

        entrada.close();

    }
}