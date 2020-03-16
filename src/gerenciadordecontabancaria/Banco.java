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
public class Banco {
       /*    Atributos (de instância):
  ● código: (inteiro) - armazena o código do banco (valor 1)
  ● clientes: (array de Cliente) - armazena as informações de clientes
  ● contas: (array de Conta) - armazena as informações sobre as contas bancárias
     */
    private int codigo;
    private Cliente[] clientes =new Cliente [20];
    private Conta[] contas =new Conta [20];
    private int pos = 0;
    /*
    Métodos:
● Construtor: inicia os atributos de classe
○ Argumentos: não há
     */
    public Banco() {

    }

    /*● cadastro: cadastra um novo cliente, armazenando as informações nos arrays clientes
e contas. O cadastro das informações dos clientes deverão ser delegados para a classe
Cliente. O número da conta deverá ser criado fornecido de modo incremental (iniciando
em 1).
○ Argumentos: não há
○ Retorno: não 
     */
    public void cadastrarClienteBanco() {

        clientes[pos].cadastroCliente();
        clientes[pos].numero = pos;
        pos++;

    }
    public void cadastro() {
        
               
    }

    /*
● saque: realiza o saque da conta bancária a partir do número da conta e do valor a ser
sacado (a serem pedidos para o usuário). A atualização do saldo deve ser delegada à
classe Conta. Deve ser informado ao cliente se o saque pôde ser realizado com
sucesso
○ Argumentos: não há
○ Retorno: não há
     */
    public void saque() {

    }

    /*
● deposito: realiza um depósito na conta bancária a partir do número da conta e do
valor a ser depositado (a serem pedidos para o usuário). A atualização do saldo deve
ser delegada à classe Conta. Deve ser informado ao cliente se o depósito pôde ser
realizado com sucesso.
○ Argumentos: não há
○ Retorno: não há
     */
    public void deposito() {

    }

    /*
● transferencia: realiza uma transferência entre a conta do depositante e a conta do
recebedor de um valor a ser depositado (a serem pedidos para o usuário). As
atualizações dos saldos do depositante e do recebedor deve ser delegada à classe
Conta. Deve ser informado ao cliente se o saque pôde ser realizado com sucesso.
○ Argumentos: não há
○ Retorno: não há
     */
    public void transferencia() {

    }
    
}
/*
 private int codigo;
    private Cliente[] clientes = new Cliente[100];
    private Conta[] contas = new Conta[100];
    private int pos = 0;

    public Banco() {
    }

    public void cadastrarClienteBanco() {

        clientes[pos].cadastroCliente();
        clientes[pos].numero = pos;
        pos++;

    }

  
*/
