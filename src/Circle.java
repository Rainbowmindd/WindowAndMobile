public class Circle extends Figure implements Printing{

    public double r;

    Circle(double r1){
        r=r1;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public void print() {
        System.out.println("Area and Perimeter of Circle");
        calculateArea();
        calculatePerimeter();

    }
}
