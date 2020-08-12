import java.awt.*;
import java.applet.*;
public class Exp1 extends Applet
{
	Checkbox c1,c2;
	CheckboxGroup cbg;
	public void init()
	{
		cbg=new CheckboxGroup();
		Checkbox r1=new Checkbox("Radio_Button_1",cbg,false);
		Checkbox r2=new Checkbox("Radio_Button_2",cbg,true);
		c1=new Checkbox("Checkbox_1");	
		c2=new Checkbox("Checkbox_2");
		add(r1);		add(r2);
		add(c1);		add(c2);
	}
}
/*<APPLET CODE="Exp1.class" HEIGHT=300 WIDTH=300></APPLET>*/