package Produto;

import java.util.Scanner;
import java.lang.reflect.Field;

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
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append(this.getClass().getName());
        result.append(" Object {");
        result.append(newLine);

        // determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();

        // print field names paired with their values
        for (Field field : fields) {
            result.append("  ");
            try {
                result.append(field.getName());
                result.append(": ");
                // requires access to private field:
                result.append(field.get(this));
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }

    @Override

    public boolean Cadastro() {
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
        System.out.println("Altura?");
        setAltura(sc.nextFloat());
        sc.nextLine();
        System.out.println("Gramatura?");
        setGramatura(sc.nextInt());
        sc.nextLine();
        System.out.println("Paltado?");
        setPaltado(sc.nextBoolean());
        sc.close();
        return true;
    }

    @Override
    public String Consulta() {
        return toString();
    }

}
