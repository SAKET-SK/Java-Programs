import java.awt.*;
import java.applet.*;
public class Exp3 extends Frame
{
	public static void main(String args[])
	{
		Exp3 e=new Exp3();
		e.setVisible(true);
		MenuBar mbr=new MenuBar();
		e.setMenuBar(mbr);
		Menu pl=new Menu("PageLayout");
		Menu ref=new Menu("Referrences");
		Menu mail=new Menu("Mailings");
		mbr.add(pl);
		mbr.add(ref);
		mbr.add(mail);
		mail.setEnabled(false);
	}
}