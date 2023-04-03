public class Escolha 
{
  private String texto; // texto digitado
  private String textomostrar; // texto que retorna na tela
  private Capitulo prox; // refência ao objeto para capitulo recebe escolhas modelo arvore

  public Escolha(String texto, Capitulo prox, String textomostrar) 
  {
    this.texto = texto;
    this.prox = prox;
    this.textomostrar = textomostrar;
  }

  public String getTextovis() 
  {
    return this.textomostrar;
  }

  public Capitulo getProx() 
  {
    return this.prox;
  }

  public String getTextdig() 
  {
    return this.texto;
  }

}
