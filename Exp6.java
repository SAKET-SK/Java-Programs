import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Exp6"width=100 height=100></applet>*/
public class Exp6 extends JApplet implements ActionListener
{
	JRadioButton b1,b2,b3;
	Container cp;
	public void init()
	{
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
		b1=new JRadioButton("Red");
		b1.addActionListener(this);
		cp.add(b1);
		b2=new JRadioButton("Blue");
		b2.addActionListener(this);
		cp.add(b2);
		b3=new JRadioButton("Green");
		b3.addActionListener(this);
		cp.add(b3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);	bg.add(b2);	bg.add(b3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JRadioButton b=(JRadioButton)ae.getSource();
		if(b==b1)
			cp.setBackground(Color.RED);
		if(b==b2)
			cp.setBackground(Color.BLUE);
		if(b==b3)
			cp.setBackground(Color.GREEN);
	}
}
		