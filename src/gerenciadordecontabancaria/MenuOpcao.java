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
public class MenuOpcao {
    static int menuOpcoes() {
        
        System.out.println("Que opção deseja?");
        System.out.println("1 - Cadastrar conta");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");
        System.out.println("4 - Transferencia");
        System.out.println("9 - Sair do programa");

        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }
    
}
