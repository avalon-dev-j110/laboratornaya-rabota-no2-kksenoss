package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.implPoint;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Polygon;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Section;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Ellipse;

//ЛР2 выполнена,в ппоследствии можно причесать и сделать аккуратнее


public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
       
        shapes[0] = new Triangle(new implPoint(7,8), new implPoint(5,9), new implPoint(3,5));
            System.out.println("тест 1 фигура " + shapes[0].toString());
        
        shapes[1] = new Triangle(new implPoint(7,2), new implPoint(9,1), new implPoint(6,5));
            System.out.println("тест 2 фигура " + shapes[1].toString());
            
        shapes[2] = new Rectangle(new implPoint(2,2), new implPoint(2,100), new implPoint(30,2));
            System.out.println("тест 3 фигура " + shapes[2].toString());
            
        shapes[3] = new Rectangle(new implPoint(0,0), new implPoint(0,15), new implPoint(30,0));
            System.out.println("тест 4 фигура " + shapes[3].toString());
            
        shapes[4] = new Circle(new implPoint(0,0), new implPoint(0,7));
            System.out.println("тест 5 фигура " + shapes[4].toString());
            
        shapes[5] = new Circle(new implPoint(0,0), new implPoint(10,0));
            System.out.println("тест 6 фигура " + shapes[5].toString());
     
        shapes[6] = new Circle(new implPoint(0,0), new implPoint(0,1));
            System.out.println("тест 7 фигура " + shapes[6].toString());
            
        shapes[7] = new Circle(new implPoint(0,0), new implPoint(5,0));
            System.out.println("тест 8 фигура " + shapes[7].toString());
            
        shapes[8] = new Circle(new implPoint(0,0), new implPoint(0,3));
            System.out.println("тест 9 фигура " + shapes[8].toString());
            
        shapes[9] = new Circle(new implPoint(0,0), new implPoint(7,0));
            System.out.println("тест 10 фигура " + shapes[9].toString());
            
            
            Shape largestshape = findLargestArea(shapes);
            System.out.println("Наибольшая площадь " + largestshape);
     }

    public static Shape findLargestArea(Shape[] shapes){
        Shape result = null;
            
    for (Shape shape : shapes){
        if(result == null){
            result = shape;
        } else {
            result = result.getArea()>= shape.getArea()?result : shape;
        }
    }  
    return result;
    }
}           
    /*    
    Сортировка массива
    Сортировка (упорядочение по значениям) массива a производится методами Arrays.sort(a) 
        и Arrays.sort(a, index1, index2). Первый метод упорядочивает в порядке возрастания весь массив, 
        второй — часть элементов (от индекса index1 до индекса index2). Имеются и более сложные методы 
        сортировки. Элементы массива должны быть сравниваемы (поддерживать операцию сравнения).
        
    упоряд в порядке возрастания , вывести послед знач
    
    
    
    
    /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */

