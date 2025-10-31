// Represents the hh:mm time format using an AM/PM format. 

import javax.print.DocFlavor.STRING;

public class TimeFormat {
	public static void main(String[] args) {
		String timeType = "";
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
	if (hours < 12 ) 
	{ 
		timeType = "AM";
        System.out.print(hours);
	}
	else if (hours >= 12){
		timeType = "PM";
	if (hours > 12 )	
		System.out.print(hours-12);
	else 
	    System.out.print(hours);
		}

        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    if (minutes <10)
	{
		System.out.print(":0" + minutes);
	}
    else 
	{
		System.out.print(":" + minutes);
	} 
        System.out.print(" " + timeType );
        }
}