/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;


import Pedido.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaac
 */
public class TesterPedido {
    public static void main(String[] args) {
        List<Pedido> dbPedido = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Pedido pedido = new Pedido();
            pedido.Cadastro();
            dbPedido.add(pedido);
        }
        for (Pedido pedido : dbPedido) {
            System.out.println(pedido.Consulta());
        }
    }
    
}
