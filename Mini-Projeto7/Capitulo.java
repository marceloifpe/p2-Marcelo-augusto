import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo 
{

  private String nome;
  private String texto;
  ArrayList<Escolha> escolhas;
  private Personagem personagem;
  private int alteracaoenergia;
  private Scanner input;
  public Object addescolha;

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

  // metodo de mostrar as informações
  public void mostrar() 
  {

    System.out.println("\n Dica: Faça suas escolhas com sabedoria ! ");
    System.out.println();
    System.out.println(this.nome);
    System.out.println(this.texto);
    this.personagem.alterarEnergia(alteracaoenergia);

    // compara se existe alguma escolha para ser mostrada diferente de vazio
    if (this.escolhas.size() != 0) 
    {
      for (int index = 0; index < escolhas.size(); index++) 
      {
        System.out.println(" - " + escolhas.get(index).getTextovis());
      }
      System.out.println();
      int Idescolha = opcao();
      this.escolhas.get(Idescolha).getProx().mostrar();
      // linha acima captura a escolha referenciando ao 
      //proximo capitulo que
      // será mostrado na tela
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
//método de adiciona escolha
  public void addescolha(Escolha selec) 
  {
    this.escolhas.add(selec);//Controle de acesso para quem está fora da classe, impedi
    //modificação direta no meu main
  }

}
