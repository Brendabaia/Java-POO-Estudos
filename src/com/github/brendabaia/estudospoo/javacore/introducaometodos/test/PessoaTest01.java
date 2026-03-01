package com.github.brendabaia.estudospoo.javacore.introducaometodos.test;

import com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Brenda";
        pessoa.setNome("Brenda");
        pessoa.setIdade(24);

        pessoa.imprime();
    }
}
