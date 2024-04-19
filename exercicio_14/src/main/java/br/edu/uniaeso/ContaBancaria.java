package br.edu.uniaeso;

import java.io.Serializable;

public class ContaBancaria implements Serializable {
    String Nome;
    double saldo;
    int numero_conta;

    @Override
    public String toString() {
        return "ContaBancaria [Nome = " + Nome + ", saldo = " + saldo + ", numero da conta = " + numero_conta + "]";
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public ContaBancaria(String nome, double saldo, int numero_conta) {
        Nome = nome;
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }
}

