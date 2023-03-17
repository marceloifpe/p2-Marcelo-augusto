
import java.util.Scanner;
import java.util.ArrayList;

public class Capitulo {

    String nome;
    String texto;
    ArrayList<Escolha>escolhas;
    Personagem personagem; 
    int alteracaoenergia;
    Scanner input;

   Capitulo (String nome,
   String texto,
   Personagem personagem,
   int alteracaoenergia,
   Scanner input)
{

    this.nome = nome;
    this.texto = texto;
    this.personagem = personagem; 
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;
    this.escolhas = new ArrayList<Escolha>();

}
//metodo de mostrar as informações 
void mostrar(){

   System.out.println("\n Dica: Faça suas escolhas com sabedoria ! ");
   System.out.println();
   System.out.println(this.nome);
   System.out.println(this.texto);
   this.personagem.alterarEnergia(alteracaoenergia);

//compara se existe alguma escolha para ser mostrada diferente de vazio
if(this.escolhas.size() != 0)
{
    for(int index = 0; index < escolhas.size(); index ++)
    {
        System.out.println(" - " + escolhas.get(index).textomostrar);
    }
    System.out.println();
    int Idescolha = opcao();
    this.escolhas.get(Idescolha).prox.mostrar();//captura a escolha referenciando ao proximo capitulo que será mostrado
  
}



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
            if(recebe.equals(escolhas.get(i).texto))
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
