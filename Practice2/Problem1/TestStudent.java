package Practice2.Problem1;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Beibit" , 1 , 2);
        Student s2 = new Student("Didar" , 2 , 2);
        s1.printInfo();
        System.out.println("----Change data----");
        s1.setName("Beibit I");
        s1.setYear(3);
        s1.printInfo();
        s1.setYear(-5);
        System.out.println("Is SENIOR?: " + s1.isSenior());
        System.out.println(s1.hasName("Beibit I"));
        s1.changeYear(5);
        s1.printInfo();
        System.out.println("-----");
        s2.printInfo();
        System.out.println("Is SENIOR?: " + s2.isSenior());
        System.out.println(s2.hasName("Didar"));
        System.out.println(s1.issameYear(s2));
    }
}
