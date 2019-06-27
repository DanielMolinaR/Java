/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.util.Random;

/**
 *
 * @author Daniel
 */
public class JugadorMaquina extends Jugador {
    
    private Random random;
    /**
     * false = modo basico
     * true = modo avanzado
     */
    
    private boolean modo_juego_avanzado;

    public JugadorMaquina(boolean modo_juego_avanzado) {
        super();
        this.modo_juego_avanzado = modo_juego_avanzado;
        random = new Random();    
    }
    
    
    
    public void Jugar(Partida partida) {
        
        Carta carta = mano.remove(0);
        int fila = random.nextInt(Tablero.FILAS);
        int columna = random.nextInt(Tablero.COLUMNAS);
        int reto = random.nextInt(5);
        
        partida.jugarCarta(carta, fila, columna, reto);
    }
}
