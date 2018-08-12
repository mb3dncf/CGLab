import java.awt.*;
import java.applet.*;
public class DrawFlag extends Applet
{
	
	public void paint (Graphics g)
	{
		g.setColor(new Color(46, 139, 89));
        g.fillRect(80, 80, 130, 80);
        g.setColor(Color.RED);
        g.fillOval(120, 100, 40, 40);
	}
	
	public static void main(String[] args) 
	{
		new DrawFlag();
	}

}