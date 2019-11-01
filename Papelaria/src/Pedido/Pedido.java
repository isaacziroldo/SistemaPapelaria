package Pedido;

import java.util.List;

import Produto.Caderno;
import Produto.CaixaLapis;
import Produto.Manipulacao;
import Produto.Papel;
import Produto.Produto;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

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
        System.out.println("Data do Pedido: ");
        this.data = new Data();
        data.Cadastro();
        int escolha = 0;
        do {

            System.out.println("Escolha um item para registro: "
                    + "\n 1 --- Caderno "
                    + "\n 2 --- Papel "
                    + "\n 3 --- Caixa de Lápis "
                    + "\n 4 --- Sair ");

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    Caderno caderno = new Caderno();
                    caderno.Cadastro();
                    cadernos.add(caderno);
                    break;
                case 2:
                    Papel papel = new Papel();
                    papel.Cadastro();
                    papeis.add(papel);
                    break;
                case 3:
                    CaixaLapis cxLapis = new CaixaLapis();
                    cxLapis.Cadastro();
                    caixasLapis.add(cxLapis);
                    break;
            }
        } while (escolha != 4);

        return true;
    }

    public String toString() {
        return "CLIENTE" + "\n=========="
                + "\nID: " + getId()
                + cliente.Consulta()
                + "\n=========="
                + "\nDATA DO PEDIDO"
                + "\n=========="
                + "\n" + data.Consulta()
                + "\n=========="
                + "\nPEDIDOS"
                + "\n=========="
                + "\n" + cadernos
                + "\n" + papeis
                + "\n" + caixasLapis;

    }

    @Override
    public String Consulta() {
        return toString();
    }

}
