package com.mycompany.pdpc_aula06b;

    public class Numero2 implements Runnable {
        private Banheiro banheiro;

        public Numero2(Banheiro banheiro1) {
            super();
            this.banheiro = banheiro1;
        }

        public void run() {
            banheiro.fazendoNumero2();
        }
    }   

