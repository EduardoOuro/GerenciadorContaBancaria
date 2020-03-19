package gerenciadordecontabancaria;

import static gerenciadordecontabancaria.Conta.checaConta;
import java.util.Scanner;

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
    private final int codigo = 1;
    private Cliente[] clientes = new Cliente[20];//informações dos clientes
    private Conta[] contas = new Conta[20];// informações conta bancaria
    private int next = 0;// a conta relativa dos Objeto Cliente e Objeto Conta

    /*
    Métodos:
        ● Construtor: inicia os atributos de classe
        ○ Argumentos: não há
     */
    public Banco() {
        // Construtor Vazio
    }


    /*● cadastro: cadastra um novo cliente, armazenando as informações nos arrays clientes
        e contas. O cadastro das informações dos clientes deverão ser delegados para a classe Cliente.
        O número da conta deverá ser criado fornecido de modo incremental (iniciando
        em 1).
        ○ Argumentos: não há
        ○ Retorno: não 
     */
    public void cadastro() {
        next++;
        Cliente cliente = new Cliente(next);//inicio objeto Cliente na posicao 0
        cliente.cadastroCliente();//chamo o metodo de cadastrar cliente do Objeto Cliente
        clientes[next] = cliente; // cliente recebe dados do cliente na posicao 'next' e guarda
        Conta conta = new Conta(0, cliente.getCpf(), cliente.getNumero()); //conta recebe dados do objeto Conta(doble valor,String cpf,int numero) 
        contas[next] = conta;//conta recebe da conta no indice next

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
        Scanner input = new Scanner(System.in);
        if (next < 0) {
            System.out.println("Essa conta não existe");

        } else {
            System.out.println("Qual o número da conta: ");
            int numeroConta = input.nextInt();
            System.out.println("Qual valor deseja sacar? ");
            int valorSaque = input.nextInt();
            contas[numeroConta].saque(valorSaque);
        }
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
        Scanner input = new Scanner(System.in);
        if (next < 0) {
            System.out.println(" Essa conta não existe!");

        } else {
            System.out.println("Qual o numero da sua conta: ");
            int conta = input.nextInt();
            System.out.println("Qual valor deseja depositar? ");
            int ValorDeposito = input.nextInt();
            contas[conta].deposito(ValorDeposito);
        }
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
        Scanner input = new Scanner(System.in);
        Conta c = new Conta();
        if (next >= 0) {
            System.out.println("Digite o número de sua conta: ");
            int conta = input.nextInt();
            if (checaConta(conta)) {
                System.out.println("Digite o número da conta favorecida: ");
                int conta2 = input.nextInt();
                if (checaConta(conta2)) {
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTransferido = input.nextDouble();
                    boolean t = false;
                    
                    if (contas[conta].saque(valorTransferido) == t) {

                        contas[conta2].deposito(valorTransferido);

                    }
                    else{
                        System.out.println(" valor maior que o saldo");
                    }
                }
            }
        }
    }

    
    public void consultarClientes() {
        for (int i = 1; i <= next; i++) {
            String nome = clientes[i].getNome();
            String cpf = clientes[i].getCpf();
            int conta = contas[i].getNumero();
            double saldo = contas[i].getSaldo();
            System.out.println("_______________________");
            System.out.println("\n Conta do Cliente: " + conta 
                              +"\n nome do Cliente: " + nome 
                              +"\n Numero do CPF: " + cpf
                              +"\n saldo: " + saldo + "\n");
            System.out.println("_______________________");
        }
    }

}
