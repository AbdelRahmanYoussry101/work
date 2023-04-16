public class Square extends GeometricObject implements iColorable{
    private double length = 5;

    public void printAreaAndPerimeter()
    {

        System.out.println("Area: "+(length*length)+"\nPerimeter: "+ (4*length));
    }

    @Override
    public void howToColor() {

        System.out.println("Color all four sides");
    }
}
