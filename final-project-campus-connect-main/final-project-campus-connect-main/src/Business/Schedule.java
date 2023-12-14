/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Schedule {
     private ArrayList<DaySchedule> daySchedules;
    
    public Schedule() {
        daySchedules = new ArrayList<>();
    }
    
    public ArrayList<DaySchedule> getDaySchedules() {
        return daySchedules;
    }
    
    public void addDaySchedule(DaySchedule daySchedule) {
        daySchedules.add(daySchedule);
    }
}
