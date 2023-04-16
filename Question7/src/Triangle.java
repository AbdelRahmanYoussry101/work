public class Triangle extends GeometricObject implements iColorable{
    private double side1, side2, side3 =1;

    public Triangle() {}

    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        return side1 * side2 * side3;
    }

    public double getPerimeter() {
        return side1 + side2 +side3;
    }

    @Override
    public String toString(){
        return super.toString() + "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all three sides");
    }
}
