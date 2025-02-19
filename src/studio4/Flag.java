package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		 
		StdDraw.setPenColor(2, 48, 32);
		StdDraw.filledRectangle(.175, .5, .075, .25);
		StdDraw.setPenColor(2, 48, 32);
		StdDraw.filledRectangle(.825, .5, .075, .25);
		StdDraw.setPenColor(173, 216, 230);
		StdDraw.filledRectangle(.5, .5, .25, .25);
		
		StdDraw.setPenColor(255, 255, 197);
		StdDraw.filledCircle(.5, .5, .1);
		
		StdDraw.setPenColor(2, 48, 32);
		StdDraw.filledCircle(.3, .3, .02);
		StdDraw.setPenColor(2, 48, 32);
		StdDraw.filledCircle(.7, .3, .02);
		StdDraw.setPenColor(2, 48, 32);
		StdDraw.filledCircle(.3, .7, .02);
		StdDraw.setPenColor(2, 48, 32);
		StdDraw.filledCircle(.7, .7, .02);
		
		StdDraw.setPenColor(255, 255, 197);
		StdDraw.line(.5, .4, .5, .3);
		StdDraw.setPenColor(255, 255, 197);
		StdDraw.line(.5, .6, .5, .7);
		StdDraw.setPenColor(255, 255, 197);
		StdDraw.line(.4, .5, .3, .5);
		StdDraw.setPenColor(255, 255, 197);
		StdDraw.line(.6, .5, .7, .5);
		
	}
}