import java.util.*;
public class preDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[]arr = {1,3,4,5};
            int i,b;
            i = sc.nextInt();
            b = sc.nextInt();
            System.out.println(arr[i]/b);

        }
        catch(ArithmeticException e){
            System.out.println("Exception caught is " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught is " + e.getMessage());
        }
        finally{
            sc.close();

        }
        
    }
}
