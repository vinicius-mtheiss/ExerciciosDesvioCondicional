import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio01();
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


}