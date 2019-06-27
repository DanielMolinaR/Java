/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hammate.extraordinario;

/**
 *
 * @author Daniel
 */
public class JugadorException extends Exception {   
    
    public static final String NIF_INCORRECTO = "El NIF proporcionado es incorrecto."; 
 
    public static final String EDAD_INCORRECTA = "El jugador debe ser mayor de edad para poder jugar";
 
    public static final String CARTA_NO_SELECCIONADA = "No se ha seleccionado ninguna carta para jugar."; 
 
    public static final String RETO_INCORRECTO = "No se ha seleccionado la dirección del reto";          
            
    public JugadorException() {          
        super("Se ha producido una excepción en la aplicación.");     
    }
    
    public JugadorException (String txt) {             
        super(txt);     
    } 
}