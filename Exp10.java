import java.net.*;
class Exp10
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress ad=InetAddress.getLocalHost();
		System.out.println("IP address of local machine "+ad);
	}
}