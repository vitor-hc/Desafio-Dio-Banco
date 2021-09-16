/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.dio.banco;

/**
 *
 * @author Vitor Hugo
 */
public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 0354;
    private static int SEQUENCIA = 1;
    
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIA++;
        this.cliente=cliente;
        
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getConta() {
        return conta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
        
    }
    
    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }
    
    @Override
    public void trasferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
      protected void ImprimirInformacoesComuns() {
          System.out.println(String.format("Titular:  %s ", this.cliente.getNome()));
        System.out.println(String.format("Agência:  %d ", this.agencia));
        System.out.println(String.format("Conta:  %d ", this.conta));
        System.out.println(String.format("Saldo:%.2f ", this.saldo));
    }

    
}
