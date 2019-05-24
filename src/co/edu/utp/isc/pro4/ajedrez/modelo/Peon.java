/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author utp
 */
 public class Peon extends Ficha {

     public Peon(Color color) {
         super(color);
     }
     /*PREGUNTAR: ¿Como se hace para capturar el click con el action performed,
     y pasarle como parametro a mover para que sepa a donde va a quedar el peon?
     ¿No debería entonces pasarle un argumento?*/
     @Override
     public void mover(Casilla destino) {
         //TODO: Mover como peon
         if(!destino.isOcupada()){
             if(this.getColor().equals("BLANCO")){
                if( (this.getCasilla().getColumna()== destino.getColumna()) && (this.getCasilla().getFila()== destino.getFila()+1)){
                    this.setCasilla(destino);
                }
                else System.out.println("Movimiento inválido");
                }
             else if(this.getColor().equals("NEGRO")){
                if( (this.getCasilla().getColumna()== destino.getColumna()) && (this.getCasilla().getFila()== destino.getFila()+1)){
                    this.setCasilla(destino);
                }
                else System.out.println("Movimiento inválido");
                }
         }  else this.comer(origen, destino); 
        
        // System.out.println("Origen " + origen.getColumna() + origen.getFila() + "  Destino: " + destino.getColumna()+ destino.getFila() );
         //this.setCasilla(destino);
     }

     @Override
     public void comer(Casilla origen, Casilla destino) {
         //TODO: Comer como peon
         
     }

     @Override
     public void draw(Graphics2D g, float x, float y) {
         // 50x50 dibujar la ficha
         g.setPaint(new GradientPaint(x, y,
                 getColor() == Color.BLANCO ? java.awt.Color.CYAN : java.awt.Color.BLACK,
                 x + 50, y + 50,
                 java.awt.Color.WHITE));
         g.fill(new Ellipse2D.Float(x + 17, y + 15, 16, 16));
         g.fill(new Rectangle2D.Float(x + 15, y + 30, 20, 15));
         g.setPaint(java.awt.Color.BLACK);
         g.draw(new Ellipse2D.Float(x + 17, y + 15, 16, 16));
         g.draw(new Rectangle2D.Float(x + 15, y + 30, 20, 15));
     }
 }
