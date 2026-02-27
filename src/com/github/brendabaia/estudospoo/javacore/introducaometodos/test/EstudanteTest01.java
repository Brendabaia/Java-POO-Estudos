package com.github.brendabaia.estudospoo.javacore.introducaometodos.test;

import com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        estudante01.nome = "Brenda";
        estudante01.idade = 24;
        estudante01.sexo = 'F';

        estudante02.nome = "Baia";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("-------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
