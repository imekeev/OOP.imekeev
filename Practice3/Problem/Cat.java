package Practice3.Problem;

class Cat extends Animal{
    Cat(String name , int age){
        super(name , age);
    }
    void makeSound(){
        System.out.println("Meow");
    }
    void makeSound(String mood){
        System.out.println("Cat says " + mood);
    }
    Cat(){
        super(); 
        System.out.print("Cat created");
    }
}