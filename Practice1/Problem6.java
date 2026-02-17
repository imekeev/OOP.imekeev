package Practice1;
import java.util.Scanner;

public class Problem6 {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write your word: ");
        String word = input.nextLine();
        String reversed = "";
        for (int i = word.length() - 1 ; i>=0 ; i--){
            reversed = reversed + word.charAt(i);
        }
        if(word.equals(reversed)){
            System.out.print("Your word is palindrome");
        }
        else{
            System.out.println("Your word isnt palindrome");
        }
        input.close();

    }
}
