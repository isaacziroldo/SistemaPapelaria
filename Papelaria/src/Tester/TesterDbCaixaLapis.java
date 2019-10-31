/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import Produto.CaixaLapis;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaac
 */
public class TesterDbCaixaLapis {
    
    public static void main(String[] args) {
		List<CaixaLapis> dbCxLapis = new ArrayList<>();
                            for (int i = 0; i < 2; i++) {
                                CaixaLapis lapis = new CaixaLapis();
                                lapis.Cadastro();
                                dbCxLapis.add(lapis);
                            }
                            for (CaixaLapis lapis : dbCxLapis) {
                                System.out.println(lapis);
                            }
	}
    
}
