/**
 * @javadoc
 *          classe Personagem e seus atributos
 */

public class Personagem 
{
  private String nome;
  private int energia;

  /**
   * @javadoc
   *          construtor da classe Personagem
   */
  public Personagem(String nome, int energia) 
  {
    this.nome = nome;
    this.energia = 100;
  }

  /**
   * @javadoc
   *          método que realiza o controle de energia do personagem
   */
  public String alterarEnergia(int alteracao) {
    String resultado = "";
    if (alteracao > 0) 
    {
      resultado = "Este movimento, impactou no cavaleiro " + this.nome
          + " restaurando " + alteracao
          + " Pontos de Energia. ";
    } else 
    {
      resultado = "Este movimento, impactou no cavaleiro " + this.nome
          + " consumindo " + alteracao
          + " Pontos de Energia. ";
    }
    resultado = resultado + "\n" + this.setEnergia(this.energia + alteracao);
    return resultado;
  }

  /**
   * @javadoc
   *          método set de alteração da energia do personagem na classe de
   *          maneira protegida o atributo
   */
  public String setEnergia(int energia) 
  {
    String resultado = "";
    this.energia = energia;
    if (this.energia > 100) 
    {
      this.energia = 100;
    } else if (this.energia <= 0) 
    {
      this.energia = 0;
      resultado = this.nome + " foi derrotado. \n" +
          "Não desista grande cavaleiro, \n" +
          "Tente Novamente !!!. ";
    }

    return resultado;
  }
}
