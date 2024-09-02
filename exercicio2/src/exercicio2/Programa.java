package exercicio2;

import java.util.Scanner;

public class Programa {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Calculadora calculadora = new Calculadora();
     boolean continuar = true;

     while (continuar) {
         System.out.println("Escolha a operação desejada:");
         System.out.println("1. Adição");
         System.out.println("2. Subtração");
         System.out.println("3. Multiplicação");
         System.out.println("4. Divisão");
         System.out.print("Digite o número da operação: ");
         int opcao = scanner.nextInt();

         System.out.print("Digite o primeiro número: ");
         double num1 = scanner.nextDouble();
         System.out.print("Digite o segundo número: ");
         double num2 = scanner.nextDouble();

         double resultado = 0;
         switch (opcao) {
             case 1:
                 resultado = calculadora.adicionar(num1, num2);
                 System.out.printf("Resultado da adição: %.2f%n", resultado);
                 break;
             case 2:
                 resultado = calculadora.subtrair(num1, num2);
                 System.out.printf("Resultado da subtração: %.2f%n", resultado);
                 break;
             case 3:
                 resultado = calculadora.multiplicar(num1, num2);
                 System.out.printf("Resultado da multiplicação: %.2f%n", resultado);
                 break;
             case 4:
                 try {
                     resultado = calculadora.dividir(num1, num2);
                     System.out.printf("Resultado da divisão: %.2f%n", resultado);
                 } catch (ArithmeticException e) {
                     System.out.println(e.getMessage());
                 }
                 break;
             default:
                 System.out.println("Opção inválida.");
         }

         System.out.print("Deseja realizar outra operação? (s/n): ");
         char resposta = scanner.next().charAt(0);
         if (resposta != 's' && resposta != 'S') {
             continuar = false;
         }
     }

     System.out.println("Obrigado por usar a calculadora!");
     scanner.close();
 }
}
