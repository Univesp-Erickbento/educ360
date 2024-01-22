import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, resultado = 0;
        char operacao;

        System.out.println("===============================================");
        System.out.println("Seja Bem Vindo ao nosso Sistema de Calculadora!");
        System.out.println("===============================================");

        System.out.println("Digite um Numero");
        valor1 = input.nextInt();

        System.out.println("Digite outro Numero");
        valor2 = input.nextInt();

        System.out.println("Qual Operção você quer Realizar?");

        System.out.println("Digite + para Soma");
        System.out.println("Digite - para Subtração");
        System.out.println("Digite * para Multiplicação");
        System.out.println("Digite / para Divisão");

        operacao = input.next().charAt(0);

        if (operacao == '+'){
            resultado = valor1 + valor2;
            System.out.println("Você Escolheu a Operação de Soma");
        }else if (operacao == '-') {
            resultado = valor1 - valor2;
            System.out.println("Você Escolheu a Operação de Subtração");
        }else if (operacao == '*') {
            resultado = valor1 * valor2;
            System.out.println("Você Escolheu a Operação de Multiplicação");
        }else if (operacao == '/') {
            resultado = valor1 / valor2;
            System.out.println("Você Escolheu a Operação de Divisão");
        }else {
            System.out.println("Você Escolheu uma Opção Inválida");
            return;

        }

        System.out.println("ENTÂO");
        System.out.println(valor1 + " " + operacao+" " + valor2 + " = " +resultado);
    }

}