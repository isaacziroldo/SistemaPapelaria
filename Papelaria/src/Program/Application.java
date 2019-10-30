package Program;

import Pedido.Pedido;
import Produto.Caderno;
import Produto.CaixaLapis;
import Produto.Papel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pedido> cxLapis = new ArrayList<>();

        int menu = 0;

        do {
            System.out.println("======== MENU ========");
            System.out.println("1 --- Cadastrar Produto "
                    + "\n2 --- Cadastrar Pedido"
                    + "\n3 --- Consultar Pedido"
                    + "\n4 --- Listar Pedidos"
                    + "\n5 --- Sair");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("======== MENU - CADASTRO ========");
                    System.out.println("1 --- Caderno"
                            + "\n2 --- Caixa de Lápis"
                            + "\n3 --- Papel"
                    );
                    int subMenu = sc.nextInt();
                    System.out.println("Quantos produtos pretende cadastrar?");
                    int n = sc.nextInt();

                    switch (subMenu) {
                        case 1:
                            List<Caderno> dbCaderno = new ArrayList<>();
                            for (int i = 0; i < n; i++) {
                                Caderno caderno = new Caderno();
                                caderno.Cadastro();
                                dbCaderno.add(caderno);
                            }
                            for (Caderno caderno : dbCaderno) {
                                System.out.println(caderno);
                            }
                            break;
                        case 2:
                            List<CaixaLapis> dbCxLapis = new ArrayList<>();
                            for (int i = 0; i < n; i++) {
                                CaixaLapis lapis = new CaixaLapis();
                                lapis.Cadastro();
                                dbCxLapis.add(lapis);
                            }
                            for (CaixaLapis lapis : dbCxLapis) {
                                System.out.println(lapis);
                            }
                            break;
                        case 3:
                            List<Papel> dbPapel = new ArrayList<>();
                            for (int i = 0; i < n; i++) {
                                Papel papel = new Papel();
                                papel.Cadastro();
                                dbPapel.add(papel);
                            }
                            for (Papel papel : dbPapel) {
                                System.out.println(papel);
                            }
                            break;
                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.exit(0);
                    break;
            }

        } while (menu != 5);

    }

}
