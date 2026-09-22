
import java.util.Scanner;

public class Ex7 {
    public void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double notas = 999;
        int soma=0 ;
        double contador = 0;
        System.out.println("bem vindo ao: Acumulador e cálculo de média\n" + "para encerrar digite a flag (-1).");
        while (true) {
            System.out.print("Digite a nota: ");
            notas = input.nextDouble();

            if (notas == -1) {
                break;
            }
            soma += notas;
            contador++;
        }
            if (contador >0) {
                double media = soma/contador;
                System.out.println("A soma é " + soma);
                System.out.println("A médoa é " + media);
            }else{
                System.out.println("nenhuma nota valida foi inserida");
            }




    }
}
