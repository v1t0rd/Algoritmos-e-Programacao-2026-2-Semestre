import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doações do dia");
        int doacoes = 0;
        double maiorvalor = 0;
        double menorvalor = 0;
        double totalvalor = 0;
        int contador = 0;
        System.out.println("Digite a flag (-1) para parar o calculo");

        while (true) {
            System.out.println("Digite a quantidade doada");
            doacoes = input.nextInt();

            if (doacoes == -1) {
                break;
            }

            totalvalor += doacoes;
            contador++;

            if (contador == 1) {
                maiorvalor = doacoes;
                menorvalor = doacoes;
            } else {
                if (doacoes > maiorvalor) {
                    maiorvalor = doacoes;
                }
                if (doacoes < menorvalor) {
                    menorvalor = doacoes;
                }
            }
        }
        if (contador > 0) {
            System.out.println("\n ------Resumo------");
            System.out.println("total de doações recebidas: " + contador);
            System.out.println("Valor Total arrecadado: " + totalvalor);
            System.out.println("maior do valor: " + maiorvalor);
            System.out.println("menor do valor: " + menorvalor);
        } else {
            System.out.println("nenhuma doação foi registrada hoje");
        }

    }


}




