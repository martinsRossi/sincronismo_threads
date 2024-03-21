package com.mycompany.pdpc_aula06;

    public class Produtor extends Thread {
        private String nome;
        private Estoque umEstoque;
        public Produtor(String n, Estoque c) {
            nome = n;
            umEstoque = c;
        }

    public void run() {
        for (int i = 0; i < 10; i++) {
            umEstoque.put(nome, i);
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}
