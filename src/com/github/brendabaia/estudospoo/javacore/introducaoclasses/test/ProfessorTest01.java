package com.github.brendabaia.estudospoo.javacore.introducaoclasses.test;

import com.github.brendabaia.estudospoo.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Abila";
        professor.idade = 23;
        professor.sexo ='F';

        System.out.println("Nome " + professor.nome + " idade " + professor.idade + " sexo " + professor.sexo);
    }
}
