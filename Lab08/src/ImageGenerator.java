/**
 * 
 * @author Weiye Xu
 * Lab 08
 * October, 7, 2016
 *
 */

import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import java.util.Random;

public class ImageGenerator {
	
	// public static final int xSize = 800;
	// public static final int ySize = 800;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter your canvas size. ");
		System.out.print("xSize: ");
		int xSize = sc.nextInt(); 
		System.out.print("ySize: ");
		int ySize = sc.nextInt();
		
		System.out.println("Please wait a moment, openning a new canvas!");
		
		StdDraw.setCanvasSize(xSize, ySize);
		StdDraw.setXscale(0, xSize);
		StdDraw.setYscale(0, ySize);
		
		System.out.print("How many rectangles do you want to draw: ");
		int number = sc.nextInt();
		
		System.out.println("Please enter the rectangle data!");
		System.out.print("widths: ");
		double widths = sc.nextDouble();
		System.out.print("heights: ");
		double heights = sc.nextDouble();
		
		
		double xc, yc;
		
		xc = xSize/2;
		yc = ySize/2;
		
		float R1 = (float)ySize/xSize;
		float R2 = (float)xSize/ySize;
		
		Random XCR = new Random();
		Random YCR = new Random();
		
		for (int i = 0; i <number; i++)   				 //you can enter any mount of rectangles you want
		{
			double XCRChange = XCR.nextInt(xSize);
			double YCRChange = YCR.nextInt(ySize);
			
			
			//Red
			if ((xSize == ySize) && (XCRChange < xc) && (YCRChange >= XCRChange))
			{
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			else if ((xSize < ySize) && (XCRChange < xc) && (YCRChange/R1) >= XCRChange)
			{
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			else if ((xSize > ySize) && (XCRChange < xc) && (YCRChange >= XCRChange/R2))
			{
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			
			
			//Yellow
			else if ((xSize == ySize) && (XCRChange < xc) && (YCRChange <= XCRChange))
			{
				StdDraw.setPenColor(StdDraw.YELLOW);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			else if ((xSize < ySize) && (XCRChange < xc) && (YCRChange/R1) <= XCRChange)
			{
				StdDraw.setPenColor(StdDraw.YELLOW);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			else if ((xSize > ySize) && (XCRChange < xc) && (YCRChange) <= XCRChange/R2)
			{
				StdDraw.setPenColor(StdDraw.YELLOW);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			
			
			//GREEN
			else if ((xSize == ySize) && (XCRChange > xc) && (XCRChange <= YCRChange))
			{
				StdDraw.setPenColor(StdDraw.GREEN);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			else if ((xSize < ySize) && (XCRChange > xc) && (XCRChange <= YCRChange/R1))
			{
				StdDraw.setPenColor(StdDraw.GREEN);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			else if ((xSize > ySize) && (XCRChange > xc) && (XCRChange/R2 <= YCRChange))
			{
				StdDraw.setPenColor(StdDraw.GREEN);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			
			
			//Blue
			else if ((xSize == ySize) && (XCRChange > xc) && (XCRChange >= YCRChange))
			{
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
			
			else if ((xSize < ySize) && (XCRChange > xc) && (XCRChange >= YCRChange/R1))
			{
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			else if ((xSize > ySize) && (XCRChange > xc) && (XCRChange/R2 >= YCRChange))
			{
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledRectangle(XCRChange, YCRChange, widths, heights);
			}
			
		}
	}

}
