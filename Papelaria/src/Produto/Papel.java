package Produto;

import java.util.Scanner;
import java.lang.reflect.Field;
import java.util.Locale;

public class Papel extends Produto implements Manipulacao {

    private String cor;
    private String tipo;
    private float largura;
    private float altura;
    private int gramatura;
    private boolean paltado;

    public Papel() {

    }

    public Papel(String cor, String tipo, float largura, float altura, int gramatura, boolean paltado) {

        this.cor = cor;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.gramatura = gramatura;
        this.paltado = paltado;

    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
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
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the gramatura
     */
    public int getGramatura() {
        return gramatura;
    }

    /**
     * @param gramatura the gramatura to set
     */
    public void setGramatura(int gramatura) {
        this.gramatura = gramatura;
    }

    /**
     * @return the paltado
     */
    public boolean isPaltado() {
        return paltado;
    }

    /**
     * @param paltado the paltado to set
     */
    public void setPaltado(boolean paltado) {
        this.paltado = paltado;
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
        System.out.println("Cor?");
        setCor(sc.nextLine());
        System.out.println("Tipo?");
        setTipo(sc.nextLine());
        System.out.println("Largura?");
        setLargura(sc.nextFloat());
        sc.nextLine();
        System.out.println("Altura?");
        setAltura(sc.nextFloat());
        sc.nextLine();
        System.out.println("Gramatura?");
        setGramatura(sc.nextInt());
        sc.nextLine();
        System.out.println("Paltado?(true/false)");
        setPaltado(sc.nextBoolean());

        return true;
    }

    @Override
    public String Consulta() {
        return super.toString()
                + " | Cor: " + getCor()
                + " | Tipo: " + getTipo()
                + " | Largura: " + getLargura() + "cm"
                + " | Altura: " + getAltura() + "cm"
                + " | Gramatura: " + getGramatura()
                + " | Paltado: " + isPaltado();
    }

}
