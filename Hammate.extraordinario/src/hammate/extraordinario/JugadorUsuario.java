/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class JugadorUsuario extends Jugador implements Comparable<JugadorUsuario>, Serializable {
    
    private String nombre;
    private String apellidos;
    private String NIF;
    private Date fechaNacimiento;
    private ArrayList<Partida> partidasJugadas = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public ArrayList<Partida> getPartidasJugadas() {
        return partidasJugadas;
    }
    
    
    
    public void jugar(Carta c, int fila, int columna, int filaReto, int columnaReto) {
        
    }

    /**
     * Compara los jugadores en base a sus puntuaciones
     * Si este jugador tienes mayor puntuacion devolvevemos -1 para decir que esta por encima en el ranking
     * Si el otro es el que tiene mayor puntuacion damos 1
     * Si es empate 0
     * @param o
     * @return 
     */
    @Override
    public int compareTo(JugadorUsuario o) {
        if (this.getPuntuacionTotal() > o.getPuntuacionTotal()) {
            return -1;
        } else if (this.getPuntuacionTotal() < o.getPuntuacionTotal()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getPuntuacionTotal() {
        int suma = 0;
        return suma;
    }

  
}
