abstract class Shape{
    abstract double area();
    public void displayArea(){
        System.out.println("Area : " + area());
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        double A = 3.14*radius*radius;
        return A;
    }
}
class Rectangle extends Shape{
    double len;
    double wid;
    Rectangle(double l,double b){
        this.len = l;
        this.wid = b;
    }
    double area(){
        double A = len*wid;
        return A;
    }
}



public class useCase2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}
