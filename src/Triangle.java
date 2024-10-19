public class Triangle extends Figure implements Printing{

    double a,b,c;
    double p =0;

    Triangle(double a1,double b1,double c1){
       a=a1;
       b=b1;
       c=c1;

    }
    @Override
    public double calculateArea() {
        //  System.out.println("Calculated Area for Triangle");
        p=0.5*(a+b+c);
        if(a+b>c || a+c>b || b+c>a) return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        else{
            System.out.println("Nieprawidlowo podane dlugosci bokow trojkata");
        }
        return 0;
    }

    @Override
    public double calculatePerimeter() {

        if(a+b>c || a+c>b || b+c>a){
            return a+b+c;
//            System.out.println("Calculated Perimeter for Triangle");
//            System.out.println(a+b+c);
        }
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Area nd Perimeter of Triangle");
        calculateArea();
        calculatePerimeter();
    }
}
