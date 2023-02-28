/* 
Criar uma classe representando um perfil de uma rede social, ter pelo menos o nome, a idade e uma microbiografia para cada perfil
criar 5 perfis usando esta classe
adicionar seguidores a um perfil a partir de um método da classe perfil, ter um array ou arraylist de seguidores na classe
mostrar os dados de um perfil e seus seguidores a partir de um método da classe perfil
*/
public class App {
    public static void main(String[] args) throws Exception {
        redes p1 = new redes("João",30,"Engenheiro Elétrico");
        redes p2 = new redes("Nike",25,"Doutor");
        redes p3 = new redes("Coca-Cola",35,"Professor");
        redes p4 = new redes("Microsoft",28,"Desenhista");
        redes p5 = new redes("Ricardo",32,"Policial");

p1.addseguidor(p2);
p1.addseguidor(p3);
p1.addseguidor(p4);
p1.addseguidor(p5);

p1.mostrainf();
System.out.println();

    }
}
