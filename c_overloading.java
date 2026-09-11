
// Constructor overloading is the technique of create multiple constructors in a class with different parameter
public class c_overloading{
    static int a,b,c;
    c_overloading(){
        System.out.println("Default");
    }
    c_overloading(int a){
        c_overloading.a = a;
    }
    c_overloading(int a,int b){
        c_overloading.a = a;
        c_overloading.b = b;
    }
    c_overloading(int a,int b,int c){
        c_overloading.a = a;
        c_overloading.b = b;
        c_overloading.c = c;
    }

    public static void main(String[] args) {
        c_overloading obj1 = new c_overloading();
        c_overloading obj2 = new c_overloading(10);
        System.out.println(a);
        c_overloading obj3 = new c_overloading(10,20);
        System.out.println(a+" "+b);
        c_overloading obj4 = new c_overloading(10,20,30);
        System.out.println(a+" "+b+" "+c);
    }

}