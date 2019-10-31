/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;


import Pedido.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaac
 */
public class TesterDbCliente {
    
    public static void main(String[] args) {
        List<Cliente> dbCliente = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            Cliente cliente = new Cliente();
            cliente.Cadastro();
            dbCliente.add(cliente);
        }
        for (Cliente cliente : dbCliente) {
            System.out.println(cliente.Consulta());
        }
    }
    
}
