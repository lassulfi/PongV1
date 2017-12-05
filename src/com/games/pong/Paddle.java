/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.pong;

import java.awt.Graphics;

/**
 *
 * @author luis.assulfi
 */
public interface Paddle {
    public void draw(Graphics g);
    public void move();
    public int getY();
}
