import java.util.Scanner;

public class Ios_Brand {
	Scanner sc=new Scanner(System.in);
	void Select_brand()
	{
		System.out.println("1)IPhone 8");
		System.out.println("2)IPhone X");
		System.out.println("enter Your Brand choice number:");
		int Ios_brand_choice=sc.nextInt();
		switch (Ios_brand_choice) {
		case 1:	IPhone_VIII ip=new IPhone_VIII();
				ip.features();
				break;
		case 2: IPhone_X ipx=new IPhone_X();
				ipx.features();
				break;
		default:System.out.println("You've entered wrong choise!!");
			break;
		}
	}
}
