import java.awt.*;
import java.applet.*;
import javax.swing.*;
/*<applet code="Exp5" width=200 height=200></applet>*/
public class Exp5 extends JApplet
{
	public void init()
	{
		Container cp=getContentPane();
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Cities",new CitiesPanel());
		jtp.addTab("Colors",new ColorsPanel());
		jtp.addTab("Flavors",new FlavorsPanel());
		cp.add(jtp);
	}
}
class CitiesPanel extends JPanel
{
	public CitiesPanel()
	{
		JButton jb1=new JButton("New York");
		add(jb1);
		JButton jb2=new JButton("London");
		add(jb2);
		JButton jb3=new JButton("Paris");
		add(jb3);
	}
}
class ColorsPanel extends JPanel
{
	public ColorsPanel()
	{
		JButton jb4=new JButton("RED");
		add(jb4);
		JButton jb5=new JButton("GREEN");
		add(jb5);
		JButton jb6=new JButton("BLUE");
		add(jb6);
	}
}
class FlavorsPanel extends JPanel
{
	public FlavorsPanel()
	{
		JComboBox jcb=new JComboBox();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		add(jcb);
	}
}
