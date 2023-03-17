public class Escolha {
    String texto; //texto digitado
    String textomostrar; //texto que retorna na tela
    Capitulo prox; //refência ao objeto para capitulo recebe escolhas modelo arvore

    Escolha(String texto, Capitulo prox, String textomostrar)
    {
    this.texto = texto;
    this.prox = prox;
    this.textomostrar = textomostrar;
    }

    

}

