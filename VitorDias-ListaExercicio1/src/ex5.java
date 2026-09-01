import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, peso, imc;
        System.out.println("Digite o altura em metros: ");
        altura = input.nextFloat();
        System.out.println("Digite o peso em kg: ");
        peso = input.nextFloat();
        imc = peso / Math.pow(altura, 2);
        System.out.println("Seu imc é igual a " + imc);

    }
}
