
package Pedido;

import Produto.CaixaLapis;
import Produto.Manipulacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido implements Manipulacao{
   
    private float totalpedido;
    public  List cxLapis;
    private List<Pedido> papel = new ArrayList<>();
    private List caderno;
    
    public Pedido(){
     
      
    }

    public float getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(float totalpedido) {
        this.totalpedido = totalpedido;
    }

    public List getCxLapis() {
        return cxLapis;
    }

    public void setCxLapis(List cxLapis) {
        this.cxLapis = cxLapis;
    }

    public List getPapel() {
        return papel;
    }

    public void setPapel(List papel) {
        this.papel = papel;
    }

    public List getCaderno() {
        return caderno;
    }

    public void setCaderno(List caderno) {
        this.caderno = caderno;
    }
    
    

    @Override
	public boolean Cadastro() {
		return false;
	}

	@Override
	public String Consulta() {
		return null;
	}
    
    
        
}
