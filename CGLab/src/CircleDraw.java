import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class CircleDraw extends JFrame
{

	public CircleDraw()
	{
		setTitle("CircleDraw");
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.MAGENTA);
		g.drawOval(200, 200, 200, 200);
		g.fillOval(200, 200, 200, 200);

	}
	public static void main(String[] args) 
	{
		new CircleDraw();
	}

}
