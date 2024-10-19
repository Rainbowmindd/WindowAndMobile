import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //double a,b,c,p;
        //a=12.0;
        //b=12.0;
      //  c=12.0;
       // p=0.5*(a+b+c);

        System.out.println("Square");
        Square s1=new Square(12.00);
        System.out.println(s1.calculateArea());
        System.out.println(s1.calculatePerimeter());

        System.out.println("\n Triangle");
        Triangle t1=new Triangle(12.00,12.00,12.00);
        System.out.println(t1.calculateArea());
        System.out.println(t1.calculatePerimeter());

        System.out.println("\n Circle");
        Circle c1=new Circle(5.0);
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimeter());






    }
}