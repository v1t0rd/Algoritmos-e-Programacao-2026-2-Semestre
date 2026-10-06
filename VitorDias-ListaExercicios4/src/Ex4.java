import java.util.Scanner;

public class Ex4 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] dias = {"segunda-feira", "terça-feira", "quarta-feira", "quinta feira", "sexta-feira"};
        float [] totalvendas = new float[dias.length];
        float soma = 0;
        float media = 0;

        for(int i = 0; i < totalvendas.length; i++){
            System.out.println("digite o total de vendas de " + dias[i] + ":");
            totalvendas[i] = input.nextFloat();
            soma += totalvendas[i];
        }
        System.out.println("\n-----Resumo-----");
        System.out.println("Total de vendas de " + dias[0] + ":"+ totalvendas[0]);
        System.out.println("Total de vendas de " + dias[1] + ":"+ totalvendas[1]);
        System.out.println("Total de vendas de " + dias[2] + ":"+ totalvendas[2]);
        System.out.println("Total de vendas de " + dias[3] + ":"+ totalvendas[3]);
        System.out.println("Total de vendas de " + dias[4] + ":"+ totalvendas[4]);
        System.out.println("\nO TOTAL de vendas da semana foi " + soma);
        media = soma / totalvendas.length;
        System.out.println("A média dos valores é: " + media);

        System.out.println("\n Dias abaixo da média");
        for(int i = 0; i < totalvendas.length; i++){
            if( totalvendas[i] < media){
                System.out.println(dias[i] + " ficou " +  (media - totalvendas[i]) + " reais abaixo da média." );
            }
        }
    }
}
