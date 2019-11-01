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

    

    @Override
    public boolean Cadastro() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrando novo caderno");
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
    
    public String toString(){
        return super.toString()
                + " | Quantidade: " + getQuantidade()
                + " | Colorido: " + isColorido();
    }

    @Override
    public String Consulta() {
        return toString();
    }

}
