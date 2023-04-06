/**  
 *@version Mini-Projeto-08
 * @author Marcelo Augusto
 */ 
import java.util.Scanner;
import java.util.HashMap;
 
/** 
 * @javadoc
 * Método main do meu código que executa a interação com os objetos das outras classes,ou seja,
 * as chamadas é o ponto de entrada do meu executável.
 */ 
class App {
  public static void main(String[] argas) 
  {
    Scanner escaneador = new Scanner(System.in);
    LeitorCarregador leitor = new LeitorCarregador();
    HashMap<String, Personagem> personagens = leitor.lerpersonagens(
      "rsc/personagens.txt");
    HashMap<String, Capitulo> capitulos = leitor.lerCapitulos(
      "rsc/capitulos.txt", personagens,
        escaneador);

    Capitulo raiz = capitulos.get("Cap1");

    raiz.mostrar();

    escaneador.close();
  }
}
