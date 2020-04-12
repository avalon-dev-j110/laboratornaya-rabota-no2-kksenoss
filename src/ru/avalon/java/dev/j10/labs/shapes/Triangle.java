package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    
    implPoint a; 
    implPoint b;
    implPoint c;
     
    //s = 1/2 основания на высоту  > т1 +т2 на основание, т3 +т1 на высоту
    public Triangle (implPoint a, implPoint b, implPoint c){
    this.a = a;
    this.b = b;
    this.c = c;
    } 
    @Override
    public float getPerimeter(){  //метод не ест флоат, перевести в дабл коорд точек
   // a+ b +c 
    double perimeter = Math.sqrt(
            (Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY()- b.getY()),2)))
            + Math.sqrt(
            (Math.pow((b.getX() - c.getX()),2) + Math.pow((b.getY()- c.getY()),2)))
           + Math.sqrt(
            (Math.pow((a.getX() - c.getX()),2) + Math.pow((a.getY()- c.getY()),2)));
          
    return (float) perimeter;
    
    @Override
    public float getArea(){
    //   S = √p · (p — a)(p — b)(p — c)
        
    return (float)area;    
    }
    /*double lineAB = Math.sqrt(
            (Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY()- b.getY()),2)));                    
    return (float)lineAB;
        }
    
    double lineBC = Math.sqrt(
            (Math.pow((b.getX() - c.getX()),2) + Math.pow((b.getY()- c.getY()),2)));                         
    return (float)lineBC;
        }

    double lineAC = Math.sqrt(
            (Math.pow((a.getX() - c.getX()),2) + Math.pow((a.getY()- c.getY()),2))); 
        return (float)lineAC;
        }
   */
   
}
    
    //Прверить на отриц значения, проверить количество знаков просле запятой, свести до 2хъ.
   /* 
    public String toString() {
    
    return "Треугольник (площадь = " + getArea() + ", периметр = " + getPerimeter() + ')';
   }
    */
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    


    
    /*public float getArea(){
    
        double area = Math.sqrt(9);    // - проверить пересчитать
    //Math.sqrt((x1-x2)** + (y1-y2)**) * (sqrt(x1-x2)** + (y1-y3)**)
            return (float)area;
    }
        
        Разобраться с методами, 
        
   */