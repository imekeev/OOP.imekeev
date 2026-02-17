package Practice1;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double x = input.nextInt();
        if(x<0){
            System.out.println("Your number negative");
        }
        else if(x>0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is zero");
        }
        if(x%2==0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        }
        input.close();
    }
}
