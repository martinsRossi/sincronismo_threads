package com.mycompany.pdpc_aula06b;

public class Banheiro {
    public void fazendoNumero1() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta do Banheiro");
        synchronized(this){
            System.out.println(nome + " Entrando no Banheiro");
            System.out.println(nome + " Fazendo numero 1");
            try {
            Thread.sleep(2000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
            System.out.println(nome + " Dando descarga");
            System.out.println(nome + " Lavando as maos");
            System.out.println(nome + " Saindo do Banheiro");
        }
    }
    
    public void fazendoNumero2() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta do Banheiro");
        synchronized(this) {
            System.out.println(nome + " Entrando no Banheiro");
            System.out.println(nome + " Fazendo numero 2");
            try {
            Thread.sleep(10000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
            System.out.println(nome + " Dando descarga");
            System.out.println(nome + " Lavando as maos");
            System.out.println(nome + " Saindo do Banheiro");
        }
    }
}