import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class LineAlgo extends java.applet.Applet implements MouseListener, MouseMotionListener {
 
 private static final long serialVersionUID = 1L;
 int width, height;
 int x1 = 0, y1 = 0, x2 = 0, y2 = 0, pixelsize = 2;
 public void init() {
      width = getSize().width;
      height = getSize().height;
this.addMouseListener(this);
       this.addMouseMotionListener(this);
  
   }

 public void bresenham_line(int x1, int y1, int x2, int y2) {

  if ((x1 - x2) > 0) {bresenham_line(x2, y2, x1, y1); return;}
 

  if (Math.abs(y2 - y1) > Math.abs(x2 - x1)) {

   bresteepline(y1, x1, y2, x2); return;
  }
  int x = x1, y = y1, sum = x2 - x1, Dx = 2 * (x2 - x1), Dy = Math.abs(2 * (y2 - y1));
  int prirastokDy = ((y2 - y1) > 0) ? 1 : -1;
 
  for (int i = 0; i <= x2 -x1; i++) {
   setpix(x, y);
   x++;
   sum -= Dy;
   if (sum < 0) {y = y + prirastokDy; sum += Dx;}
  }
 }
public void bresteepline(int x3, int y3, int x4, int y4) {
  
  if ((x3 - x4) > 0) {bresteepline(x4, y4, x3, y3); return;}

  int x = x3, y = y3, sum = x4 - x3, Dx = 2 * (x4 - x3), Dy = Math.abs(2 * (y4 - y3));
  int prirastokDy = ((y4 - y3) > 0) ? 1 : -1;

  for (int i = 0; i <= x4 -x3; i++) {
   setpix(y, x);
   x++;
    sum -= Dy;
   if (sum < 0) {y = y + prirastokDy; sum += Dx;}
  }
 }
 
 public void setpix(int x, int y)
    {
  Graphics g =getGraphics();
  g.setColor(Color.BLUE );
  g.fillRect(pixelsize * x, pixelsize * y, pixelsize, pixelsize); 
    }
 public void paint( Graphics g )
     {
        Dimension d = getSize();
        g.drawLine(0,0,d.width,0);
        g.drawLine(0,0,0,d.height);
        g.drawLine(d.width-1,d.height-1,d.width-1,0);
        g.drawLine(d.width-1,d.height-1,0,d.height-1);
        bresenham_line(x1, y1, x2, y2);
        }
    public void mousePressed(MouseEvent e)
     {
 x1 = e.getX()/pixelsize;
 y1 = e.getY()/pixelsize;
     }
    public void mouseDragged(MouseEvent e)
     {
 x2 = e.getX()/pixelsize;
 y2 = e.getY()/pixelsize;
 repaint();
     }
     public void mouseReleased(MouseEvent e) {;}
     public void mouseClicked(MouseEvent e) {;}
     public void mouseEntered(MouseEvent e) {;}
     public void mouseExited(MouseEvent e) {;}
     public void mouseMoved(MouseEvent e) {;}

}
