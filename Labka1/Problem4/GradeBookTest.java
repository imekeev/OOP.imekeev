package Labka1.Problem4;

public class GradeBookTest {
    public static void main(String[] args){
        Student s1 = new Student("Imekeev", 1);
        Student s2 = new Student("Beibit", 2);
        Student s3 = new Student("Zhanbulatovich", 3);
        Student[] students = {s1, s2, s3};
        double[] grades = {100 , 100 , 100};
        Course course = new Course("OOP");
        GradeBook gradeBook = new GradeBook(course , students, grades);
        gradeBook.printStudents();
        System.out.println("Average: " + gradeBook.getAverage());
        System.out.println("Max: " + gradeBook.getMax());
        System.out.println("Min: " + gradeBook.getMin());

    }
}
