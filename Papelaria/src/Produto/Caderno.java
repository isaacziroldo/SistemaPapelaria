
package Produto;

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
    public void Cadastro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Consulta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
