import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class EllipseDraw extends JFrame
{

	public EllipseDraw()
	{
		setTitle("EllipseDraw");
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.drawOval(250, 250, 200, 100);
		g.fillOval(250, 250, 200, 100);

	}
	public static void main(String[] args) 
	{
		new EllipseDraw();
	}

}