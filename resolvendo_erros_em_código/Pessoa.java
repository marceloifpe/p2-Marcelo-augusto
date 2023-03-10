public class Pessoa {
 String nome;
 int idade;
 Pessoa proxima;

 public Pessoa(String nome, int idade) {
  this.nome = nome;
  this.idade = idade;
 }

 public void adicionarNaFrenteDaFila(Pessoa Pessoa) {
  if(this.proxima == null) {
   this.proxima = Pessoa;
  }
  else {
   this.proxima.adicionarNaFrenteDaFila(Pessoa);
  }
 }

 public void imprimirFila(){
  System.out.print(this.nome + " -> ");
  if(proxima != null) {
    System.out.println("Fim da Fila");
  }
  else {
   proxima.imprimirFila();
  }
  }
 }

    

