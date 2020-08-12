import java.awt.*;
import java.applet.*;
public class Exp2 extends Applet
{
	int n=1;
	public void init()
	{
		setLayout(new GridLayout(3,2));
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=2;j++)
			{
				add(new Button(""+n));
				n++;
			}
		}
	}
}
/*<APPLET CODE="Exp2.class"HEIGHT=100 WIDTH=100></APPLET>*/