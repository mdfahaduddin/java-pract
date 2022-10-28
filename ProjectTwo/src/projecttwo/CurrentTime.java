/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author MD Fahad
 */
public class CurrentTime {
    public static void main(String[] args) {
        LocalTime timenow = LocalTime.now();
        System.out.println(timenow);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
       String ftime = timenow.format(formatter);
        System.out.println(ftime);
    }
}
