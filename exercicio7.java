/*
Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
possui uma taxa diferente de imposto sobre o produto. Faça um programa em que o
usuário entre com o valor e o estado de destino do produto e programa retorne o preço
final do produto acrescido do imposto do estado em que ele será vendido. Se o estado
digitado não for válido, mostrará uma mensagem de erro.
Estado MG SP RJ MS
Imposto 7% 12% 15% 8%
*/
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================================\n");
        System.out.println("Insira um valor:");
        float valor = entrada.nextFloat();
        System.out.println("");
        System.out.println("====================================================\n");
        System.out.println("Insira a Sigla De Um Estado:");
        String estado = entrada.next();
        System.out.println("\n");
        System.out.println("====================================================\n");
        double precofinal;

        switch (estado) {
            case "MG":
                precofinal = valor + (valor*0.07);
                System.out.println("Valor Final: R$"+precofinal+"\n");
                break;
            case "SP":
                precofinal = valor + (valor*0.12);
                System.out.println("Valor Final: R$"+precofinal+"\n");
                break;
            case "RJ":
                precofinal = valor + (valor*0.15);
                System.out.println("Valor Final: R$"+precofinal+"\n");
                break;
            case "MS":
                precofinal = valor + (valor*0.08);
                System.out.println("Valor Final: R$"+precofinal+"\n");

                break;
            default:
                System.out.println("O Estado Inserido É Inválido!"+"\n");
                break;
        }
        System.out.println("====================================================\n");
        entrada.close();
    }
}
