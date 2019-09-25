
package Produto;


public class CaixaLapis {
    
    private int quantidade;
    private boolean colorido;
    
    
    public CaixaLapis(){
        
    }
    
    public CaixaLapis(int quantidade, boolean colorido){
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
    
}
