import java.util.ArrayList;
import java.util.Scanner;


class App {
    public static void main(String[] argas) {
    Scanner in = new Scanner(System.in);

    Personagem Richard = new Personagem ("Richard",100);
    Personagem John = new Personagem("John", 76);

    ArrayList<String> esccap1 = new ArrayList<>();
    esccap1.add("nao");
    esccap1.add("sim");

    //cap01
    Capitulo capitulo1 = new Capitulo(
    "Bem-Vindo as terras sombrias de HigsWard, "+
    " nessa aventura o nosso cavaleiro Richard irá enfrentar, "+
    " diversas maldições. "+
    "\n ---Capítulo 01--- ",
    "olá defensor tudo bem com anda sua missão começa logo em uma caverna, "+
   " onde o mesmo encontra um grande dragão cuspidor de gelo que tenta congelar o mesmo,"+
   " \n mas será que seu escudo e lança seram capazes de derrotar o temido dragão gyrus ? "+
   "\n Digite uma opção: ",
   esccap1,
     Richard, 
     0, 
     in);  

     ArrayList<String> esccap2 = new ArrayList<>();
     esccap2.add("agora sim");
     esccap2.add("sem chances");
     esccap2.add("deve haver outra forma");

   //cap02
   Capitulo capitulo2 = new Capitulo(
    "\n ---Capitulo 02---",
    "olá cavaleiro você não conseguiu derrotar o dragão, "+
   "graças ao visionário do tempo que lhe avisou que seu equipamento não era "+
   "\nforte o suficiente para derrotar aquele temido dragão, mas "+
   "\nse o visionário lhe oferecer um equipamento mais forte você conseguirá derrotar o dragão sem perder equipamento ?"+
   "\n Digite uma opção: ",
   esccap2,
     Richard, 
     -40, 
     in);
     
     //cap03
     Capitulo capitulo3 = new Capitulo(
          "\n ---Capítulo 03---",
          "Sabia resposta Cavaleiro, sua escolha salvou sua progressão. Nessas terras sombrias, "+
         "com essa escolha o cavaleiro teve a chance de sair das terras sombrias"+
         "\ne recrutar um grupo de mercenários para ajudar em sua luta contra o dragão de gelo na caverna sombria de HigsWard. ",
           null,
           Richard, 
           -60, 
           in);
           
           //cap04
           Capitulo capitulo4 = new Capitulo(
                "\n ---Capítulo 04---",
                "Você acreditou! na derrota do dragão, mas infelizmente o cavaleiro "+
                "\nteve seu equipamento destruído, impossibilitando de continuar a jornada.",                 
                null,
                 Richard, 
                 +100, 
                 in);

                //cap05
                 Capitulo capitulo5 = new Capitulo(
                "\n ---Capítulo 05---",
                "Você foi enganado! o visionário queria apenas ver você ser aprisionado. "+
                "O mesmo lhe deu um pedaço de madeira para enfrentar o dragão sem escudo rsrsrs, "+
                "\nocasionando no seu congelamento, onde o dragão te congelou com seu raio de gelo. ",                 
                 null,
                 Richard, 
                 +100, 
                 in);
                
                 //terceiro final da escolha 3 do cap02
                 //cap06
                 Capitulo capitulo6 = new Capitulo("\n ---Capítulo 06---",
                  "O Experiente cavaleiro John ajuda Richard a derrotar o dragão, "+
                  "logo após o confronto John promete oferecer apoio nas próximas batalhas contra "+
                  "\n as criaturas sombrias da floresta...",
                   null, 
                   John, 
                   -50, 
                   in);

          capitulo1.mostrar();
          int primeira = capitulo1.opcao();
          if(primeira == 0){
                capitulo2.mostrar();
                int segundo = capitulo2.opcao();
                if( segundo == 1){
                      capitulo3.mostrar();
                }

                else if (segundo == 2){
                  capitulo6.mostrar();
                }

                else if(primeira == 0){
                      capitulo5.mostrar();

                }
          }
                else if (primeira == 1){
                      capitulo4.mostrar();
                }
                in.close();
          }
          
    }
    
