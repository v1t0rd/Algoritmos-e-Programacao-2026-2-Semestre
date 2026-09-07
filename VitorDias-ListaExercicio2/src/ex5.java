import java.util.Scanner;
public class ex5 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float celsius, kelvin, fahrenheit ;
        int resposta;

        System.out.println("Digitie a temperatura em ºC: ");
        celsius = input.nextInt();

        System.out.println("Digite 1 para converter em Fahrenheit e 2 para kelvin");
        resposta = input.nextInt();

        if(resposta == 1){
            kelvin = (float) (celsius + 273.15);
            System.out.println(" A temperatura é: " + kelvin + " kelvin");
        }else{
            fahrenheit = (float) (celsius * 1.8 + 32);
            System.out.println("A temperatura é " + fahrenheit + "°F");
        }
    }
}
