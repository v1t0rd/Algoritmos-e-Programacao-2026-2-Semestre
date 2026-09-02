import java.util.Scanner;
public class estruturas_condicionais4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float compras, desconto, valorfinal;

        System.out.println("digite o valor das suas compras:");
        compras = input.nextFloat();

        if (compras >= 100) {
            desconto = (float) (compras * 0.10);
            valorfinal = compras - desconto;
            System.out.println("10% de desconto adicionado, o valor final é: " + valorfinal);
        } else {
            System.out.println("O valor final é: " + compras);}
} }