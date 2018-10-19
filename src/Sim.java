import java.util.Scanner;

public class Sim{
	Scanner sc=new Scanner(System.in);
	void single_sim()
	{
		Sim sim=new Sim();
		System.out.println("1)Single Sim");
		System.out.println("Enter your Choice:");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: Ios_Brand ibr=new Ios_Brand();
				ibr.Select_brand();
				break;
		default:System.out.println("You've entered wrong choise!!");
			break;
		}
	}
	void dual_sim(int value)
	{
		if(value==1)
		{
		Sim sim=new Sim();
		System.out.println("1)Single Sim");
		System.out.println("2)Dual Sim");
		System.out.println("Enter your Choice:");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: Brand abr=new Brand();
				abr.Android_brand();
				break;
		case 2: Brand abx=new Brand();
				abx.Android_brand();
				break;
		default:System.out.println("You've entered wrong choise!!");
			break;
		}
		}
	}
}
