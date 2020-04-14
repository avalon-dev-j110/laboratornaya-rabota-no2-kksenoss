package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.implPoint;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Polygon;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Ellipse;





public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        /*shapes[0] =  new Cercle();
        shapes[1] =  new Elipse();
        shapes[2] =  new Polygon();
        shapes[3] =  new Rectangle();
        shapes[0] =  new Triangle();
        shapes[1] =  new Triangle();
        shapes[6] =  new Polygon();
        shapes[7] =  new Rectangle();
        shapes[8] =  new Triangle();
        shapes[9] =  new Elipse();
        */
        shapes[0] = new Triangle(new implPoint(7,8), new implPoint(5,9), new implPoint(3,5));
            System.out.println("тест 1 треуг " + shapes[0].toString());
        
        shapes[1] = new Triangle(new implPoint(7,2), new implPoint(9,1), new implPoint(6,5));
            System.out.println("тест 2 треуг " + shapes[1].toString());
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
    }

}
