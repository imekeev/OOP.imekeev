package Labka1;
import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args){
        Data data = new Data();
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.equals("Q")){
                break;
            }
            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }
        System.out.println("Average : " + data.getAverage());
        System.out.println("Max number: "  + data.getMax());
    }
    
}
