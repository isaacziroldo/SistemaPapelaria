package Produto;

import java.util.Scanner;
import java.lang.reflect.Field;

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
        System.out.println("Quantidade?");
        setQuantidade(sc.nextInt());
        System.out.println("Colorido?(T/F)");
        setColorido(sc.nextBoolean());

        sc.close();
        return true;
    }

    @Override
    public String Consulta() {
        return toString();
    }

}
