import java.util.Scanner;
public class Ex1 {
    static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x, funcao;

        System.out.println("Digite o valor de X:");
        x = input.nextInt();

        if (x <= 1) {
            funcao = 1;
            System.out.println("O valor de F(x) = " + funcao);
        }else if (x>1 && x <=2){
            funcao = 2;
            System.out.println("O valor de F(x) = " + funcao);
        }else if (x>2 && x <=3){
            funcao = x*x;
            System.out.println("O valor de F(x) = x²");
        }else if (x>3) {
            funcao = x*x*x;
            System.out.println("O valor de F(x) = x³");
        }
    }
}