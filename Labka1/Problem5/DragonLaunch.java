package Labka1.Problem5;

public class DragonLaunch {
    public boolean willDragonEatOrNot(Person[] people){
        int boys = 0;
        int girls = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getGender() == Gender.BOY) {
                boys++;
            } else {
                girls++;
            }
        }
    
        return boys == girls;

    }
}
