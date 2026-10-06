import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float soma = 0;
        float media = 0;
        String [] dias = {"segunda-feira", "terça-feira", "quarta-feira", "quinta feira", "sexta-feira"};
        float [] temperaturas = new float[5];
        System.out.println("Digite a temperatura de segunda-feira: ");
        temperaturas[0] = input.nextFloat();
        System.out.println("Digite a temperatura de terça-feira: ");
        temperaturas[1] = input.nextFloat();
        System.out.println("Digite a temperatura de quarta-feira: ");
        temperaturas[2] = input.nextFloat();
        System.out.println("Digite a temperatura de quinta-feira: ");
        temperaturas[3] = input.nextFloat();
        System.out.println("Digite a temperatura de sexta-feira: ");
        temperaturas[4] = input.nextFloat();
        for (int i =0; i<temperaturas.length; i++){
             soma += temperaturas[i];
        }
        media = soma/temperaturas.length;
        System.out.println("A média da temperatura de segunda a sexta é: " + media );

        System.out.println("\n Dias acima da média");
        for (int i =0; i<temperaturas.length; i++){
            if (temperaturas[i]>media){
                System.out.println(dias[i] + " acima da média " + temperaturas[i]+"ºC");
            }
        }



    }
}
