import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int idademeses;
        System.out.println("Digite o idade: ");
        idade = input.nextInt();
        idademeses = idade * 12;
        System.out.println("Sua idade em meses é: " + idademeses + " meses.");

    }
}

