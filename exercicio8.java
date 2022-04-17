/*
Escreva um programa que, dada a idade de um nadador, o classifique em uma das
seguintes categorias:
Categoria Idade

Infantil A 5-7
Infantil B 8-10
Juvenil A 11-13
Juvenil B 14-17
Sênior maiores de 18 anos
*/


import java.util.Scanner;

public class exercicio8 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira Sua Idade: ");
        int idade = entrada.nextInt();
        System.out.println("\n");
        System.out.println("====================================================\n");
        if (idade <= 7 && idade >= 5 ){
            System.out.println("Categoria: Infantil A\n");
        }else if (idade >= 8 && idade <= 10 ){
            System.out.println("Categoria: Infantil B\n");
        }else if (idade >= 11 && idade <=13){
            System.out.println("Categoria: Juvenil A\n");
        }else if (idade >= 14 && idade <= 17){
            System.out.println("Categoria: Juvenil B\n");
        }else if (idade > 18){
            System.out.println("Categoria Sênior\n");
        }else{
            System.out.println("Novin demais\n");
        }
        System.out.println("====================================================\n");
        entrada.close();
        
    }
}
