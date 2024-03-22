package com.mycompany.pdpc_aula06b;

public class PDPC_Aula06B_Banheiro {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();
        Thread convidado1 = new Thread(new Numero1(banheiro), "Joao");
        Thread convidado2 = new Thread(new Numero2(banheiro), "Maria");
        Thread convidado3 = new Thread(new Numero1(banheiro), "Ana");
        Thread convidado4 = new Thread(new Numero2(banheiro), "Jose");
        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
    }
}
