package com.github.brendabaia.estudospoo.javacore.introducaometodos.test;

import com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.Estudante;
import com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Brenda";
        estudante01.idade = 24;
        estudante01.sexo = 'F';

        estudante02.nome = "Baia";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();


    }
}
