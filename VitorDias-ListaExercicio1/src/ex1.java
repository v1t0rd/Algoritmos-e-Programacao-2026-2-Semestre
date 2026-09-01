import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double num;
        double resultado;
        System.out.println("Digite um numero real: ");
        num = input.nextDouble();
        resultado = num * 2;
        System.out.println("O dobro é " +  resultado);

    }
}
