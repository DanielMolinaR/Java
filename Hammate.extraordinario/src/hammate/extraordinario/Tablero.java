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
public class Tablero implements Serializable{
    
    private final Carta[][] tablero = new Carta [3][4];
    public static final int FILAS = 3;
    public static final int COLUMNAS = 4;
    
    public Tablero() {
    }
    /**
     * Con este metodo vaciamos el tablero entero para acabar o reiniciar una partida
     */
    public void vaciarTablero() {
        for (int i=0;i< FILAS;i++){
            for (int j=0;j< COLUMNAS;j++){
                tablero[i][j]=null;
            }
        }
    }
    
    public void colocarCarta(int fila, int columna, Carta c){
        tablero[fila][columna]=c;
    }
    
    /**
     * 
     * @param atacada
     * @param atacante
     * @param ataqueHorizontal Verdadero si es horizontal y falso si es vertical
     * @return Carta ganadora o null en caso de empate
     */
    public Carta resolverReto (Carta atacada, Carta atacante, boolean ataqueHorizontal) {
       int valorAtacada;
       int valorAtacante;  
       
       if (ataqueHorizontal) {
            valorAtacada = atacada.getValor_reto_horizontal();
            valorAtacante = atacante.getValor_reto_horizontal();
       } else {
           valorAtacada = atacada.getValor_reto_vertical();
           valorAtacante = atacante.getValor_reto_vertical();
       }
       
       if (valorAtacada < valorAtacante) {
           return atacante;
       } else if (valorAtacada > valorAtacante) {
           return atacada;
       } else {
           return null;
       }
    }
    public static final int ARRIBA = 1;
    public static final int ABAJO = 2;
    public static final int IZQUIERDA = 3;
    public static final int DERECHA = 4;
    /**
     *  Colocacion de la carta atacante y eleccion de la dereccion del ataque
     * @param fila
     * @param columna
     * @param reto
     * @param atacante
     * @param ataqueHorizontal
     * @return 
     */
    public Carta resolverAtaque(int fila, int columna, int reto, Carta atacante) {
        Carta atacada;
        boolean ataqueHorizontal;
        
        switch(reto) {
            case ARRIBA:
                atacada = tablero[(fila -1) % FILAS][columna];
                ataqueHorizontal = false;
                break;
            case ABAJO:
                atacada = tablero[(fila +1) % FILAS][columna];
                ataqueHorizontal = false;
                break;
            case IZQUIERDA:
                atacada = tablero[fila ][(columna -1) % COLUMNAS];
                ataqueHorizontal = true;
                break;
            case DERECHA:
                atacada = tablero[fila][(columna +1) % COLUMNAS];
                ataqueHorizontal = true;
                break;
            default:
                atacada = null;
                ataqueHorizontal = false;                  
        }
        
        if (atacada != null) {
            Carta ganadora = resolverReto (atacada, atacante, ataqueHorizontal);
            if (ganadora == atacante) {
                atacada.setColor(atacante.getColor());
            } else {
                
            }
        } else {
            return null; // se devuelve null porque no hay ganador ya que no hay carta atacada
        }
    }
    
    /**
     * Comprueba si ha terminado la partida
     * recorre la tabla y si hay alguna celda vacia es que no ha terminado el juego
     * @return 
     */
    public boolean FinJuego () {
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                if (tablero[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int calcularPuntuacion (Jugador jugador) {
        int puntos = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if ( tablero[i][j]!= null && tablero[i][j].getColor()==jugador.getColor()) {
                    
                }
            }
        }
        return puntos;
    }

}
