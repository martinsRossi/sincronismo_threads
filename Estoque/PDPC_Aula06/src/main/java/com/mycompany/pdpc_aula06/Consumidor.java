package com.mycompany.pdpc_aula06;

public class Consumidor extends Thread {
    private String nome;
    private Estoque umEstoque;
    public Consumidor(String n, Estoque c) {
        nome = n;
        umEstoque = c;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            umEstoque.get(nome);
        }
    }
}


