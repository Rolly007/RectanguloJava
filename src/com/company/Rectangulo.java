package com.company;

public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int x, int y){
        this.base=x;
        this.altura=y;
    }

    public int calcularPerimetro(){
        int resultado;
        resultado=2*(base + altura);
        return(resultado);
    }
    public int calcularArea(){
        int resultado;
        resultado=base * altura;
        return resultado;
    }
}
