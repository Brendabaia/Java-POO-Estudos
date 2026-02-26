package com.github.brendabaia.estudospoo.javacore.introducaoclasses.test;

import com.github.brendabaia.estudospoo.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        c1.nome = "Fiat";
        c1.modelo = "Fiat uno";
        c1.ano = 2005;

        c2.nome = "Renault";
        c2.modelo = "Sandero";
        c2.ano = 2019;

        c1 = c2;

        System.out.println("Carro 1");
        System.out.println(c1.nome);
        System.out.println(c1.modelo);
        System.out.println(c1.ano);

        System.out.println("\nCarro 2");
        System.out.println(c2.nome);
        System.out.println(c2.modelo);
        System.out.println(c2.ano);
    }

}
