package Pedido;

import java.util.List;

import Produto.Caderno;
import Produto.CaixaLapis;
import Produto.Manipulacao;
import Produto.Papel;
import Produto.Produto;
import java.util.ArrayList;

public class Pedido implements Manipulacao {

    private static int lastId;
    private int id;
    private Data data;
    private Cliente cliente;
    private float totalPedido;
    private List<CaixaLapis> caixasLapis;
    private List<Papel> papeis;
    private List<Caderno> cadernos;

    static {
        lastId = 1;
    }

    public Pedido() {
        this.id = lastId++;
        caixasLapis = new ArrayList<>();
        papeis = new ArrayList<>();
        cadernos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<CaixaLapis> getCaixasLapis() {
        return caixasLapis;
    }

    public void setCaixasLapis(List<CaixaLapis> caixasLapis) {
        this.caixasLapis = caixasLapis;
    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }

    public List<Caderno> getCadernos() {
        return cadernos;
    }

    public void setCadernos(List<Caderno> cadernos) {
        this.cadernos = cadernos;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    @Override
    public boolean Cadastro() {
        System.out.println("Cadastro de novo pedido:");
        this.cliente = new Cliente();
        cliente.Cadastro();
        System.out.println("Registre o Pedido: ");
        Caderno caderno = new Caderno();
        caderno.Cadastro();
        cadernos.add(caderno);
        return true;
    }

    @Override
    public String Consulta() {
        return "CLIENTE" + "\n=========="
                + "\nID: " + getId()
                + cliente.Consulta()
                + "\n=========="
                + "\nPEDIDOS"
                + "\n=========="
                + "\n" + cadernos;
    }

}
