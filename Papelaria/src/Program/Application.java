package Program;

import Pedido.Pedido;
import Produto.Caderno;
import Produto.CaixaLapis;
import Produto.Papel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static List<Caderno> dbCaderno;
    public static List<CaixaLapis> dbCxLapis;
    public static List<Papel> dbPapel;
    public static List<Pedido> dbPedidos;

    static {
        dbCaderno = new ArrayList<>();
        dbCxLapis = new ArrayList<>();
        dbPapel = new ArrayList<>();
        dbPedidos = new ArrayList<>();
    }

    public static Caderno buscaDbCaderno(int id) {
        for (Caderno caderno : dbCaderno) {
            if (caderno.getId() == id) {
                return caderno;
            }
        }
        return null;
    }

    public static CaixaLapis buscaDbCxLapis(int id) {
        for (CaixaLapis cxLapis : dbCxLapis) {
            if (cxLapis.getId() == id) {
                return cxLapis;
            }
        }
        return null;
    }

    public static Papel buscaDbPapel(int id) {
        for (Papel papel : dbPapel) {
            if (papel.getId() == id) {
                return papel;
            }
        }
        return null;
    }

    public static Pedido buscaDbPedido(String cpf) {
        for (Pedido pedido : dbPedidos) {
            if (pedido.getCliente().getCpf().equals(cpf)) {
                return pedido;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu = 0;

        do {
            System.out.println("======== MENU ========");
            System.out.println("1 --- Cadastrar Produto "
                    + "\n2 --- Cadastrar Pedido"
                    + "\n3 --- Consultar Produtos"
                    + "\n4 --- Consultar Pedido"
                    + "\n5 --- Listar Pedidos"
                    + "\n6 --- Sair");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.println("======== MENU - CADASTRO ========");
                    System.out.println("1 --- Caderno"
                            + "\n2 --- Caixa de Lápis"
                            + "\n3 --- Papel");
                    int subMenu = sc.nextInt();
                    System.out.println("Quantos produtos pretende cadastrar?");
                    int n = sc.nextInt();

                    switch (subMenu) {
                        case 1:

                            for (int i = 0; i < n; i++) {
                                Caderno caderno = new Caderno();
                                caderno.Cadastro();
                                dbCaderno.add(caderno);
                                System.out.println("CADASTRADO COM SUCESSO!");
                            }

                            break;
                        case 2:

                            for (int i = 0; i < n; i++) {
                                CaixaLapis lapis = new CaixaLapis();
                                lapis.Cadastro();
                                dbCxLapis.add(lapis);
                                System.out.println("CADASTRADO COM SUCESSO!");
                            }

                            break;
                        case 3:

                            for (int i = 0; i < n; i++) {
                                Papel papel = new Papel();
                                papel.Cadastro();
                                dbPapel.add(papel);
                                System.out.println("CADASTRADO COM SUCESSO!");
                            }

                            break;
                    }

                    break;
                case 2:
				Pedido pedido = new Pedido();
				pedido.Cadastro();
				dbPedidos.add(pedido);
				break;
                case 3:

                    System.out.println("======== MENU - PRODUTOS ========");
                    System.out.println("1 --- Caderno"
                            + "\n2 --- Caixa de Lápis"
                            + "\n3 --- Papel"
                            + "\n4 --- Listar todos os produtos");
                    subMenu = sc.nextInt();

                    switch (subMenu) {
                        case 1:

                            for (Caderno caderno : dbCaderno) {
                                System.out.println(caderno.Consulta());
                            }
                            break;
                        case 2:

                            for (CaixaLapis lapis : dbCxLapis) {
                                System.out.println(lapis.Consulta());
                            }
                            break;
                        case 3:

                            for (Papel papel : dbPapel) {
                                System.out.println(papel.Consulta());
                            }
                            break;
                        case 4:
                            for (Caderno caderno : dbCaderno) {
                                System.out.println(caderno.Consulta());
                            }

                            for (CaixaLapis lapis : dbCxLapis) {
                                System.out.println(lapis.Consulta());
                            }
                            for (Papel papel : dbPapel) {
                                System.out.println(papel.Consulta());
                            }
                            break;

                    }

                    break;
                case 4:

                    break;
                case 5:
				for (Pedido pedidoNoBanco : dbPedidos)
					System.out.println(pedidoNoBanco);
				break;
                default:
                    System.exit(0);
                    break;
            }

        } while (menu
                != 6);

    }

}
