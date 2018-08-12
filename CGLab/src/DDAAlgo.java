import java.io.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

public class DDAAlgo extends Applet
{
	public void paint(Graphics g)
	{
   double dx,dy,steps,x,y,k;
   double xc,yc;
   double x1=200,y1=500,x2=600,y2=200;
   dx=x2-x1;
   dy=y2-y1;
   if(Math.abs(dx)>Math.abs(dy))
	   steps=Math.abs(dx);
   else
	   steps=Math.abs(dy);
   xc=(dx/steps);
   yc=(dy/steps);
   x=x1;
   y=y1;
   g.fillOval(200,500,5,5);
		for(k=1;k<=steps;k++)
		{
		x=x+xc;
		y=y+yc;
		g.fillOval((int)x,(int)y,5,5);
		}
	}
	public static void main(String[] args) 
	{
		new DDAAlgo();
	}
}
