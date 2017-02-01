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
    private static final int AFTERNOON_END = 14;

    private String timeOfDay;
    private String returnMessage;

  

    private String returnTimeOfDay() {

        calMorningEnd.set(Calendar.HOUR, MORNING_END);
        calAfternoonEnd.set(Calendar.HOUR, AFTERNOON_END);
        
       if (cal.HOUR < calMorningEnd.HOUR) {
              timeOfDay = MORNING;
        } else if ( cal.HOUR > calMorningEnd.HOUR && cal.HOUR < calAfternoonEnd.HOUR) {
           timeOfDay = AFTERNOON; 
    }
    else 
    timeOfDay = EVENING; 
       
           
        return timeOfDay;
    }

    public String getGreeting(String name) {
        return  returnTimeOfDay() + " " + name + "!";
    }


}


/**
 * 
 * used old pre java 8 exampe
 * joda time if using pre java 8 
 * 
 * 
 * 
 * 
 * 
 * 
 */