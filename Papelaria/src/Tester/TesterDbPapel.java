package Tester;

import java.util.ArrayList;
import java.util.List;

import Produto.Papel;

public class TesterDbPapel {

    public static void main(String[] args) {
        List<Papel> dbPapel = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Papel papel = new Papel();
            papel.Cadastro();
            dbPapel.add(papel);
        }
        for (Papel papel : dbPapel) {
            System.out.println(papel.Consulta());
        }
    }
}
