import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String [] caixas = {"Caixa 1",  "Caixa 2", "Caixa 3", "Caixa 4", "Caixa 5", "caixa 6"};
       float pesoref=0;
       float [] peso = new float[caixas.length];
       int contador = 0;

        System.out.println("Primeiramente, insira um peso em KG de referencia por favor: ");
        pesoref = input.nextFloat();

       for (int i = 0; i < peso.length; i++) {
           System.out.println("Digite o peso em da " + caixas[i] + ": ");
           peso[i] = input.nextFloat();
           if (peso[i] == pesoref) {
               contador++;
           }
       }

       if (contador == 0){
           System.out.println("Valor não localizado na amostragem.");
           }else{
           System.out.println(" O peso de referencia apareceu " + contador + " vezes");
       }

    }
}
