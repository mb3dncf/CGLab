import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class TriangleDraw extends JFrame
{

	public TriangleDraw()
	{
		setTitle("TriangleDraw");
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.drawLine(100, 250, 500, 200);
		g.setColor(Color.YELLOW);
		g.drawLine(100, 250, 300, 100);
		g.setColor(Color.YELLOW);
		g.drawLine(300, 100, 500, 200);
		
	
	}

	public static void main(String[] args) 
	{
		new TriangleDraw();
	}

}