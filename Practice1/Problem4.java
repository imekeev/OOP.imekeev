package Practice1;
import java.util.Scanner;
public class Problem4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first nymber: ");
        int a = input.nextInt();

        System.out.println("Enter your second number: ");
        int b =input.nextInt();

        System.out.println("Enter your theird number: ");
        int c = input.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }
        else if(c>max){
            max = c;
        
        }
        System.out.println("The maximum number is: " + max);
    }
}