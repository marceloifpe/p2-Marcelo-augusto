import java.util.ArrayList;

public class redes {
    String nome;
    int idade;
    String biografia;
    ArrayList<redes> seguidores;

    redes(String nome, int idade, String biografia){
        this.nome = nome;
        this.idade = idade;
        this.biografia = biografia;
        seguidores = new ArrayList<>();
    }
public void mostrainf()
{
  System.out.println("Nome: " + nome);  
  System.out.println("Idade: " + idade);
  System.out.println("Biografia: " + biografia);  
  for (redes seguidor : seguidores) {
    System.out.println("\n O nome e idade dos outros seguidores=> " + seguidor.nome + " | " + seguidor.idade);
}
}
public void addseguidor(redes seguidor)
{
seguidores.add(seguidor);
}
ArrayList<redes> getseguidores()
{
    return seguidores;
}

}
