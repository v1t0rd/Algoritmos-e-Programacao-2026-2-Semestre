import java.util.Scanner;
public class Ex1{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        if(idade >=18){
            System.out.println("nadador de " + idade + " anos | Categoria adulta. " );
        }else if(idade <= 13) {
            System.out.println("nadador de " + idade + " anos | Categoria infantil.");
        }else{
            System.out.println("nadador de " + idade + " anos | Categoria juvenil.");
        }
    }
}
