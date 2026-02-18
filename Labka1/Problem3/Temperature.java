package Labka1.Problem3;

public class Temperature {
    private double value;
    private char scale;
    public Temperature(){
        value = 0;
        scale = 'C';

    }
    public Temperature(double value){
        this.value = value;
        this.scale = 'C';

    }
    public Temperature(double value , char scale){
        this.value = value;
        this.scale = scale;
    }
    public Temperature(char scale){
        this.value = 0;
        this.scale = scale;
    }
    public double toCelsius(){
        if(scale == 'C'){
            return value;
        }
        else{
            return (value - 32) * 5 / 9;
        }
    }
    public double toFahrenheit(){
        if(scale == 'F'){
            return value;
        }
        else{
            return value * 9 / 5 + 32;
        }
    }
    public char getScale(){
        return scale;
    }
    public void setValue(double value){
        this.value = value;
    }
    public void setScale(char scale){
        this.scale = scale;
    }
}
