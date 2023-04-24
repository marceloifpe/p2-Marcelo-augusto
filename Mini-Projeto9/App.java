/**  
 *@version Mini-Projeto-09
 * @author Marcelo Augusto
 */ 

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** 
 * @javadoc
 * Método main do meu código que executa a interação com os objetos das outras classes,ou seja,
 * as chamadas é o ponto de entrada do meu executável.
 */ 
public class App extends Application {
  public static void main(String[] args) throws IOException, InterruptedException
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader fmxLoader = new FXMLLoader(getClass().getResource("tela.fxml"));
    Parent root = fmxLoader.load();
    Scene tela =new Scene(root);

    primaryStage.setTitle("Mini-Projeto de História Interativa");
    primaryStage.setScene(tela);
    primaryStage.show();
  }
}
