import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @javadoc
 *          classe Capítulo e seus atributos
 */
public class Capitulo 
{
  private String titulo;
  private String nome;
  private String texto;
  protected ArrayList<Escolha> escolhas;
  private Personagem personagem;
  private int variacaoenergia;

  protected Capitulo() 
  {

  }

  /**
   * @javadoc
   *          construtor da classe Capitulo
   */
  public Capitulo(String titulo,
      String nome,
      String texto,
      Personagem personagem,
      int variacaoenergia) {
    this.titulo = titulo;
    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem;
    this.variacaoenergia = variacaoenergia;
    this.escolhas = new ArrayList<Escolha>();
  }

  public Capitulo(
      HashMap<String, Personagem> personagens,
      Scanner escaneadorArquivoCapiulo) 
  {
    this.leitura(personagens, escaneadorArquivoCapiulo);
    this.escolhas = new ArrayList<Escolha>();
  }

  protected void leitura(HashMap<String, Personagem> personagens,
      Scanner escaneadorArquivoCapitulos) {

    escaneadorArquivoCapitulos.nextLine();
    this.titulo = escaneadorArquivoCapitulos.nextLine();
    escaneadorArquivoCapitulos.nextLine();
    this.nome = escaneadorArquivoCapitulos.nextLine();
    escaneadorArquivoCapitulos.nextLine();
    this.texto = escaneadorArquivoCapitulos.nextLine();
    escaneadorArquivoCapitulos.nextLine();
    this.personagem = personagens.get(escaneadorArquivoCapitulos.nextLine());
    escaneadorArquivoCapitulos.nextLine();
    this.variacaoenergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
  }

  public void addescolha(Escolha selec) 
  {
    this.escolhas.add(selec);
  }

  public String getTitulo() 
  {
    return this.titulo;
  }

  public String getTexto() 
  {
    return this.texto;
  }

  public String getNome() 
  {
    return this.nome;
  }

  public String variacaoEnergiaPersonagem() 
  {
    return this.personagem.alterarEnergia(this.variacaoenergia);
  }

  public ArrayList<Escolha> getEscolhas() 
  {
    return this.escolhas;
  }
}
