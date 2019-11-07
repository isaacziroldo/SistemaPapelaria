package Produto;

import java.util.Scanner;

import java.util.Locale;

public class CaixaLapis extends Produto implements Manipulacao {

    private int quantidade;
    private boolean colorido;

    public CaixaLapis() {

    }

    public CaixaLapis(int quantidade, boolean colorido) {
        this.quantidade = quantidade;
        this.colorido = colorido;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the colorido
     */
    public boolean isColorido() {
        return colorido;
    }

    /**
     * @param colorido the colorido to set
     */
    public void setColorido(boolean colorido) {
        this.colorido = colorido;
    }

    /*
    Método Cadastro() implementado da interface Manipulacao.
    Scanner como método de entrada de dados, usando os getters and setters.
    
    */

    @Override
    public boolean Cadastro() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrando caixa de lápis");
        System.out.println("Marca?");
        setMarca(sc.nextLine());
        System.out.println("Valor?");
        setValor(sc.nextFloat());
        sc.nextLine();
        System.out.println("Quantidade?");
        setQuantidade(sc.nextInt());
        System.out.println("Colorido?(true/false)");
        setColorido(sc.nextBoolean());

        return true;
    }
    //Retorno usando o super.toString para concatenar os atributos da superclasse
    
    
    public String toString(){
        return "CAIXA DE LÁPIS | "
                + super.toString()
                + " | Quantidade: " + getQuantidade()
                + " | Colorido: " + isColorido();
    }
    
     /*
    Metodo consulta() implementado da interface Manipulacao.
    Retornando o metodo toString().
    */
    @Override
    public String Consulta() {
        return toString();
    }

}
