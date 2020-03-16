/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordecontabancaria;

/**
 *
 * @author luis.eoconrado
 */
public class Conta {
    
    /*
    Atributos (de instância):
● numero: (inteiro) - número da conta corrente
● saldo: (número real) - armazena o saldo
● cpf: (String) - CPF do titular
     */
   public int numero;
   public double saldo;
   public String cpf;

    /*
   ● Construtor: inicia o saldo e atrela o CPF
   ○ Argumentos: numero (inteiro) e cpf (String)
     */

    public Conta(int numero, String cpf) {
        this.numero = numero;
        this.saldo = 0;
        this.cpf = cpf;
    }

    /*
    ● saque: realiza o saque de um valor da conta bancária, verificando se há saldo
    suficiente, indicando o sucesso da operação como retorno.
    ○ Argumentos: valor (número real) - valor a ser sacado
    ○ Retorno: true se o saque foi realizado com sucesso
     */
    public boolean saque( double valor) {
        if (saldo > valor) {
            System.out.println("Saldo insuficiente para saque!");
            return false;

        } else {
            saldo -= valor;
            return true;
        }    
        
    }
    /*
● deposito: realiza um depósito na conta bancária a partir do valor a ser depositado
Deve ser informado ao cliente se o depósito pôde ser realizado com sucesso.
○ Argumentos: valor (número real) - valor a ser depositado
○ Retorno: true se o depósito foi realizado com sucesso
 */
     public boolean deposita( double valor) {
        saldo =saldo+ valor;
        return true;
        
    }
     
    
}
