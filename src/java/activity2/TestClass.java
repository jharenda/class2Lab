/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
import java.util.*; 
/**
 *
 * @author Jennifer
 */
public class TestClass {
    private static final String MORNING = "Morning";
    private static final String AFTERNOON = "Afternoon";
    private static final String EVENING = "Evening";
    
    private static  Calendar cal = Calendar.getInstance(); 
     private static Calendar calMorningEnd = Calendar.getInstance(); 
    private static  Calendar calAfternoonEnd = Calendar.getInstance(); 
    
    
    private static final int morningEnd = 11; 
    private static final int afternoonEnd = 17; 
     
    
    public static void main(String[] args) {
  
  String timeOfDay; 
    
    calMorningEnd.set(Calendar.HOUR, morningEnd);
    calAfternoonEnd.set(Calendar.HOUR, afternoonEnd);
    
   
    if(cal.before(calMorningEnd)){
        System.out.println(MORNING);
    } 
    else if (cal.after(calMorningEnd) && cal.before(calAfternoonEnd)) {
        System.out.println(AFTERNOON);
    }
    else if (cal.after(calAfternoonEnd)){
        System.out.println(EVENING);
    }
        
        
}
}

