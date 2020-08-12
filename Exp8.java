import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/*<applet code="Exp8"width=100 height=100></applet>*/
public class Exp8 extends Applet implements AdjustmentListener
{
	Scrollbar s1,s2,s3;
	public void init()
	{
		s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
		add(s1);		add(s2);		add(s3);
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r=s1.getValue();
		int g=s2.getValue();
		int b=s3.getValue();
		Color c=new Color(r,g,b);
		setBackground(c);
	}
}