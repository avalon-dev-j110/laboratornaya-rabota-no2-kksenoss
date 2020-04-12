/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author 1
 */
public class implPoint implements Point {
    
    private int x;
    private int y;
    public implPoint(){
        
   
}

    
    public void setX(int x) {
    this.x = x;
        }

    @Override
    public int getX() {
    return x;
        }

   
    public void setY(int y) {
    this.y = y;
        }

    @Override
    public int getY() {
    return y;
        }
    
   
}