import java.awt.Color;
import java.awt.Graphics;

/*
 * Author: Aaron Allen
 * Date: 4/2/19
 * Assignment 1 ITC 155
 */

public class Assignment1 
{
	public static void main(String[] args) 
	{
		//Creates a yellow panel
		DrawingPanel panel = new DrawingPanel(280, 200);
		panel.setBackground(Color.YELLOW);
		
		//Allows ability to draw shapes
		Graphics g = panel.getGraphics();

		//Blue circle left
		g.setColor(Color.BLUE);
		g.fillOval(60, 45, 50, 50);
		
		//Blue circle right
		g.setColor(Color.BLUE);
		g.fillOval(160, 45, 50, 50);
		
		//Red square
		g.setColor(Color.RED);
		g.fillRect(85, 70, 100, 100);

		//Line in the middle of square 
		g.setColor(Color.BLACK);
		g.drawLine(85, 125, 185, 125);
	}

}
