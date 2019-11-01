package Produto;

import java.util.Scanner;
import java.lang.reflect.Field;
import java.util.Locale;

public class Caderno extends Produto implements Manipulacao {

    private int qtdeFolhas;
    private String tamanho;
    private String tipo;
    private boolean capaDura;

    public Caderno() {

    }

    public Caderno(int qtdeFolhas, String tamanho, String tipo, boolean capaDura) {

        this.qtdeFolhas = qtdeFolhas;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.capaDura = capaDura;

    }

    /**
     * @return the qtdeFolhas
     */
    public int getQtdeFolhas() {
        return qtdeFolhas;
    }

    /**
     * @param qtdeFolhas the qtdeFolhas to set
     */
    public void setQtdeFolhas(int qtdeFolhas) {
        this.qtdeFolhas = qtdeFolhas;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the capaDura
     */
    public boolean isCapaDura() {
        return capaDura;
    }

    /**
     * @param capaDura the capaDura to set
     */
    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
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
        System.out.println("Quantidade de Folhas?");
        setQtdeFolhas(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual o tamanho?");
        setTamanho(sc.nextLine());
        System.out.println("Qual o tipo de caderno?");
        setTipo(sc.nextLine());
        System.out.println("Capadura?(true/false)");
        setCapaDura(sc.nextBoolean());

        return true;

    }

    public String toString() {
        return "\nCADERNO  | "
                + super.toString()
                + " | Quantidade de Folhas: " + getQtdeFolhas() 
                + " | Tamanho: " + getTamanho()
                + " | Tipo: " + getTipo() 
                + " | Capadura: " + isCapaDura();
    }

    @Override
    public String Consulta() {
        return this.toString();
    }

}
