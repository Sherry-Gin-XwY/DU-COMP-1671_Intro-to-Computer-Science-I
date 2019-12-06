/**
 * 
 * @author Weiye Xu
 * Lab 10
 * October, 19, 2016
 *
 */

public class ClockDriver {
	
	public static void main(String [] args) {
		
		Clock t1 = new Clock();
		for (int h = 0; h < 24; h ++)
		{
			for (int m = 0; m < 60; m++)
			{
				t1.tick();
				t1.displayTime();
			}
		}
	}
}
