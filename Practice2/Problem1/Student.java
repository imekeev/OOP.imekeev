package Practice2.Problem1;

public class Student {
    private String name;
    private int id;
    private int year;

    public Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;

    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYear(){
        return year;
    }
    public void setName(String name){
        if(name !=null && !name.isEmpty()){
            this.name = name;
        }
    }
    public void setYear(int year){
        if(year > 0){
            this.year = year;
        }
    }
    public boolean isSenior(){
        return year>=4;
    }
    public boolean hasName(String cheackName){
        return name.equals(cheackName);
    }
    public void changeYear(int newYear){
        if(newYear != year && newYear>0){
            year = newYear;
        }
    }
    public boolean issameYear(Student other){
        return this.year == other.year;
    }


    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Year: " + year);
    }

    void nextYear() {
        year++;
    }
}
