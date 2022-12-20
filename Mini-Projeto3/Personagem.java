public class Personagem {
     String nome;
     int energia;

     Personagem(String nome, int energia)
     {
                this.nome = nome;
                this.energia = 100;
     }

     void alterarEnergia(int alteracao){
        this.energia = this.energia +alteracao;

        if(alteracao > 0)
        {
            System.out.println("Este movimento, impactou no cavaleiro "+ this.nome + " restaurando "+ alteracao +" Pontos de Energia. ");
        }
        else {
            System.out.println("Este movimento, impactou no cavaleiro "+ this.nome + " consumindo "+ alteracao +" Pontos de Energia. ");
        }

        if(this.energia > 100)
        {
            this.energia = 100;
        }
        else if (this.energia < 0)
        {
            this.energia = 0;
            System.out.println(this.nome +" foi derrotado.");
        }
     }
}
     