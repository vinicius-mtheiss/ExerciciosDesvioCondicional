import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio01();
        exercicio02();
        exercicio03();
    }

    // 1. Par ou ímpar
    public static void exercicio01() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é ÍMPAR");
        }
    }

    public static void exercicio02() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
    }

    public static void exercicio03() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Número POSITIVO");
        } else if (numero < 0) {
            System.out.println("Número NEGATIVO");
        } else {
            System.out.println("Número ZERO");
        }
    }

    
}