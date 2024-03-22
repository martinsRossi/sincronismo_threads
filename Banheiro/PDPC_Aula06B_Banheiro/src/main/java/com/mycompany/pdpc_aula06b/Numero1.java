package com.mycompany.pdpc_aula06b;

public class Numero1 implements Runnable {
    private Banheiro banheiro;

    public Numero1(Banheiro banheiro1) {
        super();
        this.banheiro = banheiro1;
    }

    public void run() {
        banheiro.fazendoNumero1();
    }
}
