/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import co.edu.utp.isc.pro4.ajedrez.controlador.Ajedrez;
//import excepciones.MovimientoNoValidoException;
import javax.swing.JOptionPane;

/**
 *
 * @author utp
 */
public class Jugador {

    private Ajedrez ajedrez;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void jugar (Casilla casillaI, Casilla casillaF){
        boolean efectivo;
        efectivo = false;
        if(casillaI.isOcupada()){
            Ficha f;
            f = casillaI.getFicha();
            System.out.println("Color: "+ casillaI.getFicha().getColor()+". Turno:"+ajedrez.getTurno());
                        if((casillaI.getFicha().getColor() == Color.BLANCO) && (ajedrez.getTurno() == 0)//Valida si el turno concuerda on el color de ficha que selecciono 
                || (casillaI.getFicha().getColor() == Color.NEGRO) && (ajedrez.getTurno() == 1)){
   
                 f.mover(casillaF);   
            }

              else{
                ajedrez.cambioTurno();//Para volver al turno en que estaba
                System.out.println("No es su turno");
            
         }
       }
       else{
            System.out.println("No ha seleccionado una ficha");
                 efectivo = false;
        } 
        if(!efectivo){
            ajedrez.cambioTurno();
             JOptionPane.showMessageDialog(null,"Vuelva a internarlo");
        
        }
    }


    public void setAjedrez(Ajedrez ajedrez) {
        this.ajedrez = ajedrez;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void rendirse() {
        // No me gusta pero los estudiantes lo pidieron
        ajedrez.rendirse();
    }

}
