
package Produto;

import java.util.Scanner;
import java.lang.reflect.Field;

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
        System.out.println("Quantidade de Folhas?");
        setQtdeFolhas(sc.nextInt());
        sc.nextLine();
        System.out.println("Qual o tamanho?");
        setTamanho(sc.nextLine());
        System.out.println("Qual o tipo de caderno?");
        setTipo(sc.nextLine());
        System.out.println("Capadura?(T/F)");
        setCapaDura(sc.nextBoolean());
            
        
        return false;
        
    }

	@Override
	public String Consulta() {
		return toString();
	}
    
    
    
}
