import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--Calculadora Java--");
        System.out.println("Digite o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scan.nextDouble();
        System.out.println("Selecione: (+, -, *, /)");
        char operator = scan.next().charAt(0);
        scan.close();
        double total = switch (operator) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            default -> 0;
        };

        System.out.println("O número " + n1 + operator + n2 + " é igual a: " + total);
    }
}