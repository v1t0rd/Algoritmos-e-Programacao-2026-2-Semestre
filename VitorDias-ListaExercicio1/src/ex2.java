import java.util.Scanner;

public class ex2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        int resultado;
        int media;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = input.nextInt();
        resultado = num1+num2+num3;
        System.out.println("Resultado: "+resultado);
        media = resultado/3;
        System.out.println("Media: "+media);



    }
}
