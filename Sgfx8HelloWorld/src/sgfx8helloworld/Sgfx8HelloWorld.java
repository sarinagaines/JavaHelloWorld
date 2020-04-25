/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sgfx8helloworld;

/* found what libraries to import on the website below
https://mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/*/
import java.util.Date; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 * @author Sarina Gaines
 *          Sgfx8
 *          1/26/2020
 *          Challenge  2: Hello World
 */

public class Sgfx8HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println("Hello World!"); 
        
        String myPawPrint = "sgfx8"; 
        
        invokeMe(myPawPrint); 
    }
            

    public static void invokeMe(String pawPrint){
        
          System.out.println(pawPrint); 
        
        /* figured out how to format date and create date from the website below: 
            https://mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
          
          read up more on how to format and add AM/PM from the website below:
          https://stackoverflow.com/questions/18734452/display-current-time-in-12-hour-format-with-am-pm*/
         DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd h:mm a"); 
         Date date = new Date();
         System.out.println(sdf.format(date));
    }
    
}
