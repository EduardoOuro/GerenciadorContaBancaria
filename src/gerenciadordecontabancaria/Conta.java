
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

    public Conta(double saldo,String cpf,int numero) {
        this.numero = numero;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    Conta() {
        
    }

    /*
    ● saque: realiza o saque de um valor da conta bancária, verificando se há saldo
    suficiente, indicando o sucesso da operação como retorno.
    ○ Argumentos: valor (número real) - valor a ser sacado
    ○ Retorno: true se o saque foi realizado com sucesso
     */
    public boolean saque(double saque) {
        boolean boo =false;
        if (saque < this.saldo) {
            this.saldo = this.saldo - saque;
            System.out.println("Saque realizado com sucesso!");
            return boo;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return boo;
    }
    
    /*
    ● deposito: realiza um deposito na conta bancária a partir do valor a ser depositado,
       Deve ser informado ao cliente se deposito pode ser realizado com sucesso
    ○ Argumentos: valor (número real) - valor a ser depositado
    ○ Retorno: true se o deposito foi realizado com sucesso
     */
     public boolean deposito(double valor) {
         boolean boo =false;
        if (valor >0) {
            this.saldo = this.saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
            return boo;
            
        } else {
            System.out.println("Depósito não efetuado!");
        }
        return boo;
    }


    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
     
    static boolean checaConta(int conta) {// não ta checando corretamente 
        Conta c =new Conta();
        if (conta > 0) {
            return true;
        } else {
            System.out.println("Número de conta inválida: " + conta);
            return false;
        }
    }
    static boolean retira(int conta, double valor) {
        Conta c =new Conta();
        if (c.saldo > valor) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            c.saldo -= valor;
            return true;
        }
    }

    static boolean deposita(int conta, double valor) {
        Conta c =new Conta();
        c.saldo += valor;
        return true;
    }
}
