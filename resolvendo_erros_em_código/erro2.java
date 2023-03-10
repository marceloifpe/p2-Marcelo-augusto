//Esse código apresentava erros de sintaxe, chamada de método/declarações e na lógica de comparação na hora de imprimir, código corrigido e funcionando.
public class App {
    public static void main(String[] args) throws Exception {
  Pessoa leo = new Pessoa("Leonardo di Caprio", 49);
  Pessoa jisus = new Pessoa("Jesus", 30);
  Pessoa Linus = new Pessoa("Linus Torvalds", 52);
  Pessoa mcpip = new Pessoa("Mc Pipoquinha", 19);
  Pessoa bmars = new Pessoa("Bruno Mars", 35);
  Pessoa gbdhc = new Pessoa("Gisele Bündchen", 42);
  Pessoa simbv = new Pessoa("Simone de Beuvoir", 80);

  Pessoa cabecaDaFila = jisus;
  cabecaDaFila.adicionarNaFrenteDaFila(simbv);
  cabecaDaFila.adicionarNaFrenteDaFila(leo);
  cabecaDaFila.adicionarNaFrenteDaFila(Linus);
  cabecaDaFila.adicionarNaFrenteDaFila(mcpip);
  cabecaDaFila.adicionarNaFrenteDaFila(bmars);
  cabecaDaFila.adicionarNaFrenteDaFila(gbdhc);
  cabecaDaFila.adicionarNaFrenteDaFila(jisus);

  cabecaDaFila.imprimirFila();
 // jisus.imprimirFila();
  //System.out.println("Fim da Fila");
  
 } 
}

/*
 Código 2 
public class Pessoa {
 string nome;
 int idade;
 Pessoa proxima;

 public Pessoa(String nome, int idade) {
  nome = nome;
  idade = idade;
 }

 private void adicionarNaFrenteDaFila(Pessoa Pessoa) {
  if(this.proxima == null) {
   this.proxima = Pessoa;
  }
  else {
   this.proxima.adicionarNaFrenteDaFila(Pessoa)
  }
 }

 public void imprimirFila(){
  system.out.print(this.nome + " -> ")
  if(proxima == null) {
   print("fim da fila");
  else {
   proxima.imprimirFila();
  }
  }
 }
}

public class App {
 static ing main(String[] args) {
  Pessoa leo = new Leonardo("Leonardo di Caprio", 49);
  Pessoa jisus = new Pessoa("Jesus", 30);
  Pessoa Linus = new Pessoa("Linus Torvalds", 52);
  Pessoa mcpip = new Pessoa("Mc Pipoquinha" 19);
  Pessoa bmars = new Pessoa("Bruno Mars", 35);
  Pessoa gbdhc = new Pessoa("Gisele Bündchen", 42);
  Pessoa simbv = new Pessoa("Simone de Beuvoir", 80);

  Pessoa cabecaDaFila = jisus;
  cabecaDaFila.adicionarNaFrenteDaFila(simbv);
  cabecaDaFila.adicionarNaFrenteDaFila(leo);
  cabecaDaFila.adicionarNaFrenteDaFila(Linus);
  cabecaDaFila.adicionarNaFrenteDaFila(mcpip);
  cabecaDaFila.adicionarNaFrenteDaFila(bmars);
  cabecaDaFila.adicionarNaFrenteDaFila(gbdhc);
  cabecaDaFila.adicionarNaFrenteDaFila(jisus);

  cabecaDaFile.imprimirFila();
 } 
}
 */
