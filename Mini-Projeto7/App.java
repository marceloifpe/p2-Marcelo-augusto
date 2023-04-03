
/**
                  *Mini-Projeto 07-Programação-02-Aluno: Marcelo Augusto.* 
*Ter um arquivo que armazena todos os dados dos personagens da história.
*Usar o arquivo para carregar os personagens no código, armazenar em um 
*dicionário de personagens (HashMap).
*Ter um arquivo que armazena todos os dados dos capítulos da história, incluindo as escolhas, os nomes dos personagens e a variação de energia deles. Você precisará atribuir um nome aos capítulos, para nas escolhas deixar especificado o capítulo seguinte.
*Usar o arquivo para carregar os capítulos no código, armazenar em um dicionário de capítulos.
*O carregamento dos capítulos deve usar os personagens já carregados, acessando eles no dicionário pelo nome.
*Desta forma, todo o conteúdo do livro interativo deve estar armazenado em arquivos de recursos (ex.: .txt), nenhum texto dos capítulos, texto das escolhas, nomes e energias dos personagens deverá estar explicitamente escrito no código (.java).
*[Extra + 1pt na 2VA] Salvar o progresso da história ao mostrar cada capítulo, de forma que ao desligar a aplicação e ligar novamente o leitor/jogador continuará de onde parou.
*/
import java.util.Scanner;
import java.util.HashMap;

class App {
  public static void main(String[] argas) {
    Scanner escaneador = new Scanner(System.in);
    LeitorCarregador leitor = new LeitorCarregador();
    HashMap<String, Personagem> personagens = leitor.lerpersonagens("texto/personagens.txt");
    HashMap<String, Capitulo> capitulos = leitor.lerCapitulos("texto/capitulos.txt", personagens, 
                                                                                   escaneador);                                                                                                                                                             
    Capitulo raiz = capitulos.get("Cap1");

    raiz.mostrar();

    escaneador.close();
  }
}
