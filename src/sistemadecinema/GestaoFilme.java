/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadecinema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaiqu
 */
public class GestaoFilme implements Gestao<Filme>{
    
    private List<Filme> arrayFilmes;
    
    public GestaoFilme(){
        arrayFilmes = new ArrayList<>();
    }
    
    public List<Filme> getListaFilme(){
        
        return arrayFilmes;
    }
    
    @Override
    public void cadastrar(Filme objeto) {
        arrayFilmes.add(objeto);
    }

    @Override
    public void salvar(List<Filme> objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Filme buscar(int id) {
        Filme filmeEncontrado = null;

        // Itera sobre a lista de Funcionarios
        for (Filme filme : arrayFilmes) {
            // Verifica se o ID do Funcionario corresponde ao ID procurado
            if (filme.getIdFilme() == id) {
                // Se encontrar, atribui o Funcionario encontrado à variável FuncionarioEncontrado e interrompe o loop
                filmeEncontrado = filme;
                break;
            }
        }

        // Se o Funcionario não for encontrado, imprime uma mensagem
        if (filmeEncontrado == null) {
            System.out.println("Filme não encontrado.");
        } else {
            // Se o Funcionario for encontrado, imprime suas informações
            System.out.println("Filme encontrado:");
            System.out.println("ID: " + filmeEncontrado.getIdFilme());
            System.out.println("Título: " + filmeEncontrado.getTitulo());
            System.out.println("Sinopse: " + filmeEncontrado.getSinopse());
            
        }

        return filmeEncontrado;
    }

    @Override
    public List<Filme> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Filme objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
