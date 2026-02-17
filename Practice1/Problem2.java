package Practice1;
import java.util.Scanner;
public class Problem2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Print your number: ");
        double x = input.nextInt();
        double area = x * x;
        double perimetr = x * 4;
        double diagonal = x * Math.sqrt(2);
        System.out.println("Your number is : " + x);
        System.out.println("Area = " + area);
        System.out.println("Perimetr = " + perimetr);
        System.out.println("Diagonal = " + diagonal);
    }
}