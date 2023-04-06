import java.util.Scanner;
import java.util.ArrayList;
 /** 
 * @javadoc
 * classe Capítulo e seus atributos
 */ 
public class Capitulo 
{
  private String nome;
  private String texto;
  ArrayList<Escolha> escolhas;
  private Personagem personagem;
  private int alteracaoenergia;
  private Scanner input;
  public Object addescolha;
  /** 
 * @javadoc
 * construtor da classe Capitulo
 */ 
  public Capitulo(String nome,
      String texto,
      Personagem personagem,
      int alteracaoenergia,
      Scanner input) 
  {
    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem;
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;
    this.escolhas = new ArrayList<Escolha>();
  }

  /** 
 * @javadoc
 * método de mostrar as informações do personagem.
 * @param
 * no primeiro if compara se existe alguma escolha para ser mostrada diferente de vazio
 * linha 52 captura a escolha referenciando ao proximo capitulo que será mostrado na tela.
 */ 
  public void mostrar() 
  {
    System.out.println("\n Dica: Faça suas escolhas com sabedoria ! ");
    System.out.println();
    System.out.println(this.nome);
    System.out.println(this.texto);
    this.personagem.alterarEnergia(alteracaoenergia);

    if (this.escolhas.size() != 0) 
    {
      for (int index = 0; index < escolhas.size(); index++) 
      {
        System.out.println(" - " + escolhas.get(index).getTextovis());
      }
      System.out.println();
      int Idescolha = opcao();
      this.escolhas.get(Idescolha).getProx().mostrar();

    }
  }

  private int opcao() 
  {
    int idresultado = -1;

    if (escolhas != null) 
    {
      while (idresultado == -1) 
      {
        System.out.print("Sua escolha=> ");
        String recebe = input.nextLine();

        for (int i = 0; i < escolhas.size(); i++) 
        {
          if (recebe.equals(escolhas.get(i).getTextdig())) 
          {
            idresultado = i;
          }
        }
      }
      System.out.println();
    }
    return idresultado;
  }
   /** 
 * @javadoc
 * método de adiciona escolha
 * @param this.escolhas.add(selec)
 * Controle de acesso para quem está fora da classe, impedi
 * modificação direta no meu main
 */ 
   
  public void addescolha(Escolha selec) 
  {
    this.escolhas.add(selec);
  }
}
