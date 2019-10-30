/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import Produto.Caderno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaac
 */
public class TesterDbCaderno {
    
    public static void main(String[] args) {
		List<Caderno> dbCaderno = new ArrayList<>();
                            for (int i = 0; i < 3; i++) {
                                Caderno caderno = new Caderno();
                                caderno.Cadastro();
                                dbCaderno.add(caderno);
                            }
                            for (Caderno caderno : dbCaderno) {
                                System.out.println(caderno);
                            }
	}
    
}
