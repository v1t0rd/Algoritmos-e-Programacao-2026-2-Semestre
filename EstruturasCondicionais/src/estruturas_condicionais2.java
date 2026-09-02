import java.util.Scanner;

public class estruturas_condicionais2 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade");
        idade = input.nextInt();

        if(idade >= 18) {
            System.out.println("Você é maior de idade, acesso liberado");
        }else{
            System.out.println("Você é menor de idade, acesso negado");




        }
    }
}
