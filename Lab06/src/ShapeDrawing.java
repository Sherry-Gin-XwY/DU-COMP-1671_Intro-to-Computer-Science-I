/**
 * 
 * @author Weiye Xu
 * Lab 06
 * September, 30, 2016
 *
 */

import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;

public class ShapeDrawing {
	
	public static final int SIZE = 800;
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		StdDraw.setCanvasSize(SIZE, SIZE);
		StdDraw.setXscale(0, SIZE);
		StdDraw.setYscale(0, SIZE);
		
		System.out.print("Enter the shape you would like to draw (circle, square, triangle): ");
		String shapeEnter = sc.nextLine();
		
		System.out.print("Enter the color (red, green, blue, yellow): ");
		String colorEnter = sc.nextLine();
		
		if (colorEnter.equals("red"))
		{
			StdDraw.setPenColor(StdDraw.RED);
		}
		else if (colorEnter.equals("green"))
		{
			StdDraw.setPenColor(StdDraw.GREEN);
		}
		else if (colorEnter.equals("blue"))
		{
			StdDraw.setPenColor(StdDraw.BLUE);
		}
		else if (colorEnter.equals("yellow"))
		{
			StdDraw.setPenColor(StdDraw.YELLOW);
		}
		else
		{
			StdDraw.setPenColor(StdDraw.BLACK);
			System.out.println("Invalid color. Drawing in black...");
		}
		
		if (shapeEnter.equals("circle"))
		{
			StdDraw.circle(400, 400, 300);
		}
		else if (shapeEnter.equals("square"))
		{
			StdDraw.square(400,  400, 300);
		}
		//I have no idea how to create a triangle, so I use 3 lines to create it instead.
		else if (shapeEnter.equals("triangle"))
		{
			StdDraw.line(200, 150, 600, 150);
			StdDraw.line(600,  150,  400,  650);
			StdDraw.line(400, 650, 200, 150);
		}
	}
}