package exercicio1;
import java.util.Scanner;

public class Programa {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     boolean continuar = true;

     while (continuar) {
         System.out.print("Digite o peso (em kg): ");
         double peso = scanner.nextDouble();

         System.out.print("Digite a altura (em metros): ");
         double altura = scanner.nextDouble();

         IMC imc = new IMC(peso, altura);

         double resultadoIMC = imc.calcularIMC();
         System.out.printf("Seu IMC é: %.2f%n", resultadoIMC);
         System.out.println("Classificação: " + imc.classificacaoIMC());

         System.out.print("Deseja calcular o IMC novamente? (s/n): ");
         char resposta = scanner.next().charAt(0);
         if (resposta != 's' && resposta != 'S') {
             continuar = false;
         }
     }

     System.out.println("Obrigado por usar o programa de cálculo de IMC!");
     scanner.close();
 }
}
