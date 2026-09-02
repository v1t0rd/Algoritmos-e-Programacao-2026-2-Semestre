import java.util.Scanner;

public class estruturas_condicionais3{
    static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int nota;

        System.out.println("Digite sua nota de 0 a 10");
        nota = input.nextInt();

        if(nota < 0 || nota > 10){
            System.out.println("nota invalida! ");
        }else if(nota >= 7){
            System.out.println("parabéns, você foi aprovado! ");
        }else if(nota >= 4){
            System.out.println("Você está de recuperação");
        }else{
            System.out.println("Está reprovado, tente novamente ano que vem. ");
        }
    }
}
