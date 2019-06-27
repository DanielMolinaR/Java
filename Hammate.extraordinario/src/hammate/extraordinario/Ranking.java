/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class Ranking implements Serializable {
    
    private HashMap<String,JugadorUsuario> jugadores = new HashMap<>();
    
    /**
     * 
     * @param NIF
     * @return Si el NIF no esta en el HashMap salta una excepción
     * @throws JugadorException 
     */
    public JugadorUsuario buscarJugador(String NIF) throws JugadorException {
        JugadorUsuario jugador=jugadores.get(NIF);
        if (jugador!=null) {
            throw new JugadorException(JugadorException.NIF_INCORRECTO);
        }
        return jugador;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<JugadorUsuario> getRanking() {
        ArrayList<JugadorUsuario> lista = new ArrayList<JugadorUsuario>(jugadores.values());
        Collections.sort(lista);
        return lista;
    }
    /**
     * actualiza los datos (puntuacion) de un jugador
     * si no existe, registra al nuevo jugador
     */
    public void actualizarJugador(JugadorUsuario jugador) {
        jugadores.put(jugador.getNIF(),jugador);
    }
    
    public static void cargarDatos() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("ranking.dat");
            ObjectInputStream input = new ObjectInputStream(fis);
            
            Ranking r = (Ranking)input.readObject();
            
            input.close();
            fis.close();
            
            return r;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ranking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarDatos() throws FileNotFoundException {
        try {
           FileOutputStream fos = new FileOutputStream("ranking.dat");    
        }
            
    }
    
}
