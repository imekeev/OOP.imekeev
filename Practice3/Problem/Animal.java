package Practice3.Problem;

public class Animal {
    String name;
    int age;
    Animal(String name , int age){
        this.name= name;
        this.age = age;
    }
    void makeSound(){
        System.out.println("Animal makes a sound! ");
    }
    Animal(){
        System.out.println("Animal created: ");
    }
}
