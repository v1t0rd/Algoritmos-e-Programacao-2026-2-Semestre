import java.util.Scanner;

public class AnaliseDeNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int soma = 0;
    int[]notas = new int[5];
        System.out.println();
    for (int i=0; i< notas.length; i++){
        System.out.println("Digite a nota " + (i+1) + "(de 0 a 20)");
        notas[i]= input.nextByte();
        soma += notas[i];
    }
    for (int i=0; i< notas.length; i++){
        System.out.println("\n notas" + (i+1) + " | " + notas[i]);
    }
    int media = soma/5;
    System.out.println("\n A média é " + media);

    for (int i=0; i< notas.length; i++) {
        System.out.println("\n" + notas[i]);
        if (notas[i] > media) {
            System.out.println("Parabéns você está acima da média!");
        }
        if (notas[i] < media) {

            System.out.println("Estude mais está abaixo da média");
        }
    }
        int maior = notas[0];
        int menor = notas[0];

        for (int i=0; i< notas.length; i++){
            if (notas[i] > maior){
                maior = notas[i];
            }
            if (notas[i] < menor){
                menor = notas[i];
            }

        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}
