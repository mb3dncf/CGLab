import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class RectangleDraw extends JFrame 
{
  
	public RectangleDraw()
	{
		setTitle("RectangleDraw");
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawRect(100, 100, 600, 300);
		
	
	}
	public static void main(String[] args) 
	{
		new RectangleDraw();
	}

}
