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
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void trasferir(double valor, Conta contaDestino);
    
    void imprimirExtrato();

}
