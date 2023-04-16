import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometricObject> objects = new ArrayList<>();
        objects.add(new Triangle(1,2,3));
        objects.add(new Triangle(4,5,6));
        objects.add(new Square());
        objects.add(new Square());
        objects.add(new Square());

        for (GeometricObject g: objects) {
            if(g instanceof Triangle){
                Triangle t = (Triangle) g;
                t.howToColor();
                System.out.println(t.getArea());
            }
            else if (g instanceof Square) {
                Square s = (Square) g;
                s.howToColor();
                s.printAreaAndPerimeter();
            }
        }
    }
}