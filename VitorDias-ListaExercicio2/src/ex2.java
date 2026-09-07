import java.util.Scanner;

public class ex2 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double valorTotal;

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double kwh = input.nextDouble();

        if (kwh <= 100) {
            valorTotal = kwh * 0.50;
        } else if (kwh <= 200) {
            valorTotal = kwh * 0.70;
        } else {
            valorTotal = kwh * 0.90;
        }
        System.out.printf("Valor total da conta: R$ %.2f\n", valorTotal);
    }
}
