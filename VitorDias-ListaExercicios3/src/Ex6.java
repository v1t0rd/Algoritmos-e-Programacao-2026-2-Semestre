import java.util.Scanner;

public class Ex6 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int senhapredefinda=0;
        System.out.println("Cadastre sua senha.");
        senhapredefinda= sc.nextInt();

        int tentativas=3;
        int senha = 0;

        while(senha != senhapredefinda && tentativas >0) {
            System.out.println("insira a senha: ");
            senha = sc.nextInt();
            tentativas--;
            System.out.println("Senha invalida\n" + "Tentativas restantes: " + tentativas);
            if (tentativas == 0) {
                System.out.println("Tentativas excedidas!");
                break;
            }
        }
        if (senha == senhapredefinda) {
            System.out.println("Senha autorizada!");
        }



    }
}
