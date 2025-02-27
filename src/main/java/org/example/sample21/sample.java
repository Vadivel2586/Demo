package org.example.sample21;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class sample {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(6, 0);  // 6:00 AM
        LocalTime endTime = LocalTime.of(18, 0);   // 6:00 PM

        // Define a time step (e.g., 1 hour)
        LocalTime step = LocalTime.of(1, 0); // 1 hour interval

        // Create a formatter to output in 12-hour format with AM/PM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a"); // 12-hour format with AM/PM

        LocalTime currentTime = startTime;

        while (!currentTime.equals(endTime)) {
            LocalTime nextTime = currentTime.plusHours(step.getHour()).plusMinutes(step.getMinute());
            System.out.println(currentTime.format(formatter) + " to " + nextTime.format(formatter));
            currentTime = nextTime;
        }
    }
}
