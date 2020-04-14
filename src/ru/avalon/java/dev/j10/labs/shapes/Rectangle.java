package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{
    
    private Point a;
    private Point b;
    private Point c;
     
    public Rectangle(Point a, Point b, Point c){
    this.a = a;
    this.b = b;
    this.c = c; 
    }

    @Override
    public float getPerimeter() {
        double perimeter = 2*(Section.section(a,b)
                + Section.section(a,c));
        return (float)perimeter;
    }

    @Override
    public float getArea() {
        double area = Section.section(a,b)
                + Section.section(a,c);
        return (float)area;
    }

    @Override
    public String toString() {
       return "Rectangle perimeter = " + getPerimeter() + "// area =" + getArea() + "//" ;
    }
    
  }  
    
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

