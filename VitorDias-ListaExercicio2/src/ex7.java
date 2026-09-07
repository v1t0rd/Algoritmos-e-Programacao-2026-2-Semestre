import java.util.Scanner;
public class ex7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float renda, prestacaomax , prestacaodesejada, total;

        System.out.println("digite sua renda mensal:");
        renda = input.nextFloat();
        System.out.println("Digite o valor da prestação mensal desejada: ");
        prestacaodesejada = input.nextFloat();

        prestacaomax = (float) (renda * 0.30) + renda;

        if (prestacaodesejada > prestacaomax){
            System.out.println("Financiamento negado por alta prestação");
        }else if(prestacaodesejada > 3000 & renda < 10000){
            System.out.println("Financiamento negado por baixa renda");
        }else{
            System.out.println("Financiamento aprovado");
        }


    }
}