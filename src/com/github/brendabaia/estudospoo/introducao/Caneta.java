package com.github.brendabaia.estudospoo.introducao;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    boolean tampada;

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void  destampar(){
        this.tampada = false;
    }
    void  status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("está tampada? " + this.tampada);


    }

}
