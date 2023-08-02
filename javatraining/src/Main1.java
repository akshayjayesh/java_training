import org.w3c.dom.ls.LSOutput;

class Vehicle{
    int model;
    int year;
//    public Vehicle(int Model,int Year){
//        this.year=Year;
//        this.model=Model;
//
//    }
    public void Start(int year){
        System.out.println("Start...Method");
    }
    public void stop(){
        System.out.println("Stop...Method");
    }
}
class Car extends Vehicle{

}
class bike extends Vehicle{

}
public class Main1 {
    public static void main(String[]args){

    }
}
