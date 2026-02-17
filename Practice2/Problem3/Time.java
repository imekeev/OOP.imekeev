package Practice2.Problem3;

public class Time {
    private int hour ;
    private int minute;
    private int second;
    public Time(int hour , int minute , int second){
        setTime(hour , minute , second);
    }
    public void setTime(int hour , int minute , int second){
        if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59){
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public String toUniversal(){
        return String.format("%02d:%02d:%02d" , hour , minute , second);
    }
    public String toStandard() {
        String period = (hour < 12) ? "AM" : "PM";
    
        int standardHour = hour % 12;
        if (standardHour == 0) standardHour = 12;
    
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }
    public Time add(Time other){
        int totalSeconds = this.second + other.second;
        int extraMinutes = totalSeconds/60;
        int newSecond = totalSeconds % 60;
        int totalMinutes = this.minute + other.minute + extraMinutes;
        int extraHours = totalMinutes / 60;
        int newMinute = totalMinutes % 60;
        int totalHours = this.hour + other.hour + extraHours;
        int newHour = totalHours % 24;
        return new Time(newHour , newMinute , newSecond );


    }
    
}
