import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoDoProuto;
        double precoComDesconto;
        System.out.println("Digite o preço do produto: ");
        precoDoProuto = input.nextDouble();

        precoComDesconto = precoDoProuto * 0.9;
        System.out.println("Preço com desconto de 10% é igual a"+ ' ' + precoComDesconto);


    }
}
