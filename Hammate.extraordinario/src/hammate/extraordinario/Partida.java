/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Partida implements Serializable{
    
    private Tablero tablero;
    private JugadorMaquina jugadorMaquina;
    private JugadorUsuario jugadorUsuario;
    private MazoCartas mazo;
    private Jugador turnoActual;
    
    public Partida(JugadorMaquina jugadorMaquina, JugadorUsuario jugadorUsuario) {
        this.jugadorMaquina = jugadorMaquina;
        this.jugadorUsuario = jugadorUsuario;
        tablero = new Tablero();
    }
        
    public void repartirCartas() {
        tablero.vaciarTablero();
        mazo=new MazoCartas();
        
        mazo.repartirMano(jugadorMaquina);
        mazo.repartirMano(jugadorUsuario);
    }
    
    public Jugador getTurnoActual() {
        return turnoActual;
    }
    
    /**
     * Avanza el turno del juego
     */
    public void avanzarTurno() {
        if (turnoActual==jugadorMaquina) {
            turnoActual = jugadorUsuario;
        } else {
            turnoActual = jugadorMaquina;
        }
    }
    
    public void jugarCarta(Carta carta,int fila, int columna, int reto) {
        tablero.colocarCarta(fila, columna, carta);
        tablero.resolverAtaque(fila, columna, reto, carta);
        avanzarTurno();
    }
    
    public int getPuntosJugadorUsuario() {
        return tablero.calcularPuntuacion(jugadorUsuario);
    }

    public int getPuntosJugadorMaquina() {
        return tablero.calcularPuntuacion(jugadorMaquina);
    }
    
    private int getPuntosJugador(JugadorUsuario jugadorUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
