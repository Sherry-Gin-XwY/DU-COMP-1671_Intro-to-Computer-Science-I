/**
 * 
 * @author Weiye Xu
 * Lab 10
 * October, 19, 2016
 *
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Clock {
	
	private int hour = 0;
	private int minute = 0;
	
	public void displayTime()
	{
		DecimalFormat newHour = new DecimalFormat("00");
		DecimalFormat newMinute = new DecimalFormat("00");
		System.out.println(newHour.format(hour) + ":" +newMinute.format(minute));
	}
	
	public void tick()
	{
		minute++;
		if (minute > 59)
		{
			hour++;
			minute = 0;
		}
		if (hour == 24)
		{
			reset();
		}
	}
	
	public void reset()
	{
		hour = 0;
		minute = 0;
	}
}

