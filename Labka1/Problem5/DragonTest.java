package Labka1.Problem5;

public class DragonTest {
    public static void main(String[] args){
        Person p1 = new Person(Gender.BOY);
    Person p2 = new Person(Gender.GIRL);
    Person p3 = new Person(Gender.BOY);
    Person p4 = new Person(Gender.GIRL);

    Person[] people = {p1, p2, p3, p4};

    DragonLaunch dragon = new DragonLaunch();

    boolean result = dragon.willDragonEatOrNot(people);

    System.out.println("Will dragon eat everyone? " + result);

    }
}
