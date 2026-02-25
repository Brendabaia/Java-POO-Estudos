package com.github.brendabaia.estudospoo.exercicio.ex001;

public class Ex001 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.autor = " Kathy Sierra";
        l1.nome ="Use a Cabeça Java";
        l1.editora = "Alta Books";
        l1.fechado();
        l1.ler();

        Livro l2 = new Livro();
        l2.autor = " Kathy Sierra";
        l2.nome ="Use a Cabeça Java";
        l2.editora = "Alta Books";
        l2.aberto();
        l2.ler();
    }
}
