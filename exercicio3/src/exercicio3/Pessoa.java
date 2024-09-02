package exercicio3;

public class Pessoa implements Acoes {
 private String nome;

 public Pessoa(String nome) {
     this.nome = nome;
 }


 public void acordar() {
     System.out.println(nome + " está acordando.");
 }

 
 public void andar() {
     System.out.println(nome + " está andando.");
 }

 public void comer() {
     System.out.println(nome + " está comendo.");
 }

 public void dormir() {
     System.out.println(nome + " está dormindo.");
 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }
}
