import java.util.Scanner;

public class Mobile extends Sim{
	static Scanner input=new Scanner(System.in);
	
	void Select_Os()
	{
		Mobile mb=new Mobile();
		System.out.println("1)Android");
		System.out.println("2)IOS");
		System.out.println("Enter your Choice:");
		int choice=input.nextInt();
		switch(choice)
		{
			case 1:	mb.dual_sim(choice);
					break;
			case 2: mb.single_sim();
					break;
			default: System.out.println("You've choosen incorrect choice");
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter Your Name:");
		String user_name=input.next();
		System.out.println("Welcome,"+user_name);
		Mobile m=new Mobile();
		m.Select_Os();
	}
}
