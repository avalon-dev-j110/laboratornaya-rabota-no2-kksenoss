package ru.avalon.java.dev.j10.labs.shapes;
import static java.lang.Math.*;
/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
   /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

public class Circle implements Ellipse{
    
    private Point center;
    private Point rad;
    
        public Circle( Point center, Point rad){
    
            this.center = center;
            this.rad = rad;
            
        }

    @Override
    public float getLength() {
        double lenght = 2 * PI * (Section.section(center,rad));
        return (float) lenght;
    }

    @Override
    public float getArea() {
        double area = PI *(Math.pow((Section.section(center,rad)),2));
        return (float) area;
    }

    @Override
    public String toString() {
        return " Круг /// пуриметр = "  + getLength() + " площадь = " + getArea() ;
    }
        
}

