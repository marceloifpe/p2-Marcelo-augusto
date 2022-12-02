

import java.util.Scanner;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    // System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
    // System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
    // System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
    // System.out.println(ANSI_GREEN_BACKGROUND + ANSI_RED + "This text has a green background and red text!" + ANSI_RESET);

    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in);

        String capA = 
        "João Grilo era um menino danado. " +
        "Até que conheceu seu amigo Chicó. " +
        "Um dia os dois encontraram com a " +
        "perna cabeluda. Tu não acredita, " +
        "quando viram a perna cabeluda, eles ";

        String capAescolha1 = 
        "correram feito dois condenados.";
        
        String capAescolha2 = 
        "deram uma rasteira na perna!";

        String capAescolha3 = 
        "tacaram fogo na danada.";

        String capB = 
        "Uma perseguição digna de hollywood se inicia. " +
        "Entrando por um beco escuro Chicó tropeça! " +
        "E aí Grilo olha pra trás desesperado, mas não vê mais " +
        "a Perna Cabeluda! E agora? João Grilo: ";

        String capBescolha1 =
        "volta encabulado para ajudar Chicó.";

        String capBescolha2 =
        "abandona o amigo.";

        String capC = 
        "a Perna cai no chão e não consegue se levantar. Fim!";

        String capD = 
        "De repente a perna cabeluda flamejante " +
        " parece que ganha poderes do outro mundo." +
        "Ela começa a dançar em círculos e invoca " +
        "suas companheiras, três mulas sem cabeça. " +
        "A história começa a ficar tão louca que " +
        "João Grilo percebe que não tá fazendo sentido " +
        " e acorda do pesadelo. Fim.";

        String capE = 
        "Ao chegar pertinho de Chicó, João vê aquela perna. " +
        "Ela é bem maior do que ele imaginava, seus pelos " +
        "parecem tranças de rapunzel, só que de arame farpado." +
        "A perna usa seus tentáculos para trucidar nossos heróis." +
        "Fim!";

        String capF =
        "No desespero, vendo João Grilo fugir, Chicó começa a rezar. " +
        "No seu último apelo, nossa senhora, Maria, aparece. " +
        "Em grande clarão, com palavras gentis, ela diz \"vá embora perninha\". " +
        "E no fim todos são salvos.";

        System.out.println(capA);
        System.out.println("- " + capAescolha1);
        System.out.println("- " + capAescolha2);
        System.out.println("- " + capAescolha3);

        System.out.print("\nDigite: ");
        String escolha = escaneador.nextLine();
        System.out.println();

        if(escolha.equalsIgnoreCase(capAescolha1)) {
            System.out.println(capB);
            System.out.println("- " + capBescolha1);
            System.out.println("- " + capBescolha2);

            System.out.print("\nDigite: ");
            escolha = escaneador.nextLine();
            System.out.println();

            if(escolha.equalsIgnoreCase(capBescolha1)) {
                System.out.println(capE);
            }
            else if(escolha.equalsIgnoreCase(capBescolha2)) {
                System.err.println(capF);
            }
            else {
                System.out.println("escolha inválida!");
            }
        }
        else if(escolha.equalsIgnoreCase(capAescolha2)) {
            System.out.println(capC);
        }
        else if(escolha.equalsIgnoreCase(capAescolha3)) {
            System.out.println(capD);
        }
        else {
            System.out.println("escolha inválida!");
        }

        escaneador.close();
    }
}