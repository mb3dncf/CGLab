import java.io.*;
import java.awt.*;
import java.applet.*;
public class CircleAlgo extends Applet
{
	public void paint(Graphics g)                                  
	{
		int xc,yc,r;
		xc=125;
		yc=125;
		r=60;
		int x=0;
		int y=r;
		int p=3-2*r;
		do
		{
			if(p<0)
				p=p+4*x+6;
			else
			{
				p=p+4*(x-y)+10;
				y=y-1;
			}
			x=x+1;
			g.drawLine(xc+x,yc+y,xc+x,yc+y);
			g.drawLine(x+xc,yc-y,xc+x,yc-y);
			g.drawLine(xc-x,yc+y,xc-x,yc+y);
			g.drawLine(xc-x,yc-y,xc-x,yc-y);
			g.drawLine(xc+y,yc+x,xc+y,yc+x);
			g.drawLine(xc+y,yc-x,xc+y,yc-x);
			g.drawLine(xc-y,yc+x,xc-y,yc+x);
			g.drawLine(xc-y,yc-x,xc-y,yc-x);
		}
		while(x<y);
	}
	public static void main(String[] args) 
	{
		Brescir1 c = new Brescir1();
	}
}