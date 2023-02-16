/* 
(mini-projeto 4)
Criar um array (ou ArrayList) de escolhas como atributo da classe Capítulo
String[] escolhas;
O construtor da classe deve agora receber um array de escolhas 
O método mostrar() deve mostrar todas as escolhas do array (ou nenhuma escolha no caso de um capítulo final).
Ao invés de retornar exclusivamente os valores 1 e 2, o método escolher() deve retornar o índice da escolha digitada (começando em 0)
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {

    String nome;
    String texto;
    ArrayList<String>escolhas;
    Personagem personagem; 
    int alteracaoenergia;
    Scanner input;

   Capitulo (String nome,
   String texto,
   ArrayList<String>escolhas,
   Personagem personagem,
   int alteracaoenergia,
   Scanner input)
{

    this.nome = nome;
    this.texto = texto;
    this.escolhas = escolhas;
    this.personagem = personagem; 
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;

}

void mostrar(){

   System.out.println("\n Dica: Faça suas escolhas com sabedoria ! ");
   System.out.println();
   System.out.println(this.nome);
   System.out.println(this.texto);
   this.personagem.alterarEnergia(alteracaoenergia);

//compara se existe alguma escolha para ser mostrada diferente de vazio
if(this.escolhas != null)
{
    for(int index = 0; index < escolhas.size(); index ++)
    {
        System.out.println(" - " + escolhas.get(index));
    }
}
  System.out.println();
}

int opcao()
{
    int idresultado = -1;

    if (escolhas != null)
    {
    while(idresultado == -1)
    {
        System.out.print("Sua escolha=> ");
        String recebe = input.nextLine();

        for (int i = 0; i < escolhas.size(); i ++){
            if(recebe.equals(escolhas.get(i)))
            {
                idresultado = i;
            }
        }

    }
    System.out.println();
    }
    return idresultado;
  }
}
