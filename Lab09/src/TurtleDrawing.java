/**
 * 
 * @Weiye Xu
 * Lab 09
 * October, 12, 2016
 *
 */

import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class TurtleDrawing {
	
	public static final int XSize = 500;
	public static final int YSize = 500;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the turtle drawing program.");
		
		Scanner keyboard = new Scanner(System.in);
		
		StdDraw.setCanvasSize(XSize, YSize);
		StdDraw.setXscale(0, XSize);
		StdDraw.setYscale(0, YSize);
		
		Random XC = new Random();
		Random YC = new Random();
		
		int XCR = XC.nextInt(XSize);
		int YCR = YC.nextInt(YSize);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(XCR, YCR, 7);
		
		boolean PenDown = false;
		
		int Direction = 1;
		String Order = null;
		
		
		while(true)
		{
			System.out.print("Enter a command: ");
			Order = keyboard.nextLine();
			
			if(Order.equalsIgnoreCase("forward"))
			{
				if(Direction == 1)
				{
					StdDraw.filledCircle(XCR+=20, YCR, 7);
				}
				else if (Direction == 2)
				{
					StdDraw.filledCircle(XCR, YCR+=20, 7);
				}
				else if (Direction == 3)
				{
					StdDraw.filledCircle(XCR-=20,  YCR, 7);
				}
				else if (Direction == 4)
				{
					StdDraw.filledCircle(XCR, YCR-=20, 7);
				}
				
				if(PenDown == true)
				{
					if(Direction == 1)
					{
						StdDraw.line(XCR-20, YCR, XCR, YCR);
					}
					else if(Direction ==2)
					{
						StdDraw.line(XCR, YCR-20, XCR, YCR);
					}
					else if(Direction == 3)
					{
						StdDraw.line(XCR+20,  YCR, XCR, YCR);
					}
					
					else if(Direction == 4)
					{
						StdDraw.line(XCR,  YCR+20,  XCR,  YCR);
					}
				}
			}
			else if (Order.equalsIgnoreCase("left"))
			{
				if(Direction == 1)
				{
					Direction = 2;
				}
				
				else if (Direction ==2)
				{
					Direction = 3;
				}
				else if (Direction ==3)
				{
					Direction =4;
				}
				else if (Direction == 4)
				{
					Direction = 1;
				}
			}
			
			else if (Order.equalsIgnoreCase("right"))
			{
				if (Direction ==1)
				{
					Direction = 4;
				}
				else if(Direction == 2)
				{
					Direction = 1;
				}
				else if (Direction ==3)
				{
					Direction = 2;
				}
				else if (Direction ==4)
				{
					Direction = 3;
				}
			}
			
			else if (Order.equalsIgnoreCase("Pendown"))
			{
				PenDown = true;
			}
			
			else if (Order.equalsIgnoreCase("Penup"))
			{
				PenDown = false;
			}
			
			else if (Order.equalsIgnoreCase("randomcolor"))
			{
				Random R = new Random();
				int color = R.nextInt(4);
				if(color == 0)
				{
					StdDraw.setPenColor(StdDraw.RED);
				}
				if(color == 1)
				{
					StdDraw.setPenColor(StdDraw.BLUE);
				}
				if(color == 2)
				{
					StdDraw.setPenColor(StdDraw.YELLOW);
				}
				if(color == 3)
				{
					StdDraw.setPenColor(StdDraw.GREEN);
				}
			}
			
			else if (Order.contentEquals("quit"))
			{
				System.out.println("Turtle drawing program end, see you again!");
				break;
			}
			else
			{
				System.out.println("Invalid command:(");
			}
		}
	}
}