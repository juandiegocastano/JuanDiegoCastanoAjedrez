/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.time.LocalTime;
//Se importa ChronoUnit para hacer conteos de tiempo
//y retornar en formato long
import java.time.temporal.ChronoUnit;

/**
 *
 * @author utp
 */
public class Cronometro {
    private LocalTime[] tiempo;
    private int turno;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private long cronometroJugador1 = 0;
    private long cronometroJugador2 = 0;

    public Cronometro() {
        tiempo = new LocalTime[2];
        turno = 0;
    }
    /*PREGUNTAR: ¿Que operacion se debe hacer con esto? ¿Devolver el tiempo
    total como argumento para imprimirlo en la clase ajedrez cuando
    termine el juego o algo así?
    */
    public void iniciar(){
        //TODO: Iniciar el cronometro para el jugador actual
        horaInicio=LocalTime.now();
    }
    /*PREGUNTAR: No entiendo que hace, ¿Cuenta tiempo que se demora cada jugador? o solo descuenta
    el tiempo que se tarda el programa de ajdrez en hacer el cambio de casilla?
    */
    public void cambio(){
        //TODO: Parar el cronometro para el jugador actual
        LocalTime now1 = LocalTime.now();
        cronometroJugador1+=
        turno = (turno == 0 ? 1 : 0);
        //TODO: Iniciar el cronometro para el jugador actual
    }

    public void parar() {
        //TODO: Parar el cronometro
        horaFin=LocalTime.now();


    }

    public long darTiempoPartida(){
        return ChronoUnit.MINUTES.between(horaInicio, horaFin);
    }

}
