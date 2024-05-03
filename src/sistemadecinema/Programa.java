/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadecinema;

import java.util.Scanner;
import org.json.JSONObject;


/**
 *
 * @author kaiqu
 */
public class Programa {
    public static void main(String[] args) {
    
    Sistema sistema = new Sistema();
    
    Scanner s = new Scanner(System.in);
    int opcao;
    
    System.out.print("Bem vindo ao Cinema Diamantina!\n"
            + "------------------\n"
            + "Escolha o que deseja fazer:\n"
            + "     1 - Cadastar cliente\n"
            + "     2 - Cadastrar filme\n"
            + "     3 - Cadastrar produtos\n"
            + "     4 - Sair\n");
   
    opcao =  s.nextInt();
    
    if(opcao == 1){
        System.out.print("Usuário: ");
        String usuario = s.nextLine();
        System.out.print("Senha: ");
        String senha = s.nextLine();
        sistema.insertFuncionario(usuario,senha);
        
    }
    if(opcao == 2){
        System.out.println("Vamos cadastrar produtos");
    }
}
}
