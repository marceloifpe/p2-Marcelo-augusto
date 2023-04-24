import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImagem extends Capitulo 
{
  private String imagem;

  public CapituloImagem(
      HashMap<String, Personagem> personagens,
      Scanner escaneadorArquivoCapiulo) 
  {
    this.leitura(personagens, escaneadorArquivoCapiulo);
    this.escolhas = new ArrayList<Escolha>();
  }

  @Override
  protected void leitura(
      HashMap<String, Personagem> personagens,
      Scanner escaneadorArquivoCapiulos) 
  {
    String lin = escaneadorArquivoCapiulos.nextLine();
    lin = escaneadorArquivoCapiulos.nextLine();
    this.imagem = lin;
    lin = escaneadorArquivoCapiulos.nextLine();
    while (!lin.equals("FIM_DA_IMAGEM:")) 
    {
      this.imagem = this.imagem + "\n" + lin;
      lin = escaneadorArquivoCapiulos.nextLine();
    }
    super.leitura(personagens, escaneadorArquivoCapiulos);
  }

  public String getImagem() 
  {
    return this.imagem;
  }
}
