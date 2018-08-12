import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class LineDraw extends JFrame
{
	
	public LineDraw()
	{
		setTitle("LineDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawLine(300, 300, 500, 100);
	}
	public static void main(String[] args) 
	{
	
		LineDraw j = new LineDraw();

	}

}