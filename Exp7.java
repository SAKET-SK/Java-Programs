import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/*<applet code="Exp7"width=100 height=100></applet>*/
public class Exp7 extends Applet implements MouseMotionListener
{
	String msg=" ";
	int x,y;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
		msg="Mouse is Moved";
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		msg="Mouse is Dragged";
		x=me.getX();
		y=me.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}