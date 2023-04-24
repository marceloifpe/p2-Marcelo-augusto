import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import java.util.HashMap;

public class Controlador 
{
  HashMap<String, Personagem> personagens;
  HashMap<String, Capitulo> capitulos;

  @FXML
  private Button botaoCarregar;

  @FXML
  private VBox espacoBotoes;

  @FXML
  private Label imagemCapitulo;

  @FXML
  private TextArea textoCapitulo;

  @FXML
  void carregar(ActionEvent event) 
  {
    LeitorCarregador leitor = new LeitorCarregador();
    personagens = leitor.lerpersonagens(
        "rsc/personagens.txt");
    capitulos = leitor.lerCapitulos(
        "rsc/capitulos.txt",
        personagens);
    Capitulo raiz = capitulos.get("Capitulo-1");
    mostrarCapitulo(raiz);
  }

  void mostrarCapitulo(Capitulo capitulo) 
  {

    imagemCapitulo.setText("");
    try 
    {
      CapituloImagem capituloImagem = (CapituloImagem) capitulo;
      imagemCapitulo.setText(capituloImagem.getImagem());
    } 
    catch (Exception e) 
    {
      System.out.println(e);
    }

    textoCapitulo.clear();
    textoCapitulo.clear();
    espacoBotoes.getChildren().clear();

    textoCapitulo.setText("\n Dica: Faça suas escolhas com sabedoria ! " + "\n"
        + capitulo.getTitulo()
        + "\n" + capitulo.getNome()
        + "\n" + capitulo.getTexto() + "\n" +
        capitulo.variacaoEnergiaPersonagem());

    if (capitulo.getEscolhas().size() > 0) 
    {
      for (Escolha escolha : capitulo.getEscolhas()) 
      {

        Button botao = new Button(escolha.getTextovis());
        botao.setOnAction(new EventHandler<ActionEvent>() 
        {
          @Override
          public void handle(ActionEvent event) 
          {
            mostrarCapitulo(escolha.getProx());
          }
        });

        espacoBotoes.getChildren().add(botao);
      }
    }
  }
}
