import java.util.Scanner;
import java.util.ArrayList;
public class Ex6 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerosecreto = 77;
        int tentativas = 0;
        ArrayList<Integer> palpites = new ArrayList<>();

        System.out.println("Tente adivinhar o número secreto! ");
        System.out.println("Digite um número inteiro (-1 para desistir)");

        int inputusuario = input.nextInt();

        while (inputusuario != -1){
            palpites.add(inputusuario);
            if (inputusuario > numerosecreto){
                System.out.println("Dica: O número secreto é menor");
                tentativas++;
            }else if (inputusuario < numerosecreto){
                System.out.println("Dica: O número secreto é maior");
                tentativas++;
            }else if (inputusuario == numerosecreto){
                tentativas++;
                System.out.println("Meus parabéns você acertou!");
                break;
            }

            inputusuario = input.nextInt();

        }
        System.out.println(tentativas + " tentativas.");
        System.out.println("Seus palpites foram os seguintes" + palpites);

    }
}
