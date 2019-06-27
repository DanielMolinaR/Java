/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Carta implements Serializable{
    
    private String figura;
    private int valor_reto_horizontal;
    private int valor_reto_vertical;
    private Color color;
    
    /**
     * inicializacion de la carta con sus valores
     * @param figura
     * @param valor_reto_horizontal
     * @param valor_reto_vertical 
     */
    public Carta(String figura, int valor_reto_horizontal, int valor_reto_vertical) {
        this.figura = figura;
        this.valor_reto_horizontal = valor_reto_horizontal;
        this.valor_reto_vertical = valor_reto_vertical;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getValor_reto_horizontal() {
        return valor_reto_horizontal;
    }

    public void setValor_reto_horizontal(int valor_reto_horizontal) {
        this.valor_reto_horizontal = valor_reto_horizontal;
    }

    public int getValor_reto_vertical() {
        return valor_reto_vertical;
    }

    public void setValor_reto_vertical(int valor_reto_vertical) {
        this.valor_reto_vertical = valor_reto_vertical;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
