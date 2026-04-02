import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*exercicio01();
        exercicio02();
        exercicio03();
        exercicio04();
        exercicio05();
        exercicio06();
        exercicio07();
        exercicio08();
        exercicio09();
        exercicio10();*/
        exercicio11();
        
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

    public static void exercicio04() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void exercicio05() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }

    public static void exercicio06() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);
    }

    public static void exercicio07() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 10): ");
        int nota = sc.nextInt();

        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota <= 6) {
            System.out.println("Regular");
        } else if (nota <= 8) {
            System.out.println("Bom");
        } else if (nota <= 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Nota inválida");
        }
    }

    public static void exercicio08() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        int a = sc.nextInt();

        System.out.print("Digite o lado 2: ");
        int b = sc.nextInt();

        System.out.print("Digite o lado 3: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Formam um triângulo válido");
        } else {
            System.out.println("NÃO formam um triângulo");
        }
    }

    public static void exercicio09() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        int a = sc.nextInt();

        System.out.print("Digite o lado 2: ");
        int b = sc.nextInt();

        System.out.print("Digite o lado 3: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }

    public static void exercicio10() {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }

    public static void exercicio11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}