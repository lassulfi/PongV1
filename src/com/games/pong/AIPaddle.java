/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.pong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author luis.assulfi
 */
public class AIPaddle implements Paddle {
    
    double y, yVel;
    boolean upAccel, downAccel;
    int player, x;
    final double GRAVITY = 0.94;
    Ball b1;

    public AIPaddle(int player, Ball b) {
        upAccel = false;
        downAccel = false;
        b1 = b;
        y = 210;
        yVel = 0;
        if (player == 1){
            //Lado direito da tela
            x = 20;
        } else {
            //Lado esquerdo da tela
            x = 660;
        }
    }   

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, (int) y, 20, 80);
    }

    public void move() {
        y = b1.getY() - 40;
        
        if (y < 0){
            y = 0;
        }
        
        if (y > 420) {
            y = 420;
        }
        
    }
    
    public void setUpAccel(boolean input){
        upAccel = input;
    }
    
    public void setDownAccel(boolean input){
        downAccel = input;
    }

    public int getY() {      
        return (int)y;
    }
    
}
