/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Daniel
 */
public class MazoCartas extends ArrayList<Carta> implements Serializable{

    private static final int NUM_CARTAS = 110;
    
    public MazoCartas() {
        
        Random random = new Random();
        
        for (int i = 0; i < NUM_CARTAS; i++) {
            String nombreImagen = (i+1) + ".png";
            
            int valor_reto_horizontal = random.nextInt(7)+1;
            int valor_reto_vertical = random.nextInt(7)+1;
            
            Carta c = new Carta(nombreImagen, valor_reto_horizontal, valor_reto_vertical);
            this.add(c);
        }
    }
    
    
    
    public void repartirMano(Jugador jugador) {
        Random random = new Random();
        int n = random.nextInt(this.size());
        Carta c = this.remove(n);
        
        for (int i = 0; i < Jugador.CARTAS_MANO;i++) {
            jugador.mano.add(c);
        }
    }
}
