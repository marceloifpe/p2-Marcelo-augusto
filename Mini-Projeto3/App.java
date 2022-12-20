import java.util.Scanner;


class App {
      public static void main(String[] argas) {
      Scanner in = new Scanner(System.in);

      Personagem Richard = new Personagem ("Richard",100);
      Capitulo capitulo1 = new Capitulo(
      "Bem-Vindo as terras sombrias de HigsWard, "+
      " nessa aventura o nosso cavaleiro Richard irá enfrentar, "+
      " diversas maldições. "+
      "\n ---Capítulo 01--- ",
      "olá defensor tudo bem com anda sua missão começa logo em uma caverna, "+
     " onde o mesmo encontra um grande dragão cuspidor de gelo que tenta congelar o mesmo,"+
     " \n mas será que seu escudo e lança seram capazes de derrotar o mesmo ? "+
     "\n Digite uma opção: ",
       "Nao", 
       "Sim", 
       Richard, 
       0, 
       in);  

     Capitulo capitulo2 = new Capitulo(
      "\n ---Capitulo 02---",
      "olá cavaleiro você não conseguiu derrotar o dragão, "+
     "graças ao visionário do tempo que lhe avisou que seu equipamento não era "+
     "\nforte o suficiente para derrotar aquele temido dragão, mas "+
     "\nse o visionário lhe oferecer um equipamento mais forte você conseguirá derrotar o dragão sem perder equipamento ?",
       "agora sim", 
       "sem chances", 
       Richard, 
       -40, 
       in);
      
       Capitulo capitulo3 = new Capitulo(
            "\n ---Capítulo 03---",
            "Sabia resposta Cavaleiro, sua escolha salvou sua progressão. Nessas terras sombrias, "+
           "com essa escolha o cavaleiro teve a chance de sair das terras sombrias"+
           "\ne recrutar um grupo de mercenários para ajudar em sua luta contra o dragão de gelo na caverna sombria de HigsWard. ",
             "", 
             "", 
             Richard, 
             -60, 
             in);

             Capitulo capitulo4 = new Capitulo(
                  "\n ---Capítulo 04---",
                  "Você acreditou! na derrota do dragão, mas infelizmente o cavaleiro "+
                  "\nteve seu equipamento destruído, impossibilitando de continuar a jornada.",                 
                   "", 
                   "", 
                   Richard, 
                   +100, 
                   in);

                   Capitulo capitulo5 = new Capitulo(
                  "\n ---Capítulo 05---",
                  "Você foi enganado! o visionário queria apenas ver você ser aprisionado. "+
                  "O mesmo lhe deu um pedaço de madeira para enfrentar o dragão sem escudo rsrsrs, "+
                  "\nocasionando no seu congelamento, onde o dragão te congelou com seu raio de gelo. ",                 
                   "", 
                   "", 
                   Richard, 
                   +100, 
                   in);

            capitulo1.mostrar();
            int primeira = capitulo1.opcao();
            if(primeira == 1){
                  capitulo2.mostrar();
                  int segundo = capitulo2.opcao();
                  if( segundo == 2){
                        capitulo3.mostrar();
                  }
                  else if(primeira == 1){
                        capitulo5.mostrar();

                  }
            }
                  else if (primeira == 2){
                        capitulo4.mostrar();
                  }
            }
      }
