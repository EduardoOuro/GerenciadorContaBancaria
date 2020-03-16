/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordecontabancaria;

import java.util.Scanner;

/**
 *
 * @author luis.eoconrado
 */
public class Cliente {
     /*
    Atributos (de instância):
● nome: (String) - armazena o nome
● cpf: (String) - armazena o CPF
● numero: (inteiro) - armazena o número da conta
     */
    private String nome;
    private String cpf;
    public int numero;

    /*
   Métodos (de instãncia):
● Construtor: construtor padrão, não é necessário implementar
○ Argumentos: não há
     */
    public Cliente(int numero) {
        this.numero = numero;
    }

   

    /* ● cadastro: pede os dados ao usuário e armazena nos atributos
○ Argumentos: não há
○ Retorno: não há
     */
//    public void cadastro() {
//         Scanner input =new Scanner(System.in);
//         System.out.println("nome: ");
//         nome=input.next();
//         System.out.println("cpf: ");
//         cpf=input.next();
//        
//         
//
//    }
    public void cadastroCliente() {

        nome = getNome();
        cpf = getCpf();

    }

    /*
● getNome: inforna o nome do cliente
○ Argumentos: não há
○ Retorno: String
● getCpf: informa o CPF do cliente.
○ Argumentos: não há
○ Retorno: String
     */

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
}
/*
 

  
*/
