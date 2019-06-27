/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public abstract class Jugador { //no se puedes instanciar, para hacer restricciones con las clases hijas
    
    // protected es visible para la clase y subclases
    protected ArrayList<Carta>mano;
    protected Color color;

    public Color getColor() {
        return color;
    }
    
    
    
    public static final int CARTAS_MANO = 6;
}
