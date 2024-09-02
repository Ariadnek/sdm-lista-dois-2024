package exercicio1;

public class IMC {
 private double peso;
 private double altura;

 public IMC(double peso, double altura) {
     this.peso = peso;
     this.altura = altura;
 }

 public double calcularIMC() {
     if (altura <= 0) {
         throw new IllegalArgumentException("Altura deve ser maior que zero.");
     }
     return peso / (altura * altura);
 }

 public String classificacaoIMC() {
     double imc = calcularIMC();
     if (imc < 18.5) {
         return "Abaixo do peso";
     } else if (imc < 24.9) {
         return "Peso normal";
     } else if (imc < 29.9) {
         return "Sobrepeso";
     } else {
         return "Obesidade";
     }
 }

 public double getPeso() {
     return peso;
 }

 public void setPeso(double peso) {
     this.peso = peso;
 }

 public double getAltura() {
     return altura;
 }

 public void setAltura(double altura) {
     this.altura = altura;
 }
}
