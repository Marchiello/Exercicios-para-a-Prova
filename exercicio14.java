/*
Faça um programa que leia os coeficientes de uma equação do segundo grau. Em
seguida, calcule e mostre as raízes dessa equação, lembrando que as raízes são
calculadas como:

em que Δ = b² − 4 ∗ a ∗ c e ax² + bx + c = 0 representa uma equação do
segundo grau. 

O discriminante (Δ) pode assumir os seguintes valores:
 Se Δ < 0, não existe real. Imprima a mensagem “Não existe raiz”.
 Se Δ = 0, existe uma raiz real. Imprima a mensagem “Raiz única”, realize o
cálculo da raiz e mostre na tela.
 Se Δ > 0, existem duas raízes reais. Calcule e imprima as raízes.
OBS: para calcular a raiz quadrada na linguagem Java utilize a função sqrt da
classe Math.
*/

import java.util.Scanner;
public class exercicio14{
    public static void main(String[]args){
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira o Valor de A: ");
        int a = entrada.nextInt();
        System.out.println("\n");
        System.out.println("Insira o Valor de B: ");
        int b = entrada.nextInt();
        System.out.println("\n");
        System.out.println("Insira o Valor de C: ");
        int c = entrada.nextInt();
        System.out.println("====================================================\n");

        int delta = (int) Math.pow(b, 2)-(4*a*c);
        double x;
        double x1;
        double x2;
        System.out.println(delta);

        if (delta < 0){
            System.out.println("Não Existe Raiz Real\n");
        }else if (delta == 0){
            x = -b/(2*a);
            System.out.println("X = "+x+"\n");
        }else if (delta > 0){
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("X' = "+x1+"\nX''= "+x2+"\n");
        }
        System.out.println("====================================================\n");
        entrada.close();

    }
}
