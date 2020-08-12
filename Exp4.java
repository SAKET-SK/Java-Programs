import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
/*<APPLET CODE="Exp4.class" WIDTH=100 HEIGHT=100></APPLET>*/
public class Exp4 extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(8,8));
		int n=1;
		for(int i=1;i<=8;i++)
		{	
			for(int j=1;j<=8;j++)
			{
				jp.add(new JButton(""+n));
				++n;
			}
		}
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jp,v,h);
		cp.add(jsp,BorderLayout.CENTER);
		//A scrollpane is used to provide scrollable view of a component
		//The above displayed output provides a scrollable view of JButtons
	}
}
	
			