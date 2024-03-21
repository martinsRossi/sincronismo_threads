package com.mycompany.pdpc_aula06;

public class PDPC_Aula06 {
    public static void main(String[] args) {
        Estoque umEstoque = new Estoque();
        Produtor umProdut = new Produtor("PROD", umEstoque);
        Consumidor umConsum = new Consumidor("CONS", umEstoque);
        umConsum.start();
        umProdut.start();
    }
}


