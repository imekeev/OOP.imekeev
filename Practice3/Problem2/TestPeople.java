package Practice3.Problem2;
public class TestPeople {
    public static void main(String[] args){
        
        java.util.HashSet<Person> people = new java.util.HashSet<>();
        Student s1 = new Student("Imekeev", "Almaty", "IT", 2, 50000);
        Staff st1 = new Staff("Ronaldo", "Lissabon", "LTU", 300000);
        people.add(s1);
        people.add(st1);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("1 - Print all");
            System.out.println("2 - Add new");
            System.out.println("0 - Exit");
            System.out.print("Choose: ");
        
            int choice = sc.nextInt();
        
            if (choice == 0) break;
        
            if (choice == 1) {
                for (Person p : people) {
                    System.out.println(p);
                }
            } 
            else if (choice == 2) {
                System.out.println("1 - Person");
                System.out.println("2 - Student");
                System.out.println("3 - Staff");
                System.out.print("Type: ");
                int type = sc.nextInt();
                sc.nextLine();

                System.out.println("Selected type = " + type);
                if (type == 1) {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
            
                    System.out.print("Address: ");
                    String address = sc.nextLine();
            
                    people.add(new Person(name, address));
                    System.out.println("Added Person");
                }
                else if (type == 2) {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Program: ");
                    String program = sc.nextLine();
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    System.out.print("Fee: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();
                    people.add(new Student(name, address, program, year, fee));
                    System.out.println("Added Student");
                }
                else if (type == 3) {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                
                    System.out.print("School: ");
                    String school = sc.nextLine();
                
                    System.out.print("Pay: ");
                    double pay = sc.nextDouble();
                    sc.nextLine();
                
                    people.add(new Staff(name, address, school, pay));
                    System.out.println("Added Staff");
                }
                
                
            }
        }
    }
    

}
