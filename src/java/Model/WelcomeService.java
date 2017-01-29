/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author Jennifer
 */
public class WelcomeService {

    private static final String MORNING = "Morning";
    private static final String AFTERNOON = "Afternoon";
    private static final String EVENING = "Evening";

    private Calendar cal = Calendar.getInstance();
    private Calendar calMorningEnd = Calendar.getInstance();
    private Calendar calAfternoonEnd = Calendar.getInstance();

    private static final int MORNING_END = 11;
    private static final int AFTERNOON_END = 17;

    private String timeOfDay;
    private String returnMessage;
    private final String YELLOW = "#E9F31B";
    private String color; 

    private String returnTimeOfDay() {

        calMorningEnd.set(Calendar.HOUR, MORNING_END);
        calAfternoonEnd.set(Calendar.HOUR, AFTERNOON_END);

        if (cal.before(calMorningEnd)) {
            timeOfDay = MORNING;
        } else if (cal.before(calAfternoonEnd)) {
            timeOfDay = AFTERNOON;
        } else if (cal.after(calAfternoonEnd)) {
            timeOfDay = EVENING;
        }
        return timeOfDay;
    }

    public String getGreeting(String name) {
        return returnTimeOfDay() + " " + name + "!";
    }
public String getColor(){
    returnTimeOfDay();
    if (timeOfDay.equals(MORNING)){
        color = YELLOW; 
    }
    else color = "#1BF384";
    return color;

}
}
