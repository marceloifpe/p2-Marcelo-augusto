import java.util.Scanner;

public class Capitulo {

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem; 
    int alteracaoenergia;
    Scanner input;

   Capitulo (String nome,
   String texto,
   String escolha1,
   String escolha2,
   Personagem personagem,
   int alteracaoenergia,
   Scanner input)
{

    this.nome = nome;
    this.texto = texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.personagem = personagem; 
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;

}


void mostrar(){

   System.out.println("\n Dica: Faça suas escolhas com sabedoria ! ");
   System.out.println(this.nome);
   System.out.println(this.texto);
   System.out.println("  "+this.escolha1);
   System.out.println("  "+this.escolha2);
   this.personagem.alterarEnergia(alteracaoenergia);

}

int opcao(){
    int resultado = 0;

    while(resultado == 0){
    if (this.escolha1 != null && this.escolha2 != null)
    {
        System.out.print("Sua escolha=>");
        String recebe = input.nextLine();
        if(resultado == 0){
           
        }
        if(recebe.equalsIgnoreCase(escolha1)){
            resultado = 1;
        }
        else if(recebe.equalsIgnoreCase(escolha2)){
            resultado = 2;
        }
    }
}
    return resultado;
}

}