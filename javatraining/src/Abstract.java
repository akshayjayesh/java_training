abstract   class shape{
    abstract double GetArea();

    abstract  double GetParimeter();

    void Display(){
        System.out.println("This Is a Shape..");
    }
}
class Circle extends shape{
    double r;
    public Circle(double r){
        this.r=r;

    }
    public double GetArea(){
        return 3.14*r*r;
    }
    public double GetParimeter(){
        return 3.14*2*r;
    }
}
public class Abstract {

    public static void main(String []args){
Circle c1=new Circle(6.0);
double a=c1.GetArea();
double b=c1.GetParimeter();
        System.out.println(a);
        System.out.println(b);

    }
}
