package Labka1;

public class Data {
    private double sum;
    private double max;
    private int count;
    public Data(){
        sum=0;
        max=0;
        count=0;
    }
    public void addValue(double value){
        sum+=value;
        count++;
        if(count==1){
            max = value;
        }
        else if(value > max){
            max = value;
        }
    }
    public double getAverage(){
        if(count ==0){
            return 0;
        }
        else{
            return sum/count;
        }

    }
    public double getMax(){
        return max;
    }
}
