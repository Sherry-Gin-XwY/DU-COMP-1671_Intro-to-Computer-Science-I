/**
 * 
 * @author Weiye Xu
 * Project 2
 * October, 6, 2016
 *
 */


import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;

public class RectangleIntersection {
	
	public static final int size = 800;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		StdDraw.setCanvasSize(size, size);
		StdDraw.setXscale(0, size);
		StdDraw.setYscale(0, size);
		
		System.out.println("Please enter the center coordiantes for the first "
				+ "rectange you want to draw");
		System.out.print("X is ");
		double XCC1 = sc.nextDouble();
		System.out.print("Y is ");
		double YCC1 = sc.nextDouble();
		
		System.out.print("widths: ");
		double widths1 = sc.nextDouble();
		
		System.out.print("heights: ");
		double heights1 = sc.nextDouble();
		
		
		System.out.println("Please enter the center coordiantes for the second "
				+ "rectange you want to draw");
		System.out.print("X is ");
		double XCC2 = sc.nextDouble();
		System.out.print("Y is ");
		double YCC2 = sc.nextDouble();
		
		System.out.print("widths: ");
		double widths2 = sc.nextDouble();
		
		System.out.print("heights: ");
		double heights2 = sc.nextDouble();
		
		
		
		double XP11, XP12, XP13, XP14;
		double YP11, YP12, YP13, YP14;
		
		XP11 = XCC1 - (widths1/2);
		XP12 = XCC1 + (widths1/2);
		XP13 = XCC1 + (widths1/2);
		XP14 = XCC1 - (widths1/2);
		
		YP11 = YCC1 + (heights1/2);
		YP12 = YCC1 + (heights1/2);
		YP13 = YCC1 - (heights1/2);
		YP14 = YCC1 - (heights1/2);
		
		double XP21, XP22, XP23, XP24;
		double YP21, YP22, YP23, YP24;
		
		XP21 = XCC2 - (widths1/2);
		XP22 = XCC2 + (widths1/2);
		XP23 = XCC2 + (widths1/2);
		XP24 = XCC2 - (widths1/2);
		
		YP21 = YCC2 + (heights1/2);
		YP22 = YCC2 + (heights1/2);
		YP23 = YCC2 - (heights1/2);
		YP24 = YCC2 - (heights1/2);
		
		if((XP11 - XP22 <=0) && (XP12 - XP21 >=0) && (XP13 - XP24 >=0) && (XP14 - XP23 <=0) && (YP11 - YP24 >=0) && (YP12 - YP23 >=0) && (YP13 - YP22 <=0) && (YP14 - YP21 <=0))
		{
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledRectangle(XCC1, YCC1, widths1/2, heights1/2);
			StdDraw.filledRectangle(XCC2, YCC2, widths1/2, heights1/2);
			System.out.println("Overlap");
		}
		else
		{
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledRectangle(XCC1, YCC1, widths1/2, heights1/2);
			StdDraw.filledRectangle(XCC2, YCC2, widths1/2, heights1/2);
			System.out.println("do not intersect");
		}
	}

}
