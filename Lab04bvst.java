// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawLine(10,10,80,80);
		g.drawLine(10,10,150,10);
		g.drawLine(150,10,220,80);
		g.drawLine(80,80,220,80);
		g.drawLine(10,10,10,150);
		g.drawLine(10,150,80,220);
		g.drawLine(80,220,80,80);
		g.drawLine(80,220,220,220);
		g.drawLine(220,220,220,80);
		g.drawLine(150,150,10,150);
		g.drawLine(150,150,220,220);
		g.drawLine(150,150,150,10);




		// DRAW SPHERE
		g.drawOval(250,10,200,200);
		g.drawOval(325,10,50,200);
		g.drawOval(300,10,100,200);
		g.drawOval(275,10,150,200);
		g.drawOval(250,85,200,50);
		g.drawOval(250,60,200,100);
		g.drawOval(250,35,200,150);


		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
		g.drawOval(300,300,200,200);
		g.drawLine(400,300,330,470);
		g.drawLine(330,470,470,470);
		g.drawLine(470,470,400,300);
		g.drawOval(353,375,94,95);


		// DRAW APCS
		g.fillRect(10,400,30,10);
		g.fillRect(10,400,10,70);
		g.fillRect(40,400,10,70);
		g.fillRect(10,430,30,10);
		g.fillRect(60,400,10,70);
		g.fillRect(60,400,30,10);
		g.fillRect(90,400,10,30);
		g.fillRect(60,430,40,10);
		g.fillRect(110,400,30,10);
		g.fillRect(110,400,10,60);
		g.fillRect(110,460,30,10);
		g.fillRect(150,400,30,10);
		g.fillRect(150,400,10,30);
		g.fillRect(150,430,30,10);
		g.fillRect(170,430,10,30);
		g.fillRect(150,460,30,10);


		// DRAW PACMEN FLOWER



	}

}
