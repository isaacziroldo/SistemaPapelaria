/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

public abstract class Produto {

    private static int lastId;
    private int id;
    private String marca;
    private float valor;

    public Produto() {
        this.id = lastId++;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {

        return "ID: " + getId()
                + " | Marca: " + getMarca()
                + " | Valor: R$" + getValor();
    }

}
