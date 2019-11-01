package Pedido;

import java.util.List;

import Produto.Caderno;
import Produto.CaixaLapis;
import Produto.Manipulacao;
import Produto.Papel;
import Produto.Produto;
import Program.Application;
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
                    System.out.println("Escolha:\n1 - NOVO caderno\n2 - Caderno já cadastrado");
                    escolha = sc.nextInt();
                    switch (escolha) {
                        case 1:
                            Caderno caderno = new Caderno();
                            caderno.Cadastro();
                            Application.dbCaderno.add(caderno);
                            cadernos.add(caderno);
                            break;
                        case 2:
                            System.out.println("Digite o ID do caderno");
                            int idCaderno = sc.nextInt();
                            caderno = Application.buscaDbCaderno(idCaderno);
                            if (caderno != null) {
                                cadernos.add(caderno);
                            } else {
                                System.out.println("Caderno não encontrado");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escolha:\n1 - NOVO Papel\n2 - Papel já cadastrado");
                    escolha = sc.nextInt();
                    switch (escolha) {
                        case 1:
                            Papel papel = new Papel();
                            papel.Cadastro();
                            Application.dbPapel.add(papel);
                            papeis.add(papel);
                            break;
                        case 2:
                            System.out.println("Digite o ID do caderno");
                            int idPapel = sc.nextInt();
                            papel = Application.buscaDbPapel(idPapel);
                            if (papel != null) {
                                papeis.add(papel);
                            } else {
                                System.out.println("Papel não encontrado");
                            }
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Escolha:\n1 - NOVO Caixa de Lápis\n2 - Caixa de Lápis já cadastrado");
                    escolha = sc.nextInt();
                    switch (escolha) {
                        case 1:
                            CaixaLapis cxLapis = new CaixaLapis();
                            cxLapis.Cadastro();
                            Application.dbCxLapis.add(cxLapis);
                            caixasLapis.add(cxLapis);
                            break;
                        case 2:
                            System.out.println("Digite o ID da Caixa de Lápis");
                            int idLapis = sc.nextInt();
                            cxLapis = Application.buscaDbCxLapis(idLapis);
                            if (cxLapis != null) {
                                caixasLapis.add(cxLapis);
                            } else {
                                System.out.println("Caixa de Lápis não encontrado");
                            }
                            break;
                    }

                    break;
            }
        } while (escolha != 4);

        return true;
    }

    public void calculaTotalPedido() {
        totalPedido = 0;
        for (CaixaLapis caixaLapis : caixasLapis) {
            totalPedido += caixaLapis.getValor();
        }
        for (Papel papel : papeis) {
            totalPedido += papel.getValor();
        }
        for (Caderno caderno : cadernos) {
            totalPedido += caderno.getValor();
        }
        totalPedido *= 1.18f;
    }

    public String toString() {
        calculaTotalPedido();
        String retorno = "CLIENTE" + "\n==========" 
                + "\nID: " + getId() + cliente.Consulta() + "\n=========="
                + "\nDATA DO PEDIDO" + "\n==========" 
                + "\n" + data.Consulta() 
                + "\n==========" 
                + "\nPEDIDOS"
                + "\n==========";
        for (Caderno caderno : cadernos) {
            retorno += caderno + "\n";
        }
        for (Papel papel : papeis) {
            retorno += papel + "\n";
        }
        for (CaixaLapis caixaLapis : caixasLapis) {
            retorno += caixaLapis + "\n";
        }
        retorno += "\n TOTAL: " + getTotalPedido();
        return retorno;
    }

    @Override
    public String Consulta() {
        return toString();
    }

}
