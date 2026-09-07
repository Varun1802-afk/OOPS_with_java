import java.util.*;
public class practice {

    static int sumOfArray(int[]arr){
        int sum = 0;
        int i;
        for(i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    static void sortArray(int[]arr){
        int i,j;
        for(i=0;i<(arr.length-1);i++){
            for(j=i+1;j<arr.length-1;j++){
                if(arr[j] > arr[j+1] && j != arr.length){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void display(int[]arr){
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int i;
        for(i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array is : "+ sumOfArray(arr));
        sortArray(arr);
        display(arr);
        sc.close();
    }
}
