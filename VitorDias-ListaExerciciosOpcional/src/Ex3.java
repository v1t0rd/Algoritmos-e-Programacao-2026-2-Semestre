import java.util.Scanner;
public class Ex3 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int idade;
        float peso;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite sua peso em kg: ");
        peso = input.nextFloat();

        if (idade >= 12 && peso >= 60){
            System.out.println("Tome 1000 mg (40 gotas)");
        }else if (idade >= 12 && peso <= 60){
            System.out.println("Tome 875 mg (35 gotas)");

        }

        if (idade <= 12 && peso >= 5 && peso <= 9){
            System.out.println("Tome 125 mg (5 gotas)");
        }else if (idade <= 12 && peso >= 9.1 && peso <= 16){
            System.out.println("Tome 250 mg (10 gotas)");
        }else if (idade <= 12 && peso >= 16.1 && peso <= 24){
            System.out.println("Tome 375 mg (15 gotas)");
        }else if (idade <= 12 && peso >= 24.1 && peso <= 30) {
            System.out.println("Tome 500 mg (20 gotas)");
        }else if (idade <= 12 && peso >= 30.1){
            System.out.println("Tome 750 mg (30 gotas)");
        }

    }
}
