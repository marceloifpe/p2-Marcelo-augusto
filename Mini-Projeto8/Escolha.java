 /** 
 * @javadoc
 * Classe escolha e seus atributos que serve de ligação entre os capítulos
 */ 
public class Escolha 
{
  private String texto; 
  private String textomostrar; 
  private Capitulo prox; 
 /** 
 * @javadoc
 * construtor da classe Escolha
 */ 
  public Escolha(String texto, Capitulo prox, String textomostrar) 
  {
    this.texto = texto;
    this.prox = prox;
    this.textomostrar = textomostrar;
  }
 /** 
 * @javadoc
 * Método get que pega as informações que serão mostradas na tela do usuário como escolha.
 */ 
  public String getTextovis() 
  {
    return this.textomostrar;
  }
 /** 
 * @javadoc
 * Método get que pega as informações, refência ao objeto para o capitulo recebe escolhas,ou seja, 
 * qual será o próximo capítulo da história 'modelo arvore'.
 */ 
  public Capitulo getProx() 
  {
    return this.prox;
  }
/** 
 * @javadoc
 * Método get que pega as informações que serão digitadas pelo usuário como escolha.
 */ 
  public String getTextdig()
  {
    return this.texto;
  }
}
