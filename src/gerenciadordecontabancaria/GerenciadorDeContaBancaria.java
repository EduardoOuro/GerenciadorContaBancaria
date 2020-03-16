/*
1 - GerenciadorContaBancaria: esta classe deverá também ser o nome do projeto. Ela
será usada para iniciar a execução do sistema
Atributos de classe:
● banco (classe Banco): objeto usado para invocar as funcionalidades de gerenciamento
de conta bancária.
Métodos de classe:
● main: inicia a execução do programa e mostra o menu de opções, invocando o método
de execução. Todos as funcionalidades requeridas pelo usuário deverão ser delegadas
ao atributo banco.
○ Argumentos: args (array de String) - recebe os argumentos de linha de
comando, quando existem.
○ Retorno: não há

*/
package gerenciadordecontabancaria;

import static gerenciadordecontabancaria.MenuOpcao.menuOpcoes;


public class GerenciadorDeContaBancaria {
    
   
    public static void main(String[] args) {
        Banco banco =new Banco();
        
        boolean sair = false;
        while (!sair) {
            switch (menuOpcoes()) {
                case 1:
                    banco.cadastrarClienteBanco();
                    break;
                case 2:
                    banco.saque();
                    break;
                case 3:
                    banco.deposito();
                    break;
                case 4:
                    banco.transferencia();
                    break;
                case 9:
                    sair = true;
                    break;
                default:
                    System.out.println("opção invalida.");
            }
        }
    }
    
}
