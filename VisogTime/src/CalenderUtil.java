import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/*
 * @Amiya Kumar Mahapatro
 */
public class CalenderUtil{
	 

    public static void main(String args[]) {
    
    	      Date dNow = new Date( );
    	      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");    
              TimeZone tz = Calendar.getInstance().getTimeZone();
              System.out.println(tz.getDisplayName()); // (i.e. Moscow Standard Time)
              System.out.println(tz.getID());
              System.out.println("Current Date: " + ft.format(dNow));
    
    }

}


