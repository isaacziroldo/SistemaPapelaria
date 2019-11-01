
package Pedido;

import Produto.Manipulacao;
import java.util.Locale;
import java.util.Scanner;

public class Data implements Manipulacao {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(){
        
    }
    
    public Data(int dia, int mes, int ano){
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean Cadastro() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o Dia: ");
        setDia(sc.nextInt());
        System.out.println("Digite o Mês: ");
        setMes(sc.nextInt());
        System.out.println("Digite o Ano: ");
        setAno(sc.nextInt());
        
        return true;
    }
    
    public String toString(){
        return "Data: " + getDia() + "/" + getMes() + "/" + getAno();
    }

    @Override
    public String Consulta() {
        return toString();
    }
    
    
    
}

