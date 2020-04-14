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
public class Section{
    static double section(Point pointA, Point pointB){
    double section = Math.sqrt(
            Math.pow(pointB.getX()- pointA.getX(),2)
          + Math.pow(pointB.getY()- pointA.getY(),2));
    return section;
    }    
}
