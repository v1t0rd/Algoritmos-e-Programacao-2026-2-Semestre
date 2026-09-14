import java.util.Scanner;
public class Ex2 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c;
        float delta;

        System.out.println("Digite o valor de a:");
        a = input.nextInt();
        System.out.println("Digite o valor de b:");
        b = input.nextInt();
        System.out.println("Digite o valor de c:");
        c = input.nextInt();

        delta = (b*b) - 4*a*c;
        System.out.println("delta = " + delta);



        if (a == 0){
            System.out.println("não se trata de uma equação de segundo grau");
        }else if(delta < 0){
            System.out.println("não existem raízes reais");
        }else if(delta > 0){
            System.out.println("existem duas raízes reais diferentes");
        }else if(delta == 0) {
            System.out.println("existem duas raízes reais iguais");
        }

    }
}