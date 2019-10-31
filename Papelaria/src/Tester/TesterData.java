
package Tester;

import Pedido.Data;


public class TesterData {
    public static void main(String[] args) {
		Data data = new Data();
		data.Cadastro();
		System.out.println(data.Consulta());
	}
}
