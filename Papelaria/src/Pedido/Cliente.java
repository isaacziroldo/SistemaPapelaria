package Pedido;

import Produto.Manipulacao;
import java.util.Locale;
import java.util.Scanner;

public class Cliente implements Manipulacao {
    
    private String nome;
    private String cpf;
    private String telefone;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String cpf, String telefone){
        
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return " | Nome: " + getNome()
                + " | CPF: " + getCpf()
                + " | Telefone: " + getTelefone();
    }

    @Override
    public boolean Cadastro() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do Cliente: ");
        setNome(sc.nextLine());
        System.out.println("CPF: ");
        setCpf(sc.nextLine());
        System.out.println("Telefone: ");
        setTelefone(sc.nextLine());
        
        return true;
    }

    @Override
    public String Consulta() {
        return toString();
    }
    
    
    
}
