/*História Interativa da Copa do Mundo 2022, a história foi baseada em cima da seleção de portugal,
 brasil e argentina
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//entrada de leitura

        String capPrincipal = 
        "Bem-vindo a história da copa do mundo 2022. " +
        "A copa do mundo é recheda de suspresas, alegrias e decepções, " +
        "O Brasil começou sofrendo com a perda de Neymar na estreia, mas mesmo assim conseguiu passar. " +
        "com 3 vitórias na fase de grupos, " +
        "já a Argentina de Messi começou sofrendo com as surpresas mais passou de fase, " +
        "e Portugal mostrou toda sua qualidade passando tranquilo "+
        "Quem será que passa nas oitavas de final ?";

        String capPRINCesc1 = 
        "Brasil.";
        
        String capPRINCesc2 = 
        "Argentina.";

        String capPRINCesc3 = 
        "Portugal.";

        String capSecund = 
        "Após jogo difícil Brasil avança contra Córeia do Sul nas oitavas, " +
        "Argentina Passa fácil contra Austrália, " +
        "e Portugal dá show e classifica.  " +
        "Quem será que chega até a final ? ";

        String capSecundesc1 =
        "Brasil.";

        String capSecundesc2 =
        "Argentina.";

        String capSecundesc3 =
        "Portugal.";

        String cap3 = 
        "O Brasil conquista a copa do mundo e consegue o sonhado hexa. Parabéns !!! por vencer essa grande aventura FIM.";

        String cap4 = 
        "Argentina consegue Eliminar os Portugueses em jogo espetacular, " +
        " recheado de emoções mais cai para a seleção canarinho. " +
        "FIM obrigado !!! pela participação, infelizmente não foi dessa vez.";

        String cap5 = 
        "Os portugueses conseguem com muita garra fazer grande campanha, " +
        "mas termina sua trajetória na semifinal diante da Argentina, " +
        "onde a mesma sai derrotada por 2 x 0." +
        "mesmo assim parabéns para Cristiano Ronaldo e sua turma. FIM obrigado !!! pela participação, infelizmente não foi dessa vez.";

        String cap6 =
        "Argentina Chega Longe mais não consegue a sonhada conquista, " +
        "Onde a mesma é derrotada na final contra o Brasil. FIM obrigado !!! pela participação, infelizmente não foi dessa vez.";

        String capnovo = 
        "A torcida brasileira agradece demais a garra de cada jogador, "+
        "o hexa demorou mais veio com estilo em cima do maior rival hahaha "+
        "VAI BRASIL !!!. Será que os Argentinos ficaram tristes ?";

        String capnovoesc1 =
        "A festa foi grande e os brasileiros nem ligaram";

        String capnovoesc2 =
        "Teve apoio dos brasileiros que ficaram comovidos com a situação.";

        String capnovoesc3 = 
        "A torcida ficou na dúvida entre provocar e comemorar mais decidiu comemorar o hexa. ";

        String capnovo2 = "A torcida se mobilizou e não teve zoação pra cima dos argentinos. Fim da História";

        String capnovo3 = "A torcida se mobilizou e fez uma zoação grande pra cima dos argentinos. Fim da História";

        String capnovo4 = "A torcida se mobilizou mais não teve zoação e foi tranquilo, "+
        "mesmo assim os argentinos provocaram na derrota para os brasileiros. Fim da História.";
        

        System.out.println(capPrincipal);
        System.out.println("- " + capPRINCesc1);
        System.out.println("- " + capPRINCesc2);
        System.out.println("- " + capPRINCesc3);

        System.out.print("\nDigite uma opção: ");
        String selecao = in.nextLine();
        System.out.println();

        if(selecao.equalsIgnoreCase(capPRINCesc1) || (selecao.equalsIgnoreCase(capPRINCesc2)) || (selecao.equalsIgnoreCase(capPRINCesc3))) {
            System.out.println(capSecund);
            System.out.println("- " + capSecundesc1);
            System.out.println("- " + capSecundesc2);
            System.out.println("- " + capSecundesc3);

            System.out.print("\nDigite: ");
            selecao = in.nextLine();
            System.out.println();

            if(selecao.equalsIgnoreCase(capPRINCesc1)) {
                System.out.println(capnovo);
                System.out.println("- " + capnovoesc1);
                System.out.println("- " + capnovoesc2);
                System.out.println("- " + capnovoesc3);
    
                System.out.print("\nDigite: ");
                selecao = in.nextLine();
                System.out.println();

                if(selecao.equalsIgnoreCase(capnovoesc1)) {
                    System.out.println(capnovo2);
                }
                else if(selecao.equalsIgnoreCase(capnovoesc2)) {
                    System.err.println(capnovo3);
                }
                else if(selecao.equalsIgnoreCase(capnovoesc3)) {
                    System.err.println(capnovo4);
                }
                else {
                    System.out.println("Escolha Errada !, tente Novamente.");
                }

            if(selecao.equalsIgnoreCase(capSecundesc1)) {
                System.out.println(cap3);
            }
            else if(selecao.equalsIgnoreCase(capSecundesc2)) {
                System.err.println(cap4);
            }
            else if(selecao.equalsIgnoreCase(capSecundesc3)) {
                System.err.println(cap5);
            }
            
            else {
                System.out.println("Escolha Errada !, tente Novamente.");
            }
        }
        else if(selecao.equalsIgnoreCase(capPRINCesc3)) {
            System.out.println(cap5);
        }
        else if(selecao.equalsIgnoreCase(capPRINCesc2)) {
            System.out.println(cap6);
        }
        else {
            System.out.println("Escolha Errada !, tente Novamente.");
        }

        in.close();
    }
}
}