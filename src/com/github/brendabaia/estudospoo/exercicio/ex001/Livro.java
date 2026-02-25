package com.github.brendabaia.estudospoo.exercicio.ex001;

public class Livro {
    String autor;
    String nome;
    String editora;
    boolean aberto;
    int pag;

    void  ler(){
        if (this.aberto == false){
            System.out.println("ERRO! Livro "+ this.nome +" fechado");
        }else {
            System.out.println("Lendo livro " + this.nome);
        }
    }
    void fechado(){
       this.aberto = false;
    }
    void aberto(){
        this.aberto = true;
    }



}
