/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MD Fahad
 */
public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String CurrentDate =  dateFormat.format(date);
        System.out.println(CurrentDate);
        
    }
}
