import java.util.SortedMap;

public class Square extends Figure implements Printing{

    public double a;

    Square(double x){
        a=x;
    }


    @Override
     public double  calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {;
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Area nd Perimeter of Square");
        calculateArea();
        calculatePerimeter();
    }
}
