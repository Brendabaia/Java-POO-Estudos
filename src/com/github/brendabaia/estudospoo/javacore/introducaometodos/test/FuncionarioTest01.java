package com.github.brendabaia.estudospoo.javacore.introducaometodos.test;

import com.github.brendabaia.estudospoo.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Brenda";
        funcionario.idade = 24;
        funcionario.salarios = new float[]{1200, 987.32f, 2000};

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
