import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int x = input.nextInt();
        if(x<0 || x>100){
            System.out.println("Its wrong answer!!!");
        }
        else if(x>=95){
            System.out.println("Your score is A+");
        }
        else if(x>=90){
            System.out.println("Your score is A-");
        }
        else if(x>=85){
            System.out.println("Your score is B+");
        }
        else if(x>=80){
            System.out.println("Your score is B");
        }
        else if(x>=75){
            System.out.println("Your score is B-");
        }
        else if(x>=70){
            System.out.println("Your score is C+");
        }
        else if(x>=65){
            System.out.println("Your score is C");
        }
        else if(x>=60){
            System.out.println("Your score is C-");
        }
        else if(x>=55){
            System.out.println("Your score is D+");
        }
        else if(x>=50){
            System.out.println("Your score is D");
        }
        else{
            System.out.println("Your score is F");
        }
    }
}
