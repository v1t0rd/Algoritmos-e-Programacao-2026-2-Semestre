import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario = 0;
        int filhos = 0;
        int cont = 0;
        float somasalario = 0;
        float somafilhos = 0;
        float maiorsalario = 0;
        float menorsalario = 0;
        int contadorsalariomin = 0;
        float salariomin = 0;
        float salariomax = 0;
        String resultado = " ";

        while (true) {
            System.out.println("Digite seu salário.");
            salario = input.nextFloat();
            System.out.println("Digite quantos filhos você possui.");
            filhos = input.nextInt();
            cont++;
            somasalario += salario;
            somafilhos += filhos;

            if (cont == 1) {
                maiorsalario = salario;
                menorsalario = salario;
            } else {
                if (salario > maiorsalario) {
                    maiorsalario = salario;
                }
                if (salario < menorsalario) {
                    menorsalario = salario;
                }
            }
            if (salario <= 1621) {
                contadorsalariomin++;
            }
            while (true) {
                System.out.println("Digite \"sair\" para sair ou \"continuar\" para continuar");
                resultado = input.next();
                if (resultado.equalsIgnoreCase("sair") || resultado.equalsIgnoreCase("continuar")) {
                    break;
                } else {
                    System.out.println("Resposta incorreta tente novamente.");
                }
            }
            if (resultado.equalsIgnoreCase("sair")) {
                break;
            }

        }
        if (cont > 0) {
            System.out.println("\n--- Resumo ---");
            System.out.println("média do salario é igual á:" + somasalario / cont);
            System.out.println("média de números de filhos é " + somafilhos / cont);
            System.out.println(" O maior valor é " + maiorsalario);
            System.out.println(" O menor valor é " + menorsalario);
            System.out.println((contadorsalariomin / cont * 100) + "% recebem até um salário minimo.");
            System.out.println("O salario total da poplação é "+somasalario);
        }
    }
}
