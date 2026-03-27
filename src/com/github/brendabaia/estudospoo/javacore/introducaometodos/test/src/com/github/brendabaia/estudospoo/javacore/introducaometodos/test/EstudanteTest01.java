package com.github.brendabaia.estudospoo.javacore.introducaometodos.test.src.com.github.brendabaia.estudospoo.javacore.introducaometodos.test;

import com.github.brendabaia.estudospoo.javacore.introducaometodos.test.src.com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.Estudante;
import com.github.brendabaia.estudospoo.javacore.introducaometodos.test.src.com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Brenda";
        estudante01.idade = 24;
        estudante01.sexo = 'F';

        estudante02.nome = "Baia";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
