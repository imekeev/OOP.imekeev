package Labka1.Problem4;

public class GradeBook {
    private Course course;
    private Student[] students;
    private double[] grades;
    public GradeBook(Course course , Student[] students , double[] grades){
        this.course = course;
        this.students = students;
        this.grades = grades;

    }
    public double getAverage(){
        double sum = 0;
        for(int i = 0 ; i<grades.length ;i++){
            sum+=grades[i];
        }
        return sum / grades.length;
    }
    public double getMax(){
        double max = grades[0];
        for(int i = 0 ; i<grades.length ; i++){
            if(grades[i]>max){
                max = grades[i];
            }
        }
        return max;
    }
    public double getMin(){
        double min = grades[0];
        for(int i = 0 ; i<grades.length ; i++){
            if(grades[i]<min){
                min = grades[i];
            }
        }
        return min;
    }
    public void printStudents(){
        for(int i = 0 ; i<students.length ; i++){
            System.out.println(students[i].getName() + " (ID: " + students[i].getId() + ") Grade: " + grades[i]);
        }
    }
}
