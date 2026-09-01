import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salarioatual, percentual, aumento, salariofinal;
        System.out.println("Digite seu salário atual: ");
        salarioatual = input.nextFloat();
        System.out.println("Digite seu percentual de aumento (exemplo: 0,10): ");
        percentual = input.nextFloat();
        aumento = salarioatual * percentual;
        salariofinal = salarioatual + aumento;
        System.out.println("Seu salário final é "+salariofinal);
    }
}
