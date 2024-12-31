import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Calculadora");
        System.out.println("***********************");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > 4) {
            System.out.println("Operação inválida. Encerrando o programa.");
        } else {
            System.out.println("Digite o primeiro número");
            int numero1 = scanner.nextInt();
            System.out.println("Digite o segundo número");
            int numero2 = scanner.nextInt();

            int resultado = 0;

            switch (escolha) {

                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado da subtração " + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado da multiplicação " + resultado);
                    break;

                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado da divisão " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }
                    break;
            }
        }
        scanner.close();
    }
}