import java.util.Scanner;

public class Ex6Extra {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String senhapredefinda;
        System.out.println("Cadastre sua senha.");
        senhapredefinda= sc.nextLine();

        int tentativas=3;
        String senha = " ";

        while( tentativas >0) {
            System.out.println("insira a senha: ");
            senha = sc.nextLine();
            if (senha.equals(senhapredefinda)) {
                System.out.println("Senha autorizada.");
                break;
            } else {
                tentativas--;
                System.out.println("senha invalida");
            }
        }
            if (tentativas == 0) {
                System.out.println("Tentativas excedidas.");
            }



    }
}