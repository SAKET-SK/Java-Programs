import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/*<applet code="Exp9"width=100 height=100></applet>*/
public class Exp9 extends Applet
{
	MyAdapter ad;
	public void init()
	{
		ad=new MyAdapter(this);
		addMouseListener(ad);
	}
}
class MyAdapter extends MouseAdapter
{
	Exp9 e;
	public MyAdapter(Exp9 e)
	{
		this.e=e;
	}
	public void mouseClicked(MouseEvent me)
	{
		e.showStatus("Mouse is clicked");
	}
	public void mouseEntered(MouseEvent me)
	{
		e.showStatus("Mouse is entered");
	}
}