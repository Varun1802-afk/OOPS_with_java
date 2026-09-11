// design a user-defined exception class for validating age of a person to vote
import java.util.*;


public class ageValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        try {
            ageCheck(age);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
        sc.close();
    }   

    static void ageCheck(int age) throws InvalidAgeException{
        if(age<18) {
            throw new InvalidAgeException("Age is invaild");
        }else{
            System.out.println("Eligible to vote.");
        }
    }

}


class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
