
/**
                  *Mini-Projeto 06-Programação-02-Aluno: Marcelo Augusto.* 
 *Todos os atributos de todas as classes devem ter o modificador de acesso private
 *Todos os métodos que não são necessários para outras classes devem ter o modificador de acesso private, caso contrário escrever explicitamente o modificador de acesso public
 *Criar métodos get somente para os atributos que precisam ser acessados por outras classes
 *Criar métodos set somente para os atributos que precisam ser modificados por outras classes
 *Métodos set devem fazer checagens para impedir modificações inválidas (ex.: energia do personagem menor que 0)
*/
import java.util.ArrayList;
import java.util.Scanner;

class App {
  public static void main(String[] argas) {
    Scanner in = new Scanner(System.in);

    Personagem Richard = new Personagem("Richard", 100);
    Personagem John = new Personagem("John", 76);

    // cap01
    Capitulo capitulo1 = new Capitulo(
        "Bem-Vindo as terras sombrias de HigsWard, " +
            " nessa aventura o nosso cavaleiro Richard irá enfrentar, " +
            " diversas maldições. " +
            "\n ---Capítulo 01--- ",
        "olá defensor tudo bem com anda sua missão começa logo em uma caverna, " +
            " onde o mesmo encontra um grande dragão cuspidor de gelo que tenta congelar o mesmo," +
            " \n mas será que seu escudo e lança seram capazes de derrotar o temido dragão gyrus ? " +
            "\n Digite uma opção:(1 ou 2) ",
        Richard,
        0,
        in);

    // cap02
    Capitulo capitulo2 = new Capitulo(
        "\n ---Capitulo 02---",
        "olá cavaleiro você não conseguiu derrotar o dragão, " +
            "graças ao visionário do tempo que lhe avisou que seu equipamento não era " +
            "\nforte o suficiente para derrotar aquele temido dragão, mas " +
            "\nse o visionário lhe oferecer um equipamento mais forte você conseguirá derrotar o dragão sem perder equipamento ?"
            +
            "\n Digite uma opção:(1, 2 e 3) ",
        Richard,
        -40,
        in);

    // cap03
    Capitulo capitulo3 = new Capitulo(
        "\n ---Capítulo 03---",
        "Sabia resposta Cavaleiro, sua escolha salvou sua progressão. Nessas terras sombrias, " +
            "com essa escolha o cavaleiro teve a chance de sair das terras sombrias" +
            "\ne recrutar um grupo de mercenários para ajudar em sua luta contra o dragão de gelo na caverna sombria de HigsWard. ",
        Richard,
        -60,
        in);

    // cap04
    Capitulo capitulo4 = new Capitulo(
        "\n ---Capítulo 04---",
        "Você acreditou! na derrota do dragão, mas infelizmente o cavaleiro " +
            "\nteve seu equipamento destruído, impossibilitando de continuar a jornada." +
            "\n'A sorte foi que o cavaleiro saiu ileso da batalha.'",
        Richard,
        +100,
        in);

    // cap05
    Capitulo capitulo5 = new Capitulo(
        "\n ---Capítulo 05---",
        "Você foi enganado! o visionário queria apenas ver você ser aprisionado. " +
            "O mesmo lhe deu um pedaço de madeira para enfrentar o dragão sem escudo rsrsrs, " +
            "\nocasionando no seu congelamento, onde o dragão te congelou com seu raio de gelo. ",
        Richard,
        +100,
        in);

    // terceiro final da escolha 3 do cap02
    // cap06
    Capitulo capitulo6 = new Capitulo(
        "\n ---Capítulo 06---",
        "O Experiente cavaleiro John ajuda Richard a derrotar o dragão, " +
            "logo após o confronto John promete oferecer apoio nas próximas batalhas contra " +
            "\n as criaturas sombrias da floresta...",
        John,
        -50,
        in);

    // Escolhas dos CAPÍTULOS
    // cap01
    capitulo1.addescolha(new Escolha("1", capitulo2, "nao"));
    capitulo1.addescolha(new Escolha("2", capitulo4, "sim"));
    capitulo2.addescolha(new Escolha("1", capitulo5, "agora sim"));
    capitulo2.addescolha(new Escolha("2", capitulo6, "deve haver outra forma"));
    capitulo2.addescolha(new Escolha("3", capitulo3, "sem chances"));

    Capitulo raiz = capitulo1;

    raiz.mostrar();
    in.close();
  }

}
