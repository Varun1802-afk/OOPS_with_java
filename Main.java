package src;
// using instance
import java.util.*;

class Rectangle{
    int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    void area(){
        System.out.println("Area of rectangle : "+ l*b);
    }

}
class Circle{
    int r;
    Circle(int r){
        this.r = r;
    }

    void area(){
        System.out.println("Area of circle : "+ (3.14*r*r));
    }
}

class Main{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value for rectangle :");
        a = sc.nextInt();
        b = sc.nextInt();
        Rectangle obj = new Rectangle(a, b);
        obj.area();


        System.out.println("Enter the value for circle :");
        int r = sc.nextInt();
        Circle cir = new Circle(r);
        cir.area();
    
    }
}
