package Points;

import Points.Point2D;
import Points.Point3D;

/*Stwórz klasę Punkt, która przechowuje informacje na temat punktu na przestrzeni
dwuwymiarowej (współrzędne x oraz y). Zawierająca dwa konstruktory: bezparametrowy
ustawiający pola na wartość 0, oraz przyjmujący dwa argumenty i ustawiający pola obiektu
zgodnie z podanymi parametrami.
Napisz klasę Punkt3D dziedziczącą po Punkt reprezentującą punkt w trójwymiarze
(dodatkowe pole z). W klasie testowej utwórz obiekty obu klas i przetestuj działanie.*/
public class Main {
    public static void main(String[] args) {
        Point2D line = new Point2D(1.2, 3.0);
        Point2D line0 = new Point2D();
        Point3D triangle = new Point3D(5.0, 2.0, 4.0);
        line.showPoint2D();
        line.setY(5.3);
        line.showPoint2D();
        line0.showPoint2D();
        triangle.showPoint3D();
    }
}