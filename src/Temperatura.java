import java.util.Scanner;

import java.text.DecimalFormat;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        System.out.println("Digite a temperatura em graus celsius: ");
        double grausCelsius = scan.nextDouble();
        System.out.println("Graus Celsius: " + df.format(grausCelsius) + "ºC");
        double fahrenheit = (grausCelsius * 9/5) + 32;
        System.out.println("Graus Fahremheit: " + fahrenheit + "ºF");
    }
}
